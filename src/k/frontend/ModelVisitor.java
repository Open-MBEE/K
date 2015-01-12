// Generated from ..\grammar\Model.g4 by ANTLR 4.4
package k.frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModelParser#sortDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDeclaration(@NotNull ModelParser.SortDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumExp(@NotNull ModelParser.SetEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFFExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFFExp(@NotNull ModelParser.IFFExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull ModelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCompExp(@NotNull ModelParser.ListCompExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEnumExp(@NotNull ModelParser.ListEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp3Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp3Exp(@NotNull ModelParser.BinOp3ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExp(@NotNull ModelParser.LiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#assocDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssocDeclaration(@NotNull ModelParser.AssocDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull ModelParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentType(@NotNull ModelParser.IdentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclaration(@NotNull ModelParser.TopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull ModelParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalType(@NotNull ModelParser.OptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExp(@NotNull ModelParser.BlockExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#longFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongFunctionDeclaration(@NotNull ModelParser.LongFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternList(@NotNull ModelParser.PatternListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(@NotNull ModelParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCompExp(@NotNull ModelParser.MapCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(@NotNull ModelParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExp(@NotNull ModelParser.MatchExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBinding(@NotNull ModelParser.RngBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOrType(@NotNull ModelParser.CollectionOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull ModelParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull ModelParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentPattern(@NotNull ModelParser.IdentPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ModelParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull ModelParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(@NotNull ModelParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianPattern(@NotNull ModelParser.CartesianPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(@NotNull ModelParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExp(@NotNull ModelParser.TupleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#valueDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclaration(@NotNull ModelParser.ValueDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRngExp(@NotNull ModelParser.ListRngExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull ModelParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull ModelParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(@NotNull ModelParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#mapPairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPairList(@NotNull ModelParser.MapPairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#mapPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPair(@NotNull ModelParser.MapPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#positionalArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgumentList(@NotNull ModelParser.PositionalArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#memberDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationList(@NotNull ModelParser.MemberDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(@NotNull ModelParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExp(@NotNull ModelParser.ForallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExp(@NotNull ModelParser.LambdaExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull ModelParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(@NotNull ModelParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#topDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclarationList(@NotNull ModelParser.TopDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgList}
	 * labeled alternative in {@link ModelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgList(@NotNull ModelParser.NamedArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp1Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp1Exp(@NotNull ModelParser.BinOp1ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#assocMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssocMemberDeclaration(@NotNull ModelParser.AssocMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenType(@NotNull ModelParser.ParenTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExp(@NotNull ModelParser.ForExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#multiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicity(@NotNull ModelParser.MultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCheckExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCheckExp(@NotNull ModelParser.TypeCheckExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#partDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDeclaration(@NotNull ModelParser.PartDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull ModelParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(@NotNull ModelParser.IdentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExp(@NotNull ModelParser.TypeCastExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExp(@NotNull ModelParser.ExistsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPattern(@NotNull ModelParser.LiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(@NotNull ModelParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedPattern(@NotNull ModelParser.TypedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull ModelParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(@NotNull ModelParser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull ModelParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp2Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp2Exp(@NotNull ModelParser.BinOp2ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(@NotNull ModelParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExp(@NotNull ModelParser.BreakExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompExp(@NotNull ModelParser.SetCompExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#refDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefDeclaration(@NotNull ModelParser.RefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#namedArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentList(@NotNull ModelParser.NamedArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(@NotNull ModelParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExp(@NotNull ModelParser.WhileExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtending(@NotNull ModelParser.ExtendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBindingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBindingList(@NotNull ModelParser.RngBindingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(@NotNull ModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResultExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExp(@NotNull ModelParser.ResultExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull ModelParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppExp(@NotNull ModelParser.AppExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DontCarePattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDontCarePattern(@NotNull ModelParser.DontCarePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#shortFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortFunctionDeclaration(@NotNull ModelParser.ShortFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull ModelParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertExp(@NotNull ModelParser.AssertExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(@NotNull ModelParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrStar(@NotNull ModelParser.ExpressionOrStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosArgList}
	 * labeled alternative in {@link ModelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosArgList(@NotNull ModelParser.PosArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecification(@NotNull ModelParser.FunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExp(@NotNull ModelParser.DotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueExp(@NotNull ModelParser.ContinueExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#roleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleDeclaration(@NotNull ModelParser.RoleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(@NotNull ModelParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRngExp(@NotNull ModelParser.SetRngExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(@NotNull ModelParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianType(@NotNull ModelParser.CartesianTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull ModelParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#assocBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssocBlock(@NotNull ModelParser.AssocBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEnumExp(@NotNull ModelParser.MapEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimType(@NotNull ModelParser.PrimTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ModelParser.LiteralContext ctx);
}