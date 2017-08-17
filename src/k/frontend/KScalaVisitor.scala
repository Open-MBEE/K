package k.frontend

import scala.collection.JavaConverters._
import java.lang.Float
import java.lang.Boolean
import java.math.RoundingMode

import scala.collection.mutable.ListBuffer
//import scala.collection.mutable.Set

class KScalaVisitor extends ModelBaseVisitor[AnyRef] {
  
  var declToPosition = Map[MemberDecl, Tuple2[Int, Int]]()

  var stack: List[AnyRef] = Nil

  override def visitModel(ctx: ModelParser.ModelContext): Model = {
    visitModelThings(ctx.modelThings())
  }

  override def visitModelThings(ctx: ModelParser.ModelThingsContext): Model = {
    var packageDecls: ListBuffer[PackageDecl] = new ListBuffer[PackageDecl]() //= ctx.packageDeclaration().asScala.toList.map(visit(_).asInstanceOf[PackageDecl])
    var importDecls: ListBuffer[ImportDecl] = new ListBuffer[ImportDecl]()
    var annotationDecls: Set[AnnotationDecl] = new ListBuffer[AnnotationDecl]().toList.toSet
    var topDecls: ListBuffer[TopDecl] = new ListBuffer[TopDecl]()
    val things: List[AnyRef] = ctx.modelThing().asScala.toList.map(visit(_).asInstanceOf[AnyRef])
    for (thing <- things) {
      if (thing.isInstanceOf[PackageDecl]) {
        packageDecls += thing.asInstanceOf[PackageDecl]
      } else if (thing.isInstanceOf[ImportDecl]) {
        importDecls += thing.asInstanceOf[ImportDecl]
      } else if (thing.isInstanceOf[AnnotationDecl]) {
        annotationDecls += thing.asInstanceOf[AnnotationDecl]
      } else if (thing.isInstanceOf[TopDecl]) {
        topDecls += thing.asInstanceOf[TopDecl]
      }
    }
    var packageName: Option[String] = null
    Model(packageName, packageDecls.toList, importDecls.toList, annotationDecls, topDecls.toList)
  }

  override def visitModelThing(ctx: ModelParser.ModelThingContext): AnyRef = super.visitModelThing(ctx)

  override def visitQualifiedName(ctx: ModelParser.QualifiedNameContext): AnyRef = {
    var identifiers = ctx.Identifier().asScala
    QualifiedName(identifiers.map(_.toString()).toList)
  }

  override def visitPackageDeclaration(ctx: ModelParser.PackageDeclarationContext): PackageDecl = {
    var qn: QualifiedName = visit(ctx.qualifiedName()).asInstanceOf[QualifiedName]
    var m: Model = visitModelThings(ctx.modelThings())
    var model: Model = Model(qn.toString.asInstanceOf[Option[String]], m.packages, m.imports, m.annotations, m.decls)
    PackageDecl(qn, model)
  }

  override def visitImportDeclaration(ctx: ModelParser.ImportDeclarationContext): AnyRef = {
    var identifiers = ctx.qualifiedName().Identifier().asScala 
    var children = ctx.children.asScala
    var star: Boolean = children.last.toString() == "*"
    new ImportDecl(new QualifiedName(identifiers.map(_.toString()).toList), star)
  }

  override def visitTypeDeclaration(ctx: ModelParser.TypeDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().toString()
    var typeParams: List[TypeParam] =
      if (ctx.typeParameters() != null)
        visit(ctx.typeParameters()).asInstanceOf[List[TypeParam]]
      else Nil
    var t: Option[Type] =
      visit(ctx.`type`()).asInstanceOf[Option[Type]]
    TypeDecl(ident, typeParams, t)
  }

  override def visitTypeParameter(ctx: ModelParser.TypeParameterContext): AnyRef = {
    var ident: String = ctx.Identifier().toString()
    var typeBound: Option[TypeBound] =
      if (ctx.typeBound() != null) Some(visit(ctx.typeBound()).asInstanceOf[TypeBound])
      else None
    TypeParam(ident, typeBound)
  }

