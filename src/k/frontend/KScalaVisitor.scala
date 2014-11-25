package k.frontend

import scala.collection.JavaConverters._
import k.frontend.ModelBaseVisitor
import k.frontend.ModelParser
import java.lang.Float
import java.lang.Boolean

class KScalaVisitor extends ModelBaseVisitor[AnyRef] {

  var stack: List[AnyRef] = Nil

  override def visitModel(ctx: ModelParser.ModelContext): AnyRef = {
    var packageDecl: Option[PackageDecl] =
      if (ctx.packageDeclaration() != null) Some(visit(ctx.packageDeclaration()).asInstanceOf[PackageDecl])
      else None
    var importDecls: List[ImportDecl] = ctx.importDeclaration().asScala.toList.map(visit(_).asInstanceOf[ImportDecl])
    var topDecls: List[TopDecl] = visit(ctx.topDeclarationList()).asInstanceOf[List[TopDecl]]
    Model(packageDecl, importDecls, topDecls)
  }

  override def visitQualifiedName(ctx: ModelParser.QualifiedNameContext): AnyRef = {
    var identifiers = ctx.Identifier().asScala
    QualifiedName(identifiers.map(_.toString()).toList)
  }

  override def visitPackageDeclaration(ctx: ModelParser.PackageDeclarationContext): AnyRef = {
    var qn: QualifiedName = visit(ctx.qualifiedName()).asInstanceOf[QualifiedName]
    PackageDecl(qn)
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
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
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
    TypeBound(typeContexts.map(visit(_)).asInstanceOf[List[Type]])
  }

  override def visitPrimType(ctx: ModelParser.PrimTypeContext): AnyRef = {
    visitPrimitiveType(ctx.primitiveType())
  }

  override def visitPrimitiveType(ctx: ModelParser.PrimitiveTypeContext): AnyRef = {
    ctx.getText() match {
      case "Bool" => BoolType
      case "Char" => CharType
      case "Int" => IntType
      case "Real" => RealType
      case "String" => StringType
      case "Unit" => UnitType
    }
  }

