// Generated from Model.g4 by ANTLR 4.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__76=1, T__75=2, T__74=3, T__73=4, T__72=5, T__71=6, T__70=7, T__69=8, 
		T__68=9, T__67=10, T__66=11, T__65=12, T__64=13, T__63=14, T__62=15, T__61=16, 
		T__60=17, T__59=18, T__58=19, T__57=20, T__56=21, T__55=22, T__54=23, 
		T__53=24, T__52=25, T__51=26, T__50=27, T__49=28, T__48=29, T__47=30, 
		T__46=31, T__45=32, T__44=33, T__43=34, T__42=35, T__41=36, T__40=37, 
		T__39=38, T__38=39, T__37=40, T__36=41, T__35=42, T__34=43, T__33=44, 
		T__32=45, T__31=46, T__30=47, T__29=48, T__28=49, T__27=50, T__26=51, 
		T__25=52, T__24=53, T__23=54, T__22=55, T__21=56, T__20=57, T__19=58, 
		T__18=59, T__17=60, T__16=61, T__15=62, T__14=63, T__13=64, T__12=65, 
		T__11=66, T__10=67, T__9=68, T__8=69, T__7=70, T__6=71, T__5=72, T__4=73, 
		T__3=74, T__2=75, T__1=76, T__0=77, IntegerLiteral=78, FloatingPointLiteral=79, 
		BooleanLiteral=80, CharacterLiteral=81, StringLiteral=82, Identifier=83, 
		COMMENT=84, LINE_COMMENT=85, WS=86, SEP=87;
	public static final String[] tokenNames = {
		"<INVALID>", "'implies'", "'or'", "'['", "'*'", "'<'", "'!isin'", "'<='", 
		"'Bool'", "'}'", "'subset'", "'eq'", "'lt'", "'case'", "'->'", "'%'", 
		"'union'", "')'", "'_'", "'@'", "'-\\'", "'iff'", "'gt'", "'='", "'<=>'", 
		"'String'", "'psubset'", "'.#'", "'Int'", "'\\'", "'gte'", "'Char'", "'val'", 
		"'req'", "'class'", "'|'", "'!'", "'..'", "']'", "','", "'of'", "'Void'", 
		"'-'", "'not'", "':'", "'('", "'if'", "'lte'", "'var'", "'package'", "'def'", 
		"'{|'", "'{'", "'and'", "'extends'", "'isin'", "'else'", "'++'", "'import'", 
		"'^'", "'inter'", "'=>'", "'.'", "'+'", "'create'", "'forall'", "'|}'", 
		"'Nada'", "'&&'", "'||'", "'>'", "'exists'", "'Real'", "'type'", "':='", 
		"'then'", "'/'", "'>='", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "Identifier", "COMMENT", "LINE_COMMENT", 
		"WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclaration = 1, RULE_packageDeclaration = 2, 
		RULE_importDeclaration = 3, RULE_classDeclaration = 4, RULE_typeParameters = 5, 
		RULE_typeParameter = 6, RULE_typeBound = 7, RULE_valueParameters = 8, 
		RULE_typingList = 9, RULE_extending = 10, RULE_type = 11, RULE_typeArguments = 12, 
		RULE_memberDeclaration = 13, RULE_valueDeclaration = 14, RULE_sortDeclaration = 15, 
		RULE_typeDeclaration = 16, RULE_variableDeclaration = 17, RULE_typing = 18, 
		RULE_functionBodyElement = 19, RULE_functionDeclaration = 20, RULE_constraint = 21, 
		RULE_primitiveType = 22, RULE_tokenLessThan = 23, RULE_tokenGreatherThan = 24, 
		RULE_tokenLessThanEqual = 25, RULE_tokenGreaterThanEqual = 26, RULE_tokenAnd = 27, 
		RULE_tokenOr = 28, RULE_tokenNot = 29, RULE_tokenImplies = 30, RULE_tokenIFF = 31, 
		RULE_tokenEquals = 32, RULE_expressionsWithSeparator = 33, RULE_expression = 34, 
		RULE_classArgumentList = 35, RULE_classArgument = 36, RULE_idValueList = 37, 
		RULE_idValuePair = 38, RULE_match = 39, RULE_matchPattern = 40, RULE_matchArgument = 41, 
		RULE_mapPairList = 42, RULE_mapPair = 43, RULE_rngBindingList = 44, RULE_rngBinding = 45, 
		RULE_patternList = 46, RULE_collectionOrType = 47, RULE_letBindingList = 48, 
		RULE_letBinding = 49, RULE_pattern = 50, RULE_identifierList = 51, RULE_expressionList = 52, 
		RULE_qualifiedName = 53, RULE_literal = 54;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "typeParameters", "typeParameter", "typeBound", "valueParameters", 
		"typingList", "extending", "type", "typeArguments", "memberDeclaration", 
		"valueDeclaration", "sortDeclaration", "typeDeclaration", "variableDeclaration", 
		"typing", "functionBodyElement", "functionDeclaration", "constraint", 
		"primitiveType", "tokenLessThan", "tokenGreatherThan", "tokenLessThanEqual", 
		"tokenGreaterThanEqual", "tokenAnd", "tokenOr", "tokenNot", "tokenImplies", 
		"tokenIFF", "tokenEquals", "expressionsWithSeparator", "expression", "classArgumentList", 
		"classArgument", "idValueList", "idValuePair", "match", "matchPattern", 
		"matchArgument", "mapPairList", "mapPair", "rngBindingList", "rngBinding", 
		"patternList", "collectionOrType", "letBindingList", "letBinding", "pattern", 
		"identifierList", "expressionList", "qualifiedName", "literal"
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
		public List<TopDeclarationContext> topDeclaration() {
			return getRuleContexts(TopDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TopDeclarationContext topDeclaration(int i) {
			return getRuleContext(TopDeclarationContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); packageDeclaration();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==58) {
				{
				{
				setState(111); importDeclaration();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(117); classDeclaration();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(123); topDeclaration();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(EOF);
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

	public static class TopDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTopDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTopDeclaration(this);
		}
	}

	public final TopDeclarationContext topDeclaration() throws RecognitionException {
		TopDeclarationContext _localctx = new TopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topDeclaration);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case 3:
			case 13:
			case 20:
			case 32:
			case 33:
			case 36:
			case 42:
			case 43:
			case 45:
			case 46:
			case 48:
			case 50:
			case 52:
			case 64:
			case 65:
			case 71:
			case 73:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); memberDeclaration();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); classDeclaration();
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
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(49);
			setState(136); qualifiedName();
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
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(58);
			setState(139); qualifiedName();
			setState(142);
			_la = _input.LA(1);
			if (_la==62) {
				{
				setState(140); match(62);
				setState(141); match(4);
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
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(34);
			setState(145); match(Identifier);
			setState(147);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(146); typeParameters();
				}
			}

			setState(150);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(149); valueParameters();
				}
			}

			setState(153);
			_la = _input.LA(1);
			if (_la==54) {
				{
				setState(152); extending();
				}
			}

			setState(155); match(52);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(156); memberDeclaration();
				setState(158);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(157); match(SEP);
					}
				}

				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); match(9);
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
		enterRule(_localctx, 10, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(3);
			setState(168); typeParameter();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(169); match(39);
				setState(170); typeParameter();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176); match(38);
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
		enterRule(_localctx, 12, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(Identifier);
			setState(181);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(179); match(44);
				setState(180); typeBound();
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
		enterRule(_localctx, 14, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); type(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==63) {
				{
				{
				setState(184); match(63);
				setState(185); type(0);
				}
				}
				setState(190);
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
		enterRule(_localctx, 16, RULE_valueParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(45);
			setState(192); typingList();
			setState(193); match(17);
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
		enterRule(_localctx, 18, RULE_typingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); typing();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(196); match(39);
				setState(197); typing();
				}
				}
				setState(202);
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
		enterRule(_localctx, 20, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(54);
			setState(204); type(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(205); match(39);
				setState(206); type(0);
				}
				}
				setState(211);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			switch (_input.LA(1)) {
			case 8:
			case 25:
			case 28:
			case 31:
			case 41:
			case 67:
			case 72:
				{
				setState(213); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(214); match(Identifier);
				setState(216);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(215); typeArguments();
					}
					break;
				}
				}
				break;
			case 45:
				{
				setState(218); match(45);
				setState(219); type(0);
				setState(220); match(17);
				}
				break;
			case 51:
				{
				setState(222); match(51);
				setState(223); typing();
				setState(224); match(62);
				setState(225); expression(0);
				setState(226); match(66);
				}
				break;
			case 52:
				{
				setState(228); match(52);
				setState(229); type(0);
				setState(230); match(9);
				}
				break;
			case 3:
				{
				setState(232); match(3);
				setState(233); type(0);
				setState(234); match(38);
				}
				break;
			case 5:
				{
				setState(236); match(5);
				setState(237); type(0);
				setState(238); match(39);
				setState(239); type(0);
				setState(240); match(70);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(244);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(245); match(14);
						setState(246); type(7);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(247);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(248); match(4);
								setState(249); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(252); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 24, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(3);
			setState(260); type(0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(261); match(39);
				setState(262); type(0);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268); match(38);
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
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ExpressionsWithSeparatorContext expressionsWithSeparator() {
			return getRuleContext(ExpressionsWithSeparatorContext.class,0);
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
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); sortDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); typeDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); valueDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273); variableDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274); functionDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275); constraint();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276); expressionsWithSeparator();
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

	public static class ValueDeclarationContext extends ParserRuleContext {
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitValueDeclaration(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(32);
			setState(280); typing();
			setState(283);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(281); match(23);
				setState(282); expression(0);
				}
			}

			setState(285); match(SEP);
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
		enterRule(_localctx, 30, RULE_sortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(73);
			setState(288); match(Identifier);
			setState(289); match(SEP);
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
		enterRule(_localctx, 32, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(73);
			setState(292); match(Identifier);
			setState(294);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(293); typeParameters();
				}
			}

			setState(296); match(23);
			setState(297); type(0);
			setState(298); match(SEP);
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
		enterRule(_localctx, 34, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(48);
			setState(301); typing();
			setState(304);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(302); match(23);
				setState(303); expression(0);
				}
			}

			setState(306); match(SEP);
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
		enterRule(_localctx, 36, RULE_typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(Identifier);
			setState(309); match(44);
			setState(310); type(0);
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

	public static class FunctionBodyElementContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public FunctionBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterFunctionBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitFunctionBodyElement(this);
		}
	}

	public final FunctionBodyElementContext functionBodyElement() throws RecognitionException {
		FunctionBodyElementContext _localctx = new FunctionBodyElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionBodyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); memberDeclaration();
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
		public List<FunctionBodyElementContext> functionBodyElement() {
			return getRuleContexts(FunctionBodyElementContext.class);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionBodyElementContext functionBodyElement(int i) {
			return getRuleContext(FunctionBodyElementContext.class,i);
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
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(50);
			setState(315); match(Identifier);
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316); match(45);
				setState(318);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(317); typingList();
					}
				}

				setState(320); match(17);
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==45 );
			{
			setState(325); match(44);
			setState(326); type(0);
			}
			setState(328); match(52);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(329); functionBodyElement();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(9);
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
		enterRule(_localctx, 42, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(33);
			setState(339);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(338); match(Identifier);
				}
			}

			setState(341); match(52);
			setState(342); expression(0);
			setState(343); match(9);
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
		enterRule(_localctx, 44, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 25) | (1L << 28) | (1L << 31) | (1L << 41))) != 0) || _la==67 || _la==72) ) {
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

	public static class TokenLessThanContext extends ParserRuleContext {
		public TokenLessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenLessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenLessThan(this);
		}
	}

	public final TokenLessThanContext tokenLessThan() throws RecognitionException {
		TokenLessThanContext _localctx = new TokenLessThanContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==5 || _la==12) ) {
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

	public static class TokenGreatherThanContext extends ParserRuleContext {
		public TokenGreatherThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenGreatherThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenGreatherThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenGreatherThan(this);
		}
	}

	public final TokenGreatherThanContext tokenGreatherThan() throws RecognitionException {
		TokenGreatherThanContext _localctx = new TokenGreatherThanContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==70) ) {
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

	public static class TokenLessThanEqualContext extends ParserRuleContext {
		public TokenLessThanEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenLessThanEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenLessThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenLessThanEqual(this);
		}
	}

	public final TokenLessThanEqualContext tokenLessThanEqual() throws RecognitionException {
		TokenLessThanEqualContext _localctx = new TokenLessThanEqualContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==47) ) {
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

	public static class TokenGreaterThanEqualContext extends ParserRuleContext {
		public TokenGreaterThanEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenGreaterThanEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenGreaterThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenGreaterThanEqual(this);
		}
	}

	public final TokenGreaterThanEqualContext tokenGreaterThanEqual() throws RecognitionException {
		TokenGreaterThanEqualContext _localctx = new TokenGreaterThanEqualContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==30 || _la==77) ) {
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

	public static class TokenAndContext extends ParserRuleContext {
		public TokenAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenAnd(this);
		}
	}

	public final TokenAndContext tokenAnd() throws RecognitionException {
		TokenAndContext _localctx = new TokenAndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==53 || _la==68) ) {
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

	public static class TokenOrContext extends ParserRuleContext {
		public TokenOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenOr(this);
		}
	}

	public final TokenOrContext tokenOr() throws RecognitionException {
		TokenOrContext _localctx = new TokenOrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==69) ) {
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

	public static class TokenNotContext extends ParserRuleContext {
		public TokenNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenNot(this);
		}
	}

	public final TokenNotContext tokenNot() throws RecognitionException {
		TokenNotContext _localctx = new TokenNotContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==36 || _la==43) ) {
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

	public static class TokenImpliesContext extends ParserRuleContext {
		public TokenImpliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenImplies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenImplies(this);
		}
	}

	public final TokenImpliesContext tokenImplies() throws RecognitionException {
		TokenImpliesContext _localctx = new TokenImpliesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==61) ) {
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

	public static class TokenIFFContext extends ParserRuleContext {
		public TokenIFFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenIFF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenIFF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenIFF(this);
		}
	}

	public final TokenIFFContext tokenIFF() throws RecognitionException {
		TokenIFFContext _localctx = new TokenIFFContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==21 || _la==24) ) {
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

	public static class TokenEqualsContext extends ParserRuleContext {
		public TokenEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterTokenEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitTokenEquals(this);
		}
	}

	public final TokenEqualsContext tokenEquals() throws RecognitionException {
		TokenEqualsContext _localctx = new TokenEqualsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==11 || _la==23) ) {
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

	public static class ExpressionsWithSeparatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsWithSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsWithSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterExpressionsWithSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitExpressionsWithSeparator(this);
		}
	}

	public final ExpressionsWithSeparatorContext expressionsWithSeparator() throws RecognitionException {
		ExpressionsWithSeparatorContext _localctx = new ExpressionsWithSeparatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); expression(0);
			setState(368); match(SEP);
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
		public TokenIFFContext tokenIFF() {
			return getRuleContext(TokenIFFContext.class,0);
		}
		public TokenOrContext tokenOr() {
			return getRuleContext(TokenOrContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TokenNotContext tokenNot() {
			return getRuleContext(TokenNotContext.class,0);
		}
		public ClassArgumentListContext classArgumentList() {
			return getRuleContext(ClassArgumentListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TokenEqualsContext tokenEquals() {
			return getRuleContext(TokenEqualsContext.class,0);
		}
		public IdValueListContext idValueList() {
			return getRuleContext(IdValueListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TokenLessThanEqualContext tokenLessThanEqual() {
			return getRuleContext(TokenLessThanEqualContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TokenLessThanContext tokenLessThan() {
			return getRuleContext(TokenLessThanContext.class,0);
		}
		public TokenAndContext tokenAnd() {
			return getRuleContext(TokenAndContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public TokenGreatherThanContext tokenGreatherThan() {
			return getRuleContext(TokenGreatherThanContext.class,0);
		}
		public TokenGreaterThanEqualContext tokenGreaterThanEqual() {
			return getRuleContext(TokenGreaterThanEqualContext.class,0);
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
		public TokenImpliesContext tokenImplies() {
			return getRuleContext(TokenImpliesContext.class,0);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(371); match(42);
				setState(372); expression(27);
				}
				break;

			case 2:
				{
				setState(373); tokenNot();
				setState(374); expression(24);
				}
				break;

			case 3:
				{
				setState(376); match(65);
				setState(377); rngBindingList();
				setState(378); match(44);
				setState(379); expression(16);
				}
				break;

			case 4:
				{
				setState(381); match(71);
				setState(382); rngBindingList();
				setState(383); match(44);
				setState(384); expression(15);
				}
				break;

			case 5:
				{
				setState(386); match(20);
				setState(387); pattern();
				setState(390);
				_la = _input.LA(1);
				if (_la==44) {
					{
					setState(388); match(44);
					setState(389); type(0);
					}
				}

				setState(392); match(62);
				setState(393); expression(2);
				}
				break;

			case 6:
				{
				setState(395); match(45);
				setState(396); expression(0);
				setState(397); match(17);
				}
				break;

			case 7:
				{
				setState(399); literal();
				}
				break;

			case 8:
				{
				setState(400); match(Identifier);
				}
				break;

			case 9:
				{
				setState(401); match(64);
				setState(402); qualifiedName();
				setState(408);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(403); match(45);
					setState(405);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(404); classArgumentList();
						}
					}

					setState(407); match(17);
					}
					break;
				}
				}
				break;

			case 10:
				{
				setState(410); match(46);
				setState(411); expression(0);
				setState(412); match(75);
				setState(413); expression(0);
				setState(414); match(56);
				setState(415); expression(0);
				}
				break;

			case 11:
				{
				setState(417); match(13);
				setState(418); expression(0);
				setState(419); match(40);
				setState(420); match();
				}
				break;

			case 12:
				{
				setState(422); match(45);
				setState(423); expression(0);
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(424); match(39);
					setState(425); expression(0);
					}
					}
					setState(428); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(430); match(17);
				}
				break;

			case 13:
				{
				setState(432); match(52);
				setState(434);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(433); expressionList();
					}
				}

				setState(436); match(9);
				}
				break;

			case 14:
				{
				setState(437); match(52);
				setState(438); expression(0);
				setState(439); match(37);
				setState(440); expression(0);
				setState(441); match(9);
				}
				break;

			case 15:
				{
				setState(443); match(52);
				setState(444); expression(0);
				setState(445); match(35);
				setState(446); rngBindingList();
				setState(447); match(62);
				setState(448); expression(0);
				setState(449); match(9);
				}
				break;

			case 16:
				{
				setState(451); match(3);
				setState(453);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(452); expressionList();
					}
				}

				setState(455); match(38);
				}
				break;

			case 17:
				{
				setState(456); match(3);
				setState(457); expression(0);
				setState(458); match(37);
				setState(459); expression(0);
				setState(460); match(38);
				}
				break;

			case 18:
				{
				setState(462); match(3);
				setState(463); expression(0);
				setState(464); match(35);
				setState(465); pattern();
				setState(466); match(44);
				setState(467); expression(0);
				setState(468); match(62);
				setState(469); expression(0);
				setState(470); match(38);
				}
				break;

			case 19:
				{
				setState(472); match(52);
				setState(474);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (71 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(473); mapPairList();
					}
				}

				setState(476); match(9);
				}
				break;

			case 20:
				{
				setState(477); match(52);
				setState(478); mapPair();
				setState(479); match(35);
				setState(480); rngBindingList();
				setState(481); match(62);
				setState(482); expression(0);
				setState(483); match(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(555);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(488); match(74);
						setState(489); expression(29);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(491);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==15 || _la==76) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(492); expression(27);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(494);
						_la = _input.LA(1);
						if ( !(_la==42 || _la==63) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(495); expression(26);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(501);
						switch (_input.LA(1)) {
						case 7:
						case 47:
							{
							setState(497); tokenLessThanEqual();
							}
							break;
						case 30:
						case 77:
							{
							setState(498); tokenGreaterThanEqual();
							}
							break;
						case 5:
						case 12:
							{
							setState(499); tokenLessThan();
							}
							break;
						case 22:
						case 70:
							{
							setState(500); tokenGreatherThan();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(503); expression(24);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(505);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(506);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 10) | (1L << 26) | (1L << 55))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(507); expression(23);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(508);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(513);
						switch (_input.LA(1)) {
						case 11:
						case 23:
							{
							setState(509); tokenEquals();
							}
							break;
						case 36:
						case 43:
							{
							setState(510); tokenNot();
							setState(511); tokenEquals();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(515); expression(22);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(518); tokenAnd();
						setState(519); expression(21);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(521);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(522); tokenOr();
						setState(523); expression(20);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(525);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(528);
						switch (_input.LA(1)) {
						case 1:
						case 61:
							{
							setState(526); tokenImplies();
							}
							break;
						case 21:
						case 24:
							{
							setState(527); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(530); expression(19);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(532);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(533); match(27);
						setState(534); expression(18);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(535);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(536);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 29) | (1L << 60))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(537); expression(14);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(538);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(539); match(59);
						}
						setState(540); expression(10);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(541);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(542); match(57);
						setState(543); expression(6);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(544);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(545); match(62);
						setState(546); match(Identifier);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(547);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(548); expression(0);
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(549);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(550); match(19);
						setState(551); match(52);
						setState(552); idValueList();
						setState(553); match(9);
						}
						break;
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class ClassArgumentListContext extends ParserRuleContext {
		public List<ClassArgumentContext> classArgument() {
			return getRuleContexts(ClassArgumentContext.class);
		}
		public ClassArgumentContext classArgument(int i) {
			return getRuleContext(ClassArgumentContext.class,i);
		}
		public ClassArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterClassArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitClassArgumentList(this);
		}
	}

	public final ClassArgumentListContext classArgumentList() throws RecognitionException {
		ClassArgumentListContext _localctx = new ClassArgumentListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); classArgument();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(561); match(39);
				setState(562); classArgument();
				}
				}
				setState(567);
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

	public static class ClassArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).enterClassArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelListener ) ((ModelListener)listener).exitClassArgument(this);
		}
	}

	public final ClassArgumentContext classArgument() throws RecognitionException {
		ClassArgumentContext _localctx = new ClassArgumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(Identifier);
			setState(569); match(44);
			setState(570); expression(0);
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
		enterRule(_localctx, 74, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572); idValuePair();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(573); match(39);
				setState(574); idValuePair();
				}
				}
				setState(579);
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
		enterRule(_localctx, 76, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); match(Identifier);
			setState(581); match(74);
			setState(582); expression(0);
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
		enterRule(_localctx, 78, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); matchPattern();
			setState(585); match(61);
			setState(586); expression(0);
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(587); match(35);
				setState(588); match();
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
		enterRule(_localctx, 80, RULE_matchPattern);
		int _la;
		try {
			setState(617);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); literal();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(592); match(18);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(593); match(Identifier);
				setState(605);
				_la = _input.LA(1);
				if (_la==45) {
					{
					setState(594); match(45);
					setState(595); matchArgument();
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==39) {
						{
						{
						setState(596); match(39);
						setState(597); matchArgument();
						}
						}
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(603); match(17);
					}
				}

				}
				break;
			case 45:
				enterOuterAlt(_localctx, 4);
				{
				setState(607); match(45);
				setState(608); matchPattern();
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(609); match(39);
					setState(610); matchPattern();
					}
					}
					setState(613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(615); match(17);
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
		enterRule(_localctx, 82, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); match(Identifier);
			setState(620); match(23);
			setState(621); matchPattern();
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
		enterRule(_localctx, 84, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); mapPair();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(624); match(39);
				setState(625); mapPair();
				}
				}
				setState(630);
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
		enterRule(_localctx, 86, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); expression(0);
			setState(632); match(14);
			setState(633); expression(0);
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
		enterRule(_localctx, 88, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); rngBinding();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(636); match(39);
				setState(637); rngBinding();
				}
				}
				setState(642);
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
		enterRule(_localctx, 90, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); patternList();
			setState(644); match(44);
			setState(645); collectionOrType();
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
		enterRule(_localctx, 92, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); pattern();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(648); match(39);
				setState(649); pattern();
				}
				}
				setState(654);
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
		enterRule(_localctx, 94, RULE_collectionOrType);
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656); type(0);
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
		enterRule(_localctx, 96, RULE_letBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659); letBinding();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(660); match(39);
				setState(661); letBinding();
				}
				}
				setState(666);
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
		enterRule(_localctx, 98, RULE_letBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); pattern();
			setState(670);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(668); match(44);
				setState(669); type(0);
				}
			}

			setState(672); match(23);
			setState(673); expression(0);
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
		enterRule(_localctx, 100, RULE_pattern);
		int _la;
		try {
			setState(686);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(675); match(Identifier);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(676); match(45);
				setState(677); pattern();
				setState(680); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(678); match(39);
					setState(679); pattern();
					}
					}
					setState(682); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(684); match(17);
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
		enterRule(_localctx, 102, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); match(Identifier);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(689); match(39);
				setState(690); match(Identifier);
				}
				}
				setState(695);
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
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); expression(0);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(697); match(39);
				setState(698); expression(0);
				}
				}
				setState(703);
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
		enterRule(_localctx, 106, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704); match(Identifier);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(705); match(62);
					setState(706); match(Identifier);
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 108, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (IntegerLiteral - 78)) | (1L << (FloatingPointLiteral - 78)) | (1L << (BooleanLiteral - 78)) | (1L << (CharacterLiteral - 78)) | (1L << (StringLiteral - 78)))) != 0)) ) {
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
		case 11: return type_sempred((TypeContext)_localctx, predIndex);

		case 34: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 1);

		case 16: return precpred(_ctx, 31);

		case 2: return precpred(_ctx, 28);

		case 3: return precpred(_ctx, 26);

		case 4: return precpred(_ctx, 25);

		case 5: return precpred(_ctx, 23);

		case 6: return precpred(_ctx, 22);

		case 7: return precpred(_ctx, 21);

		case 8: return precpred(_ctx, 20);

		case 9: return precpred(_ctx, 19);

		case 10: return precpred(_ctx, 18);

		case 11: return precpred(_ctx, 17);

		case 12: return precpred(_ctx, 13);

		case 13: return precpred(_ctx, 9);

		case 14: return precpred(_ctx, 5);

		case 15: return precpred(_ctx, 33);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u02cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\7\2y\n\2\f\2\16\2|\13\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2"+
		"\3\2\3\3\3\3\5\3\u0088\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3"+
		"\6\3\6\3\6\5\6\u0096\n\6\3\6\5\6\u0099\n\6\3\6\5\6\u009c\n\6\3\6\3\6\3"+
		"\6\5\6\u00a1\n\6\7\6\u00a3\n\6\f\6\16\6\u00a6\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00b8\n"+
		"\b\3\t\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\3\f\3\f\3\f\3\f\7\f"+
		"\u00d2\n\f\f\f\16\f\u00d5\13\f\3\r\3\r\3\r\3\r\5\r\u00db\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00fd\n\r\r"+
		"\r\16\r\u00fe\7\r\u0101\n\r\f\r\16\r\u0104\13\r\3\16\3\16\3\16\3\16\7"+
		"\16\u010a\n\16\f\16\16\16\u010d\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0118\n\17\3\20\3\20\3\20\3\20\5\20\u011e\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0129\n\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u0133\n\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3\26\6\26\u0144\n\26\r"+
		"\26\16\26\u0145\3\26\3\26\3\26\3\26\3\26\7\26\u014d\n\26\f\26\16\26\u0150"+
		"\13\26\3\26\3\26\3\27\3\27\5\27\u0156\n\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0189\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u0198\n$\3$\5$\u019b\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\6$\u01ad\n$\r$\16$\u01ae\3$\3$\3$\3$\5$\u01b5\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c8\n$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01dd\n$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u01e8\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f8"+
		"\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0204\n$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\5$\u0213\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u022e\n$\f$\16$\u0231\13$\3%\3%\3"+
		"%\7%\u0236\n%\f%\16%\u0239\13%\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u0242\n\'\f"+
		"\'\16\'\u0245\13\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u0250\n)\3*\3*\3*\3*"+
		"\3*\3*\3*\7*\u0259\n*\f*\16*\u025c\13*\3*\3*\5*\u0260\n*\3*\3*\3*\3*\6"+
		"*\u0266\n*\r*\16*\u0267\3*\3*\5*\u026c\n*\3+\3+\3+\3+\3,\3,\3,\7,\u0275"+
		"\n,\f,\16,\u0278\13,\3-\3-\3-\3-\3.\3.\3.\7.\u0281\n.\f.\16.\u0284\13"+
		".\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u028d\n\60\f\60\16\60\u0290\13\60\3"+
		"\61\3\61\5\61\u0294\n\61\3\62\3\62\3\62\7\62\u0299\n\62\f\62\16\62\u029c"+
		"\13\62\3\63\3\63\3\63\5\63\u02a1\n\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\6\64\u02ab\n\64\r\64\16\64\u02ac\3\64\3\64\5\64\u02b1\n\64\3"+
		"\65\3\65\3\65\7\65\u02b6\n\65\f\65\16\65\u02b9\13\65\3\66\3\66\3\66\7"+
		"\66\u02be\n\66\f\66\16\66\u02c1\13\66\3\67\3\67\3\67\7\67\u02c6\n\67\f"+
		"\67\16\67\u02c9\13\67\38\38\38\2\4\30F9\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\22\t\2\n"+
		"\n\33\33\36\36!!++EEJJ\4\2\7\7\16\16\4\2\30\30HH\4\2\t\t\61\61\4\2  O"+
		"O\4\2\67\67FF\4\2\4\4GG\4\2&&--\4\2\3\3??\4\2\27\27\32\32\4\2\r\r\31\31"+
		"\5\2\6\6\21\21NN\4\2,,AA\6\2\b\b\f\f\34\3499\5\2\22\22\37\37>>\3\2PT\u02ff"+
		"\2p\3\2\2\2\4\u0087\3\2\2\2\6\u0089\3\2\2\2\b\u008c\3\2\2\2\n\u0092\3"+
		"\2\2\2\f\u00a9\3\2\2\2\16\u00b4\3\2\2\2\20\u00b9\3\2\2\2\22\u00c1\3\2"+
		"\2\2\24\u00c5\3\2\2\2\26\u00cd\3\2\2\2\30\u00f4\3\2\2\2\32\u0105\3\2\2"+
		"\2\34\u0117\3\2\2\2\36\u0119\3\2\2\2 \u0121\3\2\2\2\"\u0125\3\2\2\2$\u012e"+
		"\3\2\2\2&\u0136\3\2\2\2(\u013a\3\2\2\2*\u013c\3\2\2\2,\u0153\3\2\2\2."+
		"\u015b\3\2\2\2\60\u015d\3\2\2\2\62\u015f\3\2\2\2\64\u0161\3\2\2\2\66\u0163"+
		"\3\2\2\28\u0165\3\2\2\2:\u0167\3\2\2\2<\u0169\3\2\2\2>\u016b\3\2\2\2@"+
		"\u016d\3\2\2\2B\u016f\3\2\2\2D\u0171\3\2\2\2F\u01e7\3\2\2\2H\u0232\3\2"+
		"\2\2J\u023a\3\2\2\2L\u023e\3\2\2\2N\u0246\3\2\2\2P\u024a\3\2\2\2R\u026b"+
		"\3\2\2\2T\u026d\3\2\2\2V\u0271\3\2\2\2X\u0279\3\2\2\2Z\u027d\3\2\2\2\\"+
		"\u0285\3\2\2\2^\u0289\3\2\2\2`\u0293\3\2\2\2b\u0295\3\2\2\2d\u029d\3\2"+
		"\2\2f\u02b0\3\2\2\2h\u02b2\3\2\2\2j\u02ba\3\2\2\2l\u02c2\3\2\2\2n\u02ca"+
		"\3\2\2\2pt\5\6\4\2qs\5\b\5\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u"+
		"z\3\2\2\2vt\3\2\2\2wy\5\n\6\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{\u0080\3\2\2\2|z\3\2\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\2\2\3\u0084\3\3\2\2\2\u0085\u0088\5\34\17\2\u0086\u0088"+
		"\5\n\6\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\5\3\2\2\2\u0089"+
		"\u008a\7\63\2\2\u008a\u008b\5l\67\2\u008b\7\3\2\2\2\u008c\u008d\7<\2\2"+
		"\u008d\u0090\5l\67\2\u008e\u008f\7@\2\2\u008f\u0091\7\6\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7$\2\2\u0093"+
		"\u0095\7U\2\2\u0094\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\22\n\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5\26\f\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\7\66\2\2\u009e"+
		"\u00a0\5\34\17\2\u009f\u00a1\7Y\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7\13\2\2\u00a8\13\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00af"+
		"\5\16\b\2\u00ab\u00ac\7)\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3\r\3\2\2\2\u00b4"+
		"\u00b7\7U\2\2\u00b5\u00b6\7.\2\2\u00b6\u00b8\5\20\t\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00be\5\30\r\2\u00ba\u00bb"+
		"\7A\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00be\3\2\2"+
		"\2\u00c1\u00c2\7/\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7\23\2\2\u00c4"+
		"\23\3\2\2\2\u00c5\u00ca\5&\24\2\u00c6\u00c7\7)\2\2\u00c7\u00c9\5&\24\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\78\2\2\u00ce"+
		"\u00d3\5\30\r\2\u00cf\u00d0\7)\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\27\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\r\1\2\u00d7\u00f5\5.\30"+
		"\2\u00d8\u00da\7U\2\2\u00d9\u00db\5\32\16\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00f5\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\u00de\5\30"+
		"\r\2\u00de\u00df\7\23\2\2\u00df\u00f5\3\2\2\2\u00e0\u00e1\7\65\2\2\u00e1"+
		"\u00e2\5&\24\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\5F$\2\u00e4\u00e5\7D\2\2"+
		"\u00e5\u00f5\3\2\2\2\u00e6\u00e7\7\66\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9"+
		"\7\13\2\2\u00e9\u00f5\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\5\30\r\2"+
		"\u00ec\u00ed\7(\2\2\u00ed\u00f5\3\2\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0"+
		"\5\30\r\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7H\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00d6\3\2\2\2\u00f4\u00d8\3\2\2\2\u00f4\u00dc\3\2"+
		"\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00ee\3\2\2\2\u00f5\u0102\3\2\2\2\u00f6\u00f7\f\b\2\2\u00f7\u00f8\7\20"+
		"\2\2\u00f8\u0101\5\30\r\t\u00f9\u00fc\f\t\2\2\u00fa\u00fb\7\6\2\2\u00fb"+
		"\u00fd\5\30\r\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\31\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\5\2\2\u0106\u010b"+
		"\5\30\r\2\u0107\u0108\7)\2\2\u0108\u010a\5\30\r\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7(\2\2\u010f\33\3\2\2\2\u0110"+
		"\u0118\5 \21\2\u0111\u0118\5\"\22\2\u0112\u0118\5\36\20\2\u0113\u0118"+
		"\5$\23\2\u0114\u0118\5*\26\2\u0115\u0118\5,\27\2\u0116\u0118\5D#\2\u0117"+
		"\u0110\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2"+
		"\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\35\3\2\2\2\u0119\u011a\7\"\2\2\u011a\u011d\5&\24\2\u011b\u011c\7\31\2"+
		"\2\u011c\u011e\5F$\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\7Y\2\2\u0120\37\3\2\2\2\u0121\u0122\7K\2\2\u0122"+
		"\u0123\7U\2\2\u0123\u0124\7Y\2\2\u0124!\3\2\2\2\u0125\u0126\7K\2\2\u0126"+
		"\u0128\7U\2\2\u0127\u0129\5\f\7\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\31\2\2\u012b\u012c\5\30\r\2\u012c"+
		"\u012d\7Y\2\2\u012d#\3\2\2\2\u012e\u012f\7\62\2\2\u012f\u0132\5&\24\2"+
		"\u0130\u0131\7\31\2\2\u0131\u0133\5F$\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7Y\2\2\u0135%\3\2\2\2\u0136\u0137"+
		"\7U\2\2\u0137\u0138\7.\2\2\u0138\u0139\5\30\r\2\u0139\'\3\2\2\2\u013a"+
		"\u013b\5\34\17\2\u013b)\3\2\2\2\u013c\u013d\7\64\2\2\u013d\u0143\7U\2"+
		"\2\u013e\u0140\7/\2\2\u013f\u0141\5\24\13\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\23\2\2\u0143\u013e\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\7.\2\2\u0148\u0149\5\30\r\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014e\7\66\2\2\u014b\u014d\5(\25\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\13\2\2\u0152+\3\2\2\2\u0153\u0155"+
		"\7#\2\2\u0154\u0156\7U\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\7\66\2\2\u0158\u0159\5F$\2\u0159\u015a\7\13"+
		"\2\2\u015a-\3\2\2\2\u015b\u015c\t\2\2\2\u015c/\3\2\2\2\u015d\u015e\t\3"+
		"\2\2\u015e\61\3\2\2\2\u015f\u0160\t\4\2\2\u0160\63\3\2\2\2\u0161\u0162"+
		"\t\5\2\2\u0162\65\3\2\2\2\u0163\u0164\t\6\2\2\u0164\67\3\2\2\2\u0165\u0166"+
		"\t\7\2\2\u01669\3\2\2\2\u0167\u0168\t\b\2\2\u0168;\3\2\2\2\u0169\u016a"+
		"\t\t\2\2\u016a=\3\2\2\2\u016b\u016c\t\n\2\2\u016c?\3\2\2\2\u016d\u016e"+
		"\t\13\2\2\u016eA\3\2\2\2\u016f\u0170\t\f\2\2\u0170C\3\2\2\2\u0171\u0172"+
		"\5F$\2\u0172\u0173\7Y\2\2\u0173E\3\2\2\2\u0174\u0175\b$\1\2\u0175\u0176"+
		"\7,\2\2\u0176\u01e8\5F$\35\u0177\u0178\5<\37\2\u0178\u0179\5F$\32\u0179"+
		"\u01e8\3\2\2\2\u017a\u017b\7C\2\2\u017b\u017c\5Z.\2\u017c\u017d\7.\2\2"+
		"\u017d\u017e\5F$\22\u017e\u01e8\3\2\2\2\u017f\u0180\7I\2\2\u0180\u0181"+
		"\5Z.\2\u0181\u0182\7.\2\2\u0182\u0183\5F$\21\u0183\u01e8\3\2\2\2\u0184"+
		"\u0185\7\26\2\2\u0185\u0188\5f\64\2\u0186\u0187\7.\2\2\u0187\u0189\5\30"+
		"\r\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\7@\2\2\u018b\u018c\5F$\4\u018c\u01e8\3\2\2\2\u018d\u018e\7/\2\2"+
		"\u018e\u018f\5F$\2\u018f\u0190\7\23\2\2\u0190\u01e8\3\2\2\2\u0191\u01e8"+
		"\5n8\2\u0192\u01e8\7U\2\2\u0193\u0194\7B\2\2\u0194\u019a\5l\67\2\u0195"+
		"\u0197\7/\2\2\u0196\u0198\5H%\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019b\7\23\2\2\u019a\u0195\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u01e8\3\2\2\2\u019c\u019d\7\60\2\2\u019d\u019e\5"+
		"F$\2\u019e\u019f\7M\2\2\u019f\u01a0\5F$\2\u01a0\u01a1\7:\2\2\u01a1\u01a2"+
		"\5F$\2\u01a2\u01e8\3\2\2\2\u01a3\u01a4\7\17\2\2\u01a4\u01a5\5F$\2\u01a5"+
		"\u01a6\7*\2\2\u01a6\u01a7\5P)\2\u01a7\u01e8\3\2\2\2\u01a8\u01a9\7/\2\2"+
		"\u01a9\u01ac\5F$\2\u01aa\u01ab\7)\2\2\u01ab\u01ad\5F$\2\u01ac\u01aa\3"+
		"\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\7\23\2\2\u01b1\u01e8\3\2\2\2\u01b2\u01b4\7"+
		"\66\2\2\u01b3\u01b5\5j\66\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01e8\7\13\2\2\u01b7\u01b8\7\66\2\2\u01b8\u01b9\5"+
		"F$\2\u01b9\u01ba\7\'\2\2\u01ba\u01bb\5F$\2\u01bb\u01bc\7\13\2\2\u01bc"+
		"\u01e8\3\2\2\2\u01bd\u01be\7\66\2\2\u01be\u01bf\5F$\2\u01bf\u01c0\7%\2"+
		"\2\u01c0\u01c1\5Z.\2\u01c1\u01c2\7@\2\2\u01c2\u01c3\5F$\2\u01c3\u01c4"+
		"\7\13\2\2\u01c4\u01e8\3\2\2\2\u01c5\u01c7\7\5\2\2\u01c6\u01c8\5j\66\2"+
		"\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01e8"+
		"\7(\2\2\u01ca\u01cb\7\5\2\2\u01cb\u01cc\5F$\2\u01cc\u01cd\7\'\2\2\u01cd"+
		"\u01ce\5F$\2\u01ce\u01cf\7(\2\2\u01cf\u01e8\3\2\2\2\u01d0\u01d1\7\5\2"+
		"\2\u01d1\u01d2\5F$\2\u01d2\u01d3\7%\2\2\u01d3\u01d4\5f\64\2\u01d4\u01d5"+
		"\7.\2\2\u01d5\u01d6\5F$\2\u01d6\u01d7\7@\2\2\u01d7\u01d8\5F$\2\u01d8\u01d9"+
		"\7(\2\2\u01d9\u01e8\3\2\2\2\u01da\u01dc\7\66\2\2\u01db\u01dd\5V,\2\u01dc"+
		"\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e8\7\13"+
		"\2\2\u01df\u01e0\7\66\2\2\u01e0\u01e1\5X-\2\u01e1\u01e2\7%\2\2\u01e2\u01e3"+
		"\5Z.\2\u01e3\u01e4\7@\2\2\u01e4\u01e5\5F$\2\u01e5\u01e6\7\13\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u0174\3\2\2\2\u01e7\u0177\3\2\2\2\u01e7\u017a\3\2"+
		"\2\2\u01e7\u017f\3\2\2\2\u01e7\u0184\3\2\2\2\u01e7\u018d\3\2\2\2\u01e7"+
		"\u0191\3\2\2\2\u01e7\u0192\3\2\2\2\u01e7\u0193\3\2\2\2\u01e7\u019c\3\2"+
		"\2\2\u01e7\u01a3\3\2\2\2\u01e7\u01a8\3\2\2\2\u01e7\u01b2\3\2\2\2\u01e7"+
		"\u01b7\3\2\2\2\u01e7\u01bd\3\2\2\2\u01e7\u01c5\3\2\2\2\u01e7\u01ca\3\2"+
		"\2\2\u01e7\u01d0\3\2\2\2\u01e7\u01da\3\2\2\2\u01e7\u01df\3\2\2\2\u01e8"+
		"\u022f\3\2\2\2\u01e9\u01ea\f\36\2\2\u01ea\u01eb\7L\2\2\u01eb\u022e\5F"+
		"$\37\u01ec\u01ed\f\34\2\2\u01ed\u01ee\t\r\2\2\u01ee\u022e\5F$\35\u01ef"+
		"\u01f0\f\33\2\2\u01f0\u01f1\t\16\2\2\u01f1\u022e\5F$\34\u01f2\u01f7\f"+
		"\31\2\2\u01f3\u01f8\5\64\33\2\u01f4\u01f8\5\66\34\2\u01f5\u01f8\5\60\31"+
		"\2\u01f6\u01f8\5\62\32\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\5F"+
		"$\32\u01fa\u022e\3\2\2\2\u01fb\u01fc\f\30\2\2\u01fc\u01fd\t\17\2\2\u01fd"+
		"\u022e\5F$\31\u01fe\u0203\f\27\2\2\u01ff\u0204\5B\"\2\u0200\u0201\5<\37"+
		"\2\u0201\u0202\5B\"\2\u0202\u0204\3\2\2\2\u0203\u01ff\3\2\2\2\u0203\u0200"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5F$\30\u0206\u022e\3\2\2\2\u0207"+
		"\u0208\f\26\2\2\u0208\u0209\58\35\2\u0209\u020a\5F$\27\u020a\u022e\3\2"+
		"\2\2\u020b\u020c\f\25\2\2\u020c\u020d\5:\36\2\u020d\u020e\5F$\26\u020e"+
		"\u022e\3\2\2\2\u020f\u0212\f\24\2\2\u0210\u0213\5> \2\u0211\u0213\5@!"+
		"\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215"+
		"\5F$\25\u0215\u022e\3\2\2\2\u0216\u0217\f\23\2\2\u0217\u0218\7\35\2\2"+
		"\u0218\u022e\5F$\24\u0219\u021a\f\17\2\2\u021a\u021b\t\20\2\2\u021b\u022e"+
		"\5F$\20\u021c\u021d\f\13\2\2\u021d\u021e\7=\2\2\u021e\u022e\5F$\f\u021f"+
		"\u0220\f\7\2\2\u0220\u0221\7;\2\2\u0221\u022e\5F$\b\u0222\u0223\f#\2\2"+
		"\u0223\u0224\7@\2\2\u0224\u022e\7U\2\2\u0225\u0226\f!\2\2\u0226\u022e"+
		"\5F$\2\u0227\u0228\f\3\2\2\u0228\u0229\7\25\2\2\u0229\u022a\7\66\2\2\u022a"+
		"\u022b\5L\'\2\u022b\u022c\7\13\2\2\u022c\u022e\3\2\2\2\u022d\u01e9\3\2"+
		"\2\2\u022d\u01ec\3\2\2\2\u022d\u01ef\3\2\2\2\u022d\u01f2\3\2\2\2\u022d"+
		"\u01fb\3\2\2\2\u022d\u01fe\3\2\2\2\u022d\u0207\3\2\2\2\u022d\u020b\3\2"+
		"\2\2\u022d\u020f\3\2\2\2\u022d\u0216\3\2\2\2\u022d\u0219\3\2\2\2\u022d"+
		"\u021c\3\2\2\2\u022d\u021f\3\2\2\2\u022d\u0222\3\2\2\2\u022d\u0225\3\2"+
		"\2\2\u022d\u0227\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230G\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0237\5J&\2\u0233"+
		"\u0234\7)\2\2\u0234\u0236\5J&\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238I\3\2\2\2\u0239\u0237"+
		"\3\2\2\2\u023a\u023b\7U\2\2\u023b\u023c\7.\2\2\u023c\u023d\5F$\2\u023d"+
		"K\3\2\2\2\u023e\u0243\5N(\2\u023f\u0240\7)\2\2\u0240\u0242\5N(\2\u0241"+
		"\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244M\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7U\2\2\u0247\u0248"+
		"\7L\2\2\u0248\u0249\5F$\2\u0249O\3\2\2\2\u024a\u024b\5R*\2\u024b\u024c"+
		"\7?\2\2\u024c\u024f\5F$\2\u024d\u024e\7%\2\2\u024e\u0250\5P)\2\u024f\u024d"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250Q\3\2\2\2\u0251\u026c\5n8\2\u0252\u026c"+
		"\7\24\2\2\u0253\u025f\7U\2\2\u0254\u0255\7/\2\2\u0255\u025a\5T+\2\u0256"+
		"\u0257\7)\2\2\u0257\u0259\5T+\2\u0258\u0256\3\2\2\2\u0259\u025c\3\2\2"+
		"\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025a"+
		"\3\2\2\2\u025d\u025e\7\23\2\2\u025e\u0260\3\2\2\2\u025f\u0254\3\2\2\2"+
		"\u025f\u0260\3\2\2\2\u0260\u026c\3\2\2\2\u0261\u0262\7/\2\2\u0262\u0265"+
		"\5R*\2\u0263\u0264\7)\2\2\u0264\u0266\5R*\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026a\7\23\2\2\u026a\u026c\3\2\2\2\u026b\u0251\3\2\2\2\u026b"+
		"\u0252\3\2\2\2\u026b\u0253\3\2\2\2\u026b\u0261\3\2\2\2\u026cS\3\2\2\2"+
		"\u026d\u026e\7U\2\2\u026e\u026f\7\31\2\2\u026f\u0270\5R*\2\u0270U\3\2"+
		"\2\2\u0271\u0276\5X-\2\u0272\u0273\7)\2\2\u0273\u0275\5X-\2\u0274\u0272"+
		"\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"W\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\5F$\2\u027a\u027b\7\20\2\2\u027b"+
		"\u027c\5F$\2\u027cY\3\2\2\2\u027d\u0282\5\\/\2\u027e\u027f\7)\2\2\u027f"+
		"\u0281\5\\/\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283[\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286"+
		"\5^\60\2\u0286\u0287\7.\2\2\u0287\u0288\5`\61\2\u0288]\3\2\2\2\u0289\u028e"+
		"\5f\64\2\u028a\u028b\7)\2\2\u028b\u028d\5f\64\2\u028c\u028a\3\2\2\2\u028d"+
		"\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f_\3\2\2\2"+
		"\u0290\u028e\3\2\2\2\u0291\u0294\5F$\2\u0292\u0294\5\30\r\2\u0293\u0291"+
		"\3\2\2\2\u0293\u0292\3\2\2\2\u0294a\3\2\2\2\u0295\u029a\5d\63\2\u0296"+
		"\u0297\7)\2\2\u0297\u0299\5d\63\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bc\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029d\u02a0\5f\64\2\u029e\u029f\7.\2\2\u029f\u02a1\5\30\r\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\31"+
		"\2\2\u02a3\u02a4\5F$\2\u02a4e\3\2\2\2\u02a5\u02b1\7U\2\2\u02a6\u02a7\7"+
		"/\2\2\u02a7\u02aa\5f\64\2\u02a8\u02a9\7)\2\2\u02a9\u02ab\5f\64\2\u02aa"+
		"\u02a8\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\23\2\2\u02af\u02b1\3\2\2\2\u02b0"+
		"\u02a5\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b1g\3\2\2\2\u02b2\u02b7\7U\2\2\u02b3"+
		"\u02b4\7)\2\2\u02b4\u02b6\7U\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2"+
		"\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8i\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02ba\u02bf\5F$\2\u02bb\u02bc\7)\2\2\u02bc\u02be\5F$\2\u02bd"+
		"\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0k\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c7\7U\2\2\u02c3\u02c4"+
		"\7@\2\2\u02c4\u02c6\7U\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7"+
		"\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8m\3\2\2\2\u02c9\u02c7\3\2\2\2"+
		"\u02ca\u02cb\t\21\2\2\u02cbo\3\2\2\2>tz\u0080\u0087\u0090\u0095\u0098"+
		"\u009b\u00a0\u00a4\u00af\u00b7\u00be\u00ca\u00d3\u00da\u00f4\u00fe\u0100"+
		"\u0102\u010b\u0117\u011d\u0128\u0132\u0140\u0145\u014e\u0155\u0188\u0197"+
		"\u019a\u01ae\u01b4\u01c7\u01dc\u01e7\u01f7\u0203\u0212\u022d\u022f\u0237"+
		"\u0243\u024f\u025a\u025f\u0267\u026b\u0276\u0282\u028e\u0293\u029a\u02a0"+
		"\u02ac\u02b0\u02b7\u02bf\u02c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}