  override def visitTypeBound(ctx: ModelParser.TypeBoundContext): AnyRef = {
    var typeContexts: List[ModelParser.TypeContext] = (ctx.`type`().asScala).toList
    Some(TypeBound(typeContexts.map(visit(_)).asInstanceOf[List[Type]]))
  }

  override def visitPrimType(ctx: ModelParser.PrimTypeContext): AnyRef = {
    visitPrimitiveType(ctx.primitiveType())
  }

  override def visitPrimitiveType(ctx: ModelParser.PrimitiveTypeContext): AnyRef = {
    ctx.getText() match {
      case "Bool"   => BoolType
      case "Char"   => CharType
      case "Int"    => IntType
      case "Real"   => RealType
      case "String" => StringType
      case "Unit"   => UnitType
    }
  }

  override def visitIdentType(ctx: ModelParser.IdentTypeContext): AnyRef = {
    // identifier type
    var qn: QualifiedName = visit(ctx.classIdentifier()).asInstanceOf[QualifiedName]
    var typeArguments: List[Type] =
      if (ctx.typeArguments() != null) visit(ctx.typeArguments()).asInstanceOf[List[Type]]
      else Nil
    IdentType(qn, typeArguments)
  }

  override def visitCartesianType(ctx: ModelParser.CartesianTypeContext): AnyRef = {
    var types: List[ModelParser.TypeContext] = ctx.`type`().asScala.toList
    CartesianType(types.map(visit(_).asInstanceOf[Type]))
  }

  override def visitFuncType(ctx: ModelParser.FuncTypeContext): AnyRef = {
    var from: Type = visit(ctx.`type`(0)).asInstanceOf[Type]
    var to: Type = visit(ctx.`type`(1)).asInstanceOf[Type]
    FunctionType(from, to)
  }

  override def visitParenType(ctx: ModelParser.ParenTypeContext): AnyRef = {
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    ParenType(t)
  }

  override def visitSubType(ctx: ModelParser.SubTypeContext): AnyRef = {
    var i: String = visit(ctx.Identifier()).asInstanceOf[String]
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var e: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    Some(SubType(i, t, e))
  }

  override def visitTypeArguments(ctx: ModelParser.TypeArgumentsContext): AnyRef = {
    var types: List[ModelParser.TypeContext] = ctx.`type`().asScala.toList
    types.map(visit(_).asInstanceOf[Type])
  }

  override def visitIdentifierList(ctx: ModelParser.IdentifierListContext): AnyRef = {
    ctx.Identifier().asScala.map(_.toString())
  }

  override def visitConstraint(ctx: ModelParser.ConstraintContext): AnyRef = {
    val ident: Option[String] =
      if (ctx.Identifier() != null) Some(ctx.Identifier().getText())
      else None
    val exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    val c = ConstraintDecl(ident, exp)
    val line = ctx.getStart().getLine()
    val char = ctx.getStart().getCharPositionInLine()
    declToPosition += (c -> (line, char))
    c
    
  }

  override def visitParenExp(ctx: ModelParser.ParenExpContext): AnyRef = {
    ParenExp(visit(ctx.expression()).asInstanceOf[Exp])
  }

  override def visitLiteralExp(ctx: ModelParser.LiteralExpContext): AnyRef = {
    visit(ctx.literal()).asInstanceOf[Literal]
  }

  override def visitIdentExp(ctx: ModelParser.IdentExpContext): AnyRef = {
    IdentExp(ctx.Identifier().getText())
  }

  override def visitDotExp(ctx: ModelParser.DotExpContext): AnyRef = {
    var e: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var ident: String = ctx.Identifier().getText()
    DotExp(e, ident)
  }
  
  override def visitClassExp(ctx: ModelParser.ClassExpContext): AnyRef = {
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    ClassExp(t)
  }
  
  override def visitIndexExp(ctx: ModelParser.IndexExpContext): AnyRef = {
    var e: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var argumentList = visit(ctx.positionalArgumentList()).asInstanceOf[List[Argument]]
    IndexExp(e, argumentList)
  }
  

