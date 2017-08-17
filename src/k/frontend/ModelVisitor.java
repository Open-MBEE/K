// Generated from Model.g4 by ANTLR 4.7
package k.frontend;
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
	 * Visit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(ModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#modelThings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelThings(ModelParser.ModelThingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#modelThing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelThing(ModelParser.ModelThingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ModelParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ModelParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(ModelParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ModelParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclaration(ModelParser.TopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#entityDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDeclaration(ModelParser.EntityDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ModelParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ModelParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ModelParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtending(ModelParser.ExtendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ModelParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(ModelParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ModelParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ModelParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ModelParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(ModelParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ModelParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(ModelParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ModelParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecification(ModelParser.FunctionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(ModelParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#multiplicity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicity(ModelParser.MultiplicityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrStar(ModelParser.ExpressionOrStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ModelParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(ModelParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentType(ModelParser.IdentTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(ModelParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianType(ModelParser.CartesianTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimType(ModelParser.PrimTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenType(ModelParser.ParenTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ModelParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassIdentifier(ModelParser.ClassIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#collectionKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionKind(ModelParser.CollectionKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ModelParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExp(ModelParser.LiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(ModelParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(ModelParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExp(ModelParser.ExistsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumExp(ModelParser.SetEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExp(ModelParser.IndexExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakExp(ModelParser.BreakExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrevExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevExp(ModelParser.PrevExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExp(ModelParser.BlockExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp2Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp2Exp(ModelParser.BinOp2ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExp(ModelParser.TupleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExp(ModelParser.WhileExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRngExp(ModelParser.SetRngExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(ModelParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(ModelParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(ModelParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppExp(ModelParser.AppExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCheckExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCheckExp(ModelParser.TypeCheckExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(ModelParser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFFExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFFExp(ModelParser.IFFExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompExp(ModelParser.SetCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ResultExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExp(ModelParser.ResultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertExp(ModelParser.AssertExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExp(ModelParser.LambdaExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp1Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp1Exp(ModelParser.BinOp1ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExp(ModelParser.ForallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp3Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp3Exp(ModelParser.BinOp3ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(ModelParser.IdentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExp(ModelParser.DotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExp(ModelParser.ForExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(ModelParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueExp(ModelParser.ContinueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExp(ModelParser.MatchExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(ModelParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExp(ModelParser.ClassExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExp(ModelParser.TypeCastExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(ModelParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosArgList}
	 * labeled alternative in {@link ModelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosArgList(ModelParser.PosArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArgList}
	 * labeled alternative in {@link ModelParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgList(ModelParser.NamedArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#positionalArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgumentList(ModelParser.PositionalArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#namedArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgumentList(ModelParser.NamedArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(ModelParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOrType(ModelParser.CollectionOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBindingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBindingList(ModelParser.RngBindingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBinding(ModelParser.RngBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternList(ModelParser.PatternListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPattern(ModelParser.LiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DontCarePattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDontCarePattern(ModelParser.DontCarePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentPattern(ModelParser.IdentPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianPattern(ModelParser.CartesianPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedPattern(ModelParser.TypedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(ModelParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ModelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ModelParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ModelParser.LiteralContext ctx);
}