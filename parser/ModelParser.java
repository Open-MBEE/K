// Generated from ../grammar/Model.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__64=1, T__63=2, T__62=3, T__61=4, T__60=5, T__59=6, T__58=7, T__57=8, 
		T__56=9, T__55=10, T__54=11, T__53=12, T__52=13, T__51=14, T__50=15, T__49=16, 
		T__48=17, T__47=18, T__46=19, T__45=20, T__44=21, T__43=22, T__42=23, 
		T__41=24, T__40=25, T__39=26, T__38=27, T__37=28, T__36=29, T__35=30, 
		T__34=31, T__33=32, T__32=33, T__31=34, T__30=35, T__29=36, T__28=37, 
		T__27=38, T__26=39, T__25=40, T__24=41, T__23=42, T__22=43, T__21=44, 
		T__20=45, T__19=46, T__18=47, T__17=48, T__16=49, T__15=50, T__14=51, 
		T__13=52, T__12=53, T__11=54, T__10=55, T__9=56, T__8=57, T__7=58, T__6=59, 
		T__5=60, T__4=61, T__3=62, T__2=63, T__1=64, T__0=65, IntegerLiteral=66, 
		FloatingPointLiteral=67, BooleanLiteral=68, CharacterLiteral=69, StringLiteral=70, 
		Identifier=71, COMMENT=72, LINE_COMMENT=73, WS=74;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'['", "'*'", "'or'", "'!isin'", "'<'", "'!='", "'<='", 
		"'Bool'", "'}'", "'subset'", "'case'", "'%'", "'->'", "'union'", "')'", 
		"':-'", "'_'", "'@'", "'-\\'", "'='", "'<=>'", "'psubset'", "'String'", 
		"'.#'", "'Int'", "'\\'", "'Char'", "'|'", "'!'", "'..'", "']'", "'in'", 
		"'of'", "','", "'-'", "':'", "'('", "'if'", "'package'", "'{|'", "'{'", 
		"'and'", "'let'", "'isin'", "'extends'", "'else'", "'++'", "'import'", 
		"'^'", "'inter'", "'.'", "'=>'", "'+'", "'forall'", "'|}'", "';'", "'>'", 
		"'exists'", "'type'", "':='", "'then'", "'/'", "'>='", "'Float'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"Identifier", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_model = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classDeclaration = 3, RULE_typeParameters = 4, RULE_typeParameter = 5, 
		RULE_typeBound = 6, RULE_valueParameters = 7, RULE_typingList = 8, RULE_extending = 9, 
		RULE_type = 10, RULE_typeArguments = 11, RULE_memberDeclaration = 12, 
		RULE_sortDeclaration = 13, RULE_typeDeclaration = 14, RULE_variableDeclaration = 15, 
		RULE_typing = 16, RULE_functionDeclaration = 17, RULE_constraint = 18, 
		RULE_primitiveType = 19, RULE_expression = 20, RULE_idValueList = 21, 
		RULE_idValuePair = 22, RULE_match = 23, RULE_matchPattern = 24, RULE_matchArgument = 25, 
		RULE_mapPairList = 26, RULE_mapPair = 27, RULE_rngBindingList = 28, RULE_rngBinding = 29, 
		RULE_patternList = 30, RULE_collectionOrType = 31, RULE_letBindingList = 32, 
		RULE_letBinding = 33, RULE_pattern = 34, RULE_identifierList = 35, RULE_expressionList = 36, 
		RULE_qualifiedName = 37, RULE_literal = 38;
	public static final String[] ruleNames = {
		"model", "packageDeclaration", "importDeclaration", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "valueParameters", "typingList", 
		"extending", "type", "typeArguments", "memberDeclaration", "sortDeclaration", 
		"typeDeclaration", "variableDeclaration", "typing", "functionDeclaration", 
		"constraint", "primitiveType", "expression", "idValueList", "idValuePair", 
		"match", "matchPattern", "matchArgument", "mapPairList", "mapPair", "rngBindingList", 
		"rngBinding", "patternList", "collectionOrType", "letBindingList", "letBinding", 
		"pattern", "identifierList", "expressionList", "qualifiedName", "literal"
	};

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(78); packageDeclaration();
				}
			}

			setState(82);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(81); match(T__8);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(84); importDeclaration();
				setState(86);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(85); match(T__8);
					}
				}

				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(93); classDeclaration();
				setState(95);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(94); match(T__8);
					}
				}

				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(T__25);
			setState(105); qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(T__16);
			setState(108); qualifiedName();
			setState(111);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(109); match(T__13);
				setState(110); match(T__62);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(Identifier);
			setState(115);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(114); typeParameters();
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(117); valueParameters();
				}
			}

			setState(121);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(120); extending();
				}
			}

			setState(123); match(T__23);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__53) | (1L << T__45) | (1L << T__35) | (1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__10) | (1L << T__6) | (1L << T__5))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(124); memberDeclaration();
				setState(126);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(125); match(T__8);
					}
				}

				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133); match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(T__63);
			setState(136); typeParameter();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(137); match(T__30);
				setState(138); typeParameter();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(Identifier);
			setState(149);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(147); match(T__28);
				setState(148); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); type(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(152); match(T__11);
				setState(153); type(0);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueParametersContext extends ParserRuleContext {
		public TypingListContext typingList() {
			return getRuleContext(TypingListContext.class,0);
		}
		public ValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitValueParameters(this);
		}
	}

	public final ValueParametersContext valueParameters() throws RecognitionException {
		ValueParametersContext _localctx = new ValueParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(T__27);
			setState(160); typingList();
			setState(161); match(T__49);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypingListContext extends ParserRuleContext {
		public TypingContext typing(int i) {
			return getRuleContext(TypingContext.class,i);
		}
		public List<TypingContext> typing() {
			return getRuleContexts(TypingContext.class);
		}
		public TypingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypingList(this);
		}
	}

	public final TypingListContext typingList() throws RecognitionException {
		TypingListContext _localctx = new TypingListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); typing();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(164); match(T__30);
				setState(165); typing();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendingContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ExtendingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extending; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterExtending(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitExtending(this);
		}
	}

	public final ExtendingContext extending() throws RecognitionException {
		ExtendingContext _localctx = new ExtendingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(T__19);
			setState(172); type(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(173); match(T__30);
				setState(174); type(0);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			switch (_input.LA(1)) {
			case T__56:
			case T__41:
			case T__39:
			case T__37:
			case T__0:
				{
				setState(181); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(182); match(Identifier);
				setState(184);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(183); typeArguments();
					}
					break;
				}
				}
				break;
			case T__27:
				{
				setState(186); match(T__27);
				setState(187); type(0);
				setState(188); match(T__49);
				}
				break;
			case T__24:
				{
				setState(190); match(T__24);
				setState(191); typing();
				setState(192); match(T__48);
				setState(193); expression(0);
				setState(194); match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199); match(T__51);
						setState(200); type(4);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(202); match(T__62);
								setState(203); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(206); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__63);
			setState(214); type(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(215); match(T__30);
				setState(216); type(0);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222); match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public SortDeclarationContext sortDeclaration() {
			return getRuleContext(SortDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_memberDeclaration);
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227); functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228); constraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public SortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterSortDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitSortDeclaration(this);
		}
	}

	public final SortDeclarationContext sortDeclaration() throws RecognitionException {
		SortDeclarationContext _localctx = new SortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(T__5);
			setState(232); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(T__5);
			setState(235); match(Identifier);
			setState(237);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(236); typeParameters();
				}
			}

			setState(239); match(T__44);
			setState(240); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); typing();
			setState(245);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(243); match(T__44);
				setState(244); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTyping(this);
		}
	}

	public final TypingContext typing() throws RecognitionException {
		TypingContext _localctx = new TypingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(Identifier);
			setState(248); match(T__28);
			setState(249); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TypingListContext> typingList() {
			return getRuleContexts(TypingListContext.class);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypingListContext typingList(int i) {
			return getRuleContext(TypingListContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(Identifier);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252); match(T__27);
				setState(253); typingList();
				setState(254); match(T__49);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			setState(262);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(260); match(T__28);
				setState(261); type(0);
				}
			}

			setState(264); match(T__44);
			setState(265); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraint);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(Identifier);
				setState(269); match(T__23);
				setState(270); expression(0);
				setState(271); match(T__55);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__56 - 9)) | (1L << (T__41 - 9)) | (1L << (T__39 - 9)) | (1L << (T__37 - 9)) | (1L << (T__0 - 9)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LetBindingListContext letBindingList() {
			return getRuleContext(LetBindingListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IdValueListContext idValueList() {
			return getRuleContext(IdValueListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MapPairContext mapPair() {
			return getRuleContext(MapPairContext.class,0);
		}
		public MapPairListContext mapPairList() {
			return getRuleContext(MapPairListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(278); match(T__21);
				setState(279); letBindingList();
				setState(280); match(T__32);
				setState(281); expression(31);
				}
				break;
			case 2:
				{
				setState(283); match(T__35);
				setState(284); expression(26);
				}
				break;
			case 3:
				{
				setState(285); match(T__10);
				setState(286); rngBindingList();
				setState(287); match(T__48);
				setState(288); expression(16);
				}
				break;
			case 4:
				{
				setState(290); match(T__6);
				setState(291); rngBindingList();
				setState(292); match(T__48);
				setState(293); expression(15);
				}
				break;
			case 5:
				{
				setState(295); match(T__45);
				setState(296); pattern();
				setState(299);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(297); match(T__28);
					setState(298); type(0);
					}
				}

				setState(301); match(T__48);
				setState(302); expression(2);
				}
				break;
			case 6:
				{
				setState(304); match(T__27);
				setState(305); expression(0);
				setState(306); match(T__49);
				}
				break;
			case 7:
				{
				setState(308); literal();
				}
				break;
			case 8:
				{
				setState(309); match(Identifier);
				}
				break;
			case 9:
				{
				setState(310); match(T__26);
				setState(311); expression(0);
				setState(312); match(T__3);
				setState(313); expression(0);
				setState(314); match(T__18);
				setState(315); expression(0);
				}
				break;
			case 10:
				{
				setState(317); match(T__53);
				setState(318); expression(0);
				setState(319); match(T__31);
				setState(320); match();
				}
				break;
			case 11:
				{
				setState(322); match(T__27);
				setState(323); expression(0);
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(324); match(T__30);
					setState(325); expression(0);
					}
					}
					setState(328); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__30 );
				setState(330); match(T__49);
				System.out.println("@@@ TUPLE");
				}
				break;
			case 12:
				{
				setState(333); match(T__23);
				setState(335);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__53) | (1L << T__45) | (1L << T__35) | (1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__10) | (1L << T__6))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(334); expressionList();
					}
				}

				setState(337); match(T__55);
				}
				break;
			case 13:
				{
				setState(338); match(T__23);
				setState(339); expression(0);
				setState(340); match(T__34);
				setState(341); expression(0);
				setState(342); match(T__55);
				}
				break;
			case 14:
				{
				setState(344); match(T__23);
				setState(345); expression(0);
				setState(346); match(T__36);
				setState(347); rngBindingList();
				setState(348); match(T__48);
				setState(349); expression(0);
				setState(350); match(T__55);
				}
				break;
			case 15:
				{
				setState(352); match(T__63);
				setState(354);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__53) | (1L << T__45) | (1L << T__35) | (1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__10) | (1L << T__6))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(353); expressionList();
					}
				}

				setState(356); match(T__33);
				}
				break;
			case 16:
				{
				setState(357); match(T__63);
				setState(358); expression(0);
				setState(359); match(T__34);
				setState(360); expression(0);
				setState(361); match(T__33);
				}
				break;
			case 17:
				{
				setState(363); match(T__63);
				setState(364); expression(0);
				setState(365); match(T__36);
				setState(366); pattern();
				setState(367); match(T__28);
				setState(368); expression(0);
				setState(369); match(T__48);
				setState(370); expression(0);
				setState(371); match(T__33);
				}
				break;
			case 18:
				{
				setState(373); match(T__23);
				setState(375);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__53) | (1L << T__45) | (1L << T__35) | (1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__10) | (1L << T__6))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(374); mapPairList();
					}
				}

				setState(377); match(T__55);
				}
				break;
			case 19:
				{
				setState(378); match(T__23);
				setState(379); mapPair();
				setState(380); match(T__36);
				setState(381); rngBindingList();
				setState(382); match(T__48);
				setState(383); expression(0);
				setState(384); match(T__55);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(441);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(389);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__62) | (1L << T__52) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(390); expression(29);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(392);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(393); expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(395);
						_la = _input.LA(1);
						if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__59 - 6)) | (1L << (T__57 - 6)) | (1L << (T__7 - 6)) | (1L << (T__1 - 6)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(396); expression(26);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(397);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(398);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__54) | (1L << T__42) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(399); expression(25);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(400);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(401);
						_la = _input.LA(1);
						if ( !(_la==T__58 || _la==T__44) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(402); expression(24);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(403);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(404); match(T__64);
						setState(405); expression(23);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(407); match(T__36);
						setState(408); expression(22);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(410); match(T__22);
						setState(411); expression(21);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(413); match(T__61);
						setState(414); expression(20);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(416);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(417); expression(19);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(419); match(T__40);
						setState(420); expression(18);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(422);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__38) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(423); expression(14);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(424);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(425); match(T__15);
						}
						setState(426); expression(10);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(427);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(428); match(T__17);
						setState(429); expression(6);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(431); match(T__13);
						setState(432); match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(434); expression(0);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(436); match(T__46);
						setState(437); match(T__23);
						setState(438); idValueList();
						setState(439); match(T__55);
						}
						break;
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdValueListContext extends ParserRuleContext {
		public IdValuePairContext idValuePair(int i) {
			return getRuleContext(IdValuePairContext.class,i);
		}
		public List<IdValuePairContext> idValuePair() {
			return getRuleContexts(IdValuePairContext.class);
		}
		public IdValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIdValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIdValueList(this);
		}
	}

	public final IdValueListContext idValueList() throws RecognitionException {
		IdValueListContext _localctx = new IdValueListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); idValuePair();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(447); match(T__30);
				setState(448); idValuePair();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIdValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIdValuePair(this);
		}
	}

	public final IdValuePairContext idValuePair() throws RecognitionException {
		IdValuePairContext _localctx = new IdValuePairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(Identifier);
			setState(455); match(T__4);
			setState(456); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchContext extends ParserRuleContext {
		public MatchPatternContext matchPattern() {
			return getRuleContext(MatchPatternContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMatch(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); matchPattern();
			setState(459); match(T__12);
			setState(460); expression(0);
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(461); match(T__36);
				setState(462); match();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchPatternContext extends ParserRuleContext {
		public List<MatchPatternContext> matchPattern() {
			return getRuleContexts(MatchPatternContext.class);
		}
		public List<MatchArgumentContext> matchArgument() {
			return getRuleContexts(MatchArgumentContext.class);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public MatchArgumentContext matchArgument(int i) {
			return getRuleContext(MatchArgumentContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MatchPatternContext matchPattern(int i) {
			return getRuleContext(MatchPatternContext.class,i);
		}
		public MatchPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMatchPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMatchPattern(this);
		}
	}

	public final MatchPatternContext matchPattern() throws RecognitionException {
		MatchPatternContext _localctx = new MatchPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_matchPattern);
		int _la;
		try {
			setState(491);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); literal();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); match(T__47);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(467); match(Identifier);
				setState(479);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(468); match(T__27);
					setState(469); matchArgument();
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__30) {
						{
						{
						setState(470); match(T__30);
						setState(471); matchArgument();
						}
						}
						setState(476);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(477); match(T__49);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(481); match(T__27);
				setState(482); matchPattern();
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(483); match(T__30);
					setState(484); matchPattern();
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__30 );
				setState(489); match(T__49);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchArgumentContext extends ParserRuleContext {
		public MatchPatternContext matchPattern() {
			return getRuleContext(MatchPatternContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public MatchArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMatchArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMatchArgument(this);
		}
	}

	public final MatchArgumentContext matchArgument() throws RecognitionException {
		MatchArgumentContext _localctx = new MatchArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(Identifier);
			setState(494); match(T__44);
			setState(495); matchPattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPairListContext extends ParserRuleContext {
		public MapPairContext mapPair(int i) {
			return getRuleContext(MapPairContext.class,i);
		}
		public List<MapPairContext> mapPair() {
			return getRuleContexts(MapPairContext.class);
		}
		public MapPairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMapPairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMapPairList(this);
		}
	}

	public final MapPairListContext mapPairList() throws RecognitionException {
		MapPairListContext _localctx = new MapPairListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); mapPair();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(498); match(T__30);
				setState(499); mapPair();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPairContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MapPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterMapPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitMapPair(this);
		}
	}

	public final MapPairContext mapPair() throws RecognitionException {
		MapPairContext _localctx = new MapPairContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); expression(0);
			setState(506); match(T__51);
			setState(507); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RngBindingListContext extends ParserRuleContext {
		public RngBindingContext rngBinding(int i) {
			return getRuleContext(RngBindingContext.class,i);
		}
		public List<RngBindingContext> rngBinding() {
			return getRuleContexts(RngBindingContext.class);
		}
		public RngBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rngBindingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRngBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRngBindingList(this);
		}
	}

	public final RngBindingListContext rngBindingList() throws RecognitionException {
		RngBindingListContext _localctx = new RngBindingListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); rngBinding();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(510); match(T__30);
				setState(511); rngBinding();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RngBindingContext extends ParserRuleContext {
		public CollectionOrTypeContext collectionOrType() {
			return getRuleContext(CollectionOrTypeContext.class,0);
		}
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public RngBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rngBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterRngBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitRngBinding(this);
		}
	}

	public final RngBindingContext rngBinding() throws RecognitionException {
		RngBindingContext _localctx = new RngBindingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); patternList();
			setState(518); match(T__28);
			setState(519); collectionOrType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitPatternList(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); pattern();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(522); match(T__30);
				setState(523); pattern();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionOrTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CollectionOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterCollectionOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitCollectionOrType(this);
		}
	}

	public final CollectionOrTypeContext collectionOrType() throws RecognitionException {
		CollectionOrTypeContext _localctx = new CollectionOrTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_collectionOrType);
		try {
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingListContext extends ParserRuleContext {
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public LetBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLetBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLetBindingList(this);
		}
	}

	public final LetBindingListContext letBindingList() throws RecognitionException {
		LetBindingListContext _localctx = new LetBindingListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_letBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); letBinding();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(534); match(T__30);
				setState(535); letBinding();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLetBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLetBinding(this);
		}
	}

	public final LetBindingContext letBinding() throws RecognitionException {
		LetBindingContext _localctx = new LetBindingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_letBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); pattern();
			setState(544);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(542); match(T__28);
				setState(543); type(0);
				}
			}

			setState(546); match(T__44);
			setState(547); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pattern);
		int _la;
		try {
			setState(560);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(549); match(Identifier);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(550); match(T__27);
				setState(551); pattern();
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(552); match(T__30);
					setState(553); pattern();
					}
					}
					setState(556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__30 );
				setState(558); match(T__49);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); match(Identifier);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(563); match(T__30);
				setState(564); match(Identifier);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); expression(0);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(571); match(T__30);
				setState(572); expression(0);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578); match(Identifier);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(579); match(T__13);
					setState(580); match(Identifier);
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(ModelParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ModelParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ModelParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ModelParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return type_sempred((TypeContext)_localctx, predIndex);
		case 20: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 28);
		case 3: return precpred(_ctx, 27);
		case 4: return precpred(_ctx, 25);
		case 5: return precpred(_ctx, 24);
		case 6: return precpred(_ctx, 23);
		case 7: return precpred(_ctx, 22);
		case 8: return precpred(_ctx, 21);
		case 9: return precpred(_ctx, 20);
		case 10: return precpred(_ctx, 19);
		case 11: return precpred(_ctx, 18);
		case 12: return precpred(_ctx, 17);
		case 13: return precpred(_ctx, 13);
		case 14: return precpred(_ctx, 9);
		case 15: return precpred(_ctx, 5);
		case 17: return precpred(_ctx, 32);
		case 16: return precpred(_ctx, 33);
		case 18: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u024f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\5\2"+
		"U\n\2\3\2\3\2\5\2Y\n\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\5\2b\n\2\7\2d\n"+
		"\2\f\2\16\2g\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5"+
		"\5\5v\n\5\3\5\5\5y\n\5\3\5\5\5|\n\5\3\5\3\5\3\5\5\5\u0081\n\5\7\5\u0083"+
		"\n\5\f\5\16\5\u0086\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16"+
		"\6\u0091\13\6\3\6\3\6\3\7\3\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\7\b\u009d"+
		"\n\b\f\b\16\b\u00a0\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a9\n\n\f\n"+
		"\16\n\u00ac\13\n\3\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00c7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00cf\n\f\r\f\16\f\u00d0"+
		"\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\r\3\r\3\r\3\r\7\r\u00dc\n\r\f\r\16"+
		"\r\u00df\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u00f8\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\6\23\u0103"+
		"\n\23\r\23\16\23\u0104\3\23\3\23\5\23\u0109\n\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0114\n\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u012e\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\6\26\u0149\n\26\r\26\16\26\u014a\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0152\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0165\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u017a\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0185\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u01bc\n\26\f\26\16\26\u01bf\13\26\3\27\3\27\3\27\7\27\u01c4\n\27"+
		"\f\27\16\27\u01c7\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u01d2\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01db\n\32\f\32"+
		"\16\32\u01de\13\32\3\32\3\32\5\32\u01e2\n\32\3\32\3\32\3\32\3\32\6\32"+
		"\u01e8\n\32\r\32\16\32\u01e9\3\32\3\32\5\32\u01ee\n\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\7\34\u01f7\n\34\f\34\16\34\u01fa\13\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u0203\n\36\f\36\16\36\u0206\13\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \7 \u020f\n \f \16 \u0212\13 \3!\3!\5!\u0216\n"+
		"!\3\"\3\"\3\"\7\"\u021b\n\"\f\"\16\"\u021e\13\"\3#\3#\3#\5#\u0223\n#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\6$\u022d\n$\r$\16$\u022e\3$\3$\5$\u0233\n$\3%\3"+
		"%\3%\7%\u0238\n%\f%\16%\u023b\13%\3&\3&\3&\7&\u0240\n&\f&\16&\u0243\13"+
		"&\3\'\3\'\3\'\7\'\u0248\n\'\f\'\16\'\u024b\13\'\3(\3(\3(\2\4\26*)\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2"+
		"\13\7\2\13\13\32\32\34\34\36\36CC\5\2\5\5\17\17AA\4\2&&88\6\2\b\b\n\n"+
		"<<BB\6\2\7\7\r\r\31\31//\4\2\t\t\27\27\4\2\30\30\67\67\5\2\21\21\35\35"+
		"\65\65\3\2DH\u0284\2Q\3\2\2\2\4j\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\n\u0089"+
		"\3\2\2\2\f\u0094\3\2\2\2\16\u0099\3\2\2\2\20\u00a1\3\2\2\2\22\u00a5\3"+
		"\2\2\2\24\u00ad\3\2\2\2\26\u00c6\3\2\2\2\30\u00d7\3\2\2\2\32\u00e7\3\2"+
		"\2\2\34\u00e9\3\2\2\2\36\u00ec\3\2\2\2 \u00f4\3\2\2\2\"\u00f9\3\2\2\2"+
		"$\u00fd\3\2\2\2&\u0113\3\2\2\2(\u0115\3\2\2\2*\u0184\3\2\2\2,\u01c0\3"+
		"\2\2\2.\u01c8\3\2\2\2\60\u01cc\3\2\2\2\62\u01ed\3\2\2\2\64\u01ef\3\2\2"+
		"\2\66\u01f3\3\2\2\28\u01fb\3\2\2\2:\u01ff\3\2\2\2<\u0207\3\2\2\2>\u020b"+
		"\3\2\2\2@\u0215\3\2\2\2B\u0217\3\2\2\2D\u021f\3\2\2\2F\u0232\3\2\2\2H"+
		"\u0234\3\2\2\2J\u023c\3\2\2\2L\u0244\3\2\2\2N\u024c\3\2\2\2PR\5\4\3\2"+
		"QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7;\2\2TS\3\2\2\2TU\3\2\2\2U\\\3\2\2\2"+
		"VX\5\6\4\2WY\7;\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZV\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]e\3\2\2\2^\\\3\2\2\2_a\5\b\5\2`b\7;\2\2a`\3\2\2"+
		"\2ab\3\2\2\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2"+
		"\2ge\3\2\2\2hi\7\2\2\3i\3\3\2\2\2jk\7*\2\2kl\5L\'\2l\5\3\2\2\2mn\7\63"+
		"\2\2nq\5L\'\2op\7\66\2\2pr\7\5\2\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2\2su\7"+
		"I\2\2tv\5\n\6\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\5\20\t\2xw\3\2\2\2xy\3"+
		"\2\2\2y{\3\2\2\2z|\5\24\13\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0084\7,\2"+
		"\2~\u0080\5\32\16\2\177\u0081\7;\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\f\2\2\u0088\t\3\2\2\2\u0089\u008a\7\4\2\2\u008a\u008f\5\f\7\2"+
		"\u008b\u008c\7%\2\2\u008c\u008e\5\f\7\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\"\2\2\u0093\13\3\2\2\2\u0094\u0097\7I\2\2"+
		"\u0095\u0096\7\'\2\2\u0096\u0098\5\16\b\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\r\3\2\2\2\u0099\u009e\5\26\f\2\u009a\u009b\78\2\2\u009b"+
		"\u009d\5\26\f\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\17\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7(\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\22\2\2\u00a4\21\3\2\2"+
		"\2\u00a5\u00aa\5\"\22\2\u00a6\u00a7\7%\2\2\u00a7\u00a9\5\"\22\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00b3"+
		"\5\26\f\2\u00af\u00b0\7%\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00af\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\f\1\2\u00b7\u00c7\5(\25\2\u00b8"+
		"\u00ba\7I\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00c7\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\5\26\f\2\u00be"+
		"\u00bf\7\22\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c2\5\""+
		"\22\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7:\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00b6\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c7\u00d4\3\2\2\2\u00c8\u00c9\f\5\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00d3\5\26\f\6\u00cb\u00ce\f\6\2\2\u00cc\u00cd\7"+
		"\5\2\2\u00cd\u00cf\5\26\f\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c8\3\2"+
		"\2\2\u00d2\u00cb\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\4\2"+
		"\2\u00d8\u00dd\5\26\f\2\u00d9\u00da\7%\2\2\u00da\u00dc\5\26\f\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\"\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e8\5\34\17\2\u00e3\u00e8\5\36\20\2\u00e4\u00e8\5"+
		" \21\2\u00e5\u00e8\5$\23\2\u00e6\u00e8\5&\24\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\33\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7I\2\2\u00eb\35\3"+
		"\2\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ef\7I\2\2\u00ee\u00f0\5\n\6\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\27"+
		"\2\2\u00f2\u00f3\5\26\f\2\u00f3\37\3\2\2\2\u00f4\u00f7\5\"\22\2\u00f5"+
		"\u00f6\7\27\2\2\u00f6\u00f8\5*\26\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7I\2\2\u00fa\u00fb\7\'\2\2\u00fb\u00fc"+
		"\5\26\f\2\u00fc#\3\2\2\2\u00fd\u0102\7I\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100"+
		"\5\22\n\2\u0100\u0101\7\22\2\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0107\7\'\2\2\u0107\u0109\5\26\f\2\u0108\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\27\2\2\u010b\u010c"+
		"\5*\26\2\u010c%\3\2\2\2\u010d\u0114\5*\26\2\u010e\u010f\7I\2\2\u010f\u0110"+
		"\7,\2\2\u0110\u0111\5*\26\2\u0111\u0112\7\f\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0114\'\3\2\2\2\u0115\u0116\t\2\2\2"+
		"\u0116)\3\2\2\2\u0117\u0118\b\26\1\2\u0118\u0119\7.\2\2\u0119\u011a\5"+
		"B\"\2\u011a\u011b\7#\2\2\u011b\u011c\5*\26!\u011c\u0185\3\2\2\2\u011d"+
		"\u011e\7 \2\2\u011e\u0185\5*\26\34\u011f\u0120\79\2\2\u0120\u0121\5:\36"+
		"\2\u0121\u0122\7\23\2\2\u0122\u0123\5*\26\22\u0123\u0185\3\2\2\2\u0124"+
		"\u0125\7=\2\2\u0125\u0126\5:\36\2\u0126\u0127\7\23\2\2\u0127\u0128\5*"+
		"\26\21\u0128\u0185\3\2\2\2\u0129\u012a\7\26\2\2\u012a\u012d\5F$\2\u012b"+
		"\u012c\7\'\2\2\u012c\u012e\5\26\f\2\u012d\u012b\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\23\2\2\u0130\u0131\5*\26\4\u0131"+
		"\u0185\3\2\2\2\u0132\u0133\7(\2\2\u0133\u0134\5*\26\2\u0134\u0135\7\22"+
		"\2\2\u0135\u0185\3\2\2\2\u0136\u0185\5N(\2\u0137\u0185\7I\2\2\u0138\u0139"+
		"\7)\2\2\u0139\u013a\5*\26\2\u013a\u013b\7@\2\2\u013b\u013c\5*\26\2\u013c"+
		"\u013d\7\61\2\2\u013d\u013e\5*\26\2\u013e\u0185\3\2\2\2\u013f\u0140\7"+
		"\16\2\2\u0140\u0141\5*\26\2\u0141\u0142\7$\2\2\u0142\u0143\5\60\31\2\u0143"+
		"\u0185\3\2\2\2\u0144\u0145\7(\2\2\u0145\u0148\5*\26\2\u0146\u0147\7%\2"+
		"\2\u0147\u0149\5*\26\2\u0148\u0146\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\22\2\2"+
		"\u014d\u014e\b\26\1\2\u014e\u0185\3\2\2\2\u014f\u0151\7,\2\2\u0150\u0152"+
		"\5J&\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0185\7\f\2\2\u0154\u0155\7,\2\2\u0155\u0156\5*\26\2\u0156\u0157\7!\2"+
		"\2\u0157\u0158\5*\26\2\u0158\u0159\7\f\2\2\u0159\u0185\3\2\2\2\u015a\u015b"+
		"\7,\2\2\u015b\u015c\5*\26\2\u015c\u015d\7\37\2\2\u015d\u015e\5:\36\2\u015e"+
		"\u015f\7\23\2\2\u015f\u0160\5*\26\2\u0160\u0161\7\f\2\2\u0161\u0185\3"+
		"\2\2\2\u0162\u0164\7\4\2\2\u0163\u0165\5J&\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0185\7\"\2\2\u0167\u0168\7\4"+
		"\2\2\u0168\u0169\5*\26\2\u0169\u016a\7!\2\2\u016a\u016b\5*\26\2\u016b"+
		"\u016c\7\"\2\2\u016c\u0185\3\2\2\2\u016d\u016e\7\4\2\2\u016e\u016f\5*"+
		"\26\2\u016f\u0170\7\37\2\2\u0170\u0171\5F$\2\u0171\u0172\7\'\2\2\u0172"+
		"\u0173\5*\26\2\u0173\u0174\7\23\2\2\u0174\u0175\5*\26\2\u0175\u0176\7"+
		"\"\2\2\u0176\u0185\3\2\2\2\u0177\u0179\7,\2\2\u0178\u017a\5\66\34\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0185\7\f"+
		"\2\2\u017c\u017d\7,\2\2\u017d\u017e\58\35\2\u017e\u017f\7\37\2\2\u017f"+
		"\u0180\5:\36\2\u0180\u0181\7\23\2\2\u0181\u0182\5*\26\2\u0182\u0183\7"+
		"\f\2\2\u0183\u0185\3\2\2\2\u0184\u0117\3\2\2\2\u0184\u011d\3\2\2\2\u0184"+
		"\u011f\3\2\2\2\u0184\u0124\3\2\2\2\u0184\u0129\3\2\2\2\u0184\u0132\3\2"+
		"\2\2\u0184\u0136\3\2\2\2\u0184\u0137\3\2\2\2\u0184\u0138\3\2\2\2\u0184"+
		"\u013f\3\2\2\2\u0184\u0144\3\2\2\2\u0184\u014f\3\2\2\2\u0184\u0154\3\2"+
		"\2\2\u0184\u015a\3\2\2\2\u0184\u0162\3\2\2\2\u0184\u0167\3\2\2\2\u0184"+
		"\u016d\3\2\2\2\u0184\u0177\3\2\2\2\u0184\u017c\3\2\2\2\u0185\u01bd\3\2"+
		"\2\2\u0186\u0187\f\36\2\2\u0187\u0188\t\3\2\2\u0188\u01bc\5*\26\37\u0189"+
		"\u018a\f\35\2\2\u018a\u018b\t\4\2\2\u018b\u01bc\5*\26\36\u018c\u018d\f"+
		"\33\2\2\u018d\u018e\t\5\2\2\u018e\u01bc\5*\26\34\u018f\u0190\f\32\2\2"+
		"\u0190\u0191\t\6\2\2\u0191\u01bc\5*\26\33\u0192\u0193\f\31\2\2\u0193\u0194"+
		"\t\7\2\2\u0194\u01bc\5*\26\32\u0195\u0196\f\30\2\2\u0196\u0197\7\3\2\2"+
		"\u0197\u01bc\5*\26\31\u0198\u0199\f\27\2\2\u0199\u019a\7\37\2\2\u019a"+
		"\u01bc\5*\26\30\u019b\u019c\f\26\2\2\u019c\u019d\7-\2\2\u019d\u01bc\5"+
		"*\26\27\u019e\u019f\f\25\2\2\u019f\u01a0\7\6\2\2\u01a0\u01bc\5*\26\26"+
		"\u01a1\u01a2\f\24\2\2\u01a2\u01a3\t\b\2\2\u01a3\u01bc\5*\26\25\u01a4\u01a5"+
		"\f\23\2\2\u01a5\u01a6\7\33\2\2\u01a6\u01bc\5*\26\24\u01a7\u01a8\f\17\2"+
		"\2\u01a8\u01a9\t\t\2\2\u01a9\u01bc\5*\26\20\u01aa\u01ab\f\13\2\2\u01ab"+
		"\u01ac\7\64\2\2\u01ac\u01bc\5*\26\f\u01ad\u01ae\f\7\2\2\u01ae\u01af\7"+
		"\62\2\2\u01af\u01bc\5*\26\b\u01b0\u01b1\f#\2\2\u01b1\u01b2\7\66\2\2\u01b2"+
		"\u01bc\7I\2\2\u01b3\u01b4\f\"\2\2\u01b4\u01bc\5*\26\2\u01b5\u01b6\f\3"+
		"\2\2\u01b6\u01b7\7\25\2\2\u01b7\u01b8\7,\2\2\u01b8\u01b9\5,\27\2\u01b9"+
		"\u01ba\7\f\2\2\u01ba\u01bc\3\2\2\2\u01bb\u0186\3\2\2\2\u01bb\u0189\3\2"+
		"\2\2\u01bb\u018c\3\2\2\2\u01bb\u018f\3\2\2\2\u01bb\u0192\3\2\2\2\u01bb"+
		"\u0195\3\2\2\2\u01bb\u0198\3\2\2\2\u01bb\u019b\3\2\2\2\u01bb\u019e\3\2"+
		"\2\2\u01bb\u01a1\3\2\2\2\u01bb\u01a4\3\2\2\2\u01bb\u01a7\3\2\2\2\u01bb"+
		"\u01aa\3\2\2\2\u01bb\u01ad\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b3\3\2"+
		"\2\2\u01bb\u01b5\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be+\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c5\5.\30\2"+
		"\u01c1\u01c2\7%\2\2\u01c2\u01c4\5.\30\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6-\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c9\7I\2\2\u01c9\u01ca\7?\2\2\u01ca\u01cb\5*\26"+
		"\2\u01cb/\3\2\2\2\u01cc\u01cd\5\62\32\2\u01cd\u01ce\7\67\2\2\u01ce\u01d1"+
		"\5*\26\2\u01cf\u01d0\7\37\2\2\u01d0\u01d2\5\60\31\2\u01d1\u01cf\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\61\3\2\2\2\u01d3\u01ee\5N(\2\u01d4\u01ee"+
		"\7\24\2\2\u01d5\u01e1\7I\2\2\u01d6\u01d7\7(\2\2\u01d7\u01dc\5\64\33\2"+
		"\u01d8\u01d9\7%\2\2\u01d9\u01db\5\64\33\2\u01da\u01d8\3\2\2\2\u01db\u01de"+
		"\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e0\7\22\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01d6\3"+
		"\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01ee\3\2\2\2\u01e3\u01e4\7(\2\2\u01e4"+
		"\u01e7\5\62\32\2\u01e5\u01e6\7%\2\2\u01e6\u01e8\5\62\32\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\7\22\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01d3\3"+
		"\2\2\2\u01ed\u01d4\3\2\2\2\u01ed\u01d5\3\2\2\2\u01ed\u01e3\3\2\2\2\u01ee"+
		"\63\3\2\2\2\u01ef\u01f0\7I\2\2\u01f0\u01f1\7\27\2\2\u01f1\u01f2\5\62\32"+
		"\2\u01f2\65\3\2\2\2\u01f3\u01f8\58\35\2\u01f4\u01f5\7%\2\2\u01f5\u01f7"+
		"\58\35\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\67\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\5*\26"+
		"\2\u01fc\u01fd\7\20\2\2\u01fd\u01fe\5*\26\2\u01fe9\3\2\2\2\u01ff\u0204"+
		"\5<\37\2\u0200\u0201\7%\2\2\u0201\u0203\5<\37\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205;\3\2\2\2"+
		"\u0206\u0204\3\2\2\2\u0207\u0208\5> \2\u0208\u0209\7\'\2\2\u0209\u020a"+
		"\5@!\2\u020a=\3\2\2\2\u020b\u0210\5F$\2\u020c\u020d\7%\2\2\u020d\u020f"+
		"\5F$\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211?\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0216\5*\26\2"+
		"\u0214\u0216\5\26\f\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216A\3"+
		"\2\2\2\u0217\u021c\5D#\2\u0218\u0219\7%\2\2\u0219\u021b\5D#\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"C\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0222\5F$\2\u0220\u0221\7\'\2\2\u0221"+
		"\u0223\5\26\f\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3"+
		"\2\2\2\u0224\u0225\7\27\2\2\u0225\u0226\5*\26\2\u0226E\3\2\2\2\u0227\u0233"+
		"\7I\2\2\u0228\u0229\7(\2\2\u0229\u022c\5F$\2\u022a\u022b\7%\2\2\u022b"+
		"\u022d\5F$\2\u022c\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\22\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0227\3\2\2\2\u0232\u0228\3\2\2\2\u0233G\3\2\2\2"+
		"\u0234\u0239\7I\2\2\u0235\u0236\7%\2\2\u0236\u0238\7I\2\2\u0237\u0235"+
		"\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"I\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0241\5*\26\2\u023d\u023e\7%\2\2\u023e"+
		"\u0240\5*\26\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242K\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0249"+
		"\7I\2\2\u0245\u0246\7\66\2\2\u0246\u0248\7I\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aM\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u024d\t\n\2\2\u024dO\3\2\2\28QTX\\aequx{\u0080"+
		"\u0084\u008f\u0097\u009e\u00aa\u00b3\u00ba\u00c6\u00d0\u00d2\u00d4\u00dd"+
		"\u00e7\u00ef\u00f7\u0104\u0108\u0113\u012d\u014a\u0151\u0164\u0179\u0184"+
		"\u01bb\u01bd\u01c5\u01d1\u01dc\u01e1\u01e9\u01ed\u01f8\u0204\u0210\u0215"+
		"\u021c\u0222\u022e\u0232\u0239\u0241\u0249";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}