  override def visitAppExp(ctx: ModelParser.AppExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var argumentList =
      if (ctx.argumentList() != null)
        visit(ctx.argumentList()).asInstanceOf[List[Argument]]
      else
        Nil

    FunApplExp(e0, argumentList)
  }

  override def visitIfExp(ctx: ModelParser.IfExpContext): AnyRef = {
    var cond: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var trueBranch: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var falseBranch: Option[Exp] =
      if (ctx.expression(2) != null)
        Some(visit(ctx.expression(2)).asInstanceOf[Exp])
      else None
    IfExp(cond, trueBranch, falseBranch)
  }

  override def visitWhileExp(ctx: ModelParser.WhileExpContext): AnyRef = {
    var cond: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var body: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    WhileExp(cond, body)
  }

  override def visitForExp(ctx: ModelParser.ForExpContext): AnyRef = {
    var pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var exp: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var body: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    ForExp(pattern, exp, body)
  }

  override def visitNegExp(ctx: ModelParser.NegExpContext): AnyRef = {
    UnaryExp(NEG, visit(ctx.expression()).asInstanceOf[Exp])
  }

  override def visitNotExp(ctx: ModelParser.NotExpContext): AnyRef = {
    UnaryExp(NOT, visit(ctx.expression()).asInstanceOf[Exp])
  }

  override def visitForallExp(ctx: ModelParser.ForallExpContext): AnyRef = {
    var rng: List[RngBinding] = visit(ctx.rngBindingList()).asInstanceOf[List[RngBinding]]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    QuantifiedExp(Forall, rng, exp)
  }

  override def visitExistsExp(ctx: ModelParser.ExistsExpContext): AnyRef = {
    var rng: List[RngBinding] = visit(ctx.rngBindingList()).asInstanceOf[List[RngBinding]]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    QuantifiedExp(Exists, rng, exp)
  }

  override def visitTupleExp(ctx: ModelParser.TupleExpContext): AnyRef = {
    TupleExp(ctx.expression().asScala.toList.map(visit(_).asInstanceOf[Exp]))
  }

  override def visitSetEnumExp(ctx: ModelParser.SetEnumExpContext): AnyRef = {
    val ck: CollectionKind = visit(ctx.collectionKind()).asInstanceOf[CollectionKind]
    if (ctx.expressionList() == null)
      CollectionEnumExp(ck, Nil)
    else {
      val exps: List[Exp] = visit(ctx.expressionList()).asInstanceOf[List[Exp]]
      CollectionEnumExp(ck, exps)
    }
  }

  override def visitExpressionList(ctx: ModelParser.ExpressionListContext): AnyRef = {
    ctx.expression().asScala.toList.map(visit(_).asInstanceOf[Exp])
  }

  override def visitSetRngExp(ctx: ModelParser.SetRngExpContext): AnyRef = {
    var ck: CollectionKind = visit(ctx.collectionKind()).asInstanceOf[CollectionKind]
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    CollectionRangeExp(ck, e0, e1)
  }

  override def visitSetCompExp(ctx: ModelParser.SetCompExpContext): AnyRef = {
    var ck: CollectionKind = visit(ctx.collectionKind()).asInstanceOf[CollectionKind]
    var rng: List[RngBinding] = visit(ctx.rngBindingList()).asInstanceOf[List[RngBinding]]
    var exp0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var exp1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    CollectionComprExp(ck, exp0, rng, exp1)
  }

  override def visitLambdaExp(ctx: ModelParser.LambdaExpContext): AnyRef = {
    var pat: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    LambdaExp(pat, exp)
  }

  override def visitBinOp1Exp(ctx: ModelParser.BinOp1ExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      ctx.getChild(1).getText() match {
        case "*"       => MUL
        case "/"       => DIV
        case "%"       => REM
        case "inter"   => SETINTER
        case "\\"      => SETDIFF
        case "subset"  => SUBSET
        case "psubset" => PSUBSET
        case "++"      => ADD
        case "#"       => TUPLEINDEX
        case "^"       => LISTCONCAT
      }
    BinExp(e0, op, e1)
  }

