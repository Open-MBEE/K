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
			setState(104); packageDeclaration();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
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
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__27) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (T__5 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(111); topDeclaration();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); match(EOF);
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
			setState(121);
			switch (_input.LA(1)) {
			case T__73:
			case T__63:
			case T__56:
			case T__45:
			case T__44:
			case T__41:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__29:
			case T__27:
			case T__25:
			case T__14:
			case T__13:
			case T__7:
			case T__5:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); memberDeclaration();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); classDeclaration();
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
			setState(123); match(T__28);
			setState(124); qualifiedName();
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
			setState(126); match(T__19);
			setState(127); qualifiedName();
			setState(130);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(128); match(SUCHTHAT);
				setState(129); match(T__72);
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
			setState(132); match(T__43);
			setState(133); match(Identifier);
			setState(135);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(134); typeParameters();
				}
			}

			setState(138);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(137); valueParameters();
				}
			}

			setState(141);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(140); extending();
				}
			}

			setState(143); match(T__25);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__27) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (T__5 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(144); memberDeclaration();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(T__67);
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
			setState(152); match(T__73);
			setState(153); typeParameter();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(154); match(T__38);
				setState(155); typeParameter();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(T__39);
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
			setState(163); match(Identifier);
			setState(166);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(164); match(T__33);
				setState(165); typeBound();
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
			setState(168); type(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(169); match(T__15);
				setState(170); type(0);
				}
				}
				setState(175);
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
			setState(176); match(T__32);
			setState(177); typingList();
			setState(178); match(T__58);
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
			setState(180); typing();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(181); match(T__38);
				setState(182); typing();
				}
				}
				setState(187);
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
			setState(188); match(T__23);
			setState(189); type(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(190); match(T__38);
				setState(191); type(0);
				}
				}
				setState(196);
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
			setState(227);
			switch (_input.LA(1)) {
			case T__68:
			case T__60:
			case T__51:
			case T__49:
			case T__46:
			case T__36:
			case T__11:
			case T__6:
				{
				setState(198); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(199); qualifiedName();
				setState(201);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(200); typeArguments();
					}
					break;
				}
				}
				break;
			case T__32:
				{
				setState(203); match(T__32);
				setState(204); type(0);
				setState(205); match(T__58);
				}
				break;
			case T__26:
				{
				setState(207); match(T__26);
				setState(208); typing();
				setState(209); match(SUCHTHAT);
				setState(210); expression(0);
				setState(211); match(T__12);
				}
				break;
			case T__25:
				{
				setState(213); match(T__25);
				setState(214); type(0);
				setState(215); match(T__67);
				}
				break;
			case T__73:
				{
				setState(217); match(T__73);
				setState(218); type(0);
				setState(219); match(T__39);
				}
				break;
			case T__71:
				{
				setState(221); match(T__71);
				setState(222); type(0);
				setState(223); match(T__38);
				setState(224); type(0);
				setState(225); match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230); match(T__62);
						setState(231); type(7);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(232);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(233); match(T__72);
								setState(234); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(237); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(244); match(T__73);
			setState(245); type(0);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(246); match(T__38);
				setState(247); type(0);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253); match(T__39);
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
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261); expressionsWithSeparator();
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
			setState(264); match(T__45);
			setState(265); typing();
			setState(268);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(266); match(T__53);
				setState(267); expression(0);
				}
			}

			setState(270); match(SEP);
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
			setState(272); match(T__5);
			setState(273); match(Identifier);
			setState(274); match(SEP);
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
			setState(276); match(T__5);
			setState(277); match(Identifier);
			setState(279);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(278); typeParameters();
				}
			}

			setState(281); match(T__53);
			setState(282); type(0);
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
			setState(285); match(T__29);
			setState(286); typing();
			setState(289);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(287); match(T__53);
				setState(288); expression(0);
				}
			}

			setState(291); match(SEP);
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
			setState(293); match(Identifier);
			setState(294); match(T__33);
			setState(295); type(0);
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
			setState(297); match(T__27);
			setState(298); match(Identifier);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299); match(T__32);
				setState(301);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(300); typingList();
					}
				}

				setState(303); match(T__58);
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__32 );
			{
			setState(308); match(T__33);
			setState(309); type(0);
			}
			setState(311); match(T__25);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__27) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (T__5 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(312); memberDeclaration();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318); match(T__67);
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
			setState(320); match(T__44);
			setState(322);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(321); match(Identifier);
				}
			}

			setState(324); match(T__25);
			setState(325); expression(0);
			setState(326); match(T__67);
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
			setState(328);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__68 - 8)) | (1L << (T__60 - 8)) | (1L << (T__51 - 8)) | (1L << (T__49 - 8)) | (1L << (T__46 - 8)) | (1L << (T__36 - 8)) | (1L << (T__11 - 8)) | (1L << (T__6 - 8)))) != 0)) ) {
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
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__64) ) {
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
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__8) ) {
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
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__30) ) {
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
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__1) ) {
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
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__10) ) {
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
			setState(340);
			_la = _input.LA(1);
			if ( !(_la==T__74 || _la==T__9) ) {
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
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__34) ) {
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
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__16) ) {
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
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==T__55 || _la==T__52) ) {
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
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__53) ) {
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
			setState(350); expression(0);
			setState(351); match(SEP);
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
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(354); match(T__35);
				setState(355); expression(21);
				}
				break;
			case 2:
				{
				setState(356); tokenNot();
				setState(357); expression(20);
				}
				break;
			case 3:
				{
				setState(359); match(T__13);
				setState(360); rngBindingList();
				setState(361); match(SUCHTHAT);
				setState(362); expression(19);
				}
				break;
			case 4:
				{
				setState(364); match(T__7);
				setState(365); rngBindingList();
				setState(366); match(SUCHTHAT);
				setState(367); expression(18);
				}
				break;
			case 5:
				{
				setState(369); match(T__56);
				setState(370); pattern();
				setState(373);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(371); match(T__33);
					setState(372); type(0);
					}
				}

				setState(375); match(SUCHTHAT);
				setState(376); expression(8);
				}
				break;
			case 6:
				{
				setState(378); match(T__32);
				setState(379); expression(0);
				setState(380); match(T__58);
				}
				break;
			case 7:
				{
				setState(382); literal();
				}
				break;
			case 8:
				{
				setState(383); match(Identifier);
				}
				break;
			case 9:
				{
				setState(384); match(T__14);
				setState(385); qualifiedName();
				setState(391);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(386); match(T__32);
					setState(388);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(387); classArgumentList();
						}
					}

					setState(390); match(T__58);
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(393); match(T__31);
				setState(394); expression(0);
				setState(395); match(T__3);
				setState(396); expression(0);
				setState(397); match(T__21);
				setState(398); expression(0);
				}
				break;
			case 11:
				{
				setState(400); match(T__63);
				setState(401); expression(0);
				setState(402); match(T__37);
				setState(403); match();
				}
				break;
			case 12:
				{
				setState(405); match(T__32);
				setState(406); expression(0);
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(407); match(T__38);
					setState(408); expression(0);
					}
					}
					setState(411); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__38 );
				setState(413); match(T__58);
				}
				break;
			case 13:
				{
				setState(415); match(T__25);
				setState(417);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(416); expressionList();
					}
				}

				setState(419); match(T__67);
				}
				break;
			case 14:
				{
				setState(420); match(T__25);
				setState(421); expression(0);
				setState(422); match(T__40);
				setState(423); expression(0);
				setState(424); match(T__67);
				}
				break;
			case 15:
				{
				setState(426); match(T__25);
				setState(427); expression(0);
				setState(428); match(T__42);
				setState(429); rngBindingList();
				setState(430); match(SUCHTHAT);
				setState(431); expression(0);
				setState(432); match(T__67);
				}
				break;
			case 16:
				{
				setState(434); match(T__73);
				setState(436);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(435); expressionList();
					}
				}

				setState(438); match(T__39);
				}
				break;
			case 17:
				{
				setState(439); match(T__73);
				setState(440); expression(0);
				setState(441); match(T__40);
				setState(442); expression(0);
				setState(443); match(T__39);
				}
				break;
			case 18:
				{
				setState(445); match(T__73);
				setState(446); expression(0);
				setState(447); match(T__42);
				setState(448); pattern();
				setState(449); match(T__33);
				setState(450); expression(0);
				setState(451); match(SUCHTHAT);
				setState(452); expression(0);
				setState(453); match(T__39);
				}
				break;
			case 19:
				{
				setState(455); match(T__25);
				setState(457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__63) | (1L << T__56) | (1L << T__41) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25) | (1L << T__14) | (1L << T__13))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__7 - 69)) | (1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(456); mapPairList();
					}
				}

				setState(459); match(T__67);
				}
				break;
			case 20:
				{
				setState(460); match(T__25);
				setState(461); mapPair();
				setState(462); match(T__42);
				setState(463); rngBindingList();
				setState(464); match(SUCHTHAT);
				setState(465); expression(0);
				setState(466); match(T__67);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(515);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(471);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__72) | (1L << T__61) | (1L << T__48) | (1L << T__20) | (1L << T__18) | (1L << T__17))) != 0) || _la==T__2 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(472); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(473);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(474);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__35) | (1L << T__15))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(475); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(489);
						switch (_input.LA(1)) {
						case T__69:
						case T__30:
							{
							setState(477); tokenLessThanEqual();
							}
							break;
						case T__47:
						case T__1:
							{
							setState(478); tokenGreaterThanEqual();
							}
							break;
						case T__71:
						case T__64:
							{
							setState(479); tokenLessThan();
							}
							break;
						case T__54:
						case T__8:
							{
							setState(480); tokenGreatherThan();
							}
							break;
						case T__65:
						case T__53:
							{
							setState(481); tokenEquals();
							}
							break;
						case T__41:
						case T__34:
							{
							setState(482); tokenNot();
							setState(483); tokenEquals();
							}
							break;
						case T__22:
							{
							setState(485); match(T__22);
							}
							break;
						case T__70:
							{
							setState(486); match(T__70);
							}
							break;
						case T__66:
							{
							setState(487); match(T__66);
							}
							break;
						case T__50:
							{
							setState(488); match(T__50);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(491); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(493); tokenAnd();
						setState(494); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(497); tokenOr();
						setState(498); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(500);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(503);
						switch (_input.LA(1)) {
						case T__75:
						case T__16:
							{
							setState(501); tokenImplies();
							}
							break;
						case T__55:
						case T__52:
							{
							setState(502); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(505); expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(507);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(508); match(T__4);
						setState(509); expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(510);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(511); match(SUCHTHAT);
						setState(512); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(514); expression(0);
						}
						break;
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(520); classArgument();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(521); match(T__38);
				setState(522); classArgument();
				}
				}
				setState(527);
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
			setState(528); match(Identifier);
			setState(529); match(T__33);
			setState(530); expression(0);
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
			setState(532); idValuePair();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(533); match(T__38);
				setState(534); idValuePair();
				}
				}
				setState(539);
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
			setState(540); match(Identifier);
			setState(541); match(T__4);
			setState(542); expression(0);
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
			setState(544); matchPattern();
			setState(545); match(T__16);
			setState(546); expression(0);
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(547); match(T__42);
				setState(548); match();
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
			setState(577);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); literal();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(552); match(T__57);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(553); match(Identifier);
				setState(565);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(554); match(T__32);
					setState(555); matchArgument();
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__38) {
						{
						{
						setState(556); match(T__38);
						setState(557); matchArgument();
						}
						}
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(563); match(T__58);
					}
				}

				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(567); match(T__32);
				setState(568); matchPattern();
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(569); match(T__38);
					setState(570); matchPattern();
					}
					}
					setState(573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__38 );
				setState(575); match(T__58);
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
			setState(579); match(Identifier);
			setState(580); match(T__53);
			setState(581); matchPattern();
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
			setState(583); mapPair();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(584); match(T__38);
				setState(585); mapPair();
				}
				}
				setState(590);
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
			setState(591); expression(0);
			setState(592); match(T__33);
			setState(593); expression(0);
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
			setState(595); rngBinding();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(596); match(T__38);
				setState(597); rngBinding();
				}
				}
				setState(602);
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
			setState(603); patternList();
			setState(604); match(T__33);
			setState(605); collectionOrType();
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
			setState(607); pattern();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(608); match(T__38);
				setState(609); pattern();
				}
				}
				setState(614);
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
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616); type(0);
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
			setState(630);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); match(Identifier);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); match(T__32);
				setState(621); pattern();
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(622); match(T__38);
					setState(623); pattern();
					}
					}
					setState(626); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__38 );
				setState(628); match(T__58);
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
			setState(632); match(Identifier);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(633); match(T__38);
				setState(634); match(Identifier);
				}
				}
				setState(639);
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
			setState(640); expression(0);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(641); match(T__38);
				setState(642); expression(0);
				}
				}
				setState(647);
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
			setState(648); match(Identifier);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649); match(SUCHTHAT);
					setState(650); match(Identifier);
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			setState(656);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u0295\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0085\n\5"+
		"\3\6\3\6\3\6\5\6\u008a\n\6\3\6\5\6\u008d\n\6\3\6\5\6\u0090\n\6\3\6\3\6"+
		"\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u009f\n"+
		"\7\f\7\16\7\u00a2\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\7"+
		"\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ba"+
		"\n\13\f\13\16\13\u00bd\13\13\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e6"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00ee\n\r\r\r\16\r\u00ef\7\r\u00f2\n"+
		"\r\f\r\16\r\u00f5\13\r\3\16\3\16\3\16\3\16\7\16\u00fb\n\16\f\16\16\16"+
		"\u00fe\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0109\n"+
		"\17\3\20\3\20\3\20\3\20\5\20\u010f\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u011a\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\5\23\u0124\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0130\n\25\3\25\6\25\u0133\n\25\r\25\16\25\u0134\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u013c\n\25\f\25\16\25\u013f\13\25\3\25\3\25\3\26\3\26\5\26"+
		"\u0145\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0178"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0187\n#\3#\5#\u018a\n#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u019c\n#\r#\16#\u019d"+
		"\3#\3#\3#\3#\5#\u01a4\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01b7\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u01cc\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01d7\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01ec\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01fa\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#"+
		"\u0206\n#\f#\16#\u0209\13#\3$\3$\3$\7$\u020e\n$\f$\16$\u0211\13$\3%\3"+
		"%\3%\3%\3&\3&\3&\7&\u021a\n&\f&\16&\u021d\13&\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\5(\u0228\n(\3)\3)\3)\3)\3)\3)\3)\7)\u0231\n)\f)\16)\u0234\13)"+
		"\3)\3)\5)\u0238\n)\3)\3)\3)\3)\6)\u023e\n)\r)\16)\u023f\3)\3)\5)\u0244"+
		"\n)\3*\3*\3*\3*\3+\3+\3+\7+\u024d\n+\f+\16+\u0250\13+\3,\3,\3,\3,\3-\3"+
		"-\3-\7-\u0259\n-\f-\16-\u025c\13-\3.\3.\3.\3.\3/\3/\3/\7/\u0265\n/\f/"+
		"\16/\u0268\13/\3\60\3\60\5\60\u026c\n\60\3\61\3\61\3\61\3\61\3\61\6\61"+
		"\u0273\n\61\r\61\16\61\u0274\3\61\3\61\5\61\u0279\n\61\3\62\3\62\3\62"+
		"\7\62\u027e\n\62\f\62\16\62\u0281\13\62\3\63\3\63\3\63\7\63\u0286\n\63"+
		"\f\63\16\63\u0289\13\63\3\64\3\64\3\64\7\64\u028e\n\64\f\64\16\64\u0291"+
		"\13\64\3\65\3\65\3\65\2\4\30D\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\20\n\2\n\n\22\22\33"+
		"\33\35\35  **CCHH\4\2\7\7\16\16\4\2\30\30FF\4\2\t\t\60\60\4\2\37\37MM"+
		"\4\2\66\66DD\4\2\4\4EE\4\2%%,,\4\2\3\3>>\4\2\27\27\32\32\4\2\r\r\31\31"+
		"\t\2\6\6\21\21\36\36::<=LLNN\5\2\23\23++??\3\2PT\u02c4\2j\3\2\2\2\4{\3"+
		"\2\2\2\6}\3\2\2\2\b\u0080\3\2\2\2\n\u0086\3\2\2\2\f\u009a\3\2\2\2\16\u00a5"+
		"\3\2\2\2\20\u00aa\3\2\2\2\22\u00b2\3\2\2\2\24\u00b6\3\2\2\2\26\u00be\3"+
		"\2\2\2\30\u00e5\3\2\2\2\32\u00f6\3\2\2\2\34\u0108\3\2\2\2\36\u010a\3\2"+
		"\2\2 \u0112\3\2\2\2\"\u0116\3\2\2\2$\u011f\3\2\2\2&\u0127\3\2\2\2(\u012b"+
		"\3\2\2\2*\u0142\3\2\2\2,\u014a\3\2\2\2.\u014c\3\2\2\2\60\u014e\3\2\2\2"+
		"\62\u0150\3\2\2\2\64\u0152\3\2\2\2\66\u0154\3\2\2\28\u0156\3\2\2\2:\u0158"+
		"\3\2\2\2<\u015a\3\2\2\2>\u015c\3\2\2\2@\u015e\3\2\2\2B\u0160\3\2\2\2D"+
		"\u01d6\3\2\2\2F\u020a\3\2\2\2H\u0212\3\2\2\2J\u0216\3\2\2\2L\u021e\3\2"+
		"\2\2N\u0222\3\2\2\2P\u0243\3\2\2\2R\u0245\3\2\2\2T\u0249\3\2\2\2V\u0251"+
		"\3\2\2\2X\u0255\3\2\2\2Z\u025d\3\2\2\2\\\u0261\3\2\2\2^\u026b\3\2\2\2"+
		"`\u0278\3\2\2\2b\u027a\3\2\2\2d\u0282\3\2\2\2f\u028a\3\2\2\2h\u0292\3"+
		"\2\2\2jn\5\6\4\2km\5\b\5\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ot\3"+
		"\2\2\2pn\3\2\2\2qs\5\4\3\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2wx\7\2\2\3x\3\3\2\2\2y|\5\34\17\2z|\5\n\6\2{y\3\2\2\2"+
		"{z\3\2\2\2|\5\3\2\2\2}~\7\62\2\2~\177\5f\64\2\177\7\3\2\2\2\u0080\u0081"+
		"\7;\2\2\u0081\u0084\5f\64\2\u0082\u0083\7O\2\2\u0083\u0085\7\6\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\t\3\2\2\2\u0086\u0087\7#\2\2"+
		"\u0087\u0089\7U\2\2\u0088\u008a\5\f\7\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\5\26\f\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\7\65\2\2"+
		"\u0092\u0094\5\34\17\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\13\2\2\u0099\13\3\2\2\2\u009a\u009b\7\5\2\2\u009b\u00a0\5\16"+
		"\b\2\u009c\u009d\7(\2\2\u009d\u009f\5\16\b\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\'\2\2\u00a4\r\3\2\2\2\u00a5\u00a8"+
		"\7U\2\2\u00a6\u00a7\7-\2\2\u00a7\u00a9\5\20\t\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00af\5\30\r\2\u00ab\u00ac\7?\2"+
		"\2\u00ac\u00ae\5\30\r\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b2\u00b3\7.\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\7\24\2\2\u00b5"+
		"\23\3\2\2\2\u00b6\u00bb\5&\24\2\u00b7\u00b8\7(\2\2\u00b8\u00ba\5&\24\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\25\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\67\2\2\u00bf"+
		"\u00c4\5\30\r\2\u00c0\u00c1\7(\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\27\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\r\1\2\u00c8\u00e6\5,\27"+
		"\2\u00c9\u00cb\5f\64\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00e6\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\u00cf\5\30"+
		"\r\2\u00cf\u00d0\7\24\2\2\u00d0\u00e6\3\2\2\2\u00d1\u00d2\7\64\2\2\u00d2"+
		"\u00d3\5&\24\2\u00d3\u00d4\7O\2\2\u00d4\u00d5\5D#\2\u00d5\u00d6\7B\2\2"+
		"\u00d6\u00e6\3\2\2\2\u00d7\u00d8\7\65\2\2\u00d8\u00d9\5\30\r\2\u00d9\u00da"+
		"\7\13\2\2\u00da\u00e6\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\5\30\r\2"+
		"\u00dd\u00de\7\'\2\2\u00de\u00e6\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0\u00e1"+
		"\5\30\r\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4\7F\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00c7\3\2\2\2\u00e5\u00c9\3\2\2\2\u00e5\u00cd\3\2"+
		"\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5"+
		"\u00df\3\2\2\2\u00e6\u00f3\3\2\2\2\u00e7\u00e8\f\b\2\2\u00e8\u00e9\7\20"+
		"\2\2\u00e9\u00f2\5\30\r\t\u00ea\u00ed\f\t\2\2\u00eb\u00ec\7\6\2\2\u00ec"+
		"\u00ee\5\30\r\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1"+
		"\u00ea\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\31\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\5\2\2\u00f7\u00fc"+
		"\5\30\r\2\u00f8\u00f9\7(\2\2\u00f9\u00fb\5\30\r\2\u00fa\u00f8\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\'\2\2\u0100\33\3\2\2\2\u0101"+
		"\u0109\5 \21\2\u0102\u0109\5\"\22\2\u0103\u0109\5\36\20\2\u0104\u0109"+
		"\5$\23\2\u0105\u0109\5(\25\2\u0106\u0109\5*\26\2\u0107\u0109\5B\"\2\u0108"+
		"\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2"+
		"\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\35\3\2\2\2\u010a\u010b\7!\2\2\u010b\u010e\5&\24\2\u010c\u010d\7\31\2"+
		"\2\u010d\u010f\5D#\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\7Y\2\2\u0111\37\3\2\2\2\u0112\u0113\7I\2\2\u0113"+
		"\u0114\7U\2\2\u0114\u0115\7Y\2\2\u0115!\3\2\2\2\u0116\u0117\7I\2\2\u0117"+
		"\u0119\7U\2\2\u0118\u011a\5\f\7\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\31\2\2\u011c\u011d\5\30\r\2\u011d"+
		"\u011e\7Y\2\2\u011e#\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0123\5&\24\2"+
		"\u0121\u0122\7\31\2\2\u0122\u0124\5D#\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7Y\2\2\u0126%\3\2\2\2\u0127\u0128"+
		"\7U\2\2\u0128\u0129\7-\2\2\u0129\u012a\5\30\r\2\u012a\'\3\2\2\2\u012b"+
		"\u012c\7\63\2\2\u012c\u0132\7U\2\2\u012d\u012f\7.\2\2\u012e\u0130\5\24"+
		"\13\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\7\24\2\2\u0132\u012d\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7-\2\2\u0137"+
		"\u0138\5\30\r\2\u0138\u0139\3\2\2\2\u0139\u013d\7\65\2\2\u013a\u013c\5"+
		"\34\17\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\13"+
		"\2\2\u0141)\3\2\2\2\u0142\u0144\7\"\2\2\u0143\u0145\7U\2\2\u0144\u0143"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\65\2\2"+
		"\u0147\u0148\5D#\2\u0148\u0149\7\13\2\2\u0149+\3\2\2\2\u014a\u014b\t\2"+
		"\2\2\u014b-\3\2\2\2\u014c\u014d\t\3\2\2\u014d/\3\2\2\2\u014e\u014f\t\4"+
		"\2\2\u014f\61\3\2\2\2\u0150\u0151\t\5\2\2\u0151\63\3\2\2\2\u0152\u0153"+
		"\t\6\2\2\u0153\65\3\2\2\2\u0154\u0155\t\7\2\2\u0155\67\3\2\2\2\u0156\u0157"+
		"\t\b\2\2\u01579\3\2\2\2\u0158\u0159\t\t\2\2\u0159;\3\2\2\2\u015a\u015b"+
		"\t\n\2\2\u015b=\3\2\2\2\u015c\u015d\t\13\2\2\u015d?\3\2\2\2\u015e\u015f"+
		"\t\f\2\2\u015fA\3\2\2\2\u0160\u0161\5D#\2\u0161\u0162\7Y\2\2\u0162C\3"+
		"\2\2\2\u0163\u0164\b#\1\2\u0164\u0165\7+\2\2\u0165\u01d7\5D#\27\u0166"+
		"\u0167\5:\36\2\u0167\u0168\5D#\26\u0168\u01d7\3\2\2\2\u0169\u016a\7A\2"+
		"\2\u016a\u016b\5X-\2\u016b\u016c\7O\2\2\u016c\u016d\5D#\25\u016d\u01d7"+
		"\3\2\2\2\u016e\u016f\7G\2\2\u016f\u0170\5X-\2\u0170\u0171\7O\2\2\u0171"+
		"\u0172\5D#\24\u0172\u01d7\3\2\2\2\u0173\u0174\7\26\2\2\u0174\u0177\5`"+
		"\61\2\u0175\u0176\7-\2\2\u0176\u0178\5\30\r\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7O\2\2\u017a\u017b\5D#"+
		"\n\u017b\u01d7\3\2\2\2\u017c\u017d\7.\2\2\u017d\u017e\5D#\2\u017e\u017f"+
		"\7\24\2\2\u017f\u01d7\3\2\2\2\u0180\u01d7\5h\65\2\u0181\u01d7\7U\2\2\u0182"+
		"\u0183\7@\2\2\u0183\u0189\5f\64\2\u0184\u0186\7.\2\2\u0185\u0187\5F$\2"+
		"\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a"+
		"\7\24\2\2\u0189\u0184\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u01d7\3\2\2\2"+
		"\u018b\u018c\7/\2\2\u018c\u018d\5D#\2\u018d\u018e\7K\2\2\u018e\u018f\5"+
		"D#\2\u018f\u0190\79\2\2\u0190\u0191\5D#\2\u0191\u01d7\3\2\2\2\u0192\u0193"+
		"\7\17\2\2\u0193\u0194\5D#\2\u0194\u0195\7)\2\2\u0195\u0196\5N(\2\u0196"+
		"\u01d7\3\2\2\2\u0197\u0198\7.\2\2\u0198\u019b\5D#\2\u0199\u019a\7(\2\2"+
		"\u019a\u019c\5D#\2\u019b\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\24\2\2"+
		"\u01a0\u01d7\3\2\2\2\u01a1\u01a3\7\65\2\2\u01a2\u01a4\5d\63\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01d7\7\13\2\2"+
		"\u01a6\u01a7\7\65\2\2\u01a7\u01a8\5D#\2\u01a8\u01a9\7&\2\2\u01a9\u01aa"+
		"\5D#\2\u01aa\u01ab\7\13\2\2\u01ab\u01d7\3\2\2\2\u01ac\u01ad\7\65\2\2\u01ad"+
		"\u01ae\5D#\2\u01ae\u01af\7$\2\2\u01af\u01b0\5X-\2\u01b0\u01b1\7O\2\2\u01b1"+
		"\u01b2\5D#\2\u01b2\u01b3\7\13\2\2\u01b3\u01d7\3\2\2\2\u01b4\u01b6\7\5"+
		"\2\2\u01b5\u01b7\5d\63\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01d7\7\'\2\2\u01b9\u01ba\7\5\2\2\u01ba\u01bb\5D"+
		"#\2\u01bb\u01bc\7&\2\2\u01bc\u01bd\5D#\2\u01bd\u01be\7\'\2\2\u01be\u01d7"+
		"\3\2\2\2\u01bf\u01c0\7\5\2\2\u01c0\u01c1\5D#\2\u01c1\u01c2\7$\2\2\u01c2"+
		"\u01c3\5`\61\2\u01c3\u01c4\7-\2\2\u01c4\u01c5\5D#\2\u01c5\u01c6\7O\2\2"+
		"\u01c6\u01c7\5D#\2\u01c7\u01c8\7\'\2\2\u01c8\u01d7\3\2\2\2\u01c9\u01cb"+
		"\7\65\2\2\u01ca\u01cc\5T+\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01d7\7\13\2\2\u01ce\u01cf\7\65\2\2\u01cf\u01d0\5"+
		"V,\2\u01d0\u01d1\7$\2\2\u01d1\u01d2\5X-\2\u01d2\u01d3\7O\2\2\u01d3\u01d4"+
		"\5D#\2\u01d4\u01d5\7\13\2\2\u01d5\u01d7\3\2\2\2\u01d6\u0163\3\2\2\2\u01d6"+
		"\u0166\3\2\2\2\u01d6\u0169\3\2\2\2\u01d6\u016e\3\2\2\2\u01d6\u0173\3\2"+
		"\2\2\u01d6\u017c\3\2\2\2\u01d6\u0180\3\2\2\2\u01d6\u0181\3\2\2\2\u01d6"+
		"\u0182\3\2\2\2\u01d6\u018b\3\2\2\2\u01d6\u0192\3\2\2\2\u01d6\u0197\3\2"+
		"\2\2\u01d6\u01a1\3\2\2\2\u01d6\u01a6\3\2\2\2\u01d6\u01ac\3\2\2\2\u01d6"+
		"\u01b4\3\2\2\2\u01d6\u01b9\3\2\2\2\u01d6\u01bf\3\2\2\2\u01d6\u01c9\3\2"+
		"\2\2\u01d6\u01ce\3\2\2\2\u01d7\u0207\3\2\2\2\u01d8\u01d9\f\t\2\2\u01d9"+
		"\u01da\t\r\2\2\u01da\u0206\5D#\n\u01db\u01dc\f\b\2\2\u01dc\u01dd\t\16"+
		"\2\2\u01dd\u0206\5D#\t\u01de\u01eb\f\7\2\2\u01df\u01ec\5\62\32\2\u01e0"+
		"\u01ec\5\64\33\2\u01e1\u01ec\5.\30\2\u01e2\u01ec\5\60\31\2\u01e3\u01ec"+
		"\5@!\2\u01e4\u01e5\5:\36\2\u01e5\u01e6\5@!\2\u01e6\u01ec\3\2\2\2\u01e7"+
		"\u01ec\78\2\2\u01e8\u01ec\7\b\2\2\u01e9\u01ec\7\f\2\2\u01ea\u01ec\7\34"+
		"\2\2\u01eb\u01df\3\2\2\2\u01eb\u01e0\3\2\2\2\u01eb\u01e1\3\2\2\2\u01eb"+
		"\u01e2\3\2\2\2\u01eb\u01e3\3\2\2\2\u01eb\u01e4\3\2\2\2\u01eb\u01e7\3\2"+
		"\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u0206\5D#\b\u01ee\u01ef\f\6\2\2\u01ef\u01f0\5\66"+
		"\34\2\u01f0\u01f1\5D#\7\u01f1\u0206\3\2\2\2\u01f2\u01f3\f\5\2\2\u01f3"+
		"\u01f4\58\35\2\u01f4\u01f5\5D#\6\u01f5\u0206\3\2\2\2\u01f6\u01f9\f\4\2"+
		"\2\u01f7\u01fa\5<\37\2\u01f8\u01fa\5> \2\u01f9\u01f7\3\2\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5D#\5\u01fc\u0206\3\2\2\2\u01fd"+
		"\u01fe\f\3\2\2\u01fe\u01ff\7J\2\2\u01ff\u0206\5D#\4\u0200\u0201\f\34\2"+
		"\2\u0201\u0202\7O\2\2\u0202\u0206\7U\2\2\u0203\u0204\f\32\2\2\u0204\u0206"+
		"\5D#\2\u0205\u01d8\3\2\2\2\u0205\u01db\3\2\2\2\u0205\u01de\3\2\2\2\u0205"+
		"\u01ee\3\2\2\2\u0205\u01f2\3\2\2\2\u0205\u01f6\3\2\2\2\u0205\u01fd\3\2"+
		"\2\2\u0205\u0200\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208E\3\2\2\2\u0209\u0207\3\2\2\2"+
		"\u020a\u020f\5H%\2\u020b\u020c\7(\2\2\u020c\u020e\5H%\2\u020d\u020b\3"+
		"\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"G\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7U\2\2\u0213\u0214\7-\2\2\u0214"+
		"\u0215\5D#\2\u0215I\3\2\2\2\u0216\u021b\5L\'\2\u0217\u0218\7(\2\2\u0218"+
		"\u021a\5L\'\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021cK\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f"+
		"\7U\2\2\u021f\u0220\7J\2\2\u0220\u0221\5D#\2\u0221M\3\2\2\2\u0222\u0223"+
		"\5P)\2\u0223\u0224\7>\2\2\u0224\u0227\5D#\2\u0225\u0226\7$\2\2\u0226\u0228"+
		"\5N(\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228O\3\2\2\2\u0229\u0244"+
		"\5h\65\2\u022a\u0244\7\25\2\2\u022b\u0237\7U\2\2\u022c\u022d\7.\2\2\u022d"+
		"\u0232\5R*\2\u022e\u022f\7(\2\2\u022f\u0231\5R*\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\24\2\2\u0236\u0238\3\2\2\2"+
		"\u0237\u022c\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0244\3\2\2\2\u0239\u023a"+
		"\7.\2\2\u023a\u023d\5P)\2\u023b\u023c\7(\2\2\u023c\u023e\5P)\2\u023d\u023b"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\7\24\2\2\u0242\u0244\3\2\2\2\u0243\u0229\3"+
		"\2\2\2\u0243\u022a\3\2\2\2\u0243\u022b\3\2\2\2\u0243\u0239\3\2\2\2\u0244"+
		"Q\3\2\2\2\u0245\u0246\7U\2\2\u0246\u0247\7\31\2\2\u0247\u0248\5P)\2\u0248"+
		"S\3\2\2\2\u0249\u024e\5V,\2\u024a\u024b\7(\2\2\u024b\u024d\5V,\2\u024c"+
		"\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024fU\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\5D#\2\u0252\u0253"+
		"\7-\2\2\u0253\u0254\5D#\2\u0254W\3\2\2\2\u0255\u025a\5Z.\2\u0256\u0257"+
		"\7(\2\2\u0257\u0259\5Z.\2\u0258\u0256\3\2\2\2\u0259\u025c\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bY\3\2\2\2\u025c\u025a\3\2\2\2"+
		"\u025d\u025e\5\\/\2\u025e\u025f\7-\2\2\u025f\u0260\5^\60\2\u0260[\3\2"+
		"\2\2\u0261\u0266\5`\61\2\u0262\u0263\7(\2\2\u0263\u0265\5`\61\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267]\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026c\5D#\2\u026a\u026c"+
		"\5\30\r\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c_\3\2\2\2\u026d"+
		"\u0279\7U\2\2\u026e\u026f\7.\2\2\u026f\u0272\5`\61\2\u0270\u0271\7(\2"+
		"\2\u0271\u0273\5`\61\2\u0272\u0270\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\7\24\2\2"+
		"\u0277\u0279\3\2\2\2\u0278\u026d\3\2\2\2\u0278\u026e\3\2\2\2\u0279a\3"+
		"\2\2\2\u027a\u027f\7U\2\2\u027b\u027c\7(\2\2\u027c\u027e\7U\2\2\u027d"+
		"\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280c\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0287\5D#\2\u0283\u0284"+
		"\7(\2\2\u0284\u0286\5D#\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288e\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028f\7U\2\2\u028b\u028c\7O\2\2\u028c\u028e\7U\2\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"g\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\t\17\2\2\u0293i\3\2\2\29nt{"+
		"\u0084\u0089\u008c\u008f\u0095\u00a0\u00a8\u00af\u00bb\u00c4\u00cb\u00e5"+
		"\u00ef\u00f1\u00f3\u00fc\u0108\u010e\u0119\u0123\u012f\u0134\u013d\u0144"+
		"\u0177\u0186\u0189\u019d\u01a3\u01b6\u01cb\u01d6\u01eb\u01f9\u0205\u0207"+
		"\u020f\u021b\u0227\u0232\u0237\u023f\u0243\u024e\u025a\u0266\u026b\u0274"+
		"\u0278\u027f\u0287\u028f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}