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

object Frontend {
  type OptionMap = Map[Symbol, Any]

  def parseArgs(map: OptionMap, list: List[String]): OptionMap = {
    def isSwitch(s: String) = (s(0) == '-')
    list match {
      case Nil => map
      case "-f" :: value :: tail =>
        parseArgs(map ++ Map('modelFile -> value), tail)
      case "-v" :: tail => parseArgs(map ++ Map('verbose -> true), tail)
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
        case None => null
      }

    options.get('stats) match {
      case Some(_) => printStats(model)
      case None => ()
    }

    options.get('verbose) match {
      case Some(_) => printModel(model)
      case None => ()
    }

    options.get('expression) match {
      case Some(expressionString: String) => {
        println(exp2Json(expressionString))
      }
      case None => ()
    }

    options.get('json) match {
      case Some(jsonString: String) => {
        json2exp(jsonString)
      }
      case None => ()
    }
  }

  def visitJsonObject(o: Any): AnyRef = {
    val obj = o.asInstanceOf[JSONObject]
    obj.get("type") match {
      // Expressions:
      case "ParenExp" =>
        ParenExp(visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "IdentExp" =>
        IdentExp(obj.get("ident").asInstanceOf[String])
      case "DotExp" =>
        val exp: Exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        val ident: String = obj.get("ident").asInstanceOf[String]
        DotExp(exp, ident)
      case "CreateExp" =>
        val name = visitJsonObject(obj.get("name")).asInstanceOf[QualifiedName]
        val args = visitJsonArray(obj.get("args").asInstanceOf[JSONArray], (a => visitJsonObject(a))).asInstanceOf[List[ClassArgument]]
        CreateExp(name, args)
      case "IfExp" =>
        val cond: Exp = visitJsonObject(obj.get("cond")).asInstanceOf[Exp]
        val exp1: Exp = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        val exp2: Exp = visitJsonObject(obj.get("exp2")).asInstanceOf[Exp]
        IfExp(cond, exp1, exp2)
      case "DoExp" =>
        val body = visitJsonArray(obj.get("body"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        DoExp(body)
      case "WhileExp" =>
        val cond: Exp = visitJsonObject(obj.get("condition")).asInstanceOf[Exp]
        val body = visitJsonArray(obj.get("body"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        WhileExp(cond, body)
      case "ForExp" =>
        val pattern: Pattern = visitJsonObject(obj.get("pattern")).asInstanceOf[Pattern]
        var t: Option[Type] = if (obj.keySet().contains("t")) Some(visitJsonObject(obj.get("t")).asInstanceOf[Type])
        else None
        val exp: Exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        val body = visitJsonArray(obj.get("body"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        ForExp(pattern, t, exp, body)
      case "FunApplExp" =>
        val exp1: Exp = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        val exp2: Exp = visitJsonObject(obj.get("exp2")).asInstanceOf[Exp]
        FunApplExp(exp1, exp2)
      case "BinExp" =>
        val operator: BinaryOp =
          obj.get("op") match {
            case "Plus" => ADD
            case "Minus" => SUB
            case "Times" => MUL
            case "Divide" => DIV
            case "Modulo" => REM
            case "LTE" => LTE
            case "GTE" => GTE
            case "LT" => LT
            case "GT" => GT
            case "EQ" => EQ
            case "NotEQ" => NEQ
            case "IsIn" => ISIN
            case "NotIn" => NOTISIN
            case "Subset" => SUBSET
            case "Psubset" => PSUBSET
            case "Union" => SETUNION
            case "Inter" => SETINTER
            case "And" => AND
            case "Or" => OR
            case "Tuples" => TUPLEINDEX
            case "Concat" => LISTCONCAT
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
            case "Neg" => NEG
            case "Not" => NOT
          }
        UnaryExp(operator, visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "QuantifiedExp" =>
        val quant = visitJsonObject(obj.get("quant")).asInstanceOf[Quantifier]
        val bindings = visitJsonArray(obj.get("bindings"), visitJsonObject).asInstanceOf[List[RngBinding]]
        val exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        QuantifiedExp(quant, bindings, exp)
      case "TupleExp" =>
        TupleExp(visitJsonArray(obj.get("exps"), visitJsonObject).asInstanceOf[List[Exp]])
      case "SetEnumExp" =>
        SetEnumExp(visitJsonArray(obj.get("exps"), visitJsonObject).asInstanceOf[List[Exp]])
      case "SetRangeExp" =>
        SetRangeExp(visitJsonObject(obj.get("exp1")).asInstanceOf[Exp],
          visitJsonObject(obj.get("exp2")).asInstanceOf[Exp])
      case "SetComprExp" =>
        var exp1 = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        var bindings = visitJsonArray(obj.get("bindings"), visitJsonObject).asInstanceOf[List[RngBinding]]
        var exp2 = visitJsonObject(obj.get("exp2")).asInstanceOf[Exp]
        SetComprExp(exp1, bindings, exp2)
      case "ListEnumExp" =>
        ListEnumExp(visitJsonArray(obj.get("exps"), visitJsonObject).asInstanceOf[List[Exp]])
      case "ListRangeExp" =>
        ListRangeExp(visitJsonObject(obj.get("exp1")).asInstanceOf[Exp],
          visitJsonObject(obj.get("exp2")).asInstanceOf[Exp])
      case "ListComprExp" =>
        var exp1 = visitJsonObject(obj.get("exp1")).asInstanceOf[Exp]
        var exp2 = visitJsonObject(obj.get("exp2")).asInstanceOf[Exp]
        var exp3 = visitJsonObject(obj.get("exp3")).asInstanceOf[Exp]
        var pat = visitJsonObject(obj.get("pat")).asInstanceOf[Pattern]
        ListComprExp(exp1, pat, exp2, exp3)
      case "MapEnumExp" =>
        MapEnumExp(visitJsonArray(obj.get("maps"), visitJsonObject).asInstanceOf[List[MapPair]])
      case "MapComprExp" =>
        var map = visitJsonObject(obj.get("map")).asInstanceOf[MapPair]
        var bindings = visitJsonArray(obj.get("bindings"), visitJsonObject).asInstanceOf[List[RngBinding]]
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        MapComprExp(map, bindings, exp)
      case "LambdaExp" =>
        var pat = visitJsonObject(obj.get("pat")).asInstanceOf[Pattern]
        var t = if (obj.keySet().contains("t")) Some(visitJsonObject(obj.get("t")).asInstanceOf[Type])
        else None
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        LambdaExp(pat, t, exp)
      case "AssertExp" =>
        AssertExp(visitJsonObject(obj.get("exp")).asInstanceOf[Exp])
      case "StarExp" =>
        StarExp
      case "QualifiedName" =>
        QualifiedName(visitJsonArray(obj.get("names").asInstanceOf[JSONArray], (x => x.asInstanceOf[String])).asInstanceOf[List[String]])
      case "IdentType" =>
        val ident = visitJsonObject(obj.get("ident")).asInstanceOf[QualifiedName]
        val args = visitJsonArray(obj.get("args").asInstanceOf[JSONArray], visitJsonObject).asInstanceOf[List[Type]]
        IdentType(ident, args)
      case "MultType" =>
        var t = visitJsonObject(obj.get("t")).asInstanceOf[Type]
        var min = visitJsonObject(obj.get("min")).asInstanceOf[Exp]
        var max = if (obj.keySet().contains("max")) Some(visitJsonObject(obj.get("max")).asInstanceOf[Exp])
        else None
        MultType(t, min, max)
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
        IntegerLiteral(obj.get("integer").asInstanceOf[Integer])
      case "LiteralFloatingPoint" =>
        RealLiteral(java.lang.Float.parseFloat(obj.get("floatingpoint").asInstanceOf[String]))
      case "LiteralCharacter" =>
        CharacterLiteral(obj.get("character").asInstanceOf[Char])
      case "LiteralBoolean" =>
        BooleanLiteral(java.lang.Boolean.parseBoolean(obj.get("boolean").asInstanceOf[String]))
      case "StringLiteral" =>
        StringLiteral(obj.get("string").asInstanceOf[String])
      case "ElementValue" =>
        IdentExp(obj.get("element").asInstanceOf[String])
      // Top level:
      case "Model" =>
        var packageName: Option[PackageDecl] =
          if (obj.keySet().contains("packageName")) Some(visitJsonObject(obj.get("packageName"))).asInstanceOf[Option[PackageDecl]]
          else None
        var imports = visitJsonArray(obj.get("imports"), visitJsonObject).asInstanceOf[List[ImportDecl]]
        var decls = visitJsonArray(obj.get("decls"), visitJsonObject).asInstanceOf[List[TopDecl]]
        Model(packageName, imports, decls)
      case "PackageDecl" =>
        var name : QualifiedName = visitJsonObject(obj.get("name")).asInstanceOf[QualifiedName]
        PackageDecl(name)
      case "ImportDecl" =>
        var name : QualifiedName = visitJsonObject(obj.get("name")).asInstanceOf[QualifiedName]
        var star : Boolean = 
          if(obj.get("star").equals("true")) true
          else false
        ImportDecl(name, star)
      case "ClassDecl" => 
        var classToken: ClassToken = if(obj.get("classToken").equals("class")) Class else Assoc
        var ident: String = obj.get("ident").toString()
        var typeParams: List[TypeParam] = visitJsonArray(obj.get("typeParams"), visitJsonObject).asInstanceOf[List[TypeParam]]
        var valueParams: List[Typing] = visitJsonArray(obj.get("valueParams"), visitJsonObject).asInstanceOf[List[Typing]]
        var extending: List[Type] = visitJsonArray(obj.get("Type"), visitJsonObject).asInstanceOf[List[Type]]
        var members: List[MemberDecl] = visitJsonArray(obj.get("MemberDecl"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        ClassDecl(classToken, ident, typeParams, valueParams, extending, members)
      case "TypeParam" =>
        var ident : String = obj.get("ident").toString()
        var bound : Option[TypeBound] = 
          if(obj.keySet().contains("bound")) Some(visitJsonObject(obj.get("bound")).asInstanceOf[TypeBound])
          else None
        TypeParam(ident, bound)
      case "TypeBound" => 
        visitJsonArray(obj.get("types"), visitJsonObject).asInstanceOf[List[Type]]
      case "SortDecl" => 
        SortDecl(obj.get("ident").toString())
      case "TypeDecl" =>
        var ident : String = obj.get("ident").toString()
        var typeParams : List[TypeParam] = visitJsonArray(obj.get("typeParam"), visitJsonObject).asInstanceOf[List[TypeParam]]
        var t : Type = visitJsonObject(obj.get("t")).asInstanceOf[Type]
        TypeDecl(ident, typeParams, t)
      case "ValDecl" => 
        var expr : Option[Exp] = 
          if(obj.keySet().contains("expr")) Some(visitJsonObject(obj.get("expr")).asInstanceOf[Exp])
          else None
        var typing : Typing = visitJsonObject(obj.get("typing")).asInstanceOf[Typing]
        ValDecl(typing, expr)
      case "VarDecl" => 
        var expr : Option[Exp] = 
          if(obj.keySet().contains("expr")) Some(visitJsonObject(obj.get("expr")).asInstanceOf[Exp])
          else None
        var typing : Typing = visitJsonObject(obj.get("typing")).asInstanceOf[Typing]
        VarDecl(typing, expr)
      case "FunDecl" => 
        var ident : String = obj.get("ident").toString()
        var args : List[List[Typing]] = {
          var args = obj.get("args").asInstanceOf[JSONArray]
          var res : List[List[Typing]] = Nil
          for(i <- Range(0, args.length())){
            var element = obj.get("args").asInstanceOf[JSONObject]
            res = res ++ List(visitJsonArray(element.get("args"), visitJsonObject).asInstanceOf[List[Typing]])
          }
          res
        }
        var t : Type = visitJsonObject(obj.get("t")).asInstanceOf[Type]
        var body : List[MemberDecl] = visitJsonArray(obj.get("body"), visitJsonObject).asInstanceOf[List[MemberDecl]]
        FunDecl(ident, args, t, body)
      case "ConstraintDecl" => 
        var name : Option[String] = 
          if(obj.keySet().contains("name")) Some(obj.get("name").toString())
          else None
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        ConstraintDecl(name, exp)
      case "ExpressionDecl" =>
        var exp = visitJsonObject(obj.get("exp")).asInstanceOf[Exp]
        ExpressionDecl(exp)
      case "Typing" => 
        var ident : String = obj.get("ident").toString()
        var ty : Type = visitJsonObject(obj.get("ty")).asInstanceOf[Type]
        Typing(ident, ty)
      case "BoolType" => BoolType
      case "IntType" => IntType
      case "RealType" => RealType
      case "StringType" => StringType
      case "UnitType" => UnitType
      case "CharType" => CharType
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

  // Assuming that the input to this is an expression in JSON string format
  def json2exp(expressionString: String): String = {
    var tokener: JSONTokener = new JSONTokener(expressionString)
    var jsonObject: JSONObject = new JSONObject(tokener)
    var element: JSONArray = jsonObject.get("elements").asInstanceOf[JSONArray]
    var specialization: JSONObject = element.get(0).asInstanceOf[JSONObject]
    var exp: Exp = visitJsonObject(specialization.get("specialization").asInstanceOf[JSONObject]).asInstanceOf[Exp]
    exp.toString()
  }

  def getRngBindingList(o: JSONObject): List[RngBinding] = {
    visitJsonArray(o.get("bindings").asInstanceOf[JSONArray], getRngBinding).asInstanceOf[List[RngBinding]]
  }

  def getPattern(po: Any): AnyRef = {
    val p = po.asInstanceOf[JSONObject]
    val operand = p.get("operand").asInstanceOf[JSONArray]
    operand.get(0).asInstanceOf[JSONObject].get("element") match {
      case "IdentPattern" => IdentPattern(operand.get(1).asInstanceOf[JSONObject].get("element").asInstanceOf[String])
      case "ProductPattern" => ProductPattern(getPatternList(p.get("operand").asInstanceOf[JSONArray].get(1).asInstanceOf[JSONArray]))
    }
  }
  def getPatternList(pl: JSONArray): List[Pattern] = {
    visitJsonArray(pl, getPattern).asInstanceOf[List[Pattern]]
  }
  def getCollection(o: JSONObject): Collection = {
    o.get("element") match {
      case "ExpCollection" => ExpCollection(visitJsonObject2(o.get("operand").asInstanceOf[JSONObject]).asInstanceOf[Exp])
      case "TypeCollection" => TypeCollection(visitJsonObject2(o.get("operand").asInstanceOf[JSONObject]).asInstanceOf[Type])
    }
  }
  def getRngBinding(o: Any): AnyRef = {
    val obj = o.asInstanceOf[JSONArray]
    val bindings = getPatternList(obj.getInt(2).asInstanceOf[JSONArray])
    val collection = getCollection(obj.get(1).asInstanceOf[JSONObject])
    RngBinding(bindings, collection)
  }

  def visitJsonObject2(obj: JSONObject): AnyRef = {
    obj.get("type") match {
      case "Expression" =>
        val operand: JSONArray = obj.get("operand").asInstanceOf[JSONArray]
        val kind = operand.get(0).asInstanceOf[JSONObject].get("element").asInstanceOf[String]
        kind match {
          case "ParenExp" =>
            ParenExp(visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp])
          case "DotExp" =>
            val exp = visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            val ident = operand.get(2).asInstanceOf[JSONObject].get("element").asInstanceOf[String]
            DotExp(exp, ident)
          case "FunApplExp" =>
            val exp1 = visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            val exp2 = visitJsonObject2(operand.get(2).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            FunApplExp(exp1, exp2)
          case "IfExp" =>
            val cond = visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            val exp1 = visitJsonObject2(operand.get(2).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            val exp2 = visitJsonObject2(operand.get(3).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            IfExp(cond, exp1, exp2)
          case "QuantifiedExp" =>
            val quantifier = visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Quantifier]
            val bindings = getRngBindingList(operand.get(2).asInstanceOf[JSONObject]).asInstanceOf[List[RngBinding]]
            val exp = visitJsonObject2(operand.get(3).asInstanceOf[JSONObject]).asInstanceOf[Exp]

            QuantifiedExp(quantifier, bindings, exp)
          case "LambdaExp" =>
            val pat = getPattern(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Pattern]
            val exp = visitJsonObject2(operand.get(2).asInstanceOf[JSONObject]).asInstanceOf[Exp]
            val ty =
              if (operand.get(3) != null) {
                None // currently unsupported
              } else None
            LambdaExp(pat, ty, exp)
          case _ =>
            val operator: BinaryOp =
              operand.get(0).asInstanceOf[JSONObject].get("element") match {
                case "Plus" => ADD
                case "Minus" => SUB
                case "Times" => MUL
                case "Divide" => DIV
                case "Modulo" => REM
                case "LTE" => LTE
                case "GTE" => GTE
                case "LT" => LT
                case "GT" => GT
                case "EQ" => EQ
                case "NotEQ" => NEQ
                case "IsIn" => ISIN
                case "NotIn" => NOTISIN
                case "Subset" => SUBSET
                case "Psubset" => PSUBSET
                case "Union" => SETUNION
                case "Inter" => SETINTER
                case "And" => AND
                case "Or" => OR
                case "Tuples" => TUPLEINDEX
                case "Concat" => LISTCONCAT
                case _ =>
                  println(operand.get(0).asInstanceOf[JSONObject].get("element"))
                  null
              }
            if (operator != null) {
              val exp1 = visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp]
              val exp2 = visitJsonObject2(operand.get(2).asInstanceOf[JSONObject]).asInstanceOf[Exp]
              BinExp(exp1, operator, exp2)
            } else {
              val operator: UnaryOp =
                operand.get(0).asInstanceOf[JSONObject].get("element") match {
                  case "Neg" => NEG
                  case "Not" => NOT
                  case _ =>
                    println("unknown operator " + operand.get(0).asInstanceOf[JSONObject].get("element"))
                    System.exit(-1).asInstanceOf[Nothing]
                }
              UnaryExp(operator, visitJsonObject2(operand.get(1).asInstanceOf[JSONObject]).asInstanceOf[Exp])
            }
        }
      case "ElementValue" =>
        IdentExp(obj.get("element").asInstanceOf[String])
      case "LiteralInteger" =>
        IntegerLiteral(obj.get("integer").asInstanceOf[Integer])
      case "LiteralFloatingPoint" =>
        RealLiteral(java.lang.Float.parseFloat(obj.get("floatingpoint").asInstanceOf[String]))
      case "LiteralCharacter" =>
        CharacterLiteral(obj.get("character").asInstanceOf[Char])
      case "LiteralBoolean" =>
        BooleanLiteral(java.lang.Boolean.parseBoolean(obj.get("boolean").asInstanceOf[String]))
      case "StringLiteral" =>
        StringLiteral(obj.get("string").asInstanceOf[String])
      case "ElementValue" =>
        IdentExp(obj.get("element").asInstanceOf[String])
      case _ =>
        println("Unknown keys encountered in JSON string!")
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

    var input: ANTLRInputStream = new ANTLRInputStream(contents);
    var lexer: ModelLexer = new ModelLexer(input);
    var tokens: CommonTokenStream = new CommonTokenStream(lexer);
    var parser: ModelParser = new ModelParser(tokens);
    var tree = parser.model();
    var ksv: KScalaVisitor = new KScalaVisitor();
    (ksv, tree)
  }

  def getModelFromFile(f: String): Model = {
    var path: Path = Paths.get(f)
    var bytes: Array[Byte] = Files.readAllBytes(path)
    var fileContents: String = new String(bytes, "UTF-8");
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(fileContents)
    var m: Model = ksv.visit(tree).asInstanceOf[Model];
    m
  }

  def printModel(m: Model) {
    println(m)
  }

  def exp2Json(expressionString: String): String = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString + ";")
    var m: Model = ksv.visit(tree).asInstanceOf[Model];

    require(m.decls.count(_ => true) == 1)
    require(
      m.decls.count(
        _ match {
          case ExpressionDecl(_) => true
          case _ => false
        }) == 1)

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    val array = new JSONArray()
    val operand = new JSONArray()
    val root = new JSONObject()
    var elements = exp.toJson
    var specialization = new JSONObject()
    specialization = new JSONObject()
    specialization.put("specialization", elements)
    array.put(specialization)
    var res: JSONObject = root.put("elements", array)
    res.toString(4)
  }

  def exp2Json2(expressionString: String): String = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString + ";")
    var m: Model = ksv.visit(tree).asInstanceOf[Model];

    require(m.decls.count(_ => true) == 1)
    require(
      m.decls.count(
        _ match {
          case ExpressionDecl(_) => true
          case _ => false
        }) == 1)

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    val array = new JSONArray()
    val operand = new JSONArray()
    val root = new JSONObject()
    var elements = exp.toJson2
    var specialization = new JSONObject()
    specialization = new JSONObject()
    specialization.put("specialization", elements)
    array.put(specialization)
    var res: JSONObject = root.put("elements", array)
    res.toString(4)
  }
  
  def exp2KExp(expressionString : String) : Exp = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString + ";")
    var m: Model = ksv.visit(tree).asInstanceOf[Model];

    require(m.decls.count(_ => true) == 1)
    require(
      m.decls.count(
        _ match {
          case ExpressionDecl(_) => true
          case _ => false
        }) == 1)

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    exp
  }

  def printStats(m: Model) {
    println("Imports: " + m.imports.size)
    println("Classes: " + m.decls.count(
      _ match {
        case ClassDecl(Class, _, _, _, _, _) => true
        case _ => false
      }))
    println("Associations: " + m.decls.count(
      _ match {
        case ClassDecl(Assoc, _, _, _, _, _) => true
        case _ => false
      }))
    println("Constraints: " + m.decls.count(
      _ match {
        case ConstraintDecl(_, _) => true
        case _ => false
      }))
    println("Variables: " + m.decls.count(
      _ match {
        case VarDecl(_, _) => true
        case _ => false
      }))
    println("Values: " + m.decls.count(
      _ match {
        case ValDecl(_, _) => true
        case _ => false
      }))
    println("Functions: " + m.decls.count(
      _ match {
        case FunDecl(_, _, _, _) => true
        case _ => false
      }))
    println("Types: " + m.decls.count(
      _ match {
        case TypeDecl(_, _, _) => true
        case _ => false
      }))
    println("Expressions: " + m.decls.count(
      _ match {
        case ExpressionDecl(_) => true
        case _ => false
      }))
  }

  def analyze(m: Model) {

  }
}