  override def visitBinOp2Exp(ctx: ModelParser.BinOp2ExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      ctx.getChild(1).getText() match {
        case "+"     => ADD
        case "-"     => SUB
        case "union" => SETUNION
      }
    BinExp(e0, op, e1)
  }

  override def visitBinOp3Exp(ctx: ModelParser.BinOp3ExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      ctx.getChild(1).getText() match {
        case "<="      => LTE
        case ">="      => GTE
        case "<"       => LT
        case ">"       => GT
        case "="       => EQ
        case "!="      => NEQ
        case "isin"    => ISIN
        case "!isin"   => NOTISIN
        case "subset"  => SUBSET
        case "psubset" => PSUBSET
      }
    BinExp(e0, op, e1)
  }

  override def visitAndExp(ctx: ModelParser.AndExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    BinExp(e0, AND, e1)
  }

  override def visitOrExp(ctx: ModelParser.OrExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    BinExp(e0, OR, e1)
  }

  override def visitIFFExp(ctx: ModelParser.IFFExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      ctx.getChild(1).getText() match {
        case "=>"  => IMPL
        case "<=>" => IFF
      }
    BinExp(e0, op, e1)
  }

  override def visitAssignExp(ctx: ModelParser.AssignExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    BinExp(e0, ASSIGN, e1)
  }

  override def visitAssertExp(ctx: ModelParser.AssertExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    AssertExp(e0)
  }

  override def visitRngBinding(ctx: ModelParser.RngBindingContext): AnyRef = {
    var p: List[Pattern] = visit(ctx.patternList()).asInstanceOf[List[Pattern]]
    var c: Collection = visit(ctx.collectionOrType()).asInstanceOf[Collection]
    RngBinding(p, c)
  }

  override def visitRngBindingList(ctx: ModelParser.RngBindingListContext): AnyRef = {
    ctx.rngBinding().asScala.toList.map(visit(_).asInstanceOf[RngBinding])
  }

  override def visitPatternList(ctx: ModelParser.PatternListContext): AnyRef = {
    ctx.pattern().asScala.toList.map(visit(_).asInstanceOf[Pattern])
  }

  override def visitIdentPattern(ctx: ModelParser.IdentPatternContext): AnyRef = {
    IdentPattern(ctx.Identifier().getText())
  }

  override def visitCartesianPattern(ctx: ModelParser.CartesianPatternContext): AnyRef = {
    ProductPattern(ctx.pattern().asScala.toList.map(visit(_).asInstanceOf[Pattern]))
  }

  override def visitLiteral(ctx: ModelParser.LiteralContext): AnyRef = {
    if (ctx.IntegerLiteral() != null) {
      IntegerLiteral(Integer.parseInt(ctx.IntegerLiteral().getSymbol().getText()))
    } else if (ctx.RealLiteral() != null) {
      //RealLiteral(java.lang.Float.parseFloat(ctx.RealLiteral().getSymbol().getText()))
      val bd = new java.math.BigDecimal(ctx.RealLiteral.getSymbol.getText).
        setScale(16, java.math.BigDecimal.ROUND_DOWN)
      RealLiteral(bd)
    } else if (ctx.CharacterLiteral() != null) {
      CharacterLiteral(ctx.CharacterLiteral().getSymbol().getText().charAt(0))
    } else if (ctx.StringLiteral() != null) {
      StringLiteral(ctx.StringLiteral().getSymbol().getText())
    } else if (ctx.ThisLiteral() != null) {
      ThisLiteral
    } else if (ctx.NullLiteral() != null) {
      NullLiteral
    } else {
      BooleanLiteral(java.lang.Boolean.parseBoolean(ctx.BooleanLiteral().getSymbol().getText()))
    }
  }

  override def visitLiteralPattern(ctx: ModelParser.LiteralPatternContext): AnyRef = {
    visit(ctx.literal())
  }

  override def visitTypedPattern(ctx: ModelParser.TypedPatternContext): AnyRef = {
    var pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    TypedPattern(pattern, t)
  }

