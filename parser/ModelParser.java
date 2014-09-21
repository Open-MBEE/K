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
		RULE_collectionOrType = 46, RULE_pattern = 47, RULE_identifierList = 48, 
		RULE_expressionList = 49, RULE_qualifiedName = 50, RULE_literal = 51;
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
		"rngBinding", "patternList", "collectionOrType", "pattern", "identifierList", 
		"expressionList", "qualifiedName", "literal"
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
			setState(104); packageDeclaration();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==57) {
				{
				{
				setState(105); importDeclaration();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(111); classDeclaration();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(117); topDeclaration();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(EOF);
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
			setState(127);
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
				setState(125); memberDeclaration();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); classDeclaration();
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
			setState(129); match(48);
			setState(130); qualifiedName();
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
			setState(132); match(57);
			setState(133); qualifiedName();
			setState(136);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(134); match(SUCHTHAT);
				setState(135); match(4);
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
			setState(138); match(33);
			setState(139); match(Identifier);
			setState(141);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(140); typeParameters();
				}
			}

			setState(144);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(143); valueParameters();
				}
			}

			setState(147);
			_la = _input.LA(1);
			if (_la==53) {
				{
				setState(146); extending();
				}
			}

			setState(149); match(51);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(150); memberDeclaration();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); match(9);
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
			setState(158); match(3);
			setState(159); typeParameter();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(160); match(38);
				setState(161); typeParameter();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(37);
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
			setState(169); match(Identifier);
			setState(172);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(170); match(43);
				setState(171); typeBound();
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
			setState(174); type(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==61) {
				{
				{
				setState(175); match(61);
				setState(176); type(0);
				}
				}
				setState(181);
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
			setState(182); match(44);
			setState(183); typingList();
			setState(184); match(18);
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
			setState(186); typing();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(187); match(38);
				setState(188); typing();
				}
				}
				setState(193);
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
			setState(194); match(53);
			setState(195); type(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(196); match(38);
				setState(197); type(0);
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
			setState(233);
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
				setState(204); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(205); qualifiedName();
				setState(207);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(206); typeArguments();
					}
					break;
				}
				}
				break;
			case 44:
				{
				setState(209); match(44);
				setState(210); type(0);
				setState(211); match(18);
				}
				break;
			case 50:
				{
				setState(213); match(50);
				setState(214); typing();
				setState(215); match(SUCHTHAT);
				setState(216); expression(0);
				setState(217); match(64);
				}
				break;
			case 51:
				{
				setState(219); match(51);
				setState(220); type(0);
				setState(221); match(9);
				}
				break;
			case 3:
				{
				setState(223); match(3);
				setState(224); type(0);
				setState(225); match(37);
				}
				break;
			case 5:
				{
				setState(227); match(5);
				setState(228); type(0);
				setState(229); match(38);
				setState(230); type(0);
				setState(231); match(68);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(235);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(236); match(14);
						setState(237); type(7);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(238);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(241); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(239); match(4);
								setState(240); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(243); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(249);
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
			setState(250); match(3);
			setState(251); type(0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(252); match(38);
				setState(253); type(0);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259); match(37);
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
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); sortDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); typeDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); valueDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264); variableDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265); functionDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266); constraint();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267); expressionsWithSeparator();
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
			setState(270); match(31);
			setState(271); typing();
			setState(274);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(272); match(23);
				setState(273); expression(0);
				}
			}

			setState(276); match(SEP);
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
			setState(278); match(71);
			setState(279); match(Identifier);
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
			setState(282); match(71);
			setState(283); match(Identifier);
			setState(285);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(284); typeParameters();
				}
			}

			setState(287); match(23);
			setState(288); type(0);
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
			setState(291); match(47);
			setState(292); typing();
			setState(295);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(293); match(23);
				setState(294); expression(0);
				}
			}

			setState(297); match(SEP);
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
			setState(299); match(Identifier);
			setState(300); match(43);
			setState(301); type(0);
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
			setState(303); match(49);
			setState(304); match(Identifier);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305); match(44);
				setState(307);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(306); typingList();
					}
				}

				setState(309); match(18);
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==44 );
			{
			setState(314); match(43);
			setState(315); type(0);
			}
			setState(317); match(51);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 31) | (1L << 32) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (71 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(318); memberDeclaration();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324); match(9);
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
			setState(326); match(32);
			setState(328);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(327); match(Identifier);
				}
			}

			setState(330); match(51);
			setState(331); expression(0);
			setState(332); match(9);
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
			setState(334);
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
			setState(336);
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
			setState(338);
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
			setState(340);
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
			setState(342);
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
			setState(344);
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
			setState(346);
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
			setState(348);
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
			setState(350);
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
			setState(352);
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
			setState(354);
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
			setState(356); expression(0);
			setState(357); match(SEP);
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
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(360); match(41);
				setState(361); expression(21);
				}
				break;

			case 2:
				{
				setState(362); tokenNot();
				setState(363); expression(20);
				}
				break;

			case 3:
				{
				setState(365); match(63);
				setState(366); rngBindingList();
				setState(367); match(SUCHTHAT);
				setState(368); expression(19);
				}
				break;

			case 4:
				{
				setState(370); match(69);
				setState(371); rngBindingList();
				setState(372); match(SUCHTHAT);
				setState(373); expression(18);
				}
				break;

			case 5:
				{
				setState(375); match(20);
				setState(376); pattern();
				setState(379);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(377); match(43);
					setState(378); type(0);
					}
				}

				setState(381); match(SUCHTHAT);
				setState(382); expression(8);
				}
				break;

			case 6:
				{
				setState(384); match(44);
				setState(385); expression(0);
				setState(386); match(18);
				}
				break;

			case 7:
				{
				setState(388); literal();
				}
				break;

			case 8:
				{
				setState(389); match(Identifier);
				}
				break;

			case 9:
				{
				setState(390); match(62);
				setState(391); qualifiedName();
				setState(397);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(392); match(44);
					setState(394);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(393); classArgumentList();
						}
					}

					setState(396); match(18);
					}
					break;
				}
				}
				break;

			case 10:
				{
				setState(399); match(45);
				setState(400); expression(0);
				setState(401); match(73);
				setState(402); expression(0);
				setState(403); match(55);
				setState(404); expression(0);
				}
				break;

			case 11:
				{
				setState(406); match(13);
				setState(407); expression(0);
				setState(408); match(39);
				setState(409); match();
				}
				break;

			case 12:
				{
				setState(411); match(44);
				setState(412); expression(0);
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413); match(38);
					setState(414); expression(0);
					}
					}
					setState(417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(419); match(18);
				}
				break;

			case 13:
				{
				setState(421); match(51);
				setState(423);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(422); expressionList();
					}
				}

				setState(425); match(9);
				}
				break;

			case 14:
				{
				setState(426); match(51);
				setState(427); expression(0);
				setState(428); match(36);
				setState(429); expression(0);
				setState(430); match(9);
				}
				break;

			case 15:
				{
				setState(432); match(51);
				setState(433); expression(0);
				setState(434); match(34);
				setState(435); rngBindingList();
				setState(436); match(SUCHTHAT);
				setState(437); expression(0);
				setState(438); match(9);
				}
				break;

			case 16:
				{
				setState(440); match(3);
				setState(442);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(441); expressionList();
					}
				}

				setState(444); match(37);
				}
				break;

			case 17:
				{
				setState(445); match(3);
				setState(446); expression(0);
				setState(447); match(36);
				setState(448); expression(0);
				setState(449); match(37);
				}
				break;

			case 18:
				{
				setState(451); match(3);
				setState(452); expression(0);
				setState(453); match(34);
				setState(454); pattern();
				setState(455); match(43);
				setState(456); expression(0);
				setState(457); match(SUCHTHAT);
				setState(458); expression(0);
				setState(459); match(37);
				}
				break;

			case 19:
				{
				setState(461); match(51);
				setState(463);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20) | (1L << 35) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 51) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (69 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(462); mapPairList();
					}
				}

				setState(465); match(9);
				}
				break;

			case 20:
				{
				setState(466); match(51);
				setState(467); mapPair();
				setState(468); match(34);
				setState(469); rngBindingList();
				setState(470); match(SUCHTHAT);
				setState(471); expression(0);
				setState(472); match(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(477);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 15) | (1L << 28) | (1L << 56) | (1L << 58) | (1L << 59))) != 0) || _la==74 || _la==76) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(478); expression(8);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(479);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(480);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 41) | (1L << 61))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(481); expression(7);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(495);
						switch (_input.LA(1)) {
						case 7:
						case 46:
							{
							setState(483); tokenLessThanEqual();
							}
							break;
						case 29:
						case 75:
							{
							setState(484); tokenGreaterThanEqual();
							}
							break;
						case 5:
						case 12:
							{
							setState(485); tokenLessThan();
							}
							break;
						case 22:
						case 68:
							{
							setState(486); tokenGreatherThan();
							}
							break;
						case 11:
						case 23:
							{
							setState(487); tokenEquals();
							}
							break;
						case 35:
						case 42:
							{
							setState(488); tokenNot();
							setState(489); tokenEquals();
							}
							break;
						case 54:
							{
							setState(491); match(54);
							}
							break;
						case 6:
							{
							setState(492); match(6);
							}
							break;
						case 10:
							{
							setState(493); match(10);
							}
							break;
						case 26:
							{
							setState(494); match(26);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(497); expression(6);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(498);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(499); tokenAnd();
						setState(500); expression(5);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(503); tokenOr();
						setState(504); expression(4);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(509);
						switch (_input.LA(1)) {
						case 1:
						case 60:
							{
							setState(507); tokenImplies();
							}
							break;
						case 21:
						case 24:
							{
							setState(508); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(511); expression(3);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(514); match(72);
						setState(515); expression(2);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(517); match(SUCHTHAT);
						setState(518); match(Identifier);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(520); expression(0);
						}
						break;
					}
					} 
				}
				setState(525);
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
			setState(526); classArgument();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(527); match(38);
				setState(528); classArgument();
				}
				}
				setState(533);
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
			setState(534); match(Identifier);
			setState(535); match(43);
			setState(536); expression(0);
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
			setState(538); idValuePair();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(539); match(38);
				setState(540); idValuePair();
				}
				}
				setState(545);
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
			setState(546); match(Identifier);
			setState(547); match(72);
			setState(548); expression(0);
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
			setState(550); matchPattern();
			setState(551); match(60);
			setState(552); expression(0);
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(553); match(34);
				setState(554); match();
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
			setState(583);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(557); literal();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); match(19);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(559); match(Identifier);
				setState(571);
				_la = _input.LA(1);
				if (_la==44) {
					{
					setState(560); match(44);
					setState(561); matchArgument();
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==38) {
						{
						{
						setState(562); match(38);
						setState(563); matchArgument();
						}
						}
						setState(568);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(569); match(18);
					}
				}

				}
				break;
			case 44:
				enterOuterAlt(_localctx, 4);
				{
				setState(573); match(44);
				setState(574); matchPattern();
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(575); match(38);
					setState(576); matchPattern();
					}
					}
					setState(579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(581); match(18);
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
			setState(585); match(Identifier);
			setState(586); match(23);
			setState(587); matchPattern();
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
			setState(589); mapPair();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(590); match(38);
				setState(591); mapPair();
				}
				}
				setState(596);
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
			setState(597); expression(0);
			setState(598); match(43);
			setState(599); expression(0);
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
			setState(601); rngBinding();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(602); match(38);
				setState(603); rngBinding();
				}
				}
				setState(608);
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
			setState(609); patternList();
			setState(610); match(43);
			setState(611); collectionOrType();
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
			setState(613); pattern();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(614); match(38);
				setState(615); pattern();
				}
				}
				setState(620);
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
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622); type(0);
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
		enterRule(_localctx, 94, RULE_pattern);
		int _la;
		try {
			setState(636);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(625); match(Identifier);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 2);
				{
				setState(626); match(44);
				setState(627); pattern();
				setState(630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(628); match(38);
					setState(629); pattern();
					}
					}
					setState(632); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==38 );
				setState(634); match(18);
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
		enterRule(_localctx, 96, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); match(Identifier);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(639); match(38);
				setState(640); match(Identifier);
				}
				}
				setState(645);
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
		enterRule(_localctx, 98, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); expression(0);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==38) {
				{
				{
				setState(647); match(38);
				setState(648); expression(0);
				}
				}
				setState(653);
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
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(Identifier);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(655); match(SUCHTHAT);
					setState(656); match(Identifier);
					}
					} 
				}
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		enterRule(_localctx, 102, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u029b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\7\2y\n\2\f\2\16\2|\13\2\3\2\3\2\3\3\3\3\5\3\u0082\n\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\5\6\u0090\n\6\3\6\5\6\u0093"+
		"\n\6\3\6\5\6\u0096\n\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\3\b\3\b\3"+
		"\b\5\b\u00af\n\b\3\t\3\t\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13\3\f\3\f"+
		"\3\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\r\3\r\3\r\3\r\5\r\u00d2\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r"+
		"\u00f4\n\r\r\r\16\r\u00f5\7\r\u00f8\n\r\f\r\16\r\u00fb\13\r\3\16\3\16"+
		"\3\16\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u010f\n\17\3\20\3\20\3\20\3\20\5\20\u0115"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0120\n\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u012a\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0136\n\25\3\25\6\25\u0139\n\25\r"+
		"\25\16\25\u013a\3\25\3\25\3\25\3\25\3\25\7\25\u0142\n\25\f\25\16\25\u0145"+
		"\13\25\3\25\3\25\3\26\3\26\5\26\u014b\n\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u017e\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u018d\n#\3#\5#\u0190\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\6#\u01a2\n#\r#\16#\u01a3\3#\3#\3#\3#\5#\u01aa\n#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01bd\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01d2\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u01dd\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u01f2\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0200"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u020c\n#\f#\16#\u020f\13#\3$\3$\3"+
		"$\7$\u0214\n$\f$\16$\u0217\13$\3%\3%\3%\3%\3&\3&\3&\7&\u0220\n&\f&\16"+
		"&\u0223\13&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u022e\n(\3)\3)\3)\3)\3)"+
		"\3)\3)\7)\u0237\n)\f)\16)\u023a\13)\3)\3)\5)\u023e\n)\3)\3)\3)\3)\6)\u0244"+
		"\n)\r)\16)\u0245\3)\3)\5)\u024a\n)\3*\3*\3*\3*\3+\3+\3+\7+\u0253\n+\f"+
		"+\16+\u0256\13+\3,\3,\3,\3,\3-\3-\3-\7-\u025f\n-\f-\16-\u0262\13-\3.\3"+
		".\3.\3.\3/\3/\3/\7/\u026b\n/\f/\16/\u026e\13/\3\60\3\60\5\60\u0272\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\6\61\u0279\n\61\r\61\16\61\u027a\3\61\3\61\5"+
		"\61\u027f\n\61\3\62\3\62\3\62\7\62\u0284\n\62\f\62\16\62\u0287\13\62\3"+
		"\63\3\63\3\63\7\63\u028c\n\63\f\63\16\63\u028f\13\63\3\64\3\64\3\64\7"+
		"\64\u0294\n\64\f\64\16\64\u0297\13\64\3\65\3\65\3\65\2\4\30D\66\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfh\2\20\n\2\n\n\22\22\33\33\35\35  **CCHH\4\2\7\7\16\16\4\2\30"+
		"\30FF\4\2\t\t\60\60\4\2\37\37MM\4\2\66\66DD\4\2\4\4EE\4\2%%,,\4\2\3\3"+
		">>\4\2\27\27\32\32\4\2\r\r\31\31\t\2\6\6\21\21\36\36::<=LLNN\5\2\23\23"+
		"++??\3\2PT\u02cb\2j\3\2\2\2\4\u0081\3\2\2\2\6\u0083\3\2\2\2\b\u0086\3"+
		"\2\2\2\n\u008c\3\2\2\2\f\u00a0\3\2\2\2\16\u00ab\3\2\2\2\20\u00b0\3\2\2"+
		"\2\22\u00b8\3\2\2\2\24\u00bc\3\2\2\2\26\u00c4\3\2\2\2\30\u00eb\3\2\2\2"+
		"\32\u00fc\3\2\2\2\34\u010e\3\2\2\2\36\u0110\3\2\2\2 \u0118\3\2\2\2\"\u011c"+
		"\3\2\2\2$\u0125\3\2\2\2&\u012d\3\2\2\2(\u0131\3\2\2\2*\u0148\3\2\2\2,"+
		"\u0150\3\2\2\2.\u0152\3\2\2\2\60\u0154\3\2\2\2\62\u0156\3\2\2\2\64\u0158"+
		"\3\2\2\2\66\u015a\3\2\2\28\u015c\3\2\2\2:\u015e\3\2\2\2<\u0160\3\2\2\2"+
		">\u0162\3\2\2\2@\u0164\3\2\2\2B\u0166\3\2\2\2D\u01dc\3\2\2\2F\u0210\3"+
		"\2\2\2H\u0218\3\2\2\2J\u021c\3\2\2\2L\u0224\3\2\2\2N\u0228\3\2\2\2P\u0249"+
		"\3\2\2\2R\u024b\3\2\2\2T\u024f\3\2\2\2V\u0257\3\2\2\2X\u025b\3\2\2\2Z"+
		"\u0263\3\2\2\2\\\u0267\3\2\2\2^\u0271\3\2\2\2`\u027e\3\2\2\2b\u0280\3"+
		"\2\2\2d\u0288\3\2\2\2f\u0290\3\2\2\2h\u0298\3\2\2\2jn\5\6\4\2km\5\b\5"+
		"\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ot\3\2\2\2pn\3\2\2\2qs\5\n\6"+
		"\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\5\4\3"+
		"\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\2\2"+
		"\3~\3\3\2\2\2\177\u0082\5\34\17\2\u0080\u0082\5\n\6\2\u0081\177\3\2\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\5\3\2\2\2\u0083\u0084\7\62\2\2\u0084\u0085"+
		"\5f\64\2\u0085\7\3\2\2\2\u0086\u0087\7;\2\2\u0087\u008a\5f\64\2\u0088"+
		"\u0089\7O\2\2\u0089\u008b\7\6\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\t\3\2\2\2\u008c\u008d\7#\2\2\u008d\u008f\7U\2\2\u008e\u0090"+
		"\5\f\7\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0093\5\22\n\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3"+
		"\2\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009b\7\65\2\2\u0098\u009a\5\34\17\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\13\2\2\u009f\13\3\2\2"+
		"\2\u00a0\u00a1\7\5\2\2\u00a1\u00a6\5\16\b\2\u00a2\u00a3\7(\2\2\u00a3\u00a5"+
		"\5\16\b\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\7\'\2\2\u00aa\r\3\2\2\2\u00ab\u00ae\7U\2\2\u00ac\u00ad\7-\2\2\u00ad\u00af"+
		"\5\20\t\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\17\3\2\2\2\u00b0"+
		"\u00b5\5\30\r\2\u00b1\u00b2\7?\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b1\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\21\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9\u00ba\5\24\13"+
		"\2\u00ba\u00bb\7\24\2\2\u00bb\23\3\2\2\2\u00bc\u00c1\5&\24\2\u00bd\u00be"+
		"\7(\2\2\u00be\u00c0\5&\24\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c5\7\67\2\2\u00c5\u00ca\5\30\r\2\u00c6\u00c7\7(\2\2\u00c7"+
		"\u00c9\5\30\r\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\b\r\1\2\u00ce\u00ec\5,\27\2\u00cf\u00d1\5f\64\2\u00d0\u00d2\5\32"+
		"\16\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00ec\3\2\2\2\u00d3"+
		"\u00d4\7.\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\24\2\2\u00d6\u00ec\3"+
		"\2\2\2\u00d7\u00d8\7\64\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7O\2\2\u00da"+
		"\u00db\5D#\2\u00db\u00dc\7B\2\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\7\65\2"+
		"\2\u00de\u00df\5\30\r\2\u00df\u00e0\7\13\2\2\u00e0\u00ec\3\2\2\2\u00e1"+
		"\u00e2\7\5\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\7\'\2\2\u00e4\u00ec\3"+
		"\2\2\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\30\r\2\u00e7\u00e8\7(\2\2\u00e8"+
		"\u00e9\5\30\r\2\u00e9\u00ea\7F\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00cd\3\2"+
		"\2\2\u00eb\u00cf\3\2\2\2\u00eb\u00d3\3\2\2\2\u00eb\u00d7\3\2\2\2\u00eb"+
		"\u00dd\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e5\3\2\2\2\u00ec\u00f9\3\2"+
		"\2\2\u00ed\u00ee\f\b\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f8\5\30\r\t\u00f0"+
		"\u00f3\f\t\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f4\5\30\r\2\u00f3\u00f1\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\7\5\2\2\u00fd\u0102\5\30\r\2\u00fe\u00ff\7(\2\2\u00ff"+
		"\u0101\5\30\r\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7\'\2\2\u0106\33\3\2\2\2\u0107\u010f\5 \21\2\u0108\u010f\5\"\22"+
		"\2\u0109\u010f\5\36\20\2\u010a\u010f\5$\23\2\u010b\u010f\5(\25\2\u010c"+
		"\u010f\5*\26\2\u010d\u010f\5B\"\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2"+
		"\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\35\3\2\2\2\u0110\u0111\7!\2\2"+
		"\u0111\u0114\5&\24\2\u0112\u0113\7\31\2\2\u0113\u0115\5D#\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7Y\2\2\u0117"+
		"\37\3\2\2\2\u0118\u0119\7I\2\2\u0119\u011a\7U\2\2\u011a\u011b\7Y\2\2\u011b"+
		"!\3\2\2\2\u011c\u011d\7I\2\2\u011d\u011f\7U\2\2\u011e\u0120\5\f\7\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\31"+
		"\2\2\u0122\u0123\5\30\r\2\u0123\u0124\7Y\2\2\u0124#\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126\u0129\5&\24\2\u0127\u0128\7\31\2\2\u0128\u012a\5D#\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7Y"+
		"\2\2\u012c%\3\2\2\2\u012d\u012e\7U\2\2\u012e\u012f\7-\2\2\u012f\u0130"+
		"\5\30\r\2\u0130\'\3\2\2\2\u0131\u0132\7\63\2\2\u0132\u0138\7U\2\2\u0133"+
		"\u0135\7.\2\2\u0134\u0136\5\24\13\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7\24\2\2\u0138\u0133\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\7-\2\2\u013d\u013e\5\30\r\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0143\7\65\2\2\u0140\u0142\5\34\17\2\u0141\u0140\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7\13\2\2\u0147)\3\2\2\2\u0148\u014a\7\"\2\2"+
		"\u0149\u014b\7U\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\7\65\2\2\u014d\u014e\5D#\2\u014e\u014f\7\13\2\2\u014f"+
		"+\3\2\2\2\u0150\u0151\t\2\2\2\u0151-\3\2\2\2\u0152\u0153\t\3\2\2\u0153"+
		"/\3\2\2\2\u0154\u0155\t\4\2\2\u0155\61\3\2\2\2\u0156\u0157\t\5\2\2\u0157"+
		"\63\3\2\2\2\u0158\u0159\t\6\2\2\u0159\65\3\2\2\2\u015a\u015b\t\7\2\2\u015b"+
		"\67\3\2\2\2\u015c\u015d\t\b\2\2\u015d9\3\2\2\2\u015e\u015f\t\t\2\2\u015f"+
		";\3\2\2\2\u0160\u0161\t\n\2\2\u0161=\3\2\2\2\u0162\u0163\t\13\2\2\u0163"+
		"?\3\2\2\2\u0164\u0165\t\f\2\2\u0165A\3\2\2\2\u0166\u0167\5D#\2\u0167\u0168"+
		"\7Y\2\2\u0168C\3\2\2\2\u0169\u016a\b#\1\2\u016a\u016b\7+\2\2\u016b\u01dd"+
		"\5D#\27\u016c\u016d\5:\36\2\u016d\u016e\5D#\26\u016e\u01dd\3\2\2\2\u016f"+
		"\u0170\7A\2\2\u0170\u0171\5X-\2\u0171\u0172\7O\2\2\u0172\u0173\5D#\25"+
		"\u0173\u01dd\3\2\2\2\u0174\u0175\7G\2\2\u0175\u0176\5X-\2\u0176\u0177"+
		"\7O\2\2\u0177\u0178\5D#\24\u0178\u01dd\3\2\2\2\u0179\u017a\7\26\2\2\u017a"+
		"\u017d\5`\61\2\u017b\u017c\7-\2\2\u017c\u017e\5\30\r\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7O\2\2\u0180"+
		"\u0181\5D#\n\u0181\u01dd\3\2\2\2\u0182\u0183\7.\2\2\u0183\u0184\5D#\2"+
		"\u0184\u0185\7\24\2\2\u0185\u01dd\3\2\2\2\u0186\u01dd\5h\65\2\u0187\u01dd"+
		"\7U\2\2\u0188\u0189\7@\2\2\u0189\u018f\5f\64\2\u018a\u018c\7.\2\2\u018b"+
		"\u018d\5F$\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u0190\7\24\2\2\u018f\u018a\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u01dd\3\2\2\2\u0191\u0192\7/\2\2\u0192\u0193\5D#\2\u0193\u0194\7K\2\2"+
		"\u0194\u0195\5D#\2\u0195\u0196\79\2\2\u0196\u0197\5D#\2\u0197\u01dd\3"+
		"\2\2\2\u0198\u0199\7\17\2\2\u0199\u019a\5D#\2\u019a\u019b\7)\2\2\u019b"+
		"\u019c\5N(\2\u019c\u01dd\3\2\2\2\u019d\u019e\7.\2\2\u019e\u01a1\5D#\2"+
		"\u019f\u01a0\7(\2\2\u01a0\u01a2\5D#\2\u01a1\u019f\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\7\24\2\2\u01a6\u01dd\3\2\2\2\u01a7\u01a9\7\65\2\2\u01a8\u01aa\5"+
		"d\63\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01dd\7\13\2\2\u01ac\u01ad\7\65\2\2\u01ad\u01ae\5D#\2\u01ae\u01af\7&"+
		"\2\2\u01af\u01b0\5D#\2\u01b0\u01b1\7\13\2\2\u01b1\u01dd\3\2\2\2\u01b2"+
		"\u01b3\7\65\2\2\u01b3\u01b4\5D#\2\u01b4\u01b5\7$\2\2\u01b5\u01b6\5X-\2"+
		"\u01b6\u01b7\7O\2\2\u01b7\u01b8\5D#\2\u01b8\u01b9\7\13\2\2\u01b9\u01dd"+
		"\3\2\2\2\u01ba\u01bc\7\5\2\2\u01bb\u01bd\5d\63\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01dd\7\'\2\2\u01bf\u01c0\7\5"+
		"\2\2\u01c0\u01c1\5D#\2\u01c1\u01c2\7&\2\2\u01c2\u01c3\5D#\2\u01c3\u01c4"+
		"\7\'\2\2\u01c4\u01dd\3\2\2\2\u01c5\u01c6\7\5\2\2\u01c6\u01c7\5D#\2\u01c7"+
		"\u01c8\7$\2\2\u01c8\u01c9\5`\61\2\u01c9\u01ca\7-\2\2\u01ca\u01cb\5D#\2"+
		"\u01cb\u01cc\7O\2\2\u01cc\u01cd\5D#\2\u01cd\u01ce\7\'\2\2\u01ce\u01dd"+
		"\3\2\2\2\u01cf\u01d1\7\65\2\2\u01d0\u01d2\5T+\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01dd\7\13\2\2\u01d4\u01d5\7"+
		"\65\2\2\u01d5\u01d6\5V,\2\u01d6\u01d7\7$\2\2\u01d7\u01d8\5X-\2\u01d8\u01d9"+
		"\7O\2\2\u01d9\u01da\5D#\2\u01da\u01db\7\13\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u0169\3\2\2\2\u01dc\u016c\3\2\2\2\u01dc\u016f\3\2\2\2\u01dc\u0174\3\2"+
		"\2\2\u01dc\u0179\3\2\2\2\u01dc\u0182\3\2\2\2\u01dc\u0186\3\2\2\2\u01dc"+
		"\u0187\3\2\2\2\u01dc\u0188\3\2\2\2\u01dc\u0191\3\2\2\2\u01dc\u0198\3\2"+
		"\2\2\u01dc\u019d\3\2\2\2\u01dc\u01a7\3\2\2\2\u01dc\u01ac\3\2\2\2\u01dc"+
		"\u01b2\3\2\2\2\u01dc\u01ba\3\2\2\2\u01dc\u01bf\3\2\2\2\u01dc\u01c5\3\2"+
		"\2\2\u01dc\u01cf\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dd\u020d\3\2\2\2\u01de"+
		"\u01df\f\t\2\2\u01df\u01e0\t\r\2\2\u01e0\u020c\5D#\n\u01e1\u01e2\f\b\2"+
		"\2\u01e2\u01e3\t\16\2\2\u01e3\u020c\5D#\t\u01e4\u01f1\f\7\2\2\u01e5\u01f2"+
		"\5\62\32\2\u01e6\u01f2\5\64\33\2\u01e7\u01f2\5.\30\2\u01e8\u01f2\5\60"+
		"\31\2\u01e9\u01f2\5@!\2\u01ea\u01eb\5:\36\2\u01eb\u01ec\5@!\2\u01ec\u01f2"+
		"\3\2\2\2\u01ed\u01f2\78\2\2\u01ee\u01f2\7\b\2\2\u01ef\u01f2\7\f\2\2\u01f0"+
		"\u01f2\7\34\2\2\u01f1\u01e5\3\2\2\2\u01f1\u01e6\3\2\2\2\u01f1\u01e7\3"+
		"\2\2\2\u01f1\u01e8\3\2\2\2\u01f1\u01e9\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u020c\5D#\b\u01f4\u01f5\f\6\2\2\u01f5\u01f6"+
		"\5\66\34\2\u01f6\u01f7\5D#\7\u01f7\u020c\3\2\2\2\u01f8\u01f9\f\5\2\2\u01f9"+
		"\u01fa\58\35\2\u01fa\u01fb\5D#\6\u01fb\u020c\3\2\2\2\u01fc\u01ff\f\4\2"+
		"\2\u01fd\u0200\5<\37\2\u01fe\u0200\5> \2\u01ff\u01fd\3\2\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5D#\5\u0202\u020c\3\2\2\2\u0203"+
		"\u0204\f\3\2\2\u0204\u0205\7J\2\2\u0205\u020c\5D#\4\u0206\u0207\f\34\2"+
		"\2\u0207\u0208\7O\2\2\u0208\u020c\7U\2\2\u0209\u020a\f\32\2\2\u020a\u020c"+
		"\5D#\2\u020b\u01de\3\2\2\2\u020b\u01e1\3\2\2\2\u020b\u01e4\3\2\2\2\u020b"+
		"\u01f4\3\2\2\2\u020b\u01f8\3\2\2\2\u020b\u01fc\3\2\2\2\u020b\u0203\3\2"+
		"\2\2\u020b\u0206\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eE\3\2\2\2\u020f\u020d\3\2\2\2"+
		"\u0210\u0215\5H%\2\u0211\u0212\7(\2\2\u0212\u0214\5H%\2\u0213\u0211\3"+
		"\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"G\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7U\2\2\u0219\u021a\7-\2\2\u021a"+
		"\u021b\5D#\2\u021bI\3\2\2\2\u021c\u0221\5L\'\2\u021d\u021e\7(\2\2\u021e"+
		"\u0220\5L\'\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222K\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225"+
		"\7U\2\2\u0225\u0226\7J\2\2\u0226\u0227\5D#\2\u0227M\3\2\2\2\u0228\u0229"+
		"\5P)\2\u0229\u022a\7>\2\2\u022a\u022d\5D#\2\u022b\u022c\7$\2\2\u022c\u022e"+
		"\5N(\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022eO\3\2\2\2\u022f\u024a"+
		"\5h\65\2\u0230\u024a\7\25\2\2\u0231\u023d\7U\2\2\u0232\u0233\7.\2\2\u0233"+
		"\u0238\5R*\2\u0234\u0235\7(\2\2\u0235\u0237\5R*\2\u0236\u0234\3\2\2\2"+
		"\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7\24\2\2\u023c\u023e\3\2\2\2"+
		"\u023d\u0232\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u024a\3\2\2\2\u023f\u0240"+
		"\7.\2\2\u0240\u0243\5P)\2\u0241\u0242\7(\2\2\u0242\u0244\5P)\2\u0243\u0241"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\7\24\2\2\u0248\u024a\3\2\2\2\u0249\u022f\3"+
		"\2\2\2\u0249\u0230\3\2\2\2\u0249\u0231\3\2\2\2\u0249\u023f\3\2\2\2\u024a"+
		"Q\3\2\2\2\u024b\u024c\7U\2\2\u024c\u024d\7\31\2\2\u024d\u024e\5P)\2\u024e"+
		"S\3\2\2\2\u024f\u0254\5V,\2\u0250\u0251\7(\2\2\u0251\u0253\5V,\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255U\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\5D#\2\u0258\u0259"+
		"\7-\2\2\u0259\u025a\5D#\2\u025aW\3\2\2\2\u025b\u0260\5Z.\2\u025c\u025d"+
		"\7(\2\2\u025d\u025f\5Z.\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261Y\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0264\5\\/\2\u0264\u0265\7-\2\2\u0265\u0266\5^\60\2\u0266[\3\2"+
		"\2\2\u0267\u026c\5`\61\2\u0268\u0269\7(\2\2\u0269\u026b\5`\61\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d]\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0272\5D#\2\u0270\u0272"+
		"\5\30\r\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2\2\2\u0272_\3\2\2\2\u0273"+
		"\u027f\7U\2\2\u0274\u0275\7.\2\2\u0275\u0278\5`\61\2\u0276\u0277\7(\2"+
		"\2\u0277\u0279\5`\61\2\u0278\u0276\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7\24\2\2"+
		"\u027d\u027f\3\2\2\2\u027e\u0273\3\2\2\2\u027e\u0274\3\2\2\2\u027fa\3"+
		"\2\2\2\u0280\u0285\7U\2\2\u0281\u0282\7(\2\2\u0282\u0284\7U\2\2\u0283"+
		"\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286c\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028d\5D#\2\u0289\u028a"+
		"\7(\2\2\u028a\u028c\5D#\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028ee\3\2\2\2\u028f\u028d\3\2\2\2"+
		"\u0290\u0295\7U\2\2\u0291\u0292\7O\2\2\u0292\u0294\7U\2\2\u0293\u0291"+
		"\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"g\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\t\17\2\2\u0299i\3\2\2\2:ntz"+
		"\u0081\u008a\u008f\u0092\u0095\u009b\u00a6\u00ae\u00b5\u00c1\u00ca\u00d1"+
		"\u00eb\u00f5\u00f7\u00f9\u0102\u010e\u0114\u011f\u0129\u0135\u013a\u0143"+
		"\u014a\u017d\u018c\u018f\u01a3\u01a9\u01bc\u01d1\u01dc\u01f1\u01ff\u020b"+
		"\u020d\u0215\u0221\u022d\u0238\u023d\u0245\u0249\u0254\u0260\u026c\u0271"+
		"\u027a\u027e\u0285\u028d\u0295";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}