  override def visitIdentType(ctx: ModelParser.IdentTypeContext): AnyRef = {
    // identifier type
    var qn: QualifiedName = visit(ctx.qualifiedName()).asInstanceOf[QualifiedName]
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
  
  override def visitBracketedExp(ctx : ModelParser.BracketedExpContext) : AnyRef = {
	visit(ctx.bracketedExpression())

  }
  
  override def visitSubType(ctx: ModelParser.SubTypeContext): AnyRef = {
    var i: String = visit(ctx.Identifier()).asInstanceOf[String]
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var e: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    SubType(i, t, e)
  }

  override def visitSetType(ctx: ModelParser.SetTypeContext): AnyRef = {
    var ident: QualifiedName = QualifiedName(List("Set"))
    var t: List[Type] = List(visit(ctx.`type`()).asInstanceOf[Type])
    IdentType(ident, t)
  }

  override def visitListType(ctx: ModelParser.ListTypeContext): AnyRef = {
    var ident: QualifiedName = QualifiedName(List("List"))
    var t: List[Type] = List(visit(ctx.`type`()).asInstanceOf[Type])
    IdentType(ident, t)
  }

  override def visitMapType(ctx: ModelParser.MapTypeContext): AnyRef = {
    var ident: QualifiedName = QualifiedName(List("Set"))
    var from: Type = visit(ctx.`type`(0)).asInstanceOf[Type]
    var to: Type = visit(ctx.`type`(1)).asInstanceOf[Type]
    IdentType(ident, List(from, to))
  }

  override def visitOptionalType(ctx: ModelParser.OptionalTypeContext): AnyRef = {
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    NullableType(t)
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
    ConstraintDecl(ident, exp)
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

  override def visitAppExp(ctx: ModelParser.AppExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var argumentList =
      if (ctx.argumentList() != null) visit(ctx.argumentList()).asInstanceOf[List[Argument]]
      else null

    FunApplExp(e0, argumentList)
  }

  override def visitIfExp(ctx: ModelParser.IfExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var trueBranch: List[MemberDecl] =
      if (ctx.memberDeclarationList(0) != null) visit(ctx.memberDeclarationList(0)).asInstanceOf[List[MemberDecl]]
      else null
    var falseBranch: List[MemberDecl] =
      if (ctx.memberDeclarationList(0) != null) visit(ctx.memberDeclarationList(0)).asInstanceOf[List[MemberDecl]]
      else null
    IfExp(e0, trueBranch, falseBranch)
  }

  override def visitWhileExp(ctx: ModelParser.WhileExpContext): AnyRef = {
    var cond: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var body: List[MemberDecl] =
      if (ctx.memberDeclarationList() != null)
        visit(ctx.memberDeclarationList()).asInstanceOf[List[MemberDecl]]
      else
        null
    WhileExp(cond, body)
  }

  override def visitForExp(ctx: ModelParser.ForExpContext): AnyRef = {
    var pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var body: List[MemberDecl] =
      if (ctx.memberDeclarationList() != null)
        visit(ctx.memberDeclarationList()).asInstanceOf[List[MemberDecl]]
      else
        null
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
    SetEnumExp(visit(ctx.expressionList()).asInstanceOf[List[Exp]])
  }

  override def visitExpressionList(ctx: ModelParser.ExpressionListContext): AnyRef = {
    ctx.expression().asScala.toList.map(visit(_).asInstanceOf[Exp])
  }

  override def visitSetRngExp(ctx: ModelParser.SetRngExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    SetRangeExp(e0, e1)
  }

  override def visitListRngExp(ctx: ModelParser.ListRngExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    ListRangeExp(e0, e1)
  }

  override def visitSetCompExp(ctx: ModelParser.SetCompExpContext): AnyRef = {
    var rng: List[RngBinding] = visit(ctx.rngBindingList()).asInstanceOf[List[RngBinding]]
    var exp0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var exp1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    SetComprExp(exp0, rng, exp1)
  }

  override def visitListCompExp(ctx: ModelParser.ListCompExpContext): AnyRef = {
    var exp0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var exp1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var exp2: Exp = visit(ctx.expression(2)).asInstanceOf[Exp]
    var pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    ListComprExp(exp0, pattern, exp1, exp2)
  }

  override def visitMapEnumExp(ctx: ModelParser.MapEnumExpContext): AnyRef = {
    MapEnumExp(visit(ctx.mapPairList()).asInstanceOf[List[MapPair]])
  }

  override def visitMapPairList(ctx: ModelParser.MapPairListContext): AnyRef = {
    ctx.mapPair().asScala.toList.map(visit(_).asInstanceOf[Exp])
  }

  override def visitMapPair(ctx: ModelParser.MapPairContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    List(e0, e1)
  }

  override def visitListEnumExp(ctx: ModelParser.ListEnumExpContext): AnyRef = {
    ListEnumExp(visit(ctx.expressionList()).asInstanceOf[List[Exp]])
  }

  override def visitMapCompExp(ctx: ModelParser.MapCompExpContext): AnyRef = {
    var mapPair = visit(ctx.mapPair()).asInstanceOf[MapPair]
    var rngBindingList = visit(ctx.rngBindingList()).asInstanceOf[List[RngBinding]]
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    MapComprExp(mapPair, rngBindingList, exp)
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
        case "*" => MUL
        case "/" => DIV
        case "%" => REM
        case "inter" => SETINTER
        case "\\" => SETDIFF
        case "++" => ADD
        case "#" => TUPLEINDEX
        case "^" => LISTCONCAT
      }
    BinExp(e0, op, e1)
  }

  override def visitBinOp2Exp(ctx: ModelParser.BinOp2ExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      ctx.getChild(1).getText() match {
        case "+" => ADD
        case "-" => SUB
        case "union" => SETUNION
      }
    BinExp(e0, op, e1)
  }

  override def visitBinOp3Exp(ctx: ModelParser.BinOp3ExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var op: BinaryOp =
      if (ctx.tokenLessThanEqual() != null) LTE
      else if (ctx.tokenGreaterThanEqual() != null) GTE
      else if (ctx.tokenLessThan() != null) LT
      else if (ctx.tokenGreatherThan() != null) GT
      else if (ctx.tokenEquals() != null) EQ
      else if (ctx.tokenNot() != null && ctx.tokenEquals() != null) NEQ
      else {
        ctx.getChild(1).getText() match {
          case "isin" => ISIN
          case "!isin" => NOTISIN
          case "subset" => SUBSET
          case "^" => LISTCONCAT
        }
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
    if (ctx.tokenIFF() != null) BinExp(e0, IFF, e1)
    else BinExp(e0, IMPL, e1)
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
    } else if (ctx.FloatingPointLiteral() != null) {
      RealLiteral(java.lang.Float.parseFloat(ctx.FloatingPointLiteral().getSymbol().getText()))
    } else if (ctx.CharacterLiteral() != null) {
      CharacterLiteral(ctx.CharacterLiteral().getSymbol().getText().charAt(0))
    } else if (ctx.StringLiteral() != null) {
      StringLiteral(ctx.StringLiteral().getSymbol().getText())
    } else {
      BooleanLiteral(java.lang.Boolean.parseBoolean(ctx.BooleanLiteral().getSymbol().getText()))
    }
  }
  
  override def visitLiteralPattern(ctx : ModelParser.LiteralPatternContext) : AnyRef = {
    visit(ctx.literal())
  }

  override def visitTypedPattern (ctx : ModelParser.TypedPatternContext) : AnyRef = {
	var pattern : Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
	var t : Type = visit(ctx.`type`()).asInstanceOf[Type]
	TypedPattern(pattern, t)
  } 
  
  override def visitTypeParameters(ctx: ModelParser.TypeParametersContext): AnyRef = {
    ctx.typeParameter().asScala.toList.map(visit(_).asInstanceOf[TypeParam])
  }

  override def visitMemberDeclarationList(ctx:ModelParser.MemberDeclarationListContext) : AnyRef = {
	ctx.memberDeclaration().asScala.toList.map(visit(_)).asInstanceOf[List[MemberDecl]]
  }
  
  override def visitMemberDeclaration(ctx: ModelParser.MemberDeclarationContext): AnyRef = {	
    if (ctx.sortDeclaration() != null) visit(ctx.sortDeclaration())
    else if (ctx.typeDeclaration() != null) visit(ctx.typeDeclaration())
    else if (ctx.sortDeclaration() != null) visit(ctx.sortDeclaration())
    else if (ctx.valueDeclaration() != null) visit(ctx.valueDeclaration())
    else if (ctx.variableDeclaration() != null) visit(ctx.variableDeclaration())
    else if (ctx.functionDeclaration() != null) visit(ctx.functionDeclaration())
    else if (ctx.constraint() != null) visit(ctx.constraint())
    else if (ctx.expression() != null) ExpressionDecl(visit(ctx.expression()).asInstanceOf[Exp])
    else null
  }

  override def visitTopDeclarationList(ctx : ModelParser.TopDeclarationListContext) : AnyRef = {
    ctx.topDeclaration().asScala.toList.map(visit(_)).asInstanceOf[List[TopDecl]]
  }
  
  override def visitTopDeclaration(ctx: ModelParser.TopDeclarationContext): AnyRef = {
    if (ctx.classDeclaration() != null) visit(ctx.classDeclaration())
    else if (ctx.memberDeclaration() != null) {
      visit(ctx.memberDeclaration())
    } else null
  }

  override def visitClassDeclaration(ctx: ModelParser.ClassDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var typeParams: List[TypeParam] =
      if (ctx.typeParameters() == null) Nil
      else visit(ctx.typeParameters()).asInstanceOf[List[TypeParam]]
    var extending: List[Type] =
      if (ctx.extending() == null) Nil
      else visit(ctx.extending()).asInstanceOf[List[Type]]
    var members: List[MemberDecl] =
      if (ctx.memberDeclarationList() != null)
        visit(ctx.memberDeclarationList()).asInstanceOf[List[MemberDecl]]
      else
        null
    ClassDecl(Class, ident, typeParams, extending, members)
  }

  override def visitAssocDeclaration(ctx: ModelParser.AssocDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().getText();
    var members: List[MemberDecl] = visit(ctx.assocMemberDeclarationList()).asInstanceOf[List[MemberDecl]]
    ClassDecl(Assoc, ident, null, null, members)
  }

  override def visitAssocMemberDeclarationList(ctx: ModelParser.AssocMemberDeclarationListContext): AnyRef = {
    ctx.assocMemberDeclaration().asScala.map(visit(_)).asInstanceOf[List[MemberDecl]]
  }
  
  override def visitAssocMemberDeclaration(ctx: ModelParser.AssocMemberDeclarationContext): AnyRef = {
	if(ctx.roleDeclaration() != null) visit(ctx.roleDeclaration())
	else if(ctx.memberDeclaration() != null) visit(ctx.memberDeclaration())
	else null
  }

  override def visitPositionalArgumentList(ctx: ModelParser.PositionalArgumentListContext): AnyRef = {
    ctx.expression().asScala.map(visit(_)).asInstanceOf[List[Exp]]
  }

  override def visitNamedArgList(ctx : ModelParser.NamedArgListContext) : AnyRef = {
    visit(ctx.namedArgumentList()).asInstanceOf[List[NamedArg]]
  }
  
  override def visitNamedArgument(ctx: ModelParser.NamedArgumentContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    NamedArg(ident, exp)
  }
  
  override def visitNamedArgumentList(ctx : ModelParser.NamedArgumentListContext) : AnyRef = {
    ctx.namedArgument().asScala.toList.map(visit(_)).asInstanceOf[List[NamedArg]]
  }

  override def visitLongFunctionDeclaration(ctx: ModelParser.LongFunctionDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var patterns: Option[List[Pattern]] =
      if (ctx.patternList() != null)
        Some(ctx.patternList().asScala.map(visit(_)).asInstanceOf[List[Pattern]])
      else None
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var spec: List[FunSpec] =
      if (ctx.functionSpecification() != null)
        ctx.functionSpecification().asScala.map(visit(_)).asInstanceOf[List[FunSpec]]
      else
        null
    var members: Option[List[MemberDecl]] =
      if (ctx.memberDeclarationList() != null)
        Some(visit(ctx.memberDeclarationList()).asInstanceOf[List[MemberDecl]])
      else
        None
    FunDecl(ident, patterns, t, spec, members)
  }
  
  override def visitShortFunctionDeclaration(ctx : ModelParser.ShortFunctionDeclarationContext) : AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var patterns: Option[List[Pattern]] =
      if (ctx.patternList() != null)
        Some(ctx.patternList().asScala.map(visit(_)).asInstanceOf[List[Pattern]])
      else None
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var exp : Exp = visit(ctx.expression()).asInstanceOf[Exp]
    ShortFunDecl(ident, patterns, t, exp)
  }