  override def visitTypeParameters(ctx: ModelParser.TypeParametersContext): AnyRef = {
    ctx.typeParameter().asScala.toList.map(visit(_).asInstanceOf[TypeParam])
  }

  override def visitMemberDeclaration(ctx: ModelParser.MemberDeclarationContext): AnyRef = {
    if (ctx.typeDeclaration() != null) visit(ctx.typeDeclaration())
    else if (ctx.entityDeclaration() != null) visit(ctx.entityDeclaration())
    else if (ctx.propertyDeclaration() != null) visit(ctx.propertyDeclaration())
    else if (ctx.functionDeclaration() != null) visit(ctx.functionDeclaration())
    else if (ctx.constraint() != null) visit(ctx.constraint())
    else if (ctx.expression() != null) ExpressionDecl(visit(ctx.expression()).asInstanceOf[Exp])
    else null
  }

  override def visitTopDeclaration(ctx: ModelParser.TopDeclarationContext): AnyRef = {
    val annotations: List[Annotation] = ctx.annotation().asScala.toList.map(visit(_)).asInstanceOf[List[Annotation]]
    if (ctx.entityDeclaration() != null) {
      var entity: EntityDecl = visit(ctx.entityDeclaration()).asInstanceOf[EntityDecl]
      entity.annotations = annotations
      return entity.asInstanceOf[AnyRef] // asInstanceOf not needed here
    } else if (ctx.memberDeclaration() != null) {
      var member: MemberDecl = visit(ctx.memberDeclaration()).asInstanceOf[MemberDecl]
      member.annotations = annotations
      return member.asInstanceOf[AnyRef] // asInstanceOf not needed here
    } else return null
  }

  override def visitEntityDeclaration(ctx: ModelParser.EntityDeclarationContext): AnyRef = {
    val entityToken: EntityToken =
      if (ctx.children.get(0).getText() == "class") ClassToken
      else if (ctx.children.get(0).getText() == "assoc") AssocToken
      else IdentifierToken(ctx.children.get(0).getText())
    val keyword: Option[String] =
      if (ctx.Keyword() != null) Some(ctx.Keyword.getText.replaceAll("<", "").replaceAll(">", ""))
      else None
    var ident: String =
      if (entityToken.isInstanceOf[IdentifierToken])
        ctx.Identifier(1).getText()
      else
        ctx.Identifier(0).getText()
    var typeParams: List[TypeParam] =
      if (ctx.typeParameters() == null) Nil
      else visit(ctx.typeParameters()).asInstanceOf[List[TypeParam]]
    var extending: List[Type] =
      if (ctx.extending() == null) Nil
      else visit(ctx.extending()).asInstanceOf[List[Type]]
    var members: List[MemberDecl] =
      if (ctx.block() != null)
        visit(ctx.block()).asInstanceOf[List[MemberDecl]]
      else
        Nil
    val e = EntityDecl(null, entityToken, keyword, ident, typeParams, extending, members)
    val line = ctx.getStart().getLine()
    val char = ctx.getStart().getCharPositionInLine()
    declToPosition += (e -> (line, char))
    e
  }

  override def visitParamList(ctx: ModelParser.ParamListContext): AnyRef = {
    ctx.param().asScala.toList.map(visit(_)).asInstanceOf[List[Param]]
  }

  override def visitParam(ctx: ModelParser.ParamContext): AnyRef = {
    val identifier: String = ctx.Identifier().getText()
    val t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    Param(identifier, t)

  }

  override def visitPositionalArgumentList(ctx: ModelParser.PositionalArgumentListContext): AnyRef = {
    val exps: List[Exp] = ctx.expression().asScala.toList.map(visit(_)).asInstanceOf[List[Exp]]
    exps map (PositionalArgument(_))
  }

  override def visitNamedArgList(ctx: ModelParser.NamedArgListContext): AnyRef = {
    visit(ctx.namedArgumentList()).asInstanceOf[List[NamedArgument]]
  }

  override def visitNamedArgument(ctx: ModelParser.NamedArgumentContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    NamedArgument(ident, exp)
  }

