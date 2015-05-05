package k.frontend

import org.antlr.runtime.tree.ParseTree
import k.frontend
import java.nio
import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.Path
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.json.JSONArray
import org.json.JSONObject
import k.frontend.ModelParser.ModelContext
import org.json.JSONTokener
import scala.collection.mutable.{ ListBuffer => MList }

object Frontend {
  type OptionMap = Map[Symbol, Any]

  def parseArgs(map: OptionMap, list: List[String]): OptionMap = {
    def isSwitch(s: String) = (s(0) == '-')
    list match {
      case Nil => map
      case "-f" :: value :: tail =>
        parseArgs(map ++ Map('modelFile -> value), tail)
      case "-v" :: tail     => parseArgs(map ++ Map('verbose -> true), tail)
      case "-stats" :: tail => parseArgs(map ++ Map('stats -> true), tail)
      case "-expressionToJson" :: value :: tail =>
        parseArgs(map ++ Map('expression -> value), tail)
      case "-jsonToExpression" :: value :: tail =>
        parseArgs(map ++ Map('json -> value), tail)
      case option :: tail =>
        println("Unknown option " + option)
        System.exit(1).asInstanceOf[Nothing]
    }
  }

  def scala_main(args: Array[String]) {
    val options = parseArgs(Map(), args.toList)

    val model: Model =
      options.get('modelFile) match {
        case Some(f: String) => getModelFromFile(f)
        case None            => null
      }

    model.decls.forall { d =>
      if (d.isInstanceOf[EntityDecl])
        Misc.checkEntityConsistency(d.asInstanceOf[EntityDecl])
      else
        true
    }
    
    options.get('stats) match {
      case Some(_) => printStats(model)
      case None    => ()
    }

    options.get('expression) match {
      case Some(expressionString: String) => {
        println(exp2Json(expressionString))
      }
      case None => ()
    }

    options.get('json) match {
      case Some(jsonString: String) => {
        //json2exp(jsonString)
      }
      case None => ()
    }

    if (model != null) {
      println(model.toString())
      // Remember old value of option
      val optionsUseJson1 = Options.useJson1
      // MMS method using toJson1
      Options.useJson1 = true
      val modelJson = model.toJson
      println("JSON1: " + modelJson.toString(0))
      val modelFromJson = visitJsonObject(modelJson).asInstanceOf[Model]
      // MMS method using toJson2
      Options.useJson1 = false
      val modelJson2 = model.toJson
      println("JSON2: " + modelJson2.toString(0))
      val modelFromJson2 = visitJsonObject2(modelJson2).asInstanceOf[Model]
      // Reset old value of option
      Options.useJson1 = Options.useJson1
    } else
      println("Model was null!")

    println("\n=====================================================\n")
  }

  def visitJsonObject(o: Any): AnyRef = {
    val obj = o.asInstanceOf[JSONObject]
    obj.getString("type") match {
      // Expressions:
      case "ParenExp" =>
        ParenExp(visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "IdentExp" =>
        IdentExp(obj.get("ident").asInstanceOf[String])
      case "DotExp" =>
        val exp: Exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        val ident: String = obj.get("ident").asInstanceOf[String]
        DotExp(exp, ident)
      case "IfExp" =>
        val cond: Exp = visitJsonObject(obj.get("cond")).asInstanceOf[Exp]
        val trueBranch: Exp = visitJsonObject(obj.get("trueBranch")).asInstanceOf[Exp]
        val falseBranch: Option[Exp] =
          if (obj.keySet().contains("falseBranch")) Some(visitJsonObject(obj.get("falseBranch")).asInstanceOf[Exp])
          else None
        IfExp(cond, trueBranch, falseBranch)
      case "WhileExp" =>
        val cond: Exp = visitJsonObject(obj.get("condition")).asInstanceOf[Exp]
        val body = visitJsonObject(obj.get("body")).asInstanceOf[Exp]
        WhileExp(cond, body)
      case "ForExp" =>
        val pattern: Pattern = visitJsonObject(obj.get("pattern")).asInstanceOf[Pattern]
        val exp: Exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        val body = visitJsonObject(obj.get("body")).asInstanceOf[Exp]
        ForExp(pattern, exp, body)
      case "FunApplExp" =>
        val exp1: Exp = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        val args: List[Argument] = visitJsonArray(obj.get("args"), visitJsonObject).asInstanceOf[List[Argument]]
        FunApplExp(exp1, args)
      case "BinExp" =>
        val operator: BinaryOp =
          obj.get("op") match {
            case "Plus"    => ADD
            case "Minus"   => SUB
            case "Times"   => MUL
            case "Divide"  => DIV
            case "Modulo"  => REM
            case "LTE"     => LTE
            case "GTE"     => GTE
            case "LT"      => LT
            case "GT"      => GT
            case "EQ"      => EQ
            case "NotEQ"   => NEQ
            case "IsIn"    => ISIN
            case "NotIn"   => NOTISIN
            case "Subset"  => SUBSET
            case "Psubset" => PSUBSET
            case "Union"   => SETUNION
            case "Inter"   => SETINTER
            case "And"     => AND
            case "OR"      => OR
            case "Tuples"  => TUPLEINDEX
            case "Concat"  => LISTCONCAT
            case "Implies" => IMPL
            case "Assign"  => ASSIGN
            case x =>
              println(x + " not recognized as a BinOp.")
              null
          }
        BinExp(visitJsonObject(obj.get("exp1")).asInstanceOf[Exp],
          operator,
          visitJsonObject(obj.get("exp2")).asInstanceOf[Exp])
      case "UnaryExp" =>
        val operator: UnaryOp =
          obj.get("op") match {
            case "Neg"  => NEG
            case "Not"  => NOT
            case "Prev" => PREV
          }
        UnaryExp(operator, visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "QuantifiedExp" =>
        val quant = visitJsonObject(obj.get("quant")).asInstanceOf[Quantifier]
        val bindings = visitJsonArray(obj.get("bindings"), visitJsonObject).asInstanceOf[List[RngBinding]]
        val exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        QuantifiedExp(quant, bindings, exp)
      case "TupleExp" =>
        TupleExp(visitJsonArray(obj.get("exps"), visitJsonObject).asInstanceOf[List[Exp]])
      case "CollectionEnumExp" =>
        CollectionEnumExp(getCollectionKind(obj.getString("kind")),
          visitJsonArray(obj.get("exps"), visitJsonObject).asInstanceOf[List[Exp]])
      case "CollectionRangeExp" =>
        CollectionRangeExp(getCollectionKind(obj.getString("kind")),
          visitJsonObject(obj.get("exp1")).asInstanceOf[Exp],
          visitJsonObject(obj.get("exp2")).asInstanceOf[Exp])
      case "CollectionComprExp" =>
        var kind = getCollectionKind(obj.getString("kind"))
        var exp1 = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        var bindings = visitJsonArray(obj.get("bindings"), visitJsonObject).asInstanceOf[List[RngBinding]]
        var exp2 = visitJsonObject(obj.get("exp2")).asInstanceOf[Exp]
        CollectionComprExp(kind, exp1, bindings, exp2)
      case "LambdaExp" =>
        var pat = visitJsonObject(obj.get("pat")).asInstanceOf[Pattern]
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        LambdaExp(pat, exp)
      case "AssertExp" =>
        AssertExp(visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "StarExp" =>
        StarExp
      case "ResultExp" =>
        ResultExp
      case "QualifiedName" =>
        QualifiedName(visitJsonArray(obj.get("names").asInstanceOf[JSONArray], (x => x.asInstanceOf[String])).asInstanceOf[List[String]])
      case "IdentType" =>
        val ident = visitJsonObject(obj.get("ident")).asInstanceOf[QualifiedName]
        val args = visitJsonArray(obj.get("args").asInstanceOf[JSONArray], visitJsonObject).asInstanceOf[List[Type]]
        IdentType(ident, args)
      case "CartesianType" =>
        CartesianType(visitJsonArray(obj.get("types"), visitJsonObject).asInstanceOf[List[Type]])
      case "IdentPattern" =>
        IdentPattern(obj.get("ident").asInstanceOf[String])
      case "ProductPattern" =>
        ProductPattern(visitJsonArray(obj.get("patterns"), visitJsonObject).asInstanceOf[List[Pattern]])
      case "RngBinding" =>
        val patterns = visitJsonArray(obj.get("patterns"), visitJsonObject).asInstanceOf[List[Pattern]]
        val collection = visitJsonObject(obj.get("collection")).asInstanceOf[Collection]
        RngBinding(patterns, collection)
      case "ExpCollection" =>
        ExpCollection(visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "TypeCollection" =>
        TypeCollection(visitJsonObject(obj.get("ty")).asInstanceOf[Type])
      case "LiteralInteger" =>
        IntegerLiteral(obj.getInt("i"))
      case "LiteralFloatingPoint" =>
        RealLiteral(java.lang.Float.parseFloat(obj.get("f").asInstanceOf[String]))
      case "LiteralCharacter" =>
        CharacterLiteral(obj.get("c").asInstanceOf[Char])
      case "LiteralBoolean" =>
        BooleanLiteral(obj.getBoolean("b"))
      case "StringLiteral" =>
        StringLiteral(obj.getString("string"))
      case "ElementValue" =>
        IdentExp(obj.get("element").asInstanceOf[String])
      // Top level:
      case "Model" =>
        var packageName: Option[PackageDecl] =
          if (obj.keySet().contains("packageName")) Some(visitJsonObject(obj.get("packageName"))).asInstanceOf[Option[PackageDecl]]
          else None
        var annotations = visitJsonArray(obj.get("annotations"), visitJsonObject).asInstanceOf[List[AnnotationDecl]]
        var imports = visitJsonArray(obj.get("imports"), visitJsonObject).asInstanceOf[List[ImportDecl]]
        var decls = visitJsonArray(obj.get("decls"), visitJsonObject).asInstanceOf[List[TopDecl]]
        Model(packageName, imports, annotations, decls)
      case "AnnotationDecl" =>
        AnnotationDecl(obj.getString("name"), visitJsonObject(obj.get("ty")).asInstanceOf[Type])
      case "Annotation" =>
        Annotation(obj.getString("name"), visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "PackageDecl" =>
        var name: QualifiedName = visitJsonObject(obj.get("name")).asInstanceOf[QualifiedName]
        PackageDecl(name)
      case "ImportDecl" =>
        var name: QualifiedName = visitJsonObject(obj.get("name")).asInstanceOf[QualifiedName]
        var star: Boolean =
          if (obj.get("star").equals("true")) true
          else false
        ImportDecl(name, star)
      case "EntityDecl" =>
        var annotations = visitJsonArray(obj.get("annotations"), visitJsonObject).asInstanceOf[List[Annotation]]
        var entityToken =
          if (obj.get("entityToken").equals("class")) ClassToken
          else if (obj.get("entityToken").equals("assoc")) AssocToken
          else IdentifierToken(obj.getString("entityToken"))
        var keyword =
          if (obj.keySet().contains("keyword")) Some(obj.getString("keyword"))
          else None
        var ident: String = obj.get("ident").toString()
        var typeParams: List[TypeParam] =
          if (obj.keySet.contains("typeParams"))
            visitJsonArray(obj.get("typeParams"), visitJsonObject).asInstanceOf[List[TypeParam]]
          else Nil
        var extending: List[Type] =
          visitJsonArray(obj.get("extending"), visitJsonObject).asInstanceOf[List[Type]]
        var members: List[MemberDecl] =
          visitJsonArray(obj.get("members"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        EntityDecl(annotations, entityToken, keyword, ident, typeParams, extending, members)
      case "TypeParam" =>
        var ident: String = obj.get("ident").toString()
        var bound: Option[TypeBound] =
          if (obj.keySet().contains("bound")) Some(visitJsonObject(obj.get("bound")).asInstanceOf[TypeBound])
          else None
        TypeParam(ident, bound)
      case "TypeBound" => // should this be here?
        visitJsonArray(obj.get("types"), visitJsonObject).asInstanceOf[List[Type]]
      case "TypeDecl" =>
        var ident: String = obj.get("ident").toString()
        var typeParams: List[TypeParam] = visitJsonArray(obj.get("typeParam"), visitJsonObject).asInstanceOf[List[TypeParam]]
        var ty =
          if (obj.keySet().contains("ty")) Some(visitJsonObject(obj.get("ty")).asInstanceOf[Type])
          else None
        TypeDecl(ident, typeParams, ty)
      case "PropertyDecl" =>
        var modifiers =
          visitJsonArray(obj.get("modifiers"), getModifier).asInstanceOf[List[PropertyModifier]]
        var name = obj.getString("name")
        var ty = visitJsonObject(obj.get("ty")).asInstanceOf[Type]
        var multiplicity =
          if (obj.keySet.contains("multiplicity")) Some(visitJsonObject(obj.get("multiplicity")).asInstanceOf[Multiplicity])
          else None
        var assignment =
          if (obj.keySet.contains("assignment")) Some(obj.getBoolean("assignment"))
          else None
        var expr: Option[Exp] =
          if (obj.keySet().contains("expr")) Some(visitJsonObject(obj.get("expr")).asInstanceOf[Exp])
          else None
        PropertyDecl(modifiers, name, ty, multiplicity, assignment, expr)
      case "FunDecl" =>
        var ident: String = obj.get("ident").toString()
        var typeParams = visitJsonArray(obj.get("typeParams"), visitJsonObject).asInstanceOf[List[TypeParam]]
        var params = visitJsonArray(obj.get("params"), visitJsonObject).asInstanceOf[List[Param]]
        var ty =
          if (obj.keySet().contains("ty")) Some(visitJsonObject(obj.get("ty")).asInstanceOf[Type])
          else None
        var spec = visitJsonArray(obj.get("spec"), visitJsonObject).asInstanceOf[List[FunSpec]]
        var body: List[MemberDecl] = visitJsonArray(obj.get("body"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        FunDecl(ident, typeParams, params, ty, spec, body)
      case "FunSpec" =>
        FunSpec(obj.getBoolean("pre"), visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "ConstraintDecl" =>
        var name: Option[String] =
          if (obj.keySet().contains("name")) Some(obj.get("name").toString())
          else None
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        ConstraintDecl(name, exp)
      case "ExpressionDecl" =>
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        ExpressionDecl(exp)
      case "Multiplicity" =>
        var exp1 = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        val exp2: Option[Exp] =
          if (obj.keySet().contains("falseBranch")) Some(visitJsonObject(obj.get("exp2")).asInstanceOf[Exp])
          else None
        Multiplicity(exp1, exp2)
      case "Param" =>
        Param(obj.getString("name"), visitJsonObject(obj.get("ty")).asInstanceOf[Type])
      case "Quantifier" =>
        obj.getString("element") match {
          case "Forall" => Forall
          case "Exists" => Exists
        }
      case "TypeCastCheckExp" =>
        TypeCastCheckExp(obj.getBoolean("cast"), visitJsonObject(obj.get("exp")).asInstanceOf[Exp], visitJsonObject(obj.get("ty")).asInstanceOf[Type])
      case "BlockExp" =>
        BlockExp(visitJsonArray(obj.getJSONArray("body"), visitJsonObject).asInstanceOf[List[MemberDecl]])
      case "BoolType"   => BoolType
      case "IntType"    => IntType
      case "RealType"   => RealType
      case "StringType" => StringType
      case "UnitType"   => UnitType
      case "CharType"   => CharType
      case key @ _ =>
        println("Unknown keys encountered in JSON string!: " + key)
        System.exit(-1).asInstanceOf[Nothing]
    }
  }

  def visitJsonArray(o: Any, f: Any => AnyRef): List[AnyRef] = {
    val obj = o.asInstanceOf[JSONArray]
    var res: List[AnyRef] = Nil
    for (i <- Range(0, obj.length())) {
      val element = obj.get(i)
      res = res ++ List(f(element))
    }
    res
  }

  def getModifier(po: Any): AnyRef = {
    po.asInstanceOf[String] match {
      case "part"    => Part
      case "var"     => Var
      case "val"     => Val
      case "source"  => Source
      case "target"  => Target
      case "unique"  => Unique
      case "ordered" => Ordered
    }
  }

  // Assuming that the input to this is an expression in JSON string format
  def json2exp(expressionString: String): String = {
    var tokener: JSONTokener = new JSONTokener(expressionString)
    var jsonObject: JSONObject = new JSONObject(tokener)
    //var element: JSONArray = jsonObject.get("elements").asInstanceOf[JSONArray]
    //var specialization: JSONObject = element.get(0).asInstanceOf[JSONObject]
    //var exp: Exp = visitJsonObject(specialization.get("specialization").asInstanceOf[JSONObject]).asInstanceOf[Exp]
    var exp = visitJsonObject(jsonObject)
    exp.toString()
  }

  def getRngBindingList(o: JSONObject): List[RngBinding] = {
    visitJsonArray(o.get("bindings").asInstanceOf[JSONArray], getRngBinding).asInstanceOf[List[RngBinding]]
  }

  def getPattern(po: Any): AnyRef = {
    val p = po.asInstanceOf[JSONObject]
    val operand = p.get("operand").asInstanceOf[JSONArray]
    operand.get(0).asInstanceOf[JSONObject].get("type") match {
      case "IdentPattern"   => IdentPattern(operand.getString(1))
      case "ProductPattern" => ProductPattern(getPatternList(p.get("operand").asInstanceOf[JSONArray].get(1).asInstanceOf[JSONArray]))
    }
  }

  def getPatternList(pl: JSONArray): List[Pattern] = {
    visitJsonArray(pl, getPattern).asInstanceOf[List[Pattern]]
  }

  def getCollection(o: JSONObject): Collection = {
    val operand = o.getJSONArray("operand")
    operand.getJSONObject(0).get("type") match {
      case "ExpCollection" =>
        ExpCollection(visitJsonObject2(operand.get(1)).asInstanceOf[Exp])
      case "TypeCollection" =>
        TypeCollection(visitJsonObject2(operand.get(1)).asInstanceOf[Type])
    }
  }

  def getCollectionKind(o: String): CollectionKind = {
    o match {
      case "Set" => SetKind
      case "Seq" => SeqKind
      case "Bag" => BagKind
    }
  }

  def getRngBinding(o: Any): AnyRef = {
    val obj = o.asInstanceOf[JSONObject].getJSONArray("operand")
    val patternList: MList[Pattern] = MList()
    for (i <- Range(2, obj.length)) {
      patternList += getPattern(obj.getJSONObject(i)).asInstanceOf[Pattern]
    }
    val collection = getCollection(obj.get(1).asInstanceOf[JSONObject])
    RngBinding(patternList.toList, collection)
  }

  def visitJsonObject2(o: Any): AnyRef = {
    val obj = o.asInstanceOf[JSONObject]
    obj.get("type") match {
      case "Expression" =>
        val operand: JSONArray = obj.get("operand").asInstanceOf[JSONArray]
        val kind = operand.get(0).asInstanceOf[JSONObject].get("type").asInstanceOf[String]
        kind match {
          case "BlockExp" =>
            val memberDecls: MList[MemberDecl] = MList()
            for (i <- Range(1, operand.length())) {
              memberDecls += visitJsonObject2(operand.getJSONObject(i)).asInstanceOf[MemberDecl]
            }
            BlockExp(memberDecls.toList)
          case "ParenExp" =>
            ParenExp(visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Exp])
          case "DotExp" =>
            val exp = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Exp]
            val ident = operand.getString(2)
            DotExp(exp, ident)
          case "StarExp" => StarExp
          case "FunApplExp" =>
            val exp1 = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Exp]
            val args =
              if (operand.length > 2) {
                val argsList: MList[Exp] = MList()
                for (i <- Range(2, operand.length())) {
                  argsList += visitJsonObject2(operand.get(i)).asInstanceOf[Exp]
                }
                argsList.toList
              } else Nil
            FunApplExp(exp1, args)
          case "WhileExp" =>
            val cond: Exp = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Exp]
            val body = visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp]
            WhileExp(cond, body)
          case "ForExp" =>
            val pattern: Pattern = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Pattern]
            val cond: Exp = visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp]
            val body = visitJsonObject2(operand.getJSONObject(3)).asInstanceOf[Exp]
            ForExp(pattern, cond, body)
          case "IfExp" =>
            val cond = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Exp]
            val trueBranch = visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp]
            val falseBranch =
              if (operand.length() == 4)
                Some(visitJsonObject2(operand.getJSONObject(3)).asInstanceOf[Exp])
              else None
            IfExp(cond, trueBranch, falseBranch)
          case "QuantifiedExp" =>
            val quantifier = visitJsonObject2(operand.getJSONObject(1)).asInstanceOf[Quantifier]
            val bindings = getRngBindingList(operand.getJSONObject(2)).asInstanceOf[List[RngBinding]]
            val exp = visitJsonObject2(operand.getJSONObject(3)).asInstanceOf[Exp]
            QuantifiedExp(quantifier, bindings, exp)
          case "CollectionComprExp" =>
            var kind = getCollectionKind(operand.getString(1))
            var exp1 = visitJsonObject2(operand.get(2)).asInstanceOf[Exp]
            var exp2 = visitJsonObject2(operand.get(3)).asInstanceOf[Exp]
            val bindings: MList[RngBinding] = MList()
            for (i <- Range(4, operand.length())) {
              bindings += visitJsonObject2(operand.get(i)).asInstanceOf[RngBinding]
            }
            CollectionComprExp(kind, exp1, bindings.toList, exp2)
          case "LambdaExp" =>
            val pat = getPattern(operand.getJSONObject(1)).asInstanceOf[Pattern]
            val exp = visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp]
            LambdaExp(pat, exp)
          case "ResultExp" => ResultExp
          case "TypeCastCheckExp" =>
            TypeCastCheckExp(operand.getBoolean(1),
              visitJsonObject2(operand.get(2)).asInstanceOf[Exp],
              visitJsonObject2(operand.get(3)).asInstanceOf[Type])
          case "TupleExp" =>
            val expList: MList[Exp] = MList()
            for (i <- Range(1, operand.length)) {
              expList += (visitJsonObject2(operand.get(i)).asInstanceOf[Exp])
            }
            TupleExp(expList.toList)
          case "Forall" => Forall
          case "Exists" => Exists
          case "IntegerLiteral" =>
            IntegerLiteral(operand.getInt(1))
          case "FloatingPointLiteral" =>
            RealLiteral(java.lang.Float.parseFloat(operand.getString(1)))
          case "CharacterLiteral" =>
            CharacterLiteral(operand.get(1).asInstanceOf[Char])
          case "BooleanLiteral" =>
            BooleanLiteral(operand.getBoolean(1))
          case "StringLiteral" =>
            StringLiteral(operand.getString(1))
          case "BoolType"   => BoolType
          case "IntType"    => IntType
          case "RealType"   => RealType
          case "StringType" => StringType
          case "UnitType"   => UnitType
          case "CharType"   => CharType
          case "IdentType" =>
            IdentType(visitJsonObject2(operand.get(1)).asInstanceOf[QualifiedName],
              null) // missing type parameters I think (null)
          case "Multiplicity" =>
            var exp1 = visitJsonObject2(operand.get(1)).asInstanceOf[Exp]
            var exp2 =
              if (operand.length() == 2)
                Some(visitJsonObject2(operand.get(1)).asInstanceOf[Exp])
              else
                None
            Multiplicity(exp1, exp2)
          case "BinExp" =>
            val operator: BinaryOp =
              operand.getString(1) match {
                case "Plus"    => ADD
                case "Minus"   => SUB
                case "Times"   => MUL
                case "Divide"  => DIV
                case "Modulo"  => REM
                case "LTE"     => LTE
                case "GTE"     => GTE
                case "LT"      => LT
                case "GT"      => GT
                case "EQ"      => EQ
                case "NotEQ"   => NEQ
                case "IsIn"    => ISIN
                case "NotIn"   => NOTISIN
                case "Subset"  => SUBSET
                case "Psubset" => PSUBSET
                case "Union"   => SETUNION
                case "Inter"   => SETINTER
                case "And"     => AND
                case "Or"      => OR
                case "Tuples"  => TUPLEINDEX
                case "Concat"  => LISTCONCAT
                case "Assign"  => ASSIGN
                case "Implies" => IMPL
                case _ =>
                  println(operand.get(0).asInstanceOf[JSONObject].get("element"))
                  null
              }
            val exp1 = visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp]
            val exp2 = visitJsonObject2(operand.getJSONObject(3)).asInstanceOf[Exp]
            BinExp(exp1, operator, exp2)
          case "UnaryExp" =>
            val operator: UnaryOp =
              operand.getString(1) match {
                case "Neg"  => NEG
                case "Not"  => NOT
                case "Prev" => PREV
                case op @ _ =>
                  println("unknown operator " + op)
                  System.exit(-1).asInstanceOf[Nothing]
              }
            UnaryExp(operator, visitJsonObject2(operand.getJSONObject(2)).asInstanceOf[Exp])
          case "RngBinding" =>
            val patterns: MList[Pattern] = MList()
            for (i <- Range(2, operand.length())) {
              patterns += visitJsonObject2(operand.get(i)).asInstanceOf[Pattern]
            }
            val collection = visitJsonObject2(operand.get(1)).asInstanceOf[Collection]
            RngBinding(patterns.toList, collection)
          case "ExpCollection" =>
            ExpCollection(visitJsonObject2(operand.get(1)).asInstanceOf[Exp])
          case "IdentPattern" =>
            IdentPattern(operand.get(1).asInstanceOf[String])
        }
      case "IdentExp" | "ElementValue" =>
        IdentExp(obj.get("element").asInstanceOf[String])
      // Non-Expr, similar to regular JSON
      case "Model" =>
        var packageName: Option[PackageDecl] =
          if (obj.keySet().contains("packageName")) Some(visitJsonObject2(obj.getJSONObject("packageName"))).asInstanceOf[Option[PackageDecl]]
          else None
        var annotations = visitJsonArray(obj.get("annotations"), visitJsonObject2).asInstanceOf[List[AnnotationDecl]]
        var imports = visitJsonArray(obj.get("imports"), visitJsonObject2).asInstanceOf[List[ImportDecl]]
        var decls = visitJsonArray(obj.get("decls"), visitJsonObject2).asInstanceOf[List[TopDecl]]
        Model(packageName, imports, annotations, decls)
      case "AnnotationDecl" =>
        AnnotationDecl(obj.getString("name"), visitJsonObject2(obj.get("ty")).asInstanceOf[Type])
      case "Annotation" =>
        Annotation(obj.getString("name"), visitJsonObject2(obj.get("exp")).asInstanceOf[Exp])
      case "PackageDecl" =>
        var name: QualifiedName = visitJsonObject2(obj.get("name")).asInstanceOf[QualifiedName]
        PackageDecl(name)
      case "ImportDecl" =>
        var name: QualifiedName = visitJsonObject2(obj.get("name")).asInstanceOf[QualifiedName]
        var star: Boolean =
          if (obj.get("star").equals("true")) true
          else false
        ImportDecl(name, star)
      case "EntityDecl" =>
        var annotations = visitJsonArray(obj.get("annotations"), visitJsonObject2).asInstanceOf[List[Annotation]]
        var entityToken =
          if (obj.get("entityToken").equals("class")) ClassToken
          else if (obj.get("entityToken").equals("assoc")) AssocToken
          else IdentifierToken(obj.getString("entityToken"))
        var keyword =
          if (obj.keySet().contains("keyword")) Some(obj.getString("keyword"))
          else None
        var ident: String = obj.get("ident").toString()
        var typeParams: List[TypeParam] =
          if (obj.keySet.contains("typeParams"))
            visitJsonArray(obj.get("typeParams"), visitJsonObject2).asInstanceOf[List[TypeParam]]
          else Nil
        var extending: List[Type] =
          visitJsonArray(obj.get("extending"), visitJsonObject2).asInstanceOf[List[Type]]
        var members: List[MemberDecl] =
          visitJsonArray(obj.get("members"), visitJsonObject2).asInstanceOf[List[MemberDecl]]
        EntityDecl(annotations, entityToken, keyword, ident, typeParams, extending, members)
      case "TypeParam" =>
        var ident: String = obj.get("ident").toString()
        var bound: Option[TypeBound] =
          if (obj.keySet().contains("bound")) Some(visitJsonObject2(obj.get("bound")).asInstanceOf[TypeBound])
          else None
        TypeParam(ident, bound)
      case "TypeBound" =>
        visitJsonArray(obj.get("types"), visitJsonObject2).asInstanceOf[List[Type]]
      case "TypeDecl" =>
        var ident: String = obj.get("ident").toString()
        var typeParams: List[TypeParam] = visitJsonArray(obj.get("typeParam"), visitJsonObject2).asInstanceOf[List[TypeParam]]
        var ty =
          if (obj.keySet().contains("ty")) Some(visitJsonObject2(obj.get("ty")).asInstanceOf[Type])
          else None
        TypeDecl(ident, typeParams, ty)
      case "PropertyDecl" =>
        var modifiers =
          visitJsonArray(obj.get("modifiers"), getModifier).asInstanceOf[List[PropertyModifier]]
        var name = obj.getString("name")
        var ty = visitJsonObject2(obj.get("ty")).asInstanceOf[Type]
        var multiplicity =
          if (obj.keySet.contains("multiplicity")) Some(visitJsonObject2(obj.get("multiplicity")).asInstanceOf[Multiplicity])
          else None
        var assignment =
          if (obj.keySet.contains("assignment")) Some(obj.getBoolean("assignment"))
          else None
        var expr: Option[Exp] =
          if (obj.keySet().contains("expr")) Some(visitJsonObject2(obj.get("expr")).asInstanceOf[Exp])
          else None
        PropertyDecl(modifiers, name, ty, multiplicity, assignment, expr)
      case "FunDecl" =>
        var ident: String = obj.get("ident").toString()
        var typeParams = visitJsonArray(obj.get("typeParams"), visitJsonObject2).asInstanceOf[List[TypeParam]]
        var params = visitJsonArray(obj.get("params"), visitJsonObject2).asInstanceOf[List[Param]]
        var ty =
          if (obj.keySet().contains("ty")) Some(visitJsonObject2(obj.get("ty")).asInstanceOf[Type])
          else None
        var spec = visitJsonArray(obj.get("spec"), visitJsonObject2).asInstanceOf[List[FunSpec]]
        var body: List[MemberDecl] = visitJsonArray(obj.get("body"), visitJsonObject2).asInstanceOf[List[MemberDecl]]
        FunDecl(ident, typeParams, params, ty, spec, body)
      case "FunSpec" =>
        FunSpec(obj.getBoolean("pre"), visitJsonObject2(obj.get("exp")).asInstanceOf[Exp])
      case "ConstraintDecl" =>
        var name: Option[String] =
          if (obj.keySet().contains("name")) Some(obj.get("name").toString())
          else None
        var exp = visitJsonObject2(obj.get("exp")).asInstanceOf[Exp]
        ConstraintDecl(name, exp)
      case "ExpressionDecl" =>
        var exp = visitJsonObject2(obj.get("exp")).asInstanceOf[Exp]
        ExpressionDecl(exp)
      case "Multiplicity" =>
        var exp1 = visitJsonObject2(obj.get("exp1")).asInstanceOf[Exp]
        val exp2: Option[Exp] =
          if (obj.keySet().contains("falseBranch")) Some(visitJsonObject2(obj.get("exp2")).asInstanceOf[Exp])
          else None
        Multiplicity(exp1, exp2)
      case "Param" =>
        Param(obj.getString("name"), visitJsonObject2(obj.get("ty")).asInstanceOf[Type])
      case "Quantifier" =>
        obj.getString("element") match {
          case "Forall" => Forall
          case "Exists" => Exists
        }
      case "TypeCastCheckExp" =>
        TypeCastCheckExp(obj.getBoolean("cast"), visitJsonObject2(obj.get("exp")).asInstanceOf[Exp], visitJsonObject2(obj.get("ty")).asInstanceOf[Type])
      case "QualifiedName" =>
        QualifiedName(visitJsonArray(obj.get("names").asInstanceOf[JSONArray], (x => x.asInstanceOf[String])).asInstanceOf[List[String]])
      case key @ _ =>
        println("Unknown keys encountered in JSON string! (2) : " + key)
        System.exit(-1).asInstanceOf[Nothing]
    }
  }

  // Assuming that the input to this is an expression in JSON string format
  def json2exp2(expressionString: String): String = {
    var tokener: JSONTokener = new JSONTokener(expressionString)
    var jsonObject: JSONObject = new JSONObject(tokener)
    var element: JSONArray = jsonObject.get("elements").asInstanceOf[JSONArray]
    var specialization: JSONObject = element.get(0).asInstanceOf[JSONObject]
    var exp: Exp = visitJsonObject2(specialization.get("specialization").asInstanceOf[JSONObject]).asInstanceOf[Exp]
    exp.toString();
  }

  def getVisitor(contents: String): (KScalaVisitor, ModelContext) = {

    var input: ANTLRInputStream = new ANTLRInputStream(contents)
    var lexer: ModelLexer = new ModelLexer(input)
    var tokens: CommonTokenStream = new CommonTokenStream(lexer)
    var parser: ModelParser = new ModelParser(tokens)
    var tree = parser.model()
    var ksv: KScalaVisitor = new KScalaVisitor()
    (ksv, tree)
  }

  def getModelFromFile(f: String): Model = {
    var path: Path = Paths.get(f)
    var bytes: Array[Byte] = Files.readAllBytes(path)
    var fileContents: String = new String(bytes, "UTF-8")
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(fileContents)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]
    m
  }

  def getModelFromString(f: String): Model = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(f)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]
    m
  }

  def exp2Json(expressionString: String): String = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    val array = new JSONArray()
    val operand = new JSONArray()
    val root = new JSONObject()
    Options.useJson1 = true
    exp.toJson.toString(4)
  }

  def exp2Json2(expressionString: String): String = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    val array = new JSONArray()
    val operand = new JSONArray()
    val root = new JSONObject()

    Options.useJson1 = false

    var elements = exp.toJson
    var specialization = new JSONObject()
    specialization = new JSONObject()
    specialization.put("specialization", elements)
    array.put(specialization)
    var res: JSONObject = root.put("elements", array)
    res.toString(4)
  }

  def exp2KExp(expressionString: String): Exp = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    exp
  }

  def exp2KExpList(expressionString: String): List[Exp] = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString)
    var m: Model = ksv.visit(tree).asInstanceOf[Model]
    m.decls.map(x => x.asInstanceOf[ExpressionDecl].exp)
  }

  def getDeclCount(m: Model, d: Class[_]): Int = {
    m.decls.count(decl => (d == decl.getClass))
  }

  def printStats(m: Model) {
    println("Imports: " + m.imports.size)
    println("Entities: " + getDeclCount(m, classOf[EntityDecl]))
    println("Properties: " + getDeclCount(m, classOf[PropertyDecl]))
    println("Functions: " + getDeclCount(m, classOf[FunDecl]))
    println("Types: " + getDeclCount(m, classOf[TypeDecl]))
    println("Expressions: " + getDeclCount(m, classOf[ExpressionDecl]))
    println("Constraints: " + getDeclCount(m, classOf[ConstraintDecl]))
  }

  def analyze(m: Model) {

  }
}