  override def visitFunctionSpecification(ctx: ModelParser.FunctionSpecificationContext): AnyRef = {
    var pre : Boolean = 
      if(ctx.children.get(0) == "pre") true
      else false
    var exp : Exp = visit(ctx.expression()).asInstanceOf[Exp]
    FunSpec(pre, exp)
  }

  override def visitFunctionDeclaration(ctx: ModelParser.FunctionDeclarationContext): AnyRef = {
    if (ctx.shortFunctionDeclaration() != null)
      visit(ctx.shortFunctionDeclaration()).asInstanceOf[FunDecl]
    else
      visit(ctx.longFunctionDeclaration()).asInstanceOf[FunDecl]
  }

  override def visitVariableDeclaration(ctx: ModelParser.VariableDeclarationContext): AnyRef = {
    val pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    val expr: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    VarDecl(pattern, expr)
  }

  override def visitCollectionOrType(ctx: ModelParser.CollectionOrTypeContext): AnyRef = {
    if (ctx.expression() != null) {
      ExpCollection(visit(ctx.expression()).asInstanceOf[Exp])
    } else {
      TypeCollection(visit(ctx.`type`()).asInstanceOf[Type])
    }
  }

  override def visitSortDeclaration(ctx: ModelParser.SortDeclarationContext): AnyRef = {
    SortDecl(ctx.Identifier().getText())
  }

