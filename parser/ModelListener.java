// Generated from Model.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenIFF}.
	 * @param ctx the parse tree
	 */
	void enterTokenIFF(@NotNull ModelParser.TokenIFFContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenIFF}.
	 * @param ctx the parse tree
	 */
	void exitTokenIFF(@NotNull ModelParser.TokenIFFContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ModelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ModelParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSortDeclaration(@NotNull ModelParser.SortDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#sortDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSortDeclaration(@NotNull ModelParser.SortDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ModelParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ModelParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenGreatherThan}.
	 * @param ctx the parse tree
	 */
	void enterTokenGreatherThan(@NotNull ModelParser.TokenGreatherThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenGreatherThan}.
	 * @param ctx the parse tree
	 */
	void exitTokenGreatherThan(@NotNull ModelParser.TokenGreatherThanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ModelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ModelParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull ModelParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull ModelParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenLessThan}.
	 * @param ctx the parse tree
	 */
	void enterTokenLessThan(@NotNull ModelParser.TokenLessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenLessThan}.
	 * @param ctx the parse tree
	 */
	void exitTokenLessThan(@NotNull ModelParser.TokenLessThanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typing}.
	 * @param ctx the parse tree
	 */
	void enterTyping(@NotNull ModelParser.TypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typing}.
	 * @param ctx the parse tree
	 */
	void exitTyping(@NotNull ModelParser.TypingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull ModelParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull ModelParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTopDeclaration(@NotNull ModelParser.TopDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTopDeclaration(@NotNull ModelParser.TopDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull ModelParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull ModelParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull ModelParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull ModelParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 */
	void enterPatternList(@NotNull ModelParser.PatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 */
	void exitPatternList(@NotNull ModelParser.PatternListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#matchArgument}.
	 * @param ctx the parse tree
	 */
	void enterMatchArgument(@NotNull ModelParser.MatchArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#matchArgument}.
	 * @param ctx the parse tree
	 */
	void exitMatchArgument(@NotNull ModelParser.MatchArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenImplies}.
	 * @param ctx the parse tree
	 */
	void enterTokenImplies(@NotNull ModelParser.TokenImpliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenImplies}.
	 * @param ctx the parse tree
	 */
	void exitTokenImplies(@NotNull ModelParser.TokenImpliesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#valueParameters}.
	 * @param ctx the parse tree
	 */
	void enterValueParameters(@NotNull ModelParser.ValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#valueParameters}.
	 * @param ctx the parse tree
	 */
	void exitValueParameters(@NotNull ModelParser.ValueParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 */
	void enterRngBinding(@NotNull ModelParser.RngBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 */
	void exitRngBinding(@NotNull ModelParser.RngBindingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(@NotNull ModelParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(@NotNull ModelParser.MatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenEquals}.
	 * @param ctx the parse tree
	 */
	void enterTokenEquals(@NotNull ModelParser.TokenEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenEquals}.
	 * @param ctx the parse tree
	 */
	void exitTokenEquals(@NotNull ModelParser.TokenEqualsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOrType(@NotNull ModelParser.CollectionOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOrType(@NotNull ModelParser.CollectionOrTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 */
	void enterExtending(@NotNull ModelParser.ExtendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 */
	void exitExtending(@NotNull ModelParser.ExtendingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull ModelParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull ModelParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#classArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterClassArgumentList(@NotNull ModelParser.ClassArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#classArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitClassArgumentList(@NotNull ModelParser.ClassArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#rngBindingList}.
	 * @param ctx the parse tree
	 */
	void enterRngBindingList(@NotNull ModelParser.RngBindingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#rngBindingList}.
	 * @param ctx the parse tree
	 */
	void exitRngBindingList(@NotNull ModelParser.RngBindingListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull ModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull ModelParser.ModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#idValueList}.
	 * @param ctx the parse tree
	 */
	void enterIdValueList(@NotNull ModelParser.IdValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#idValueList}.
	 * @param ctx the parse tree
	 */
	void exitIdValueList(@NotNull ModelParser.IdValueListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull ModelParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull ModelParser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenNot}.
	 * @param ctx the parse tree
	 */
	void enterTokenNot(@NotNull ModelParser.TokenNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenNot}.
	 * @param ctx the parse tree
	 */
	void exitTokenNot(@NotNull ModelParser.TokenNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenAnd}.
	 * @param ctx the parse tree
	 */
	void enterTokenAnd(@NotNull ModelParser.TokenAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenAnd}.
	 * @param ctx the parse tree
	 */
	void exitTokenAnd(@NotNull ModelParser.TokenAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull ModelParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull ModelParser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull ModelParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull ModelParser.IdentifierListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenOr}.
	 * @param ctx the parse tree
	 */
	void enterTokenOr(@NotNull ModelParser.TokenOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenOr}.
	 * @param ctx the parse tree
	 */
	void exitTokenOr(@NotNull ModelParser.TokenOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenLessThanEqual}.
	 * @param ctx the parse tree
	 */
	void enterTokenLessThanEqual(@NotNull ModelParser.TokenLessThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenLessThanEqual}.
	 * @param ctx the parse tree
	 */
	void exitTokenLessThanEqual(@NotNull ModelParser.TokenLessThanEqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull ModelParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull ModelParser.MemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenGreaterThanEqual}.
	 * @param ctx the parse tree
	 */
	void enterTokenGreaterThanEqual(@NotNull ModelParser.TokenGreaterThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenGreaterThanEqual}.
	 * @param ctx the parse tree
	 */
	void exitTokenGreaterThanEqual(@NotNull ModelParser.TokenGreaterThanEqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#idValuePair}.
	 * @param ctx the parse tree
	 */
	void enterIdValuePair(@NotNull ModelParser.IdValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#idValuePair}.
	 * @param ctx the parse tree
	 */
	void exitIdValuePair(@NotNull ModelParser.IdValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclaration(@NotNull ModelParser.ValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclaration(@NotNull ModelParser.ValueDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull ModelParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull ModelParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull ModelParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull ModelParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#expressionsWithSeparator}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithSeparator(@NotNull ModelParser.ExpressionsWithSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expressionsWithSeparator}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithSeparator(@NotNull ModelParser.ExpressionsWithSeparatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#classArgument}.
	 * @param ctx the parse tree
	 */
	void enterClassArgument(@NotNull ModelParser.ClassArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#classArgument}.
	 * @param ctx the parse tree
	 */
	void exitClassArgument(@NotNull ModelParser.ClassArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#matchPattern}.
	 * @param ctx the parse tree
	 */
	void enterMatchPattern(@NotNull ModelParser.MatchPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#matchPattern}.
	 * @param ctx the parse tree
	 */
	void exitMatchPattern(@NotNull ModelParser.MatchPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#mapPairList}.
	 * @param ctx the parse tree
	 */
	void enterMapPairList(@NotNull ModelParser.MapPairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#mapPairList}.
	 * @param ctx the parse tree
	 */
	void exitMapPairList(@NotNull ModelParser.MapPairListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull ModelParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull ModelParser.PatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#mapPair}.
	 * @param ctx the parse tree
	 */
	void enterMapPair(@NotNull ModelParser.MapPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#mapPair}.
	 * @param ctx the parse tree
	 */
	void exitMapPair(@NotNull ModelParser.MapPairContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull ModelParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull ModelParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#typingList}.
	 * @param ctx the parse tree
	 */
	void enterTypingList(@NotNull ModelParser.TypingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#typingList}.
	 * @param ctx the parse tree
	 */
	void exitTypingList(@NotNull ModelParser.TypingListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull ModelParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull ModelParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ModelParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ModelParser.LiteralContext ctx);
}