  override def visitNamedArgumentList(ctx: ModelParser.NamedArgumentListContext): AnyRef = {
    ctx.namedArgument().asScala.toList.map(visit(_)).asInstanceOf[List[NamedArgument]]
  }

  override def visitFunctionDeclaration(ctx: ModelParser.FunctionDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var typeParams: List[TypeParam] =
      if (ctx.typeParameters() == null) Nil
      else visit(ctx.typeParameters()).asInstanceOf[List[TypeParam]]
    var paramList: List[Param] =
      if (ctx.paramList() != null)
        visit(ctx.paramList()).asInstanceOf[List[Param]]
      else Nil
    var t: Option[Type] =
      if (ctx.`type`() != null) Some(visit(ctx.`type`()).asInstanceOf[Type])
      else None
    var spec: List[FunSpec] =
      if (ctx.functionSpecification() != null)
        ctx.functionSpecification().asScala.toList.map(visit(_)).asInstanceOf[List[FunSpec]]
      else
        null // Nil ?
    var body: List[MemberDecl] =
      if (ctx.block() != null)
        visit(ctx.block()).asInstanceOf[List[MemberDecl]]
      else Nil
    val f = FunDecl(ident, typeParams, paramList, t, spec, body)
    val line = ctx.getStart().getLine()
    val char = ctx.getStart().getCharPositionInLine()
    declToPosition += (f -> (line, char))
    f
  }

  override def visitFunctionSpecification(ctx: ModelParser.FunctionSpecificationContext): AnyRef = {
    var pre: Boolean =
      if (ctx.children.get(0).getText().equals("pre")) true
      else false
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    FunSpec(pre, exp)
  }

  override def visitPropertyDeclaration(ctx: ModelParser.PropertyDeclarationContext): AnyRef = {
    val modifiers: List[PropertyModifier] =
      ctx.propertyModifier().asScala.toList.map(visit(_)).asInstanceOf[List[PropertyModifier]]
    val name: String = ctx.Identifier().getText()
    val t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    val multiplicity: Option[Multiplicity] =
      if (ctx.multiplicity() != null)
        Some(visit(ctx.multiplicity()).asInstanceOf[Multiplicity])
      else
        None
    val expr: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    val assignment: Option[scala.Boolean] =
      if (ctx.expression() != null)
        if (ctx.children.get(ctx.children.size() - 2).getText() == "=") Some(false.asInstanceOf[scala.Boolean])
        else Some(true.asInstanceOf[scala.Boolean])
      else None
    val p = PropertyDecl(modifiers, name, t, multiplicity, assignment, expr)
    val line = ctx.getStart().getLine()
    val char = ctx.getStart().getCharPositionInLine()
    declToPosition += (p -> (line, char))
    p
  }

  override def visitCollectionKind(ctx: ModelParser.CollectionKindContext): AnyRef = {
    Misc.getCollectionKind(ctx.children.get(0).getText)
  }

  override def visitCollectionOrType(ctx: ModelParser.CollectionOrTypeContext): AnyRef = {
    if (ctx.expression() != null) {
      ExpCollection(visit(ctx.expression()).asInstanceOf[Exp])
    } else {
      TypeCollection(visit(ctx.`type`()).asInstanceOf[Type])
    }
  }

  override def visitExpressionOrStar(ctx: ModelParser.ExpressionOrStarContext): AnyRef = {
    if (ctx.expression() != null) {
      visit(ctx.expression()).asInstanceOf[Exp]
    } else {
      StarExp
    }
  }

  override def visitMatch(ctx: ModelParser.MatchContext): AnyRef = {
    var patterns: List[Pattern] = ctx.pattern().asScala.toList.map(visit(_)).asInstanceOf[List[Pattern]]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    MatchCase(patterns, exp)
  }

  override def visitMatchExp(ctx: ModelParser.MatchExpContext): AnyRef = {
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var m: List[MatchCase] = ctx.`match`().asScala.map(visit(_)).asInstanceOf[List[MatchCase]]
    MatchExp(exp, m)
  }