  override def visitIdValueList(ctx: ModelParser.IdValueListContext): AnyRef = {
    null
  }

  override def visitExpressionOrStar(ctx: ModelParser.ExpressionOrStarContext): AnyRef = {
    if (ctx.expression() != null) {
      visit(ctx.expression()).asInstanceOf[Exp]
    } else {
      StarExp
    }
  }

  override def visitIdValuePair(ctx: ModelParser.IdValuePairContext): AnyRef = {
    val ident: String = ctx.Identifier().getText()
    val value: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    null
  }

  override def visitValueDeclaration(ctx: ModelParser.ValueDeclarationContext): AnyRef = {
    val pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var exp: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    ValDecl(pattern, exp)
  }

  override def visitMatch(ctx : ModelParser.MatchContext) : AnyRef = {
    var patterns : List[Pattern] = ctx.pattern().asScala.toList.map(visit(_)).asInstanceOf[List[Pattern]]
    var exp : Exp = visit(ctx.expression()).asInstanceOf[Exp]
    MatchCase(patterns, exp)
  }
  
  override def visitMatchExp(ctx: ModelParser.MatchExpContext): AnyRef = {
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var m: List[MatchCase] = ctx.`match`().asScala.map(visit(_)).asInstanceOf[List[MatchCase]]
    MatchExp(exp, m)
  }

