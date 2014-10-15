package k.frontend;

// Generated from ../grammar/Model.g4 by ANTLR 4.4
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
	 * Visit a parse tree produced by {@link ModelParser#tokenIFF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenIFF(@NotNull ModelParser.TokenIFFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ModelParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#sortDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDeclaration(@NotNull ModelParser.SortDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull ModelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ModelParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenGreatherThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenGreatherThan(@NotNull ModelParser.TokenGreatherThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull ModelParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenLessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenLessThan(@NotNull ModelParser.TokenLessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyping(@NotNull ModelParser.TypingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull ModelParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclaration(@NotNull ModelParser.TopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull ModelParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull ModelParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternList(@NotNull ModelParser.PatternListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#matchArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchArgument(@NotNull ModelParser.MatchArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenImplies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenImplies(@NotNull ModelParser.TokenImpliesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#valueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueParameters(@NotNull ModelParser.ValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBinding(@NotNull ModelParser.RngBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(@NotNull ModelParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenEquals(@NotNull ModelParser.TokenEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOrType(@NotNull ModelParser.CollectionOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtending(@NotNull ModelParser.ExtendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull ModelParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArgumentList(@NotNull ModelParser.ClassArgumentListContext ctx);
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
	 * Visit a parse tree produced by {@link ModelParser#idValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValueList(@NotNull ModelParser.IdValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull ModelParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenNot(@NotNull ModelParser.TokenNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenAnd(@NotNull ModelParser.TokenAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull ModelParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull ModelParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenOr(@NotNull ModelParser.TokenOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenLessThanEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenLessThanEqual(@NotNull ModelParser.TokenLessThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassToken(@NotNull ModelParser.ClassTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull ModelParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrStar(@NotNull ModelParser.ExpressionOrStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenGreaterThanEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenGreaterThanEqual(@NotNull ModelParser.TokenGreaterThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#idValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValuePair(@NotNull ModelParser.IdValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#valueDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclaration(@NotNull ModelParser.ValueDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link ModelParser#expressionsWithSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithSeparator(@NotNull ModelParser.ExpressionsWithSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArgument(@NotNull ModelParser.ClassArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull ModelParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#matchPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchPattern(@NotNull ModelParser.MatchPatternContext ctx);
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
	 * Visit a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull ModelParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypingList(@NotNull ModelParser.TypingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull ModelParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ModelParser.LiteralContext ctx);
}