  override def visitBlockExp(ctx: ModelParser.BlockExpContext): AnyRef = {
    BlockExp(visit(ctx.block()).asInstanceOf[List[MemberDecl]])
  }

  override def visitBlock(ctx: ModelParser.BlockContext): AnyRef = {
    ctx.blockDeclaration().asScala.toList.map(visit(_)).asInstanceOf[List[MemberDecl]]
  }

  override def visitBlockDeclaration(ctx: ModelParser.BlockDeclarationContext): AnyRef = {
    val annotations: List[Annotation] = ctx.annotation().asScala.toList.map(visit(_)).asInstanceOf[List[Annotation]]
    val member: MemberDecl = visit(ctx.memberDeclaration()).asInstanceOf[MemberDecl]
    member.annotations = annotations
    member
  }

  override def visitMultiplicity(ctx: ModelParser.MultiplicityContext): AnyRef = {
    var start: Exp = visit(ctx.expressionOrStar(0)).asInstanceOf[Exp]
    var end: Option[Exp] =
      if (ctx.expressionOrStar(1) != null)
        Some(visit(ctx.expressionOrStar(1)).asInstanceOf[Exp])
      else
        None
    Multiplicity(start, end)
  }

  override def visitTypeCheckExp(ctx: ModelParser.TypeCheckExpContext): AnyRef = {
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    TypeCastCheckExp(false, exp, t)
  }

  override def visitTypeCastExp(ctx: ModelParser.TypeCastExpContext): AnyRef = {
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    TypeCastCheckExp(true, exp, t)
  }

  override def visitReturnExp(ctx: ModelParser.ReturnExpContext): AnyRef = {
    ReturnExp(visit(ctx.expression()).asInstanceOf[Exp])
  }

  override def visitBreakExp(ctx: ModelParser.BreakExpContext): AnyRef = {
    BreakExp
  }

  override def visitContinueExp(ctx: ModelParser.ContinueExpContext): AnyRef = {
    ContinueExp
  }

  override def visitResultExp(ctx: ModelParser.ResultExpContext): AnyRef = {
    ResultExp
  }

  override def visitExtending(ctx: ModelParser.ExtendingContext): AnyRef = {
    ctx.`type`().asScala.toList.map(visit(_)).asInstanceOf[List[Type]]
  }

  override def visitClassIdentifier(ctx: ModelParser.ClassIdentifierContext): AnyRef = {
    if (ctx.qualifiedName() != null) {
      visit(ctx.qualifiedName())
    } else if (ctx.collectionKind() != null) {
      // Class case, should this be special? TODO
      QualifiedName(List(ctx.children.get(0).getText))
    } else {
      QualifiedName(List(ctx.children.get(0).getText))
    }
  }

  override def visitDontCarePattern(ctx: ModelParser.DontCarePatternContext): AnyRef = {
    DontCarePattern
  }

  override def visitPosArgList(ctx: ModelParser.PosArgListContext): AnyRef = {
    visit(ctx.positionalArgumentList())
  }

  override def visitAnnotation(ctx: ModelParser.AnnotationContext): AnyRef = {
    val name: String = ctx.Identifier().getText()

    val exp: Exp =
      if (ctx.expression != null) visit(ctx.expression()).asInstanceOf[Exp]
      else null
    Annotation(name, exp)

  }

  override def visitAnnotationDeclaration(ctx: ModelParser.AnnotationDeclarationContext): AnyRef = {
    val name: String = ctx.Identifier().getText()
    val t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    AnnotationDecl(name, t)
  }

  override def visitPrevExp(ctx: ModelParser.PrevExpContext): AnyRef = {
    UnaryExp(PREV, IdentExp(ctx.qualifiedName().getText())) // getText: is that correct?
  }

  override def visitPropertyModifier(ctx: ModelParser.PropertyModifierContext): AnyRef = {
    ctx.children.get(0).getText match {
      case "part"    => Part
      case "var"     => Var
      case "val"     => Val
      case "ordered" => Ordered
      case "unique"  => Unique
      case "source"  => Source
      case "target"  => Target
    }
  }

}