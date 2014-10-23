// Generated from Model.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(@NotNull ModelParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(@NotNull ModelParser.NotExpContext ctx);
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
	 * Enter a parse tree produced by the {@code CartesianType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCartesianType(@NotNull ModelParser.CartesianTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CartesianType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCartesianType(@NotNull ModelParser.CartesianTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExp}
	 * labeled alternative in {@link ModelParser#bracketedexpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExp(@NotNull ModelParser.TupleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExp}
	 * labeled alternative in {@link ModelParser#bracketedexpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExp(@NotNull ModelParser.TupleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSetType(@NotNull ModelParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSetType(@NotNull ModelParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AppExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAppExp(@NotNull ModelParser.AppExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AppExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAppExp(@NotNull ModelParser.AppExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterListType(@NotNull ModelParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitListType(@NotNull ModelParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimType(@NotNull ModelParser.PrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimType(@NotNull ModelParser.PrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFFExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIFFExp(@NotNull ModelParser.IFFExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFFExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIFFExp(@NotNull ModelParser.IFFExpContext ctx);
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
	 * Enter a parse tree produced by the {@code AssertExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssertExp(@NotNull ModelParser.AssertExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssertExp(@NotNull ModelParser.AssertExpContext ctx);
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
	 * Enter a parse tree produced by the {@code FuncType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(@NotNull ModelParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(@NotNull ModelParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExp(@NotNull ModelParser.LambdaExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExp(@NotNull ModelParser.LambdaExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ForallExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterForallExp(@NotNull ModelParser.ForallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitForallExp(@NotNull ModelParser.ForallExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ModelParser#bracketedexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(@NotNull ModelParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ModelParser#bracketedexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(@NotNull ModelParser.ParenExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ExistsExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExistsExp(@NotNull ModelParser.ExistsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExistsExp(@NotNull ModelParser.ExistsExpContext ctx);
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
	 * Enter a parse tree produced by the {@code BinOp2Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOp2Exp(@NotNull ModelParser.BinOp2ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp2Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOp2Exp(@NotNull ModelParser.BinOp2ExpContext ctx);
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
	 * Enter a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ModelParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ModelParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RangeType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterRangeType(@NotNull ModelParser.RangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RangeType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitRangeType(@NotNull ModelParser.RangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(@NotNull ModelParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(@NotNull ModelParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListRngExp(@NotNull ModelParser.ListRngExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListRngExp(@NotNull ModelParser.ListRngExpContext ctx);
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
	 * Enter a parse tree produced by the {@code ListCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListCompExp(@NotNull ModelParser.ListCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListCompExp(@NotNull ModelParser.ListCompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetCompExp(@NotNull ModelParser.SetCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetCompExp(@NotNull ModelParser.SetCompExpContext ctx);
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
	 * Enter a parse tree produced by the {@code MapEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapEnumExp(@NotNull ModelParser.MapEnumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapEnumExp(@NotNull ModelParser.MapEnumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExp(@NotNull ModelParser.DotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExp(@NotNull ModelParser.DotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(@NotNull ModelParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(@NotNull ModelParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#classToken}.
	 * @param ctx the parse tree
	 */
	void enterClassToken(@NotNull ModelParser.ClassTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#classToken}.
	 * @param ctx the parse tree
	 */
	void exitClassToken(@NotNull ModelParser.ClassTokenContext ctx);
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
	 * Enter a parse tree produced by the {@code CreateExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCreateExp(@NotNull ModelParser.CreateExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCreateExp(@NotNull ModelParser.CreateExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetEnumExp(@NotNull ModelParser.SetEnumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetEnumExp(@NotNull ModelParser.SetEnumExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#tokenStar}.
	 * @param ctx the parse tree
	 */
	void enterTokenStar(@NotNull ModelParser.TokenStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenStar}.
	 * @param ctx the parse tree
	 */
	void exitTokenStar(@NotNull ModelParser.TokenStarContext ctx);
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
	 * Enter a parse tree produced by the {@code ParenType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterParenType(@NotNull ModelParser.ParenTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitParenType(@NotNull ModelParser.ParenTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterMapType(@NotNull ModelParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitMapType(@NotNull ModelParser.MapTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code ListEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListEnumExp(@NotNull ModelParser.ListEnumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListEnumExp(@NotNull ModelParser.ListEnumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(@NotNull ModelParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(@NotNull ModelParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(@NotNull ModelParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(@NotNull ModelParser.OrExpContext ctx);
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
	 * Enter a parse tree produced by the {@code SubType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSubType(@NotNull ModelParser.SubTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSubType(@NotNull ModelParser.SubTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentType(@NotNull ModelParser.IdentTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentType(@NotNull ModelParser.IdentTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code BinOp1Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOp1Exp(@NotNull ModelParser.BinOp1ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp1Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOp1Exp(@NotNull ModelParser.BinOp1ExpContext ctx);
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
	 * Enter a parse tree produced by the {@code OptionalType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterOptionalType(@NotNull ModelParser.OptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitOptionalType(@NotNull ModelParser.OptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExp(@NotNull ModelParser.MatchExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExp(@NotNull ModelParser.MatchExpContext ctx);
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
	 * Enter a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp(@NotNull ModelParser.LiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp(@NotNull ModelParser.LiteralExpContext ctx);
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
	 * Enter a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(@NotNull ModelParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(@NotNull ModelParser.AndExpContext ctx);
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
	 * Enter a parse tree produced by the {@code SetRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetRngExp(@NotNull ModelParser.SetRngExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetRngExp(@NotNull ModelParser.SetRngExpContext ctx);
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
	 * Enter a parse tree produced by the {@code IdentPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentPattern(@NotNull ModelParser.IdentPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentPattern(@NotNull ModelParser.IdentPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMapCompExp(@NotNull ModelParser.MapCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMapCompExp(@NotNull ModelParser.MapCompExpContext ctx);
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
	 * Enter a parse tree produced by the {@code BracketedExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketedExp(@NotNull ModelParser.BracketedExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketedExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketedExp(@NotNull ModelParser.BracketedExpContext ctx);
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
	 * Enter a parse tree produced by the {@code BinOp3Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOp3Exp(@NotNull ModelParser.BinOp3ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp3Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOp3Exp(@NotNull ModelParser.BinOp3ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CartesianPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterCartesianPattern(@NotNull ModelParser.CartesianPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CartesianPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitCartesianPattern(@NotNull ModelParser.CartesianPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentExp(@NotNull ModelParser.IdentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentExp(@NotNull ModelParser.IdentExpContext ctx);
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
	 * Enter a parse tree produced by {@link ModelParser#tokenArrow}.
	 * @param ctx the parse tree
	 */
	void enterTokenArrow(@NotNull ModelParser.TokenArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#tokenArrow}.
	 * @param ctx the parse tree
	 */
	void exitTokenArrow(@NotNull ModelParser.TokenArrowContext ctx);
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
	 * Enter a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrStar(@NotNull ModelParser.ExpressionOrStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrStar(@NotNull ModelParser.ExpressionOrStarContext ctx);
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
}