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
		"'Unit'", "'union'", "')'", "'_'", "'-\\'", "'iff'", "'gt'", "'='", "'<=>'", 
		"'String'", "'psubset'", "'Int'", "'\\'", "'gte'", "'Char'", "'val'", 
		"'req'", "'class'", "'|'", "'!'", "'..'", "']'", "','", "'of'", "'Void'", 
		"'-'", "'not'", "':'", "'('", "'if'", "'lte'", "'var'", "'package'", "'def'", 
		"'{|'", "'{'", "'and'", "'extends'", "'isin'", "'else'", "'++'", "'import'", 
		"'^'", "'inter'", "'=>'", "'+'", "'create'", "'forall'", "'|}'", "'Nada'", 
		"'&&'", "'||'", "'>'", "'exists'", "'Real'", "'type'", "':='", "'then'", 
		"'/'", "'>='", "'#'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "Identifier", "COMMENT", 
		"LINE_COMMENT", "WS", "';'"
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
			while (_la==57) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
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
			case 31:
			case 32:
			case 35:
			case 41:
			case 42:
			case 44:
			case 45:
			case 47:
			case 49:
			case 51:
			case 62:
			case 63:
			case 69:
			case 71:
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
			case 33:
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
			setState(133); match(48);
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
			setState(136); match(57);
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
			setState(142); match(33);
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
			if (_la==44) {
				{
				setState(147); valueParameters();
				}
			}

			setState(151);
			_la = _input.LA(1);
			if (_la==53) {
				{
				setState(150); extending();
				}
			}

			setState(153); match(51);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(154); memberDeclaration();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); match(9);
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
			setState(162); match(3);
			setState(163); typeParameter();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(164); match(38);
				setState(165); typeParameter();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(37);
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
			setState(173); match(Identifier);
			setState(176);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(174); match(43);
				setState(175); typeBound();
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
			setState(178); type(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==61) {
				{
				{
				setState(179); match(61);
				setState(180); type(0);
				}
				}
				setState(185);
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
			setState(186); match(44);
			setState(187); typingList();
			setState(188); match(18);
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
			setState(190); typing();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(191); match(38);
				setState(192); typing();
				}
				}
				setState(197);
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
			setState(198); match(53);
			setState(199); type(0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(200); match(38);
				setState(201); type(0);
				}
				}
				setState(206);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
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
			setState(237);
			switch (_input.LA(1)) {
			case 8:
			case 16:
			case 25:
			case 27:
			case 30:
			case 40:
			case 65:
			case 70:
				{
				setState(208); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(209); qualifiedName();
				setState(211);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(210); typeArguments();
					}
					break;
				}
				}
				break;
			case 44:
				{
				setState(213); match(44);
				setState(214); type(0);
				setState(215); match(18);
				}
				break;
			case 50:
				{
				setState(217); match(50);
				setState(218); typing();
				setState(219); match(SUCHTHAT);
				setState(220); expression(0);
				setState(221); match(64);
				}
				break;
			case 51:
				{
				setState(223); match(51);
				setState(224); type(0);
				setState(225); match(9);
				}
				break;
			case 3:
				{
				setState(227); match(3);
				setState(228); type(0);
				setState(229); match(37);
				}
				break;
			case 5:
				{
				setState(231); match(5);
				setState(232); type(0);
				setState(233); match(38);
				setState(234); type(0);
				setState(235); match(68);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240); match(14);
						setState(241); type(7);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(243); match(4);
								setState(244); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(247); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(254); match(3);
			setState(255); type(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(256); match(38);
				setState(257); type(0);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); match(37);
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
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); sortDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266); typeDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267); valueDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268); variableDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269); functionDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270); constraint();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(271); expressionsWithSeparator();
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
			setState(274); match(31);
			setState(275); typing();
			setState(278);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(276); match(23);
				setState(277); expression(0);
				}
			}

			setState(280); match(SEP);
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
			setState(282); match(71);
			setState(283); match(Identifier);
			setState(284); match(SEP);
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
			setState(286); match(71);
			setState(287); match(Identifier);
			setState(289);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(288); typeParameters();
				}
			}

			setState(291); match(23);
			setState(292); type(0);
			setState(293); match(SEP);
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
			setState(295); match(47);
			setState(296); typing();
			setState(299);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(297); match(23);
				setState(298); expression(0);
				}
			}

			setState(301); match(SEP);
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
			setState(303); match(Identifier);
			setState(304); match(43);
			setState(305); type(0);
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
			setState(307); match(49);
			setState(308); match(Identifier);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309); match(44);
				setState(311);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(310); typingList();
					}
				}

				setState(313); match(18);
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==44 );
			{
			setState(318); match(43);
			setState(319); type(0);
			}
			setState(321); match(51);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(322); memberDeclaration();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328); match(9);
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
			setState(330); match(32);
			setState(332);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(331); match(Identifier);
				}
			}

			setState(334); match(51);
			setState(335); expression(0);
			setState(336); match(9);
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
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (16 - 8)) | (1L << (25 - 8)) | (1L << (27 - 8)) | (1L << (30 - 8)) | (1L << (40 - 8)) | (1L << (65 - 8)) | (1L << (70 - 8)))) != 0)) ) {
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
			setState(340);
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
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==68) ) {
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
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==46) ) {
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
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==29 || _la==75) ) {
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
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==52 || _la==66) ) {
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
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==67) ) {
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
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==35 || _la==42) ) {
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
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==60) ) {
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
			setState(356);
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
			setState(358);
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
			setState(360); expression(0);
			setState(361); match(SEP);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public TokenEqualsContext tokenEquals() {
			return getRuleContext(TokenEqualsContext.class,0);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(364); match(41);
				setState(365); expression(21);
				}
				break;

			case 2:
				{
				setState(366); tokenNot();
				setState(367); expression(20);
				}
				break;

			case 3:
				{
				setState(369); match(63);
				setState(370); rngBindingList();
				setState(371); match(SUCHTHAT);
				setState(372); expression(19);
				}
				break;

			case 4:
				{
				setState(374); match(69);
				setState(375); rngBindingList();
				setState(376); match(SUCHTHAT);
				setState(377); expression(18);
				}
				break;

			case 5:
				{
				setState(379); match(20);
				setState(380); pattern();
				setState(383);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(381); match(43);
					setState(382); type(0);
					}
				}

				setState(385); match(SUCHTHAT);
				setState(386); expression(8);
				}
				break;

			case 6:
				{
				setState(388); match(44);
				setState(389); expression(0);
				setState(390); match(18);
				}
				break;

			case 7:
				{
				setState(392); literal();
				}
				break;

			case 8:
				{
				setState(393); match(Identifier);
				}
				break;

			case 9:
				{
				setState(394); match(62);
				setState(395); qualifiedName();
				setState(401);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(396); match(44);
					setState(398);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(397); classArgumentList();
						}
					}

					setState(400); match(18);
					}
					break;
				}
				}
				break;

			case 10:
				{
				setState(403); match(45);
				setState(404); expression(0);
				setState(405); match(73);
				setState(406); expression(0);
				setState(407); match(55);
				setState(408); expression(0);
				}
				break;

			case 11:
				{
				setState(410); match(13);
				setState(411); expression(0);
				setState(412); match(39);
				setState(413); match();
				}
				break;

			case 12:
				{
				setState(415); match(44);
				setState(416); expression(0);
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(417); match(38);
					setState(418); expression(0);
					}
					}
					setState(421); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(423); match(18);
				}
				break;

			case 13:
				{
				setState(425); match(51);
				setState(427);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(426); expressionList();
					}
				}

				setState(429); match(9);
				}
				break;

			case 14:
				{
				setState(430); match(51);
				setState(431); expression(0);
				setState(432); match(36);
				setState(433); expression(0);
				setState(434); match(9);
				}
				break;

			case 15:
				{
				setState(436); match(51);
				setState(437); expression(0);
				setState(438); match(34);
				setState(439); rngBindingList();
				setState(440); match(SUCHTHAT);
				setState(441); expression(0);
				setState(442); match(9);
				}
				break;

			case 16:
				{
				setState(444); match(3);
				setState(446);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(445); expressionList();
					}
				}

				setState(448); match(37);
				}
				break;

			case 17:
				{
				setState(449); match(3);
				setState(450); expression(0);
				setState(451); match(36);
				setState(452); expression(0);
				setState(453); match(37);
				}
				break;

			case 18:
				{
				setState(455); match(3);
				setState(456); expression(0);
				setState(457); match(34);
				setState(458); pattern();
				setState(459); match(43);
				setState(460); expression(0);
				setState(461); match(SUCHTHAT);
				setState(462); expression(0);
				setState(463); match(37);
				}
				break;

			case 19:
				{
				setState(465); match(51);
				setState(467);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(466); mapPairList();
					}
				}

				setState(469); match(9);
				}
				break;

			case 20:
				{
				setState(470); match(51);
				setState(471); mapPair();
				setState(472); match(34);
				setState(473); rngBindingList();
				setState(474); match(SUCHTHAT);
				setState(475); expression(0);
				setState(476); match(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(525);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(481);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 15) | (1L << 28) | (1L << 56) | (1L << 58) | (1L << 59))) != 0) || _la==74 || _la==76) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(482); expression(8);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(484);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 41) | (1L << 61))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(485); expression(7);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(499);
						switch (_input.LA(1)) {
						case 7:
						case 46:
							{
							setState(487); tokenLessThanEqual();
							}
							break;
						case 29:
						case 75:
							{
							setState(488); tokenGreaterThanEqual();
							}
							break;
						case 5:
						case 12:
							{
							setState(489); tokenLessThan();
							}
							break;
						case 22:
						case 68:
							{
							setState(490); tokenGreatherThan();
							}
							break;
						case 11:
						case 23:
							{
							setState(491); tokenEquals();
							}
							break;
						case 35:
						case 42:
							{
							setState(492); tokenNot();
							setState(493); tokenEquals();
							}
							break;
						case 54:
							{
							setState(495); match(54);
							}
							break;
						case 6:
							{
							setState(496); match(6);
							}
							break;
						case 10:
							{
							setState(497); match(10);
							}
							break;
						case 26:
							{
							setState(498); match(26);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(501); expression(6);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(503); tokenAnd();
						setState(504); expression(5);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(507); tokenOr();
						setState(508); expression(4);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(510);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(513);
						switch (_input.LA(1)) {
						case 1:
						case 60:
							{
							setState(511); tokenImplies();
							}
							break;
						case 21:
						case 24:
							{
							setState(512); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(515); expression(3);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(518); match(72);
						setState(519); expression(2);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(521); match(SUCHTHAT);
						setState(522); match(Identifier);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(524); expression(0);
						}
						break;
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(530); classArgument();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(531); match(38);
				setState(532); classArgument();
				}
				}
				setState(537);
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
			setState(538); match(Identifier);
			setState(539); match(43);
			setState(540); expression(0);
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
			setState(542); idValuePair();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(543); match(38);
				setState(544); idValuePair();
				}
				}
				setState(549);
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
			setState(550); match(Identifier);
			setState(551); match(72);
			setState(552); expression(0);
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
			setState(554); matchPattern();
			setState(555); match(60);
			setState(556); expression(0);
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(557); match(34);
				setState(558); match();
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
			setState(587);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(561); literal();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(562); match(19);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(563); match(Identifier);
				setState(575);
				_la = _input.LA(1);
				if (_la==44) {
					{
					setState(564); match(44);
					setState(565); matchArgument();
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==38) {
						{
						{
						setState(566); match(38);
						setState(567); matchArgument();
						}
						}
						setState(572);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(573); match(18);
					}
				}

				}
				break;
			case 44:
				enterOuterAlt(_localctx, 4);
				{
				setState(577); match(44);
				setState(578); matchPattern();
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(579); match(38);
					setState(580); matchPattern();
					}
					}
					setState(583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(585); match(18);
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
			setState(589); match(Identifier);
			setState(590); match(23);
			setState(591); matchPattern();
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
			setState(593); mapPair();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(594); match(38);
				setState(595); mapPair();
				}
				}
				setState(600);
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
			setState(601); expression(0);
			setState(602); match(14);
			setState(603); expression(0);
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
			setState(605); rngBinding();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(606); match(38);
				setState(607); rngBinding();
				}
				}
				setState(612);
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
			setState(613); patternList();
			setState(614); match(43);
			setState(615); collectionOrType();
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
			setState(617); pattern();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(618); match(38);
				setState(619); pattern();
				}
				}
				setState(624);
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
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626); type(0);
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
			setState(629); letBinding();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(630); match(38);
				setState(631); letBinding();
				}
				}
				setState(636);
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
			setState(637); pattern();
			setState(640);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(638); match(43);
				setState(639); type(0);
				}
			}

			setState(642); match(23);
			setState(643); expression(0);
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
			setState(656);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); match(Identifier);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(44);
				setState(647); pattern();
				setState(650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648); match(38);
					setState(649); pattern();
					}
					}
					setState(652); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(654); match(18);
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
			setState(658); match(Identifier);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(659); match(38);
				setState(660); match(Identifier);
				}
				}
				setState(665);
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
			setState(666); expression(0);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(667); match(38);
				setState(668); expression(0);
				}
				}
				setState(673);
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
			setState(674); match(Identifier);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(675); match(SUCHTHAT);
					setState(676); match(Identifier);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
			setState(682);
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
		case 2: return precpred(_ctx, 7);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 5);

		case 5: return precpred(_ctx, 4);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);

		case 8: return precpred(_ctx, 1);

		case 9: return precpred(_ctx, 26);

		case 10: return precpred(_ctx, 24);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u02af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2"+
		"\7\2w\n\2\f\2\16\2z\13\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\3\3"+
		"\3\3\5\3\u0086\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3"+
		"\6\5\6\u0094\n\6\3\6\5\6\u0097\n\6\3\6\5\6\u009a\n\6\3\6\3\6\7\6\u009e"+
		"\n\6\f\6\16\6\u00a1\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00a9\n\7\f\7\16"+
		"\7\u00ac\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3\t\3\t\7\t\u00b8"+
		"\n\t\f\t\16\t\u00bb\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00c4\n\13"+
		"\f\13\16\13\u00c7\13\13\3\f\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f0\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00f8\n\r\r\r\16\r\u00f9\7\r\u00fc\n\r"+
		"\f\r\16\r\u00ff\13\r\3\16\3\16\3\16\3\16\7\16\u0105\n\16\f\16\16\16\u0108"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0113\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0119\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u0124\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u012e\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u013a"+
		"\n\25\3\25\6\25\u013d\n\25\r\25\16\25\u013e\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u0146\n\25\f\25\16\25\u0149\13\25\3\25\3\25\3\26\3\26\5\26\u014f\n"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0182\n"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0191\n#\3#\5#\u0194\n#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u01a6\n#\r#\16#\u01a7"+
		"\3#\3#\3#\3#\5#\u01ae\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01c1\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01d6\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e1\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01f6\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0204\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#"+
		"\u0210\n#\f#\16#\u0213\13#\3$\3$\3$\7$\u0218\n$\f$\16$\u021b\13$\3%\3"+
		"%\3%\3%\3&\3&\3&\7&\u0224\n&\f&\16&\u0227\13&\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\5(\u0232\n(\3)\3)\3)\3)\3)\3)\3)\7)\u023b\n)\f)\16)\u023e\13)"+
		"\3)\3)\5)\u0242\n)\3)\3)\3)\3)\6)\u0248\n)\r)\16)\u0249\3)\3)\5)\u024e"+
		"\n)\3*\3*\3*\3*\3+\3+\3+\7+\u0257\n+\f+\16+\u025a\13+\3,\3,\3,\3,\3-\3"+
		"-\3-\7-\u0263\n-\f-\16-\u0266\13-\3.\3.\3.\3.\3/\3/\3/\7/\u026f\n/\f/"+
		"\16/\u0272\13/\3\60\3\60\5\60\u0276\n\60\3\61\3\61\3\61\7\61\u027b\n\61"+
		"\f\61\16\61\u027e\13\61\3\62\3\62\3\62\5\62\u0283\n\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\6\63\u028d\n\63\r\63\16\63\u028e\3\63\3\63\5"+
		"\63\u0293\n\63\3\64\3\64\3\64\7\64\u0298\n\64\f\64\16\64\u029b\13\64\3"+
		"\65\3\65\3\65\7\65\u02a0\n\65\f\65\16\65\u02a3\13\65\3\66\3\66\3\66\7"+
		"\66\u02a8\n\66\f\66\16\66\u02ab\13\66\3\67\3\67\3\67\2\4\30D8\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjl\2\20\n\2\n\n\22\22\33\33\35\35  **CCHH\4\2\7\7\16\16\4\2\30"+
		"\30FF\4\2\t\t\60\60\4\2\37\37MM\4\2\66\66DD\4\2\4\4EE\4\2%%,,\4\2\3\3"+
		">>\4\2\27\27\32\32\4\2\r\r\31\31\t\2\6\6\21\21\36\36::<=LLNN\5\2\23\23"+
		"++??\3\2PT\u02df\2n\3\2\2\2\4\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u008a\3"+
		"\2\2\2\n\u0090\3\2\2\2\f\u00a4\3\2\2\2\16\u00af\3\2\2\2\20\u00b4\3\2\2"+
		"\2\22\u00bc\3\2\2\2\24\u00c0\3\2\2\2\26\u00c8\3\2\2\2\30\u00ef\3\2\2\2"+
		"\32\u0100\3\2\2\2\34\u0112\3\2\2\2\36\u0114\3\2\2\2 \u011c\3\2\2\2\"\u0120"+
		"\3\2\2\2$\u0129\3\2\2\2&\u0131\3\2\2\2(\u0135\3\2\2\2*\u014c\3\2\2\2,"+
		"\u0154\3\2\2\2.\u0156\3\2\2\2\60\u0158\3\2\2\2\62\u015a\3\2\2\2\64\u015c"+
		"\3\2\2\2\66\u015e\3\2\2\28\u0160\3\2\2\2:\u0162\3\2\2\2<\u0164\3\2\2\2"+
		">\u0166\3\2\2\2@\u0168\3\2\2\2B\u016a\3\2\2\2D\u01e0\3\2\2\2F\u0214\3"+
		"\2\2\2H\u021c\3\2\2\2J\u0220\3\2\2\2L\u0228\3\2\2\2N\u022c\3\2\2\2P\u024d"+
		"\3\2\2\2R\u024f\3\2\2\2T\u0253\3\2\2\2V\u025b\3\2\2\2X\u025f\3\2\2\2Z"+
		"\u0267\3\2\2\2\\\u026b\3\2\2\2^\u0275\3\2\2\2`\u0277\3\2\2\2b\u027f\3"+
		"\2\2\2d\u0292\3\2\2\2f\u0294\3\2\2\2h\u029c\3\2\2\2j\u02a4\3\2\2\2l\u02ac"+
		"\3\2\2\2nr\5\6\4\2oq\5\b\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s"+
		"x\3\2\2\2tr\3\2\2\2uw\5\n\6\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y~\3\2\2\2zx\3\2\2\2{}\5\4\3\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3"+
		"\3\2\2\2\u0083\u0086\5\34\17\2\u0084\u0086\5\n\6\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0084\3\2\2\2\u0086\5\3\2\2\2\u0087\u0088\7\62\2\2\u0088\u0089"+
		"\5j\66\2\u0089\7\3\2\2\2\u008a\u008b\7;\2\2\u008b\u008e\5j\66\2\u008c"+
		"\u008d\7O\2\2\u008d\u008f\7\6\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\t\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0093\7U\2\2\u0092\u0094"+
		"\5\f\7\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0097\5\22\n\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3"+
		"\2\2\2\u0098\u009a\5\26\f\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009f\7\65\2\2\u009c\u009e\5\34\17\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3\13\3\2\2"+
		"\2\u00a4\u00a5\7\5\2\2\u00a5\u00aa\5\16\b\2\u00a6\u00a7\7(\2\2\u00a7\u00a9"+
		"\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7\'\2\2\u00ae\r\3\2\2\2\u00af\u00b2\7U\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b3"+
		"\5\20\t\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\17\3\2\2\2\u00b4"+
		"\u00b9\5\30\r\2\u00b5\u00b6\7?\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b5\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\21\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd\u00be\5\24\13"+
		"\2\u00be\u00bf\7\24\2\2\u00bf\23\3\2\2\2\u00c0\u00c5\5&\24\2\u00c1\u00c2"+
		"\7(\2\2\u00c2\u00c4\5&\24\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00c9\7\67\2\2\u00c9\u00ce\5\30\r\2\u00ca\u00cb\7(\2\2\u00cb"+
		"\u00cd\5\30\r\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\b\r\1\2\u00d2\u00f0\5,\27\2\u00d3\u00d5\5j\66\2\u00d4\u00d6\5\32"+
		"\16\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f0\3\2\2\2\u00d7"+
		"\u00d8\7.\2\2\u00d8\u00d9\5\30\r\2\u00d9\u00da\7\24\2\2\u00da\u00f0\3"+
		"\2\2\2\u00db\u00dc\7\64\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7O\2\2\u00de"+
		"\u00df\5D#\2\u00df\u00e0\7B\2\2\u00e0\u00f0\3\2\2\2\u00e1\u00e2\7\65\2"+
		"\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\7\13\2\2\u00e4\u00f0\3\2\2\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00e7\5\30\r\2\u00e7\u00e8\7\'\2\2\u00e8\u00f0\3"+
		"\2\2\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\7(\2\2\u00ec"+
		"\u00ed\5\30\r\2\u00ed\u00ee\7F\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00d1\3\2"+
		"\2\2\u00ef\u00d3\3\2\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef"+
		"\u00e1\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\u00fd\3\2"+
		"\2\2\u00f1\u00f2\f\b\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00fc\5\30\r\t\u00f4"+
		"\u00f7\f\t\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f8\5\30\r\2\u00f7\u00f5\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\7\5\2\2\u0101\u0106\5\30\r\2\u0102\u0103\7(\2\2\u0103"+
		"\u0105\5\30\r\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7\'\2\2\u010a\33\3\2\2\2\u010b\u0113\5 \21\2\u010c\u0113\5\"\22"+
		"\2\u010d\u0113\5\36\20\2\u010e\u0113\5$\23\2\u010f\u0113\5(\25\2\u0110"+
		"\u0113\5*\26\2\u0111\u0113\5B\"\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2"+
		"\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\35\3\2\2\2\u0114\u0115\7!\2\2"+
		"\u0115\u0118\5&\24\2\u0116\u0117\7\31\2\2\u0117\u0119\5D#\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7Y\2\2\u011b"+
		"\37\3\2\2\2\u011c\u011d\7I\2\2\u011d\u011e\7U\2\2\u011e\u011f\7Y\2\2\u011f"+
		"!\3\2\2\2\u0120\u0121\7I\2\2\u0121\u0123\7U\2\2\u0122\u0124\5\f\7\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\31"+
		"\2\2\u0126\u0127\5\30\r\2\u0127\u0128\7Y\2\2\u0128#\3\2\2\2\u0129\u012a"+
		"\7\61\2\2\u012a\u012d\5&\24\2\u012b\u012c\7\31\2\2\u012c\u012e\5D#\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7Y"+
		"\2\2\u0130%\3\2\2\2\u0131\u0132\7U\2\2\u0132\u0133\7-\2\2\u0133\u0134"+
		"\5\30\r\2\u0134\'\3\2\2\2\u0135\u0136\7\63\2\2\u0136\u013c\7U\2\2\u0137"+
		"\u0139\7.\2\2\u0138\u013a\5\24\13\2\u0139\u0138\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7\24\2\2\u013c\u0137\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\7-\2\2\u0141\u0142\5\30\r\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0147\7\65\2\2\u0144\u0146\5\34\17\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014b\7\13\2\2\u014b)\3\2\2\2\u014c\u014e\7\"\2\2"+
		"\u014d\u014f\7U\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\7\65\2\2\u0151\u0152\5D#\2\u0152\u0153\7\13\2\2\u0153"+
		"+\3\2\2\2\u0154\u0155\t\2\2\2\u0155-\3\2\2\2\u0156\u0157\t\3\2\2\u0157"+
		"/\3\2\2\2\u0158\u0159\t\4\2\2\u0159\61\3\2\2\2\u015a\u015b\t\5\2\2\u015b"+
		"\63\3\2\2\2\u015c\u015d\t\6\2\2\u015d\65\3\2\2\2\u015e\u015f\t\7\2\2\u015f"+
		"\67\3\2\2\2\u0160\u0161\t\b\2\2\u01619\3\2\2\2\u0162\u0163\t\t\2\2\u0163"+
		";\3\2\2\2\u0164\u0165\t\n\2\2\u0165=\3\2\2\2\u0166\u0167\t\13\2\2\u0167"+
		"?\3\2\2\2\u0168\u0169\t\f\2\2\u0169A\3\2\2\2\u016a\u016b\5D#\2\u016b\u016c"+
		"\7Y\2\2\u016cC\3\2\2\2\u016d\u016e\b#\1\2\u016e\u016f\7+\2\2\u016f\u01e1"+
		"\5D#\27\u0170\u0171\5:\36\2\u0171\u0172\5D#\26\u0172\u01e1\3\2\2\2\u0173"+
		"\u0174\7A\2\2\u0174\u0175\5X-\2\u0175\u0176\7O\2\2\u0176\u0177\5D#\25"+
		"\u0177\u01e1\3\2\2\2\u0178\u0179\7G\2\2\u0179\u017a\5X-\2\u017a\u017b"+
		"\7O\2\2\u017b\u017c\5D#\24\u017c\u01e1\3\2\2\2\u017d\u017e\7\26\2\2\u017e"+
		"\u0181\5d\63\2\u017f\u0180\7-\2\2\u0180\u0182\5\30\r\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7O\2\2\u0184"+
		"\u0185\5D#\n\u0185\u01e1\3\2\2\2\u0186\u0187\7.\2\2\u0187\u0188\5D#\2"+
		"\u0188\u0189\7\24\2\2\u0189\u01e1\3\2\2\2\u018a\u01e1\5l\67\2\u018b\u01e1"+
		"\7U\2\2\u018c\u018d\7@\2\2\u018d\u0193\5j\66\2\u018e\u0190\7.\2\2\u018f"+
		"\u0191\5F$\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2"+
		"\2\u0192\u0194\7\24\2\2\u0193\u018e\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u01e1\3\2\2\2\u0195\u0196\7/\2\2\u0196\u0197\5D#\2\u0197\u0198\7K\2\2"+
		"\u0198\u0199\5D#\2\u0199\u019a\79\2\2\u019a\u019b\5D#\2\u019b\u01e1\3"+
		"\2\2\2\u019c\u019d\7\17\2\2\u019d\u019e\5D#\2\u019e\u019f\7)\2\2\u019f"+
		"\u01a0\5N(\2\u01a0\u01e1\3\2\2\2\u01a1\u01a2\7.\2\2\u01a2\u01a5\5D#\2"+
		"\u01a3\u01a4\7(\2\2\u01a4\u01a6\5D#\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\7\24\2\2\u01aa\u01e1\3\2\2\2\u01ab\u01ad\7\65\2\2\u01ac\u01ae\5"+
		"h\65\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01e1\7\13\2\2\u01b0\u01b1\7\65\2\2\u01b1\u01b2\5D#\2\u01b2\u01b3\7&"+
		"\2\2\u01b3\u01b4\5D#\2\u01b4\u01b5\7\13\2\2\u01b5\u01e1\3\2\2\2\u01b6"+
		"\u01b7\7\65\2\2\u01b7\u01b8\5D#\2\u01b8\u01b9\7$\2\2\u01b9\u01ba\5X-\2"+
		"\u01ba\u01bb\7O\2\2\u01bb\u01bc\5D#\2\u01bc\u01bd\7\13\2\2\u01bd\u01e1"+
		"\3\2\2\2\u01be\u01c0\7\5\2\2\u01bf\u01c1\5h\65\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01e1\7\'\2\2\u01c3\u01c4\7\5"+
		"\2\2\u01c4\u01c5\5D#\2\u01c5\u01c6\7&\2\2\u01c6\u01c7\5D#\2\u01c7\u01c8"+
		"\7\'\2\2\u01c8\u01e1\3\2\2\2\u01c9\u01ca\7\5\2\2\u01ca\u01cb\5D#\2\u01cb"+
		"\u01cc\7$\2\2\u01cc\u01cd\5d\63\2\u01cd\u01ce\7-\2\2\u01ce\u01cf\5D#\2"+
		"\u01cf\u01d0\7O\2\2\u01d0\u01d1\5D#\2\u01d1\u01d2\7\'\2\2\u01d2\u01e1"+
		"\3\2\2\2\u01d3\u01d5\7\65\2\2\u01d4\u01d6\5T+\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01e1\7\13\2\2\u01d8\u01d9\7"+
		"\65\2\2\u01d9\u01da\5V,\2\u01da\u01db\7$\2\2\u01db\u01dc\5X-\2\u01dc\u01dd"+
		"\7O\2\2\u01dd\u01de\5D#\2\u01de\u01df\7\13\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u016d\3\2\2\2\u01e0\u0170\3\2\2\2\u01e0\u0173\3\2\2\2\u01e0\u0178\3\2"+
		"\2\2\u01e0\u017d\3\2\2\2\u01e0\u0186\3\2\2\2\u01e0\u018a\3\2\2\2\u01e0"+
		"\u018b\3\2\2\2\u01e0\u018c\3\2\2\2\u01e0\u0195\3\2\2\2\u01e0\u019c\3\2"+
		"\2\2\u01e0\u01a1\3\2\2\2\u01e0\u01ab\3\2\2\2\u01e0\u01b0\3\2\2\2\u01e0"+
		"\u01b6\3\2\2\2\u01e0\u01be\3\2\2\2\u01e0\u01c3\3\2\2\2\u01e0\u01c9\3\2"+
		"\2\2\u01e0\u01d3\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e1\u0211\3\2\2\2\u01e2"+
		"\u01e3\f\t\2\2\u01e3\u01e4\t\r\2\2\u01e4\u0210\5D#\n\u01e5\u01e6\f\b\2"+
		"\2\u01e6\u01e7\t\16\2\2\u01e7\u0210\5D#\t\u01e8\u01f5\f\7\2\2\u01e9\u01f6"+
		"\5\62\32\2\u01ea\u01f6\5\64\33\2\u01eb\u01f6\5.\30\2\u01ec\u01f6\5\60"+
		"\31\2\u01ed\u01f6\5@!\2\u01ee\u01ef\5:\36\2\u01ef\u01f0\5@!\2\u01f0\u01f6"+
		"\3\2\2\2\u01f1\u01f6\78\2\2\u01f2\u01f6\7\b\2\2\u01f3\u01f6\7\f\2\2\u01f4"+
		"\u01f6\7\34\2\2\u01f5\u01e9\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01eb\3"+
		"\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5"+
		"\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0210\5D#\b\u01f8\u01f9\f\6\2\2\u01f9\u01fa"+
		"\5\66\34\2\u01fa\u01fb\5D#\7\u01fb\u0210\3\2\2\2\u01fc\u01fd\f\5\2\2\u01fd"+
		"\u01fe\58\35\2\u01fe\u01ff\5D#\6\u01ff\u0210\3\2\2\2\u0200\u0203\f\4\2"+
		"\2\u0201\u0204\5<\37\2\u0202\u0204\5> \2\u0203\u0201\3\2\2\2\u0203\u0202"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5D#\5\u0206\u0210\3\2\2\2\u0207"+
		"\u0208\f\3\2\2\u0208\u0209\7J\2\2\u0209\u0210\5D#\4\u020a\u020b\f\34\2"+
		"\2\u020b\u020c\7O\2\2\u020c\u0210\7U\2\2\u020d\u020e\f\32\2\2\u020e\u0210"+
		"\5D#\2\u020f\u01e2\3\2\2\2\u020f\u01e5\3\2\2\2\u020f\u01e8\3\2\2\2\u020f"+
		"\u01f8\3\2\2\2\u020f\u01fc\3\2\2\2\u020f\u0200\3\2\2\2\u020f\u0207\3\2"+
		"\2\2\u020f\u020a\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212E\3\2\2\2\u0213\u0211\3\2\2\2"+
		"\u0214\u0219\5H%\2\u0215\u0216\7(\2\2\u0216\u0218\5H%\2\u0217\u0215\3"+
		"\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"G\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7U\2\2\u021d\u021e\7-\2\2\u021e"+
		"\u021f\5D#\2\u021fI\3\2\2\2\u0220\u0225\5L\'\2\u0221\u0222\7(\2\2\u0222"+
		"\u0224\5L\'\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226K\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229"+
		"\7U\2\2\u0229\u022a\7J\2\2\u022a\u022b\5D#\2\u022bM\3\2\2\2\u022c\u022d"+
		"\5P)\2\u022d\u022e\7>\2\2\u022e\u0231\5D#\2\u022f\u0230\7$\2\2\u0230\u0232"+
		"\5N(\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232O\3\2\2\2\u0233\u024e"+
		"\5l\67\2\u0234\u024e\7\25\2\2\u0235\u0241\7U\2\2\u0236\u0237\7.\2\2\u0237"+
		"\u023c\5R*\2\u0238\u0239\7(\2\2\u0239\u023b\5R*\2\u023a\u0238\3\2\2\2"+
		"\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\24\2\2\u0240\u0242\3\2\2\2"+
		"\u0241\u0236\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u024e\3\2\2\2\u0243\u0244"+
		"\7.\2\2\u0244\u0247\5P)\2\u0245\u0246\7(\2\2\u0246\u0248\5P)\2\u0247\u0245"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u024c\7\24\2\2\u024c\u024e\3\2\2\2\u024d\u0233\3"+
		"\2\2\2\u024d\u0234\3\2\2\2\u024d\u0235\3\2\2\2\u024d\u0243\3\2\2\2\u024e"+
		"Q\3\2\2\2\u024f\u0250\7U\2\2\u0250\u0251\7\31\2\2\u0251\u0252\5P)\2\u0252"+
		"S\3\2\2\2\u0253\u0258\5V,\2\u0254\u0255\7(\2\2\u0255\u0257\5V,\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259U\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\5D#\2\u025c\u025d"+
		"\7\20\2\2\u025d\u025e\5D#\2\u025eW\3\2\2\2\u025f\u0264\5Z.\2\u0260\u0261"+
		"\7(\2\2\u0261\u0263\5Z.\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265Y\3\2\2\2\u0266\u0264\3\2\2\2"+
		"\u0267\u0268\5\\/\2\u0268\u0269\7-\2\2\u0269\u026a\5^\60\2\u026a[\3\2"+
		"\2\2\u026b\u0270\5d\63\2\u026c\u026d\7(\2\2\u026d\u026f\5d\63\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271]\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0276\5D#\2\u0274\u0276"+
		"\5\30\r\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276_\3\2\2\2\u0277"+
		"\u027c\5b\62\2\u0278\u0279\7(\2\2\u0279\u027b\5b\62\2\u027a\u0278\3\2"+
		"\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"a\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0282\5d\63\2\u0280\u0281\7-\2\2\u0281"+
		"\u0283\5\30\r\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3"+
		"\2\2\2\u0284\u0285\7\31\2\2\u0285\u0286\5D#\2\u0286c\3\2\2\2\u0287\u0293"+
		"\7U\2\2\u0288\u0289\7.\2\2\u0289\u028c\5d\63\2\u028a\u028b\7(\2\2\u028b"+
		"\u028d\5d\63\2\u028c\u028a\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\7\24\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0287\3\2\2\2\u0292\u0288\3\2\2\2\u0293e\3\2\2\2"+
		"\u0294\u0299\7U\2\2\u0295\u0296\7(\2\2\u0296\u0298\7U\2\2\u0297\u0295"+
		"\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"g\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u02a1\5D#\2\u029d\u029e\7(\2\2\u029e"+
		"\u02a0\5D#\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2"+
		"\2\u02a1\u02a2\3\2\2\2\u02a2i\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a9"+
		"\7U\2\2\u02a5\u02a6\7O\2\2\u02a6\u02a8\7U\2\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aak\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ac\u02ad\t\17\2\2\u02adm\3\2\2\2<rx~\u0085\u008e"+
		"\u0093\u0096\u0099\u009f\u00aa\u00b2\u00b9\u00c5\u00ce\u00d5\u00ef\u00f9"+
		"\u00fb\u00fd\u0106\u0112\u0118\u0123\u012d\u0139\u013e\u0147\u014e\u0181"+
		"\u0190\u0193\u01a7\u01ad\u01c0\u01d5\u01e0\u01f5\u0203\u020f\u0211\u0219"+
		"\u0225\u0231\u023c\u0241\u0249\u024d\u0258\u0264\u0270\u0275\u027c\u0282"+
		"\u028e\u0292\u0299\u02a1\u02a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}