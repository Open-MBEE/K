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
		T__75=1, T__74=2, T__73=3, T__72=4, T__71=5, T__70=6, T__69=7, T__68=8, 
		T__67=9, T__66=10, T__65=11, T__64=12, T__63=13, T__62=14, T__61=15, T__60=16, 
		T__59=17, T__58=18, T__57=19, T__56=20, T__55=21, T__54=22, T__53=23, 
		T__52=24, T__51=25, T__50=26, T__49=27, T__48=28, T__47=29, T__46=30, 
		T__45=31, T__44=32, T__43=33, T__42=34, T__41=35, T__40=36, T__39=37, 
		T__38=38, T__37=39, T__36=40, T__35=41, T__34=42, T__33=43, T__32=44, 
		T__31=45, T__30=46, T__29=47, T__28=48, T__27=49, T__26=50, T__25=51, 
		T__24=52, T__23=53, T__22=54, T__21=55, T__20=56, T__19=57, T__18=58, 
		T__17=59, T__16=60, T__15=61, T__14=62, T__13=63, T__12=64, T__11=65, 
		T__10=66, T__9=67, T__8=68, T__7=69, T__6=70, T__5=71, T__4=72, T__3=73, 
		T__2=74, T__1=75, T__0=76, SUCHTHAT=77, IntegerLiteral=78, FloatingPointLiteral=79, 
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
		"'^'", "'inter'", "'=>'", "'+'", "'create'", "'forall'", "'|}'", "'Nada'", 
		"'&&'", "'||'", "'>'", "'exists'", "'Real'", "'type'", "':='", "'then'", 
		"'/'", "'>='", "'.'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
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
		RULE_functionDeclaration = 19, RULE_constraint = 20, RULE_primitiveType = 21, 
		RULE_tokenLessThan = 22, RULE_tokenGreatherThan = 23, RULE_tokenLessThanEqual = 24, 
		RULE_tokenGreaterThanEqual = 25, RULE_tokenAnd = 26, RULE_tokenOr = 27, 
		RULE_tokenNot = 28, RULE_tokenImplies = 29, RULE_tokenIFF = 30, RULE_tokenEquals = 31, 
		RULE_expressionsWithSeparator = 32, RULE_expression = 33, RULE_classArgumentList = 34, 
		RULE_classArgument = 35, RULE_idValueList = 36, RULE_idValuePair = 37, 
		RULE_match = 38, RULE_matchPattern = 39, RULE_matchArgument = 40, RULE_mapPairList = 41, 
		RULE_mapPair = 42, RULE_rngBindingList = 43, RULE_rngBinding = 44, RULE_patternList = 45, 
		RULE_collectionOrType = 46, RULE_letBindingList = 47, RULE_letBinding = 48, 
		RULE_pattern = 49, RULE_identifierList = 50, RULE_expressionList = 51, 
		RULE_qualifiedName = 52, RULE_literal = 53;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "typeParameters", "typeParameter", "typeBound", "valueParameters", 
		"typingList", "extending", "type", "typeArguments", "memberDeclaration", 
		"valueDeclaration", "sortDeclaration", "typeDeclaration", "variableDeclaration", 
		"typing", "functionDeclaration", "constraint", "primitiveType", "tokenLessThan", 
		"tokenGreatherThan", "tokenLessThanEqual", "tokenGreaterThanEqual", "tokenAnd", 
		"tokenOr", "tokenNot", "tokenImplies", "tokenIFF", "tokenEquals", "expressionsWithSeparator", 
		"expression", "classArgumentList", "classArgument", "idValueList", "idValuePair", 
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
			setState(108); packageDeclaration();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==58) {
				{
				{
				setState(109); importDeclaration();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(115); classDeclaration();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(121); topDeclaration();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); match(EOF);
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
			setState(131);
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
			case 63:
			case 64:
			case 70:
			case 72:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); memberDeclaration();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); classDeclaration();
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
			setState(133); match(49);
			setState(134); qualifiedName();
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
			setState(136); match(58);
			setState(137); qualifiedName();
			setState(140);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(138); match(SUCHTHAT);
				setState(139); match(4);
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
			setState(142); match(34);
			setState(143); match(Identifier);
			setState(145);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(144); typeParameters();
				}
			}

			setState(148);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(147); valueParameters();
				}
			}

			setState(151);
			_la = _input.LA(1);
			if (_la==54) {
				{
				setState(150); extending();
				}
			}

			setState(153); match(52);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(154); memberDeclaration();
				setState(156);
				_la = _input.LA(1);
				if (_la==SEP) {
					{
					setState(155); match(SEP);
					}
				}

				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(9);
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
			setState(165); match(3);
			setState(166); typeParameter();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(167); match(39);
				setState(168); typeParameter();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174); match(38);
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
			setState(176); match(Identifier);
			setState(179);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(177); match(44);
				setState(178); typeBound();
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
			setState(181); type(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==62) {
				{
				{
				setState(182); match(62);
				setState(183); type(0);
				}
				}
				setState(188);
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
			setState(189); match(45);
			setState(190); typingList();
			setState(191); match(17);
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
			setState(193); typing();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(194); match(39);
				setState(195); typing();
				}
				}
				setState(200);
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
			setState(201); match(54);
			setState(202); type(0);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(203); match(39);
				setState(204); type(0);
				}
				}
				setState(209);
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
			setState(240);
			switch (_input.LA(1)) {
			case 8:
			case 25:
			case 28:
			case 31:
			case 41:
			case 66:
			case 71:
				{
				setState(211); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(212); match(Identifier);
				setState(214);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(213); typeArguments();
					}
					break;
				}
				}
				break;
			case 45:
				{
				setState(216); match(45);
				setState(217); type(0);
				setState(218); match(17);
				}
				break;
			case 51:
				{
				setState(220); match(51);
				setState(221); typing();
				setState(222); match(SUCHTHAT);
				setState(223); expression(0);
				setState(224); match(65);
				}
				break;
			case 52:
				{
				setState(226); match(52);
				setState(227); type(0);
				setState(228); match(9);
				}
				break;
			case 3:
				{
				setState(230); match(3);
				setState(231); type(0);
				setState(232); match(38);
				}
				break;
			case 5:
				{
				setState(234); match(5);
				setState(235); type(0);
				setState(236); match(39);
				setState(237); type(0);
				setState(238); match(69);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(242);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(243); match(14);
						setState(244); type(7);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(245);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(248); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(246); match(4);
								setState(247); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(250); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(256);
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
			setState(257); match(3);
			setState(258); type(0);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(259); match(39);
				setState(260); type(0);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266); match(38);
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); sortDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); typeDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); valueDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271); variableDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272); functionDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273); constraint();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274); expressionsWithSeparator();
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
			setState(277); match(32);
			setState(278); typing();
			setState(281);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(279); match(23);
				setState(280); expression(0);
				}
			}

			setState(283); match(SEP);
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
			setState(285); match(72);
			setState(286); match(Identifier);
			setState(287); match(SEP);
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
			setState(289); match(72);
			setState(290); match(Identifier);
			setState(292);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(291); typeParameters();
				}
			}

			setState(294); match(23);
			setState(295); type(0);
			setState(296); match(SEP);
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
			setState(298); match(48);
			setState(299); typing();
			setState(302);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(300); match(23);
				setState(301); expression(0);
				}
			}

			setState(304); match(SEP);
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
			setState(306); match(Identifier);
			setState(307); match(44);
			setState(308); type(0);
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
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 38, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(50);
			setState(311); match(Identifier);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312); match(45);
				setState(314);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(313); typingList();
					}
				}

				setState(316); match(17);
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==45 );
			{
			setState(321); match(44);
			setState(322); type(0);
			}
			setState(324); match(52);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 32) | (1L << 33) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(325); memberDeclaration();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331); match(9);
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
		enterRule(_localctx, 40, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(33);
			setState(335);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(334); match(Identifier);
				}
			}

			setState(337); match(52);
			setState(338); expression(0);
			setState(339); match(9);
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
		enterRule(_localctx, 42, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (25 - 8)) | (1L << (28 - 8)) | (1L << (31 - 8)) | (1L << (41 - 8)) | (1L << (66 - 8)) | (1L << (71 - 8)))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		enterRule(_localctx, 46, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==69) ) {
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
		enterRule(_localctx, 48, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 50, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==30 || _la==76) ) {
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
		enterRule(_localctx, 52, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==53 || _la==67) ) {
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
		enterRule(_localctx, 54, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==68) ) {
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
		enterRule(_localctx, 56, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		enterRule(_localctx, 58, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 60, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 62, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 64, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); expression(0);
			setState(364); match(SEP);
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
		public TokenAndContext tokenAnd() {
			return getRuleContext(TokenAndContext.class,0);
		}
		public TokenGreaterThanEqualContext tokenGreaterThanEqual() {
			return getRuleContext(TokenGreaterThanEqualContext.class,0);
		}
		public TokenGreatherThanContext tokenGreatherThan() {
			return getRuleContext(TokenGreatherThanContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MapPairContext mapPair() {
			return getRuleContext(MapPairContext.class,0);
		}
		public TokenIFFContext tokenIFF() {
			return getRuleContext(TokenIFFContext.class,0);
		}
		public ClassArgumentListContext classArgumentList() {
			return getRuleContext(ClassArgumentListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TokenLessThanContext tokenLessThan() {
			return getRuleContext(TokenLessThanContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TokenImpliesContext tokenImplies() {
			return getRuleContext(TokenImpliesContext.class,0);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(367); match(42);
				setState(368); expression(27);
				}
				break;

			case 2:
				{
				setState(369); tokenNot();
				setState(370); expression(24);
				}
				break;

			case 3:
				{
				setState(372); match(64);
				setState(373); rngBindingList();
				setState(374); match(SUCHTHAT);
				setState(375); expression(16);
				}
				break;

			case 4:
				{
				setState(377); match(70);
				setState(378); rngBindingList();
				setState(379); match(SUCHTHAT);
				setState(380); expression(15);
				}
				break;

			case 5:
				{
				setState(382); match(20);
				setState(383); pattern();
				setState(386);
				_la = _input.LA(1);
				if (_la==44) {
					{
					setState(384); match(44);
					setState(385); type(0);
					}
				}

				setState(388); match(SUCHTHAT);
				setState(389); expression(2);
				}
				break;

			case 6:
				{
				setState(391); match(45);
				setState(392); expression(0);
				setState(393); match(17);
				}
				break;

			case 7:
				{
				setState(395); literal();
				}
				break;

			case 8:
				{
				setState(396); match(Identifier);
				}
				break;

			case 9:
				{
				setState(397); match(63);
				setState(398); qualifiedName();
				setState(404);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(399); match(45);
					setState(401);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(400); classArgumentList();
						}
					}

					setState(403); match(17);
					}
					break;
				}
				}
				break;

			case 10:
				{
				setState(406); match(46);
				setState(407); expression(0);
				setState(408); match(74);
				setState(409); expression(0);
				setState(410); match(56);
				setState(411); expression(0);
				}
				break;

			case 11:
				{
				setState(413); match(13);
				setState(414); expression(0);
				setState(415); match(40);
				setState(416); match();
				}
				break;

			case 12:
				{
				setState(418); match(45);
				setState(419); expression(0);
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420); match(39);
					setState(421); expression(0);
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(426); match(17);
				}
				break;

			case 13:
				{
				setState(428); match(52);
				setState(430);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(429); expressionList();
					}
				}

				setState(432); match(9);
				}
				break;

			case 14:
				{
				setState(433); match(52);
				setState(434); expression(0);
				setState(435); match(37);
				setState(436); expression(0);
				setState(437); match(9);
				}
				break;

			case 15:
				{
				setState(439); match(52);
				setState(440); expression(0);
				setState(441); match(35);
				setState(442); rngBindingList();
				setState(443); match(SUCHTHAT);
				setState(444); expression(0);
				setState(445); match(9);
				}
				break;

			case 16:
				{
				setState(447); match(3);
				setState(449);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(448); expressionList();
					}
				}

				setState(451); match(38);
				}
				break;

			case 17:
				{
				setState(452); match(3);
				setState(453); expression(0);
				setState(454); match(37);
				setState(455); expression(0);
				setState(456); match(38);
				}
				break;

			case 18:
				{
				setState(458); match(3);
				setState(459); expression(0);
				setState(460); match(35);
				setState(461); pattern();
				setState(462); match(44);
				setState(463); expression(0);
				setState(464); match(SUCHTHAT);
				setState(465); expression(0);
				setState(466); match(38);
				}
				break;

			case 19:
				{
				setState(468); match(52);
				setState(470);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 36) | (1L << 42) | (1L << 43) | (1L << 45) | (1L << 46) | (1L << 52) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (70 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(469); mapPairList();
					}
				}

				setState(472); match(9);
				}
				break;

			case 20:
				{
				setState(473); match(52);
				setState(474); mapPair();
				setState(475); match(35);
				setState(476); rngBindingList();
				setState(477); match(SUCHTHAT);
				setState(478); expression(0);
				setState(479); match(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(551);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(484); match(73);
						setState(485); expression(29);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(487);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==15 || _la==75) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(488); expression(27);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(490);
						_la = _input.LA(1);
						if ( !(_la==42 || _la==62) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(491); expression(26);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(497);
						switch (_input.LA(1)) {
						case 7:
						case 47:
							{
							setState(493); tokenLessThanEqual();
							}
							break;
						case 30:
						case 76:
							{
							setState(494); tokenGreaterThanEqual();
							}
							break;
						case 5:
						case 12:
							{
							setState(495); tokenLessThan();
							}
							break;
						case 22:
						case 69:
							{
							setState(496); tokenGreatherThan();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(499); expression(24);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(502);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 10) | (1L << 26) | (1L << 55))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(503); expression(23);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(504);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(509);
						switch (_input.LA(1)) {
						case 11:
						case 23:
							{
							setState(505); tokenEquals();
							}
							break;
						case 36:
						case 43:
							{
							setState(506); tokenNot();
							setState(507); tokenEquals();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(511); expression(22);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(514); tokenAnd();
						setState(515); expression(21);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(518); tokenOr();
						setState(519); expression(20);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(521);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(524);
						switch (_input.LA(1)) {
						case 1:
						case 61:
							{
							setState(522); tokenImplies();
							}
							break;
						case 21:
						case 24:
							{
							setState(523); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(526); expression(19);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(529); match(27);
						setState(530); expression(18);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(531);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(532);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 29) | (1L << 60))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(533); expression(14);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(534);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(535); match(59);
						}
						setState(536); expression(10);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(537);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(538); match(57);
						setState(539); expression(6);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(540);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(541); match(SUCHTHAT);
						setState(542); match(Identifier);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(543);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(544); expression(0);
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(546); match(19);
						setState(547); match(52);
						setState(548); idValueList();
						setState(549); match(9);
						}
						break;
					}
					} 
				}
				setState(555);
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
		enterRule(_localctx, 68, RULE_classArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); classArgument();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(557); match(39);
				setState(558); classArgument();
				}
				}
				setState(563);
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
		enterRule(_localctx, 70, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); match(Identifier);
			setState(565); match(44);
			setState(566); expression(0);
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
		enterRule(_localctx, 72, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); idValuePair();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(569); match(39);
				setState(570); idValuePair();
				}
				}
				setState(575);
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
		enterRule(_localctx, 74, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(Identifier);
			setState(577); match(73);
			setState(578); expression(0);
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
		enterRule(_localctx, 76, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); matchPattern();
			setState(581); match(61);
			setState(582); expression(0);
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(583); match(35);
				setState(584); match();
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
		enterRule(_localctx, 78, RULE_matchPattern);
		int _la;
		try {
			setState(613);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(587); literal();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(588); match(18);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(589); match(Identifier);
				setState(601);
				_la = _input.LA(1);
				if (_la==45) {
					{
					setState(590); match(45);
					setState(591); matchArgument();
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==39) {
						{
						{
						setState(592); match(39);
						setState(593); matchArgument();
						}
						}
						setState(598);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(599); match(17);
					}
				}

				}
				break;
			case 45:
				enterOuterAlt(_localctx, 4);
				{
				setState(603); match(45);
				setState(604); matchPattern();
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(605); match(39);
					setState(606); matchPattern();
					}
					}
					setState(609); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(611); match(17);
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
		enterRule(_localctx, 80, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); match(Identifier);
			setState(616); match(23);
			setState(617); matchPattern();
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
		enterRule(_localctx, 82, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); mapPair();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(620); match(39);
				setState(621); mapPair();
				}
				}
				setState(626);
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
		enterRule(_localctx, 84, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); expression(0);
			setState(628); match(14);
			setState(629); expression(0);
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
		enterRule(_localctx, 86, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); rngBinding();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(632); match(39);
				setState(633); rngBinding();
				}
				}
				setState(638);
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
		enterRule(_localctx, 88, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); patternList();
			setState(640); match(44);
			setState(641); collectionOrType();
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
		enterRule(_localctx, 90, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); pattern();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(644); match(39);
				setState(645); pattern();
				}
				}
				setState(650);
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
		enterRule(_localctx, 92, RULE_collectionOrType);
		try {
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); type(0);
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
		enterRule(_localctx, 94, RULE_letBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); letBinding();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(656); match(39);
				setState(657); letBinding();
				}
				}
				setState(662);
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
		enterRule(_localctx, 96, RULE_letBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); pattern();
			setState(666);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(664); match(44);
				setState(665); type(0);
				}
			}

			setState(668); match(23);
			setState(669); expression(0);
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
		enterRule(_localctx, 98, RULE_pattern);
		int _la;
		try {
			setState(682);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); match(Identifier);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); match(45);
				setState(673); pattern();
				setState(676); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(674); match(39);
					setState(675); pattern();
					}
					}
					setState(678); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==39 );
				setState(680); match(17);
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
		enterRule(_localctx, 100, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(Identifier);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(685); match(39);
				setState(686); match(Identifier);
				}
				}
				setState(691);
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
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); expression(0);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==39) {
				{
				{
				setState(693); match(39);
				setState(694); expression(0);
				}
				}
				setState(699);
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
		enterRule(_localctx, 104, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700); match(Identifier);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(701); match(SUCHTHAT);
					setState(702); match(Identifier);
					}
					} 
				}
				setState(707);
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
		enterRule(_localctx, 106, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
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

		case 33: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u02c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2"+
		"\7\2w\n\2\f\2\16\2z\13\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\3\3"+
		"\3\3\5\3\u0086\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3"+
		"\6\5\6\u0094\n\6\3\6\5\6\u0097\n\6\3\6\5\6\u009a\n\6\3\6\3\6\3\6\5\6\u009f"+
		"\n\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ac"+
		"\n\7\f\7\16\7\u00af\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t"+
		"\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u00c7\n\13\f\13\16\13\u00ca\13\13\3\f\3\f\3\f\3\f\7\f\u00d0\n\f\f\f\16"+
		"\f\u00d3\13\f\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00f3\n\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00fb\n\r\r\r\16\r\u00fc\7"+
		"\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\16\3\16\3\16\3\16\7\16\u0108\n\16\f"+
		"\16\16\16\u010b\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0116\n\17\3\20\3\20\3\20\3\20\5\20\u011c\n\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u0127\n\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0131\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\5\25\u013d\n\25\3\25\6\25\u0140\n\25\r\25\16\25\u0141\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0149\n\25\f\25\16\25\u014c\13\25\3\25\3\25\3\26"+
		"\3\26\5\26\u0152\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u0185\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0194\n#"+
		"\3#\5#\u0197\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u01a9"+
		"\n#\r#\16#\u01aa\3#\3#\3#\3#\5#\u01b1\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01c4\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01d9\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e4"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01f4\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u0200\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\5#\u020f\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u022a\n#\f#\16#\u022d\13#\3$\3$\3$\7$\u0232\n$\f"+
		"$\16$\u0235\13$\3%\3%\3%\3%\3&\3&\3&\7&\u023e\n&\f&\16&\u0241\13&\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u024c\n(\3)\3)\3)\3)\3)\3)\3)\7)\u0255"+
		"\n)\f)\16)\u0258\13)\3)\3)\5)\u025c\n)\3)\3)\3)\3)\6)\u0262\n)\r)\16)"+
		"\u0263\3)\3)\5)\u0268\n)\3*\3*\3*\3*\3+\3+\3+\7+\u0271\n+\f+\16+\u0274"+
		"\13+\3,\3,\3,\3,\3-\3-\3-\7-\u027d\n-\f-\16-\u0280\13-\3.\3.\3.\3.\3/"+
		"\3/\3/\7/\u0289\n/\f/\16/\u028c\13/\3\60\3\60\5\60\u0290\n\60\3\61\3\61"+
		"\3\61\7\61\u0295\n\61\f\61\16\61\u0298\13\61\3\62\3\62\3\62\5\62\u029d"+
		"\n\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\6\63\u02a7\n\63\r\63\16"+
		"\63\u02a8\3\63\3\63\5\63\u02ad\n\63\3\64\3\64\3\64\7\64\u02b2\n\64\f\64"+
		"\16\64\u02b5\13\64\3\65\3\65\3\65\7\65\u02ba\n\65\f\65\16\65\u02bd\13"+
		"\65\3\66\3\66\3\66\7\66\u02c2\n\66\f\66\16\66\u02c5\13\66\3\67\3\67\3"+
		"\67\2\4\30D8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\22\t\2\n\n\33\33\36\36!!++DDII\4\2\7"+
		"\7\16\16\4\2\30\30GG\4\2\t\t\61\61\4\2  NN\4\2\67\67EE\4\2\4\4FF\4\2&"+
		"&--\4\2\3\3??\4\2\27\27\32\32\4\2\r\r\31\31\5\2\6\6\21\21MM\4\2,,@@\6"+
		"\2\b\b\f\f\34\3499\5\2\22\22\37\37>>\3\2PT\u02fc\2n\3\2\2\2\4\u0085\3"+
		"\2\2\2\6\u0087\3\2\2\2\b\u008a\3\2\2\2\n\u0090\3\2\2\2\f\u00a7\3\2\2\2"+
		"\16\u00b2\3\2\2\2\20\u00b7\3\2\2\2\22\u00bf\3\2\2\2\24\u00c3\3\2\2\2\26"+
		"\u00cb\3\2\2\2\30\u00f2\3\2\2\2\32\u0103\3\2\2\2\34\u0115\3\2\2\2\36\u0117"+
		"\3\2\2\2 \u011f\3\2\2\2\"\u0123\3\2\2\2$\u012c\3\2\2\2&\u0134\3\2\2\2"+
		"(\u0138\3\2\2\2*\u014f\3\2\2\2,\u0157\3\2\2\2.\u0159\3\2\2\2\60\u015b"+
		"\3\2\2\2\62\u015d\3\2\2\2\64\u015f\3\2\2\2\66\u0161\3\2\2\28\u0163\3\2"+
		"\2\2:\u0165\3\2\2\2<\u0167\3\2\2\2>\u0169\3\2\2\2@\u016b\3\2\2\2B\u016d"+
		"\3\2\2\2D\u01e3\3\2\2\2F\u022e\3\2\2\2H\u0236\3\2\2\2J\u023a\3\2\2\2L"+
		"\u0242\3\2\2\2N\u0246\3\2\2\2P\u0267\3\2\2\2R\u0269\3\2\2\2T\u026d\3\2"+
		"\2\2V\u0275\3\2\2\2X\u0279\3\2\2\2Z\u0281\3\2\2\2\\\u0285\3\2\2\2^\u028f"+
		"\3\2\2\2`\u0291\3\2\2\2b\u0299\3\2\2\2d\u02ac\3\2\2\2f\u02ae\3\2\2\2h"+
		"\u02b6\3\2\2\2j\u02be\3\2\2\2l\u02c6\3\2\2\2nr\5\6\4\2oq\5\b\5\2po\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\5\n\6\2vu\3\2"+
		"\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y~\3\2\2\2zx\3\2\2\2{}\5\4\3\2|{\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0086\5\34\17\2\u0084"+
		"\u0086\5\n\6\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\5\3\2\2\2"+
		"\u0087\u0088\7\63\2\2\u0088\u0089\5j\66\2\u0089\7\3\2\2\2\u008a\u008b"+
		"\7<\2\2\u008b\u008e\5j\66\2\u008c\u008d\7O\2\2\u008d\u008f\7\6\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\t\3\2\2\2\u0090\u0091\7$\2\2"+
		"\u0091\u0093\7U\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5\22\n\2\u0096\u0095\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5\26\f\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a2\7\66\2\2"+
		"\u009c\u009e\5\34\17\2\u009d\u009f\7Y\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7\13\2\2\u00a6\13\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00ad"+
		"\5\16\b\2\u00a9\u00aa\7)\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7(\2\2\u00b1\r\3\2\2\2\u00b2"+
		"\u00b5\7U\2\2\u00b3\u00b4\7.\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00bc\5\30\r\2\u00b8\u00b9"+
		"\7@\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c0\7/\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\23\3\2\2\2\u00c3\u00c8\5&\24\2\u00c4\u00c5\7)\2\2\u00c5\u00c7\5&\24\2"+
		"\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\78\2\2\u00cc"+
		"\u00d1\5\30\r\2\u00cd\u00ce\7)\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\27\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\r\1\2\u00d5\u00f3\5,\27"+
		"\2\u00d6\u00d8\7U\2\2\u00d7\u00d9\5\32\16\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00f3\3\2\2\2\u00da\u00db\7/\2\2\u00db\u00dc\5\30"+
		"\r\2\u00dc\u00dd\7\23\2\2\u00dd\u00f3\3\2\2\2\u00de\u00df\7\65\2\2\u00df"+
		"\u00e0\5&\24\2\u00e0\u00e1\7O\2\2\u00e1\u00e2\5D#\2\u00e2\u00e3\7C\2\2"+
		"\u00e3\u00f3\3\2\2\2\u00e4\u00e5\7\66\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7"+
		"\7\13\2\2\u00e7\u00f3\3\2\2\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\5\30\r\2"+
		"\u00ea\u00eb\7(\2\2\u00eb\u00f3\3\2\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee"+
		"\5\30\r\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1\7G\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00d4\3\2\2\2\u00f2\u00d6\3\2\2\2\u00f2\u00da\3\2"+
		"\2\2\u00f2\u00de\3\2\2\2\u00f2\u00e4\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2"+
		"\u00ec\3\2\2\2\u00f3\u0100\3\2\2\2\u00f4\u00f5\f\b\2\2\u00f5\u00f6\7\20"+
		"\2\2\u00f6\u00ff\5\30\r\t\u00f7\u00fa\f\t\2\2\u00f8\u00f9\7\6\2\2\u00f9"+
		"\u00fb\5\30\r\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe"+
		"\u00f7\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\31\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\5\2\2\u0104\u0109"+
		"\5\30\r\2\u0105\u0106\7)\2\2\u0106\u0108\5\30\r\2\u0107\u0105\3\2\2\2"+
		"\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7(\2\2\u010d\33\3\2\2\2\u010e"+
		"\u0116\5 \21\2\u010f\u0116\5\"\22\2\u0110\u0116\5\36\20\2\u0111\u0116"+
		"\5$\23\2\u0112\u0116\5(\25\2\u0113\u0116\5*\26\2\u0114\u0116\5B\"\2\u0115"+
		"\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2"+
		"\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\35\3\2\2\2\u0117\u0118\7\"\2\2\u0118\u011b\5&\24\2\u0119\u011a\7\31\2"+
		"\2\u011a\u011c\5D#\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\7Y\2\2\u011e\37\3\2\2\2\u011f\u0120\7J\2\2\u0120"+
		"\u0121\7U\2\2\u0121\u0122\7Y\2\2\u0122!\3\2\2\2\u0123\u0124\7J\2\2\u0124"+
		"\u0126\7U\2\2\u0125\u0127\5\f\7\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\31\2\2\u0129\u012a\5\30\r\2\u012a"+
		"\u012b\7Y\2\2\u012b#\3\2\2\2\u012c\u012d\7\62\2\2\u012d\u0130\5&\24\2"+
		"\u012e\u012f\7\31\2\2\u012f\u0131\5D#\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7Y\2\2\u0133%\3\2\2\2\u0134\u0135"+
		"\7U\2\2\u0135\u0136\7.\2\2\u0136\u0137\5\30\r\2\u0137\'\3\2\2\2\u0138"+
		"\u0139\7\64\2\2\u0139\u013f\7U\2\2\u013a\u013c\7/\2\2\u013b\u013d\5\24"+
		"\13\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\7\23\2\2\u013f\u013a\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7.\2\2\u0144"+
		"\u0145\5\30\r\2\u0145\u0146\3\2\2\2\u0146\u014a\7\66\2\2\u0147\u0149\5"+
		"\34\17\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\13"+
		"\2\2\u014e)\3\2\2\2\u014f\u0151\7#\2\2\u0150\u0152\7U\2\2\u0151\u0150"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\66\2\2"+
		"\u0154\u0155\5D#\2\u0155\u0156\7\13\2\2\u0156+\3\2\2\2\u0157\u0158\t\2"+
		"\2\2\u0158-\3\2\2\2\u0159\u015a\t\3\2\2\u015a/\3\2\2\2\u015b\u015c\t\4"+
		"\2\2\u015c\61\3\2\2\2\u015d\u015e\t\5\2\2\u015e\63\3\2\2\2\u015f\u0160"+
		"\t\6\2\2\u0160\65\3\2\2\2\u0161\u0162\t\7\2\2\u0162\67\3\2\2\2\u0163\u0164"+
		"\t\b\2\2\u01649\3\2\2\2\u0165\u0166\t\t\2\2\u0166;\3\2\2\2\u0167\u0168"+
		"\t\n\2\2\u0168=\3\2\2\2\u0169\u016a\t\13\2\2\u016a?\3\2\2\2\u016b\u016c"+
		"\t\f\2\2\u016cA\3\2\2\2\u016d\u016e\5D#\2\u016e\u016f\7Y\2\2\u016fC\3"+
		"\2\2\2\u0170\u0171\b#\1\2\u0171\u0172\7,\2\2\u0172\u01e4\5D#\35\u0173"+
		"\u0174\5:\36\2\u0174\u0175\5D#\32\u0175\u01e4\3\2\2\2\u0176\u0177\7B\2"+
		"\2\u0177\u0178\5X-\2\u0178\u0179\7O\2\2\u0179\u017a\5D#\22\u017a\u01e4"+
		"\3\2\2\2\u017b\u017c\7H\2\2\u017c\u017d\5X-\2\u017d\u017e\7O\2\2\u017e"+
		"\u017f\5D#\21\u017f\u01e4\3\2\2\2\u0180\u0181\7\26\2\2\u0181\u0184\5d"+
		"\63\2\u0182\u0183\7.\2\2\u0183\u0185\5\30\r\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7O\2\2\u0187\u0188\5D#"+
		"\4\u0188\u01e4\3\2\2\2\u0189\u018a\7/\2\2\u018a\u018b\5D#\2\u018b\u018c"+
		"\7\23\2\2\u018c\u01e4\3\2\2\2\u018d\u01e4\5l\67\2\u018e\u01e4\7U\2\2\u018f"+
		"\u0190\7A\2\2\u0190\u0196\5j\66\2\u0191\u0193\7/\2\2\u0192\u0194\5F$\2"+
		"\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\7\23\2\2\u0196\u0191\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01e4\3\2\2\2"+
		"\u0198\u0199\7\60\2\2\u0199\u019a\5D#\2\u019a\u019b\7L\2\2\u019b\u019c"+
		"\5D#\2\u019c\u019d\7:\2\2\u019d\u019e\5D#\2\u019e\u01e4\3\2\2\2\u019f"+
		"\u01a0\7\17\2\2\u01a0\u01a1\5D#\2\u01a1\u01a2\7*\2\2\u01a2\u01a3\5N(\2"+
		"\u01a3\u01e4\3\2\2\2\u01a4\u01a5\7/\2\2\u01a5\u01a8\5D#\2\u01a6\u01a7"+
		"\7)\2\2\u01a7\u01a9\5D#\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7\23"+
		"\2\2\u01ad\u01e4\3\2\2\2\u01ae\u01b0\7\66\2\2\u01af\u01b1\5h\65\2\u01b0"+
		"\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01e4\7\13"+
		"\2\2\u01b3\u01b4\7\66\2\2\u01b4\u01b5\5D#\2\u01b5\u01b6\7\'\2\2\u01b6"+
		"\u01b7\5D#\2\u01b7\u01b8\7\13\2\2\u01b8\u01e4\3\2\2\2\u01b9\u01ba\7\66"+
		"\2\2\u01ba\u01bb\5D#\2\u01bb\u01bc\7%\2\2\u01bc\u01bd\5X-\2\u01bd\u01be"+
		"\7O\2\2\u01be\u01bf\5D#\2\u01bf\u01c0\7\13\2\2\u01c0\u01e4\3\2\2\2\u01c1"+
		"\u01c3\7\5\2\2\u01c2\u01c4\5h\65\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01e4\7(\2\2\u01c6\u01c7\7\5\2\2\u01c7"+
		"\u01c8\5D#\2\u01c8\u01c9\7\'\2\2\u01c9\u01ca\5D#\2\u01ca\u01cb\7(\2\2"+
		"\u01cb\u01e4\3\2\2\2\u01cc\u01cd\7\5\2\2\u01cd\u01ce\5D#\2\u01ce\u01cf"+
		"\7%\2\2\u01cf\u01d0\5d\63\2\u01d0\u01d1\7.\2\2\u01d1\u01d2\5D#\2\u01d2"+
		"\u01d3\7O\2\2\u01d3\u01d4\5D#\2\u01d4\u01d5\7(\2\2\u01d5\u01e4\3\2\2\2"+
		"\u01d6\u01d8\7\66\2\2\u01d7\u01d9\5T+\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01e4\7\13\2\2\u01db\u01dc\7\66\2\2"+
		"\u01dc\u01dd\5V,\2\u01dd\u01de\7%\2\2\u01de\u01df\5X-\2\u01df\u01e0\7"+
		"O\2\2\u01e0\u01e1\5D#\2\u01e1\u01e2\7\13\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u0170\3\2\2\2\u01e3\u0173\3\2\2\2\u01e3\u0176\3\2\2\2\u01e3\u017b\3\2"+
		"\2\2\u01e3\u0180\3\2\2\2\u01e3\u0189\3\2\2\2\u01e3\u018d\3\2\2\2\u01e3"+
		"\u018e\3\2\2\2\u01e3\u018f\3\2\2\2\u01e3\u0198\3\2\2\2\u01e3\u019f\3\2"+
		"\2\2\u01e3\u01a4\3\2\2\2\u01e3\u01ae\3\2\2\2\u01e3\u01b3\3\2\2\2\u01e3"+
		"\u01b9\3\2\2\2\u01e3\u01c1\3\2\2\2\u01e3\u01c6\3\2\2\2\u01e3\u01cc\3\2"+
		"\2\2\u01e3\u01d6\3\2\2\2\u01e3\u01db\3\2\2\2\u01e4\u022b\3\2\2\2\u01e5"+
		"\u01e6\f\36\2\2\u01e6\u01e7\7K\2\2\u01e7\u022a\5D#\37\u01e8\u01e9\f\34"+
		"\2\2\u01e9\u01ea\t\r\2\2\u01ea\u022a\5D#\35\u01eb\u01ec\f\33\2\2\u01ec"+
		"\u01ed\t\16\2\2\u01ed\u022a\5D#\34\u01ee\u01f3\f\31\2\2\u01ef\u01f4\5"+
		"\62\32\2\u01f0\u01f4\5\64\33\2\u01f1\u01f4\5.\30\2\u01f2\u01f4\5\60\31"+
		"\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5D#\32\u01f6\u022a\3\2\2\2\u01f7"+
		"\u01f8\f\30\2\2\u01f8\u01f9\t\17\2\2\u01f9\u022a\5D#\31\u01fa\u01ff\f"+
		"\27\2\2\u01fb\u0200\5@!\2\u01fc\u01fd\5:\36\2\u01fd\u01fe\5@!\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\5D#\30\u0202\u022a\3\2\2\2\u0203\u0204\f\26\2\2\u0204"+
		"\u0205\5\66\34\2\u0205\u0206\5D#\27\u0206\u022a\3\2\2\2\u0207\u0208\f"+
		"\25\2\2\u0208\u0209\58\35\2\u0209\u020a\5D#\26\u020a\u022a\3\2\2\2\u020b"+
		"\u020e\f\24\2\2\u020c\u020f\5<\37\2\u020d\u020f\5> \2\u020e\u020c\3\2"+
		"\2\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\5D#\25\u0211"+
		"\u022a\3\2\2\2\u0212\u0213\f\23\2\2\u0213\u0214\7\35\2\2\u0214\u022a\5"+
		"D#\24\u0215\u0216\f\17\2\2\u0216\u0217\t\20\2\2\u0217\u022a\5D#\20\u0218"+
		"\u0219\f\13\2\2\u0219\u021a\7=\2\2\u021a\u022a\5D#\f\u021b\u021c\f\7\2"+
		"\2\u021c\u021d\7;\2\2\u021d\u022a\5D#\b\u021e\u021f\f#\2\2\u021f\u0220"+
		"\7O\2\2\u0220\u022a\7U\2\2\u0221\u0222\f!\2\2\u0222\u022a\5D#\2\u0223"+
		"\u0224\f\3\2\2\u0224\u0225\7\25\2\2\u0225\u0226\7\66\2\2\u0226\u0227\5"+
		"J&\2\u0227\u0228\7\13\2\2\u0228\u022a\3\2\2\2\u0229\u01e5\3\2\2\2\u0229"+
		"\u01e8\3\2\2\2\u0229\u01eb\3\2\2\2\u0229\u01ee\3\2\2\2\u0229\u01f7\3\2"+
		"\2\2\u0229\u01fa\3\2\2\2\u0229\u0203\3\2\2\2\u0229\u0207\3\2\2\2\u0229"+
		"\u020b\3\2\2\2\u0229\u0212\3\2\2\2\u0229\u0215\3\2\2\2\u0229\u0218\3\2"+
		"\2\2\u0229\u021b\3\2\2\2\u0229\u021e\3\2\2\2\u0229\u0221\3\2\2\2\u0229"+
		"\u0223\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022cE\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0233\5H%\2\u022f\u0230"+
		"\7)\2\2\u0230\u0232\5H%\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234G\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0237\7U\2\2\u0237\u0238\7.\2\2\u0238\u0239\5D#\2\u0239I\3\2\2"+
		"\2\u023a\u023f\5L\'\2\u023b\u023c\7)\2\2\u023c\u023e\5L\'\2\u023d\u023b"+
		"\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"K\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7U\2\2\u0243\u0244\7K\2\2\u0244"+
		"\u0245\5D#\2\u0245M\3\2\2\2\u0246\u0247\5P)\2\u0247\u0248\7?\2\2\u0248"+
		"\u024b\5D#\2\u0249\u024a\7%\2\2\u024a\u024c\5N(\2\u024b\u0249\3\2\2\2"+
		"\u024b\u024c\3\2\2\2\u024cO\3\2\2\2\u024d\u0268\5l\67\2\u024e\u0268\7"+
		"\24\2\2\u024f\u025b\7U\2\2\u0250\u0251\7/\2\2\u0251\u0256\5R*\2\u0252"+
		"\u0253\7)\2\2\u0253\u0255\5R*\2\u0254\u0252\3\2\2\2\u0255\u0258\3\2\2"+
		"\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025a\7\23\2\2\u025a\u025c\3\2\2\2\u025b\u0250\3\2\2\2"+
		"\u025b\u025c\3\2\2\2\u025c\u0268\3\2\2\2\u025d\u025e\7/\2\2\u025e\u0261"+
		"\5P)\2\u025f\u0260\7)\2\2\u0260\u0262\5P)\2\u0261\u025f\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\7\23\2\2\u0266\u0268\3\2\2\2\u0267\u024d\3\2\2\2\u0267"+
		"\u024e\3\2\2\2\u0267\u024f\3\2\2\2\u0267\u025d\3\2\2\2\u0268Q\3\2\2\2"+
		"\u0269\u026a\7U\2\2\u026a\u026b\7\31\2\2\u026b\u026c\5P)\2\u026cS\3\2"+
		"\2\2\u026d\u0272\5V,\2\u026e\u026f\7)\2\2\u026f\u0271\5V,\2\u0270\u026e"+
		"\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"U\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\5D#\2\u0276\u0277\7\20\2\2\u0277"+
		"\u0278\5D#\2\u0278W\3\2\2\2\u0279\u027e\5Z.\2\u027a\u027b\7)\2\2\u027b"+
		"\u027d\5Z.\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027fY\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282"+
		"\5\\/\2\u0282\u0283\7.\2\2\u0283\u0284\5^\60\2\u0284[\3\2\2\2\u0285\u028a"+
		"\5d\63\2\u0286\u0287\7)\2\2\u0287\u0289\5d\63\2\u0288\u0286\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b]\3\2\2\2"+
		"\u028c\u028a\3\2\2\2\u028d\u0290\5D#\2\u028e\u0290\5\30\r\2\u028f\u028d"+
		"\3\2\2\2\u028f\u028e\3\2\2\2\u0290_\3\2\2\2\u0291\u0296\5b\62\2\u0292"+
		"\u0293\7)\2\2\u0293\u0295\5b\62\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029c\5d\63\2\u029a\u029b\7.\2\2\u029b\u029d\5\30\r\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\31"+
		"\2\2\u029f\u02a0\5D#\2\u02a0c\3\2\2\2\u02a1\u02ad\7U\2\2\u02a2\u02a3\7"+
		"/\2\2\u02a3\u02a6\5d\63\2\u02a4\u02a5\7)\2\2\u02a5\u02a7\5d\63\2\u02a6"+
		"\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\23\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02a1\3\2\2\2\u02ac\u02a2\3\2\2\2\u02ade\3\2\2\2\u02ae\u02b3\7U\2\2\u02af"+
		"\u02b0\7)\2\2\u02b0\u02b2\7U\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2"+
		"\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4g\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6\u02bb\5D#\2\u02b7\u02b8\7)\2\2\u02b8\u02ba\5D#\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bci\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c3\7U\2\2\u02bf\u02c0"+
		"\7O\2\2\u02c0\u02c2\7U\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4k\3\2\2\2\u02c5\u02c3\3\2\2\2"+
		"\u02c6\u02c7\t\21\2\2\u02c7m\3\2\2\2>rx~\u0085\u008e\u0093\u0096\u0099"+
		"\u009e\u00a2\u00ad\u00b5\u00bc\u00c8\u00d1\u00d8\u00f2\u00fc\u00fe\u0100"+
		"\u0109\u0115\u011b\u0126\u0130\u013c\u0141\u014a\u0151\u0184\u0193\u0196"+
		"\u01aa\u01b0\u01c3\u01d8\u01e3\u01f3\u01ff\u020e\u0229\u022b\u0233\u023f"+
		"\u024b\u0256\u025b\u0263\u0267\u0272\u027e\u028a\u028f\u0296\u029c\u02a8"+
		"\u02ac\u02b3\u02bb\u02c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}