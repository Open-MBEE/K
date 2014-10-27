package k.frontend

import scala.collection.JavaConverters._
import k.frontend.ModelBaseVisitor
import k.frontend.ModelParser
import java.lang.Float

class KScalaVisitor extends ModelBaseVisitor[AnyRef] {

  var stack: List[AnyRef] = Nil

  override def visitModel(ctx: ModelParser.ModelContext): AnyRef = {
    var packageDecl: Option[PackageDecl] =
      if (ctx.packageDeclaration() != null) Some(visit(ctx.packageDeclaration()).asInstanceOf[PackageDecl])
      else None
    var importDecls: List[ImportDecl] = ctx.importDeclaration().asScala.toList.map(visit(_).asInstanceOf[ImportDecl])
    var topDecls: List[TopDecl] = ctx.topDeclaration().asScala.toList.map(visit(_).asInstanceOf[TopDecl])
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

  override def visitSubType(ctx: ModelParser.SubTypeContext): AnyRef = {
    var t: Typing = visit(ctx.typing()).asInstanceOf[Typing]
    var e: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    SubType(t, e)
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

  override def visitRangeType(ctx: ModelParser.RangeTypeContext): AnyRef = {
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var e1: Exp = visit(ctx.expressionOrStar(0)).asInstanceOf[Exp]
    var e2: Option[Exp] =
      if (ctx.expressionOrStar(1) != null) Some(visit(ctx.expressionOrStar(1)).asInstanceOf[Exp])
      else None
    MultType(t, e1, e2)
  }

  override def visitOptionalType(ctx: ModelParser.OptionalTypeContext): AnyRef = {
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    NullableType(t)
  }

  override def visitTypeArguments(ctx: ModelParser.TypeArgumentsContext): AnyRef = {
    var types: List[ModelParser.TypeContext] = ctx.`type`().asScala.toList
    types.map(visit(_).asInstanceOf[Type])
  }

  override def visitTyping(ctx: ModelParser.TypingContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var t: Type = visit(ctx.`type`()).asInstanceOf[Type]
    Typing(ident, t)
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

  override def visitCreateExp(ctx: ModelParser.CreateExpContext): AnyRef = {
    var qn: QualifiedName = visit(ctx.qualifiedName()).asInstanceOf[QualifiedName]
    var args: List[ClassArgument] = visit(ctx.classArgumentList()).asInstanceOf[List[ClassArgument]]
    CreateExp(qn, args)
  }

  override def visitAppExp(ctx: ModelParser.AppExpContext): AnyRef = {

    var e0: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.bracketedexpression()).asInstanceOf[Exp]
    FunApplExp(e0, e1)
  }

  override def visitIfExp(ctx: ModelParser.IfExpContext): AnyRef = {
    var e0: Exp = visit(ctx.expression(0)).asInstanceOf[Exp]
    var e1: Exp = visit(ctx.expression(1)).asInstanceOf[Exp]
    var e2: Exp = visit(ctx.expression(2)).asInstanceOf[Exp]
    IfExp(e0, e1, e2)
  }

  override def visitDoExp(ctx: ModelParser.DoExpContext): AnyRef = {
    var body: List[MemberDecl] = ctx.memberDeclaration().asScala.toList.map(visit(_).asInstanceOf[MemberDecl])
    DoExp(body)
  }

  override def visitWhileExp(ctx: ModelParser.WhileExpContext): AnyRef = {
    var cond: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var body: List[MemberDecl] = ctx.memberDeclaration().asScala.toList.map(visit(_).asInstanceOf[MemberDecl])
    WhileExp(cond, body)
  }

  override def visitForExp(ctx: ModelParser.ForExpContext): AnyRef = {
    var pattern: Pattern = visit(ctx.pattern()).asInstanceOf[Pattern]
    var t: Option[Type] = if (ctx.`type`() == null) None else
      Some(visit(ctx.`type`()).asInstanceOf[Type])
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    var body: List[MemberDecl] = ctx.memberDeclaration().asScala.toList.map(visit(_).asInstanceOf[MemberDecl])
    ForExp(pattern, t, exp, body)
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
    var t: Option[Type] =
      if (ctx.`type`() != null) Some(visit(ctx.`type`()).asInstanceOf[Type])
      else None
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    LambdaExp(pat, t, exp)
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

  override def visitClassArgumentList(ctx: ModelParser.ClassArgumentListContext): AnyRef = {
    ctx.classArgument().asScala.map(visit(_).asInstanceOf[ClassArgument]).toList
  }

  override def visitClassArgument(ctx: ModelParser.ClassArgumentContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var exp: Exp = visit(ctx.expression()).asInstanceOf[Exp]
    ClassArgument(ident, exp)
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

  override def visitTypeParameters(ctx: ModelParser.TypeParametersContext): AnyRef = {
    ctx.typeParameter().asScala.toList.map(visit(_).asInstanceOf[TypeParam])
  }

  override def visitExpressionsWithSeparator(ctx: ModelParser.ExpressionsWithSeparatorContext): AnyRef = {
    ExpressionDecl(visit(ctx.expression()).asInstanceOf[Exp])
  }

  override def visitTypingList(ctx: ModelParser.TypingListContext): AnyRef = {
    ctx.typing().asScala.toList.map(visit(_).asInstanceOf[Typing])
  }

  override def visitMemberDeclaration(ctx: ModelParser.MemberDeclarationContext): AnyRef = {
    if (ctx.sortDeclaration() != null) visit(ctx.sortDeclaration())
    else if (ctx.typeDeclaration() != null) visit(ctx.typeDeclaration())
    else if (ctx.sortDeclaration() != null) visit(ctx.sortDeclaration())
    else if (ctx.valueDeclaration() != null) visit(ctx.valueDeclaration())
    else if (ctx.variableDeclaration() != null) visit(ctx.variableDeclaration())
    else if (ctx.functionDeclaration() != null) visit(ctx.functionDeclaration())
    else if (ctx.constraint() != null) visit(ctx.constraint())
    else if (ctx.expressionsWithSeparator() != null) visit(ctx.expressionsWithSeparator())
    else null
  }

  override def visitTopDeclaration(ctx: ModelParser.TopDeclarationContext): AnyRef = {
    if (ctx.classDeclaration() != null) visit(ctx.classDeclaration())
    else if (ctx.memberDeclaration() != null) {
      visit(ctx.memberDeclaration())
    } else null
  }

  override def visitClassDeclaration(ctx: ModelParser.ClassDeclarationContext): AnyRef = {
    var classToken: ClassToken = visit(ctx.classToken()).asInstanceOf[ClassToken]
    var ident: String = ctx.Identifier().getText()
    var typeParams: List[TypeParam] =
      if (ctx.typeParameters() == null) Nil
      else visit(ctx.typeParameters()).asInstanceOf[List[TypeParam]]
    var valueParams : List[Typing] =
      if (ctx.valueParameters() == null) Nil
      else visit(ctx.valueParameters()).asInstanceOf[List[Typing]]
    var extending : List[Type] =
      if (ctx.extending() == null) Nil
      else visit(ctx.extending()).asInstanceOf[List[Type]]   
    var members: List[MemberDecl] = ctx.memberDeclaration().asScala.toList.map(visit(_).asInstanceOf[MemberDecl])
    ClassDecl(classToken, ident, typeParams, valueParams, extending, members)
  }

  override def visitFunctionDeclaration(ctx: ModelParser.FunctionDeclarationContext): AnyRef = {
    var ident: String = ctx.Identifier().getText()
    var args: List[List[Typing]] = ctx.typingList().asScala.toList.map(visit(_).asInstanceOf[List[Typing]])
    var resType: Type = visit(ctx.`type`()).asInstanceOf[Type]
    var body: List[MemberDecl] = ctx.memberDeclaration().asScala.toList.map(visit(_).asInstanceOf[MemberDecl])
    FunDecl(ident, args, resType, body)
  }

  override def visitClassToken(ctx: ModelParser.ClassTokenContext): AnyRef = {
    ctx.getText().toString() match {
      case "class" => Class
      case "assoc" => Assoc
    }
  }

  override def visitVariableDeclaration(ctx: ModelParser.VariableDeclarationContext): AnyRef = {
    val typing: Typing = visit(ctx.typing()).asInstanceOf[Typing]
    val expr: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    VarDecl(typing, expr)
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
    var typing: Typing = visit(ctx.typing()).asInstanceOf[Typing]
    var exp: Option[Exp] =
      if (ctx.expression() != null) Some(visit(ctx.expression()).asInstanceOf[Exp])
      else None
    ValDecl(typing, exp)
  }

}