  override def visitMultiplicity(ctx : ModelParser.MultiplicityContext) : AnyRef = {
	var start : Exp = visit(ctx.expressionOrStar(0)).asInstanceOf[Exp]
	var end : Option[Exp] = 
	  if(ctx.expressionOrStar(1) != null) 
	    Some(visit(ctx.expressionOrStar(1)).asInstanceOf[Exp])
	  else 
	    None
	Multiplicity(start, end)
  }
  
  override def visitPartDeclaration (ctx : ModelParser.PartDeclarationContext) : AnyRef = {
    var ident0 : String = ctx.Identifier(0).getText()
    var ident1 : String = ctx.Identifier(1).getText()
    var mult : Option[Multiplicity] = 
      if(ctx.multiplicity() != null) 
        Some(visit(ctx.multiplicity()).asInstanceOf[Multiplicity])
      else
        None
    PartRefDecl(true, ident0, ident1, mult)
  }

  override def visitRefDeclaration (ctx : ModelParser.RefDeclarationContext) : AnyRef = {
    var ident0 : String = ctx.Identifier(0).getText()
    var ident1 : String = ctx.Identifier(1).getText()
    var mult : Option[Multiplicity] = 
      if(ctx.multiplicity() != null) 
        Some(visit(ctx.multiplicity()).asInstanceOf[Multiplicity])
      else
        None
    PartRefDecl(false, ident0, ident1, mult)
  }

  override def visitRoleDeclaration(ctx : ModelParser.RoleDeclarationContext) : AnyRef = {
	if(ctx.refDeclaration() != null) visit(ctx.refDeclaration())
	else if (ctx.partDeclaration() != null) visit(ctx.partDeclaration())
	else null
  }
  
  override def visitTypeCheckExp(ctx : ModelParser.TypeCheckExpContext) : AnyRef = {
	var exp : Exp = visit(ctx.expression()).asInstanceOf[Exp]
	var t : Type = visit(ctx.`type`()).asInstanceOf[Type]
	TypeCastCheckExp(false, exp, t)
  }
  
  override def visitTypeCastExp (ctx : ModelParser.TypeCastExpContext) : AnyRef = {
    var exp : Exp = visit(ctx.expression()).asInstanceOf[Exp]
	var t : Type = visit(ctx.`type`()).asInstanceOf[Type]
	TypeCastCheckExp(true, exp, t)
  }
  
  override def visitReturnExp(ctx : ModelParser.ReturnExpContext)  : AnyRef = {
    ReturnExp(visit(ctx.expression()).asInstanceOf[Exp])
  }
  
  override def visitBreakExp(ctx : ModelParser.BreakExpContext) : AnyRef = {
    BreakExp
  }
  
  override def visitContinueExp(ctx : ModelParser.ContinueExpContext) : AnyRef = {
    ContinueExp
  }
  
  override def visitResultExp (ctx : ModelParser.ResultExpContext) : AnyRef = {
    ResultExp
  }
  
  override def visitExtending (ctx : ModelParser.ExtendingContext) : AnyRef = {
    ctx.`type`().asScala.toList.map(visit(_)).asInstanceOf[List[Type]]
  }
  
  override def visitDontCarePattern(ctx : ModelParser.DontCarePatternContext) : AnyRef = {
    DontCarePattern
  }
  
  override def visitPosArgList(ctx : ModelParser.PosArgListContext) : AnyRef = {
    visit(ctx.positionalArgumentList())
  }
  
}