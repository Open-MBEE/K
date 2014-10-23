// Generated from ../grammar/Model.g4 by ANTLR 4.4
package k.frontend;
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
		T__3=74, T__2=75, T__1=76, T__0=77, SUCHTHAT=78, IntegerLiteral=79, FloatingPointLiteral=80, 
		BooleanLiteral=81, CharacterLiteral=82, StringLiteral=83, Identifier=84, 
		COMMENT=85, LINE_COMMENT=86, WS=87, SEP=88;
	public static final String[] tokenNames = {
		"<INVALID>", "'!isin'", "'isin'", "'fun'", "'Bool'", "'{'", "'&&'", "'..'", 
		"'='", "'^'", "'eq'", "'union'", "'implies'", "'('", "'package'", "'psubset'", 
		"','", "'gte'", "'Real'", "'var'", "'iff'", "'>='", "'++'", "'Unit'", 
		"'String'", "'<'", "'assert'", "']'", "'~'", "'<=>'", "'type'", "'{|'", 
		"'#'", "'lte'", "'Char'", "'then'", "'+'", "'subset'", "'gt'", "'/'", 
		"'of'", "'assoc'", "'create'", "'inter'", "'class'", "'\\'", "'||'", "'extends'", 
		"'}'", "'if'", "':='", "'?'", "'<='", "'|}'", "'req'", "'*'", "'exists'", 
		"'case'", "'->'", "'Int'", "':'", "'['", "'|'", "'val'", "'>'", "'_'", 
		"'forall'", "'or'", "'=>'", "'!'", "'lt'", "'%'", "'else'", "')'", "'and'", 
		"'not'", "'-'", "'import'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "Identifier", "COMMENT", 
		"LINE_COMMENT", "WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclaration = 1, RULE_packageDeclaration = 2, 
		RULE_importDeclaration = 3, RULE_classDeclaration = 4, RULE_classToken = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeBound = 8, RULE_valueParameters = 9, 
		RULE_typingList = 10, RULE_extending = 11, RULE_type = 12, RULE_expressionOrStar = 13, 
		RULE_typeArguments = 14, RULE_memberDeclaration = 15, RULE_valueDeclaration = 16, 
		RULE_sortDeclaration = 17, RULE_typeDeclaration = 18, RULE_variableDeclaration = 19, 
		RULE_typing = 20, RULE_functionDeclaration = 21, RULE_constraint = 22, 
		RULE_primitiveType = 23, RULE_tokenLessThan = 24, RULE_tokenGreatherThan = 25, 
		RULE_tokenLessThanEqual = 26, RULE_tokenGreaterThanEqual = 27, RULE_tokenAnd = 28, 
		RULE_tokenOr = 29, RULE_tokenNot = 30, RULE_tokenImplies = 31, RULE_tokenIFF = 32, 
		RULE_tokenEquals = 33, RULE_tokenStar = 34, RULE_tokenArrow = 35, RULE_expressionsWithSeparator = 36, 
		RULE_expression = 37, RULE_bracketedexpression = 38, RULE_classArgumentList = 39, 
		RULE_classArgument = 40, RULE_idValueList = 41, RULE_idValuePair = 42, 
		RULE_match = 43, RULE_matchPattern = 44, RULE_matchArgument = 45, RULE_mapPairList = 46, 
		RULE_mapPair = 47, RULE_rngBindingList = 48, RULE_rngBinding = 49, RULE_patternList = 50, 
		RULE_collectionOrType = 51, RULE_pattern = 52, RULE_identifierList = 53, 
		RULE_expressionList = 54, RULE_qualifiedName = 55, RULE_literal = 56;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "classToken", "typeParameters", "typeParameter", "typeBound", 
		"valueParameters", "typingList", "extending", "type", "expressionOrStar", 
		"typeArguments", "memberDeclaration", "valueDeclaration", "sortDeclaration", 
		"typeDeclaration", "variableDeclaration", "typing", "functionDeclaration", 
		"constraint", "primitiveType", "tokenLessThan", "tokenGreatherThan", "tokenLessThanEqual", 
		"tokenGreaterThanEqual", "tokenAnd", "tokenOr", "tokenNot", "tokenImplies", 
		"tokenIFF", "tokenEquals", "tokenStar", "tokenArrow", "expressionsWithSeparator", 
		"expression", "bracketedexpression", "classArgumentList", "classArgument", 
		"idValueList", "idValuePair", "match", "matchPattern", "matchArgument", 
		"mapPairList", "mapPair", "rngBindingList", "rngBinding", "patternList", 
		"collectionOrType", "pattern", "identifierList", "expressionList", "qualifiedName", 
		"literal"
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
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
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
		public TopDeclarationContext topDeclaration(int i) {
			return getRuleContext(TopDeclarationContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(114); packageDeclaration();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(117); importDeclaration();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__58) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__47) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__28) | (1L << T__23) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__14))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TopDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTopDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopDeclarationContext topDeclaration() throws RecognitionException {
		TopDeclarationContext _localctx = new TopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topDeclaration);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case T__74:
			case T__72:
			case T__64:
			case T__58:
			case T__52:
			case T__51:
			case T__49:
			case T__47:
			case T__35:
			case T__28:
			case T__23:
			case T__21:
			case T__20:
			case T__16:
			case T__14:
			case T__11:
			case T__8:
			case T__2:
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
			case T__36:
			case T__33:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(T__63);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(T__0);
			setState(139); qualifiedName();
			setState(142);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(140); match(SUCHTHAT);
				setState(141); match(T__22);
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
		public ClassTokenContext classToken() {
			return getRuleContext(ClassTokenContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); classToken();
			setState(145); match(Identifier);
			setState(147);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(146); typeParameters();
				}
			}

			setState(150);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(149); valueParameters();
				}
			}

			setState(153);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(152); extending();
				}
			}

			setState(155); match(T__72);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__58) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__47) | (1L << T__35) | (1L << T__28) | (1L << T__23) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__14))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(156); memberDeclaration();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTokenContext extends ParserRuleContext {
		public ClassTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classToken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTokenContext classToken() throws RecognitionException {
		ClassTokenContext _localctx = new ClassTokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__33) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__16);
			setState(167); typeParameter();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(168); match(T__61);
				setState(169); typeParameter();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(T__50);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(Identifier);
			setState(180);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(178); match(T__17);
				setState(179); typeBound();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); type(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(183); match(T__41);
				setState(184); type(0);
				}
				}
				setState(189);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitValueParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueParametersContext valueParameters() throws RecognitionException {
		ValueParametersContext _localctx = new ValueParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(T__64);
			setState(191); typingList();
			setState(192); match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypingList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypingListContext typingList() throws RecognitionException {
		TypingListContext _localctx = new TypingListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); typing();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(195); match(T__61);
				setState(196); typing();
				}
				}
				setState(201);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExtending(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendingContext extending() throws RecognitionException {
		ExtendingContext _localctx = new ExtendingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(T__30);
			setState(203); type(0);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(204); match(T__61);
				setState(205); type(0);
				}
				}
				setState(210);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeTypeContext extends TypeContext {
		public List<ExpressionOrStarContext> expressionOrStar() {
			return getRuleContexts(ExpressionOrStarContext.class);
		}
		public ExpressionOrStarContext expressionOrStar(int i) {
			return getRuleContext(ExpressionOrStarContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RangeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRangeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionalTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitOptionalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubTypeContext extends TypeContext {
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSubType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentTypeContext extends TypeContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SetTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTypeContext extends TypeContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TokenArrowContext tokenArrow() {
			return getRuleContext(TokenArrowContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public FuncTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianTypeContext extends TypeContext {
		public TokenStarContext tokenStar(int i) {
			return getRuleContext(TokenStarContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TokenStarContext> tokenStar() {
			return getRuleContexts(TokenStarContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public CartesianTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCartesianType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimTypeContext extends TypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPrimType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParenTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParenType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapTypeContext extends TypeContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public MapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			switch (_input.LA(1)) {
			case T__73:
			case T__59:
			case T__54:
			case T__53:
			case T__43:
			case T__18:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(212); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); qualifiedName();
				setState(215);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(214); typeArguments();
					}
					break;
				}
				}
				break;
			case T__64:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217); match(T__64);
				setState(218); type(0);
				setState(219); match(T__4);
				}
				break;
			case T__46:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221); match(T__46);
				setState(222); typing();
				setState(223); match(SUCHTHAT);
				setState(224); expression(0);
				setState(225); match(T__24);
				}
				break;
			case T__72:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); match(T__72);
				setState(228); type(0);
				setState(229); match(T__29);
				}
				break;
			case T__16:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); match(T__16);
				setState(232); type(0);
				setState(233); match(T__50);
				}
				break;
			case T__52:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235); match(T__52);
				setState(236); type(0);
				setState(237); match(T__61);
				setState(238); type(0);
				setState(239); match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(243);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(244); tokenArrow();
						setState(245); type(9);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(247);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(251); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(248); tokenStar();
								setState(249); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(253); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new RangeTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256); expressionOrStar();
						setState(259);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(257); match(T__70);
							setState(258); expressionOrStar();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(261);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(262); match(T__26);
						}
						break;
					}
					} 
				}
				setState(267);
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

	public static class ExpressionOrStarContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOrStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOrStar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpressionOrStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOrStarContext expressionOrStar() throws RecognitionException {
		ExpressionOrStarContext _localctx = new ExpressionOrStarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionOrStar);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__72:
			case T__64:
			case T__52:
			case T__51:
			case T__49:
			case T__35:
			case T__28:
			case T__21:
			case T__20:
			case T__16:
			case T__11:
			case T__8:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); expression(0);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(T__22);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(T__16);
			setState(273); type(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(274); match(T__61);
				setState(275); type(0);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(T__50);
			}
		}
		catch (RecognitionException re) {
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
		public SortDeclarationContext sortDeclaration() {
			return getRuleContext(SortDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ExpressionsWithSeparatorContext expressionsWithSeparator() {
			return getRuleContext(ExpressionsWithSeparatorContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(288); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289); expressionsWithSeparator();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(T__14);
			setState(293); typing();
			setState(296);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(294); match(T__69);
				setState(295); expression(0);
				}
			}

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

	public static class SortDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public SortDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSortDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortDeclarationContext sortDeclaration() throws RecognitionException {
		SortDeclarationContext _localctx = new SortDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(T__47);
			setState(301); match(Identifier);
			setState(302); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(T__47);
			setState(305); match(Identifier);
			setState(307);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(306); typeParameters();
				}
			}

			setState(309); match(T__69);
			setState(310); type(0);
			setState(311); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(T__58);
			setState(314); typing();
			setState(317);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(315); match(T__69);
				setState(316); expression(0);
				}
			}

			setState(319); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTyping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypingContext typing() throws RecognitionException {
		TypingContext _localctx = new TypingContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(Identifier);
			setState(322); match(T__17);
			setState(323); type(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public List<TypingListContext> typingList() {
			return getRuleContexts(TypingListContext.class);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(T__74);
			setState(326); match(Identifier);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327); match(T__64);
				setState(329);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(328); typingList();
					}
				}

				setState(331); match(T__4);
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__64 );
			{
			setState(336); match(T__17);
			setState(337); type(0);
			}
			setState(339); match(T__72);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__58) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__47) | (1L << T__35) | (1L << T__28) | (1L << T__23) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__14))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(340); memberDeclaration();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(T__29);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(T__23);
			setState(350);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(349); match(Identifier);
				}
			}

			setState(352); match(T__72);
			setState(353); expression(0);
			setState(354); match(T__29);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__43) | (1L << T__18))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenLessThanContext tokenLessThan() throws RecognitionException {
		TokenLessThanContext _localctx = new TokenLessThanContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__7) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenGreatherThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenGreatherThanContext tokenGreatherThan() throws RecognitionException {
		TokenGreatherThanContext _localctx = new TokenGreatherThanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__13) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenLessThanEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenLessThanEqualContext tokenLessThanEqual() throws RecognitionException {
		TokenLessThanEqualContext _localctx = new TokenLessThanEqualContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__25) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenGreaterThanEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenGreaterThanEqualContext tokenGreaterThanEqual() throws RecognitionException {
		TokenGreaterThanEqualContext _localctx = new TokenGreaterThanEqualContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==T__60 || _la==T__56) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenAndContext tokenAnd() throws RecognitionException {
		TokenAndContext _localctx = new TokenAndContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__3) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenOrContext tokenOr() throws RecognitionException {
		TokenOrContext _localctx = new TokenOrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__10) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenNotContext tokenNot() throws RecognitionException {
		TokenNotContext _localctx = new TokenNotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__2) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenImplies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenImpliesContext tokenImplies() throws RecognitionException {
		TokenImpliesContext _localctx = new TokenImpliesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__9) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenIFF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenIFFContext tokenIFF() throws RecognitionException {
		TokenIFFContext _localctx = new TokenIFFContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==T__57 || _la==T__48) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenEqualsContext tokenEquals() throws RecognitionException {
		TokenEqualsContext _localctx = new TokenEqualsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__67) ) {
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

	public static class TokenStarContext extends ParserRuleContext {
		public TokenStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenStar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenStarContext tokenStar() throws RecognitionException {
		TokenStarContext _localctx = new TokenStarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tokenStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenArrowContext extends ParserRuleContext {
		public TokenArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenArrow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenArrowContext tokenArrow() throws RecognitionException {
		TokenArrowContext _localctx = new TokenArrowContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tokenArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(T__19);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpressionsWithSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsWithSeparatorContext expressionsWithSeparator() throws RecognitionException {
		ExpressionsWithSeparatorContext _localctx = new ExpressionsWithSeparatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); expression(0);
			setState(383); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralExpContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExpressionContext {
		public TokenNotContext tokenNot() {
			return getRuleContext(TokenNotContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpressionContext {
		public TokenAndContext tokenAnd() {
			return getRuleContext(TokenAndContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExistsExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExistsExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetEnumExpContext extends ExpressionContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SetEnumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSetEnumExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp2ExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinOp2ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBinOp2Exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListEnumExpContext extends ExpressionContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListEnumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListEnumExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRngExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SetRngExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSetRngExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListRngExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListRngExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListRngExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TokenOrContext tokenOr() {
			return getRuleContext(TokenOrContext.class,0);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppExpContext extends ExpressionContext {
		public BracketedexpressionContext bracketedexpression() {
			return getRuleContext(BracketedexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AppExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAppExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IFFExpContext extends ExpressionContext {
		public TokenIFFContext tokenIFF() {
			return getRuleContext(TokenIFFContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TokenImpliesContext tokenImplies() {
			return getRuleContext(TokenImpliesContext.class,0);
		}
		public IFFExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIFFExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListCompExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapCompExpContext extends ExpressionContext {
		public MapPairContext mapPair() {
			return getRuleContext(MapPairContext.class,0);
		}
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCompExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SetCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSetCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssertExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedExpContext extends ExpressionContext {
		public BracketedexpressionContext bracketedexpression() {
			return getRuleContext(BracketedexpressionContext.class,0);
		}
		public BracketedExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBracketedExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLambdaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp1ExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinOp1ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBinOp1Exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitForallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp3ExpContext extends ExpressionContext {
		public TokenEqualsContext tokenEquals() {
			return getRuleContext(TokenEqualsContext.class,0);
		}
		public TokenGreatherThanContext tokenGreatherThan() {
			return getRuleContext(TokenGreatherThanContext.class,0);
		}
		public TokenLessThanEqualContext tokenLessThanEqual() {
			return getRuleContext(TokenLessThanEqualContext.class,0);
		}
		public TokenNotContext tokenNot() {
			return getRuleContext(TokenNotContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TokenGreaterThanEqualContext tokenGreaterThanEqual() {
			return getRuleContext(TokenGreaterThanEqualContext.class,0);
		}
		public TokenLessThanContext tokenLessThan() {
			return getRuleContext(TokenLessThanContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinOp3ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBinOp3Exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentExpContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapEnumExpContext extends ExpressionContext {
		public MapPairListContext mapPairList() {
			return getRuleContext(MapPairListContext.class,0);
		}
		public MapEnumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapEnumExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExpContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DotExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitDotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatchExpContext extends ExpressionContext {
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateExpContext extends ExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassArgumentListContext classArgumentList() {
			return getRuleContext(ClassArgumentListContext.class,0);
		}
		public CreateExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCreateExp(this);
			else return visitor.visitChildren(this);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(386); tokenNot();
				setState(387); expression(21);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389); match(T__11);
				setState(390); rngBindingList();
				setState(391); match(SUCHTHAT);
				setState(392); expression(20);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394); match(T__21);
				setState(395); rngBindingList();
				setState(396); match(SUCHTHAT);
				setState(397); expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399); match(T__49);
				setState(400); expression(2);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401); pattern();
				setState(404);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(402); match(T__17);
					setState(403); type(0);
					}
				}

				setState(406); match(T__19);
				setState(407); expression(1);
				}
				break;
			case 6:
				{
				_localctx = new BracketedExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409); bracketedexpression();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410); literal();
				}
				break;
			case 8:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411); match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new CreateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412); match(T__35);
				setState(413); qualifiedName();
				setState(419);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(414); match(T__64);
					setState(416);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(415); classArgumentList();
						}
					}

					setState(418); match(T__4);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421); match(T__28);
				setState(422); expression(0);
				setState(423); match(T__42);
				setState(424); expression(0);
				setState(425); match(T__5);
				setState(426); expression(0);
				}
				break;
			case 11:
				{
				_localctx = new MatchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428); match(T__20);
				setState(429); expression(0);
				setState(430); match(T__37);
				setState(431); match();
				}
				break;
			case 12:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433); match(T__72);
				setState(435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__72) | (1L << T__64) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__35) | (1L << T__28) | (1L << T__21) | (1L << T__20) | (1L << T__16))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(434); expressionList();
					}
				}

				setState(437); match(T__29);
				}
				break;
			case 13:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(438); match(T__72);
				setState(439); expression(0);
				setState(440); match(T__70);
				setState(441); expression(0);
				setState(442); match(T__29);
				}
				break;
			case 14:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(444); match(T__72);
				setState(445); expression(0);
				setState(446); match(T__15);
				setState(447); rngBindingList();
				setState(448); match(SUCHTHAT);
				setState(449); expression(0);
				setState(450); match(T__29);
				}
				break;
			case 15:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(452); match(T__16);
				setState(454);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__72) | (1L << T__64) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__35) | (1L << T__28) | (1L << T__21) | (1L << T__20) | (1L << T__16))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(453); expressionList();
					}
				}

				setState(456); match(T__50);
				}
				break;
			case 16:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(457); match(T__16);
				setState(458); expression(0);
				setState(459); match(T__70);
				setState(460); expression(0);
				setState(461); match(T__50);
				}
				break;
			case 17:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463); match(T__16);
				setState(464); expression(0);
				setState(465); match(T__15);
				setState(466); pattern();
				setState(467); match(T__17);
				setState(468); expression(0);
				setState(469); match(SUCHTHAT);
				setState(470); expression(0);
				setState(471); match(T__50);
				}
				break;
			case 18:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473); match(T__52);
				setState(475);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__72) | (1L << T__64) | (1L << T__52) | (1L << T__51) | (1L << T__49) | (1L << T__35) | (1L << T__28) | (1L << T__21) | (1L << T__20) | (1L << T__16))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__11 - 66)) | (1L << (T__8 - 66)) | (1L << (T__2 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(474); mapPairList();
					}
				}

				setState(477); match(T__13);
				}
				break;
			case 19:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(478); match(T__52);
				setState(479); mapPair();
				setState(480); match(T__15);
				setState(481); rngBindingList();
				setState(482); match(SUCHTHAT);
				setState(483); expression(0);
				setState(484); match(T__13);
				}
				break;
			case 20:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(486); match(T__51);
				setState(487); match(T__64);
				setState(488); expression(0);
				setState(489); match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(538);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(494);
						_la = _input.LA(1);
						if ( !(((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__68 - 9)) | (1L << (T__55 - 9)) | (1L << (T__45 - 9)) | (1L << (T__38 - 9)) | (1L << (T__34 - 9)) | (1L << (T__32 - 9)) | (1L << (T__22 - 9)) | (1L << (T__6 - 9)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(495); expression(11);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(497);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__41 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(498); expression(10);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(512);
						switch (_input.LA(1)) {
						case T__44:
						case T__25:
							{
							setState(500); tokenLessThanEqual();
							}
							break;
						case T__60:
						case T__56:
							{
							setState(501); tokenGreaterThanEqual();
							}
							break;
						case T__52:
						case T__7:
							{
							setState(502); tokenLessThan();
							}
							break;
						case T__39:
						case T__13:
							{
							setState(503); tokenGreatherThan();
							}
							break;
						case T__69:
						case T__67:
							{
							setState(504); tokenEquals();
							}
							break;
						case T__8:
						case T__2:
							{
							setState(505); tokenNot();
							setState(506); tokenEquals();
							}
							break;
						case T__75:
							{
							setState(508); match(T__75);
							}
							break;
						case T__76:
							{
							setState(509); match(T__76);
							}
							break;
						case T__40:
							{
							setState(510); match(T__40);
							}
							break;
						case T__62:
							{
							setState(511); match(T__62);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(514); expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(515);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(516); tokenAnd();
						setState(517); expression(8);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(520); tokenOr();
						setState(521); expression(7);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(526);
						switch (_input.LA(1)) {
						case T__65:
						case T__9:
							{
							setState(524); tokenImplies();
							}
							break;
						case T__57:
						case T__48:
							{
							setState(525); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(528); expression(6);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(530);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(531); match(T__27);
						setState(532); expression(5);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(534); match(SUCHTHAT);
						setState(535); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(536);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(537); bracketedexpression();
						}
						break;
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class BracketedexpressionContext extends ParserRuleContext {
		public BracketedexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedexpression; }
	 
		public BracketedexpressionContext() { }
		public void copyFrom(BracketedexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenExpContext extends BracketedexpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpContext(BracketedexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExpContext extends BracketedexpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TupleExpContext(BracketedexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTupleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketedexpressionContext bracketedexpression() throws RecognitionException {
		BracketedexpressionContext _localctx = new BracketedexpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bracketedexpression);
		int _la;
		try {
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(543); match(T__64);
				setState(544); expression(0);
				setState(545); match(T__4);
				}
				break;
			case 2:
				_localctx = new TupleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(547); match(T__64);
				setState(548); expression(0);
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(549); match(T__61);
					setState(550); expression(0);
					}
					}
					setState(553); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__61 );
				setState(555); match(T__4);
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

	public static class ClassArgumentListContext extends ParserRuleContext {
		public ClassArgumentContext classArgument(int i) {
			return getRuleContext(ClassArgumentContext.class,i);
		}
		public List<ClassArgumentContext> classArgument() {
			return getRuleContexts(ClassArgumentContext.class);
		}
		public ClassArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgumentListContext classArgumentList() throws RecognitionException {
		ClassArgumentListContext _localctx = new ClassArgumentListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); classArgument();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(560); match(T__61);
				setState(561); classArgument();
				}
				}
				setState(566);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgumentContext classArgument() throws RecognitionException {
		ClassArgumentContext _localctx = new ClassArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(Identifier);
			setState(568); match(T__17);
			setState(569); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public List<IdValuePairContext> idValuePair() {
			return getRuleContexts(IdValuePairContext.class);
		}
		public IdValuePairContext idValuePair(int i) {
			return getRuleContext(IdValuePairContext.class,i);
		}
		public IdValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idValueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdValueListContext idValueList() throws RecognitionException {
		IdValueListContext _localctx = new IdValueListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); idValuePair();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(572); match(T__61);
				setState(573); idValuePair();
				}
				}
				setState(578);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdValuePairContext idValuePair() throws RecognitionException {
		IdValuePairContext _localctx = new IdValuePairContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(Identifier);
			setState(580); match(T__27);
			setState(581); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); matchPattern();
			setState(584); match(T__9);
			setState(585); expression(0);
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(586); match(T__15);
				setState(587); match();
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public MatchPatternContext matchPattern(int i) {
			return getRuleContext(MatchPatternContext.class,i);
		}
		public List<MatchPatternContext> matchPattern() {
			return getRuleContexts(MatchPatternContext.class);
		}
		public List<MatchArgumentContext> matchArgument() {
			return getRuleContexts(MatchArgumentContext.class);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MatchArgumentContext matchArgument(int i) {
			return getRuleContext(MatchArgumentContext.class,i);
		}
		public MatchPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchPattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchPatternContext matchPattern() throws RecognitionException {
		MatchPatternContext _localctx = new MatchPatternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_matchPattern);
		int _la;
		try {
			setState(616);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(590); literal();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(591); match(T__12);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(592); match(Identifier);
				setState(604);
				_la = _input.LA(1);
				if (_la==T__64) {
					{
					setState(593); match(T__64);
					setState(594); matchArgument();
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__61) {
						{
						{
						setState(595); match(T__61);
						setState(596); matchArgument();
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602); match(T__4);
					}
				}

				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 4);
				{
				setState(606); match(T__64);
				setState(607); matchPattern();
				setState(610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(608); match(T__61);
					setState(609); matchPattern();
					}
					}
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__61 );
				setState(614); match(T__4);
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public MatchPatternContext matchPattern() {
			return getRuleContext(MatchPatternContext.class,0);
		}
		public MatchArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArgumentContext matchArgument() throws RecognitionException {
		MatchArgumentContext _localctx = new MatchArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); match(Identifier);
			setState(619); match(T__69);
			setState(620); matchPattern();
			}
		}
		catch (RecognitionException re) {
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
		public List<MapPairContext> mapPair() {
			return getRuleContexts(MapPairContext.class);
		}
		public MapPairContext mapPair(int i) {
			return getRuleContext(MapPairContext.class,i);
		}
		public MapPairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPairList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapPairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairListContext mapPairList() throws RecognitionException {
		MapPairListContext _localctx = new MapPairListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); mapPair();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(623); match(T__61);
				setState(624); mapPair();
				}
				}
				setState(629);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairContext mapPair() throws RecognitionException {
		MapPairContext _localctx = new MapPairContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); expression(0);
			setState(631); match(T__17);
			setState(632); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRngBindingList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RngBindingListContext rngBindingList() throws RecognitionException {
		RngBindingListContext _localctx = new RngBindingListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); rngBinding();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(635); match(T__61);
				setState(636); rngBinding();
				}
				}
				setState(641);
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
		public PatternListContext patternList() {
			return getRuleContext(PatternListContext.class,0);
		}
		public CollectionOrTypeContext collectionOrType() {
			return getRuleContext(CollectionOrTypeContext.class,0);
		}
		public RngBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rngBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRngBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RngBindingContext rngBinding() throws RecognitionException {
		RngBindingContext _localctx = new RngBindingContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); patternList();
			setState(643); match(T__17);
			setState(644); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); pattern();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(647); match(T__61);
				setState(648); pattern();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCollectionOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionOrTypeContext collectionOrType() throws RecognitionException {
		CollectionOrTypeContext _localctx = new CollectionOrTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_collectionOrType);
		try {
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655); type(0);
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
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentPatternContext extends PatternContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianPatternContext extends PatternContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public CartesianPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCartesianPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pattern);
		int _la;
		try {
			setState(669);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(658); match(Identifier);
				}
				break;
			case T__64:
				_localctx = new CartesianPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659); match(T__64);
				setState(660); pattern();
				setState(663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(661); match(T__61);
					setState(662); pattern();
					}
					}
					setState(665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__61 );
				setState(667); match(T__4);
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
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); match(Identifier);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(672); match(T__61);
				setState(673); match(Identifier);
				}
				}
				setState(678);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); expression(0);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61) {
				{
				{
				setState(680); match(T__61);
				setState(681); expression(0);
				}
				}
				setState(686);
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
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(687); match(Identifier);
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(688); match(SUCHTHAT);
					setState(689); match(Identifier);
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public TerminalNode StringLiteral() { return getToken(ModelParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ModelParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ModelParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ModelParser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)))) != 0)) ) {
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
		case 12: return type_sempred((TypeContext)_localctx, predIndex);
		case 37: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 10);
		case 5: return precpred(_ctx, 9);
		case 6: return precpred(_ctx, 8);
		case 7: return precpred(_ctx, 7);
		case 8: return precpred(_ctx, 6);
		case 9: return precpred(_ctx, 5);
		case 10: return precpred(_ctx, 4);
		case 11: return precpred(_ctx, 26);
		case 12: return precpred(_ctx, 24);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 2);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Z\u02bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\5\2v\n\2\3\2\7"+
		"\2y\n\2\f\2\16\2|\13\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\3\2\3\2\3\3"+
		"\3\3\5\3\u0088\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3"+
		"\6\5\6\u0096\n\6\3\6\5\6\u0099\n\6\3\6\5\6\u009c\n\6\3\6\3\6\7\6\u00a0"+
		"\n\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00ad\n\b"+
		"\f\b\16\b\u00b0\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\7\n"+
		"\u00bc\n\n\f\n\16\n\u00bf\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c8"+
		"\n\f\f\f\16\f\u00cb\13\f\3\r\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4"+
		"\13\r\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\6\16\u00fe\n\16\r\16\16\16\u00ff\3\16\3\16\3\16\3\16\5\16\u0106"+
		"\n\16\3\16\3\16\7\16\u010a\n\16\f\16\16\16\u010d\13\16\3\17\3\17\5\17"+
		"\u0111\n\17\3\20\3\20\3\20\3\20\7\20\u0117\n\20\f\20\16\20\u011a\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0125\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u012b\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\5\24\u0136\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0140\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u014c\n\27"+
		"\3\27\6\27\u014f\n\27\r\27\16\27\u0150\3\27\3\27\3\27\3\27\3\27\7\27\u0158"+
		"\n\27\f\27\16\27\u015b\13\27\3\27\3\27\3\30\3\30\5\30\u0161\n\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0197\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a3\n\'\3\'"+
		"\5\'\u01a6\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u01b6\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u01c9\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01de\n\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ee\n\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0203\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0211\n\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u021d\n\'\f\'\16\'\u0220\13\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\6(\u022a\n(\r(\16(\u022b\3(\3(\5(\u0230\n(\3)\3)\3)\7"+
		")\u0235\n)\f)\16)\u0238\13)\3*\3*\3*\3*\3+\3+\3+\7+\u0241\n+\f+\16+\u0244"+
		"\13+\3,\3,\3,\3,\3-\3-\3-\3-\3-\5-\u024f\n-\3.\3.\3.\3.\3.\3.\3.\7.\u0258"+
		"\n.\f.\16.\u025b\13.\3.\3.\5.\u025f\n.\3.\3.\3.\3.\6.\u0265\n.\r.\16."+
		"\u0266\3.\3.\5.\u026b\n.\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u0274\n\60\f"+
		"\60\16\60\u0277\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0280\n"+
		"\62\f\62\16\62\u0283\13\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u028c"+
		"\n\64\f\64\16\64\u028f\13\64\3\65\3\65\5\65\u0293\n\65\3\66\3\66\3\66"+
		"\3\66\3\66\6\66\u029a\n\66\r\66\16\66\u029b\3\66\3\66\5\66\u02a0\n\66"+
		"\3\67\3\67\3\67\7\67\u02a5\n\67\f\67\16\67\u02a8\13\67\38\38\38\78\u02ad"+
		"\n8\f8\168\u02b0\138\39\39\39\79\u02b5\n9\f9\169\u02b8\139\3:\3:\3:\2"+
		"\4\32L;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\21\4\2++..\7\2\6\6\24\24\31\32$$==\4\2"+
		"\33\33HH\4\2((BB\4\2##\66\66\4\2\23\23\27\27\4\2\b\bLL\4\2\60\60EE\4\2"+
		"GGMM\4\2\16\16FF\4\2\26\26\37\37\4\2\n\n\f\f\n\2\13\13\30\30\"\"))--/"+
		"/99II\5\2\r\r&&NN\3\2QU\u02ec\2u\3\2\2\2\4\u0087\3\2\2\2\6\u0089\3\2\2"+
		"\2\b\u008c\3\2\2\2\n\u0092\3\2\2\2\f\u00a6\3\2\2\2\16\u00a8\3\2\2\2\20"+
		"\u00b3\3\2\2\2\22\u00b8\3\2\2\2\24\u00c0\3\2\2\2\26\u00c4\3\2\2\2\30\u00cc"+
		"\3\2\2\2\32\u00f3\3\2\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2\2 \u0124\3\2"+
		"\2\2\"\u0126\3\2\2\2$\u012e\3\2\2\2&\u0132\3\2\2\2(\u013b\3\2\2\2*\u0143"+
		"\3\2\2\2,\u0147\3\2\2\2.\u015e\3\2\2\2\60\u0166\3\2\2\2\62\u0168\3\2\2"+
		"\2\64\u016a\3\2\2\2\66\u016c\3\2\2\28\u016e\3\2\2\2:\u0170\3\2\2\2<\u0172"+
		"\3\2\2\2>\u0174\3\2\2\2@\u0176\3\2\2\2B\u0178\3\2\2\2D\u017a\3\2\2\2F"+
		"\u017c\3\2\2\2H\u017e\3\2\2\2J\u0180\3\2\2\2L\u01ed\3\2\2\2N\u022f\3\2"+
		"\2\2P\u0231\3\2\2\2R\u0239\3\2\2\2T\u023d\3\2\2\2V\u0245\3\2\2\2X\u0249"+
		"\3\2\2\2Z\u026a\3\2\2\2\\\u026c\3\2\2\2^\u0270\3\2\2\2`\u0278\3\2\2\2"+
		"b\u027c\3\2\2\2d\u0284\3\2\2\2f\u0288\3\2\2\2h\u0292\3\2\2\2j\u029f\3"+
		"\2\2\2l\u02a1\3\2\2\2n\u02a9\3\2\2\2p\u02b1\3\2\2\2r\u02b9\3\2\2\2tv\5"+
		"\6\4\2ut\3\2\2\2uv\3\2\2\2vz\3\2\2\2wy\5\b\5\2xw\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{\u0080\3\2\2\2|z\3\2\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\7\2\2\3\u0084\3\3\2\2\2\u0085\u0088\5 \21\2"+
		"\u0086\u0088\5\n\6\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\5\3"+
		"\2\2\2\u0089\u008a\7\20\2\2\u008a\u008b\5p9\2\u008b\7\3\2\2\2\u008c\u008d"+
		"\7O\2\2\u008d\u0090\5p9\2\u008e\u008f\7P\2\2\u008f\u0091\79\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\5\f\7\2"+
		"\u0093\u0095\7V\2\2\u0094\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\24\13\2\u0098\u0097\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5\30\r\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\7\7\2\2\u009e"+
		"\u00a0\5 \21\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7\62\2\2\u00a5\13\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7\r\3\2\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\u00ae\5\20\t\2\u00aa\u00ab\7\22\2\2\u00ab\u00ad\5"+
		"\20\t\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\35"+
		"\2\2\u00b2\17\3\2\2\2\u00b3\u00b6\7V\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b7"+
		"\5\22\n\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\21\3\2\2\2\u00b8"+
		"\u00bd\5\32\16\2\u00b9\u00ba\7&\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\23\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\5\26"+
		"\f\2\u00c2\u00c3\7K\2\2\u00c3\25\3\2\2\2\u00c4\u00c9\5*\26\2\u00c5\u00c6"+
		"\7\22\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00d2\5\32\16\2\u00ce\u00cf\7\22\2"+
		"\2\u00cf\u00d1\5\32\16\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2\3\2\2"+
		"\2\u00d5\u00d6\b\16\1\2\u00d6\u00f4\5\60\31\2\u00d7\u00d9\5p9\2\u00d8"+
		"\u00da\5\36\20\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00f4\3"+
		"\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7K\2\2\u00de"+
		"\u00f4\3\2\2\2\u00df\u00e0\7!\2\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\7P\2"+
		"\2\u00e2\u00e3\5L\'\2\u00e3\u00e4\7\67\2\2\u00e4\u00f4\3\2\2\2\u00e5\u00e6"+
		"\7\7\2\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\7\62\2\2\u00e8\u00f4\3\2\2"+
		"\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\35\2\2\u00ec"+
		"\u00f4\3\2\2\2\u00ed\u00ee\7\33\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0"+
		"\7\22\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\7B\2\2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00d5\3\2\2\2\u00f3\u00d7\3\2\2\2\u00f3\u00db\3\2\2\2\u00f3\u00df"+
		"\3\2\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4"+
		"\u010b\3\2\2\2\u00f5\u00f6\f\n\2\2\u00f6\u00f7\5H%\2\u00f7\u00f8\5\32"+
		"\16\13\u00f8\u010a\3\2\2\2\u00f9\u00fd\f\13\2\2\u00fa\u00fb\5F$\2\u00fb"+
		"\u00fc\5\32\16\2\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u010a\3\2\2\2\u0101"+
		"\u0102\f\4\2\2\u0102\u0105\5\34\17\2\u0103\u0104\7\t\2\2\u0104\u0106\5"+
		"\34\17\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107"+
		"\u0108\f\3\2\2\u0108\u010a\7\65\2\2\u0109\u00f5\3\2\2\2\u0109\u00f9\3"+
		"\2\2\2\u0109\u0101\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\33\3\2\2\2\u010d\u010b\3\2\2"+
		"\2\u010e\u0111\5L\'\2\u010f\u0111\79\2\2\u0110\u010e\3\2\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\35\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0118\5\32\16\2\u0114"+
		"\u0115\7\22\2\2\u0115\u0117\5\32\16\2\u0116\u0114\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\7\35\2\2\u011c\37\3\2\2\2\u011d\u0125\5$\23"+
		"\2\u011e\u0125\5&\24\2\u011f\u0125\5\"\22\2\u0120\u0125\5(\25\2\u0121"+
		"\u0125\5,\27\2\u0122\u0125\5.\30\2\u0123\u0125\5J&\2\u0124\u011d\3\2\2"+
		"\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125!\3\2\2\2\u0126"+
		"\u0127\7A\2\2\u0127\u012a\5*\26\2\u0128\u0129\7\n\2\2\u0129\u012b\5L\'"+
		"\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\7Z\2\2\u012d#\3\2\2\2\u012e\u012f\7 \2\2\u012f\u0130\7V\2\2\u0130\u0131"+
		"\7Z\2\2\u0131%\3\2\2\2\u0132\u0133\7 \2\2\u0133\u0135\7V\2\2\u0134\u0136"+
		"\5\16\b\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\7\n\2\2\u0138\u0139\5\32\16\2\u0139\u013a\7Z\2\2\u013a\'"+
		"\3\2\2\2\u013b\u013c\7\25\2\2\u013c\u013f\5*\26\2\u013d\u013e\7\n\2\2"+
		"\u013e\u0140\5L\'\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\7Z\2\2\u0142)\3\2\2\2\u0143\u0144\7V\2\2\u0144\u0145"+
		"\7>\2\2\u0145\u0146\5\32\16\2\u0146+\3\2\2\2\u0147\u0148\7\5\2\2\u0148"+
		"\u014e\7V\2\2\u0149\u014b\7\17\2\2\u014a\u014c\5\26\f\2\u014b\u014a\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\7K\2\2\u014e"+
		"\u0149\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7>\2\2\u0153\u0154\5\32\16\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0159\7\7\2\2\u0156\u0158\5 \21\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\62\2\2\u015d-\3\2\2\2"+
		"\u015e\u0160\78\2\2\u015f\u0161\7V\2\2\u0160\u015f\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\7\2\2\u0163\u0164\5L\'\2\u0164"+
		"\u0165\7\62\2\2\u0165/\3\2\2\2\u0166\u0167\t\3\2\2\u0167\61\3\2\2\2\u0168"+
		"\u0169\t\4\2\2\u0169\63\3\2\2\2\u016a\u016b\t\5\2\2\u016b\65\3\2\2\2\u016c"+
		"\u016d\t\6\2\2\u016d\67\3\2\2\2\u016e\u016f\t\7\2\2\u016f9\3\2\2\2\u0170"+
		"\u0171\t\b\2\2\u0171;\3\2\2\2\u0172\u0173\t\t\2\2\u0173=\3\2\2\2\u0174"+
		"\u0175\t\n\2\2\u0175?\3\2\2\2\u0176\u0177\t\13\2\2\u0177A\3\2\2\2\u0178"+
		"\u0179\t\f\2\2\u0179C\3\2\2\2\u017a\u017b\t\r\2\2\u017bE\3\2\2\2\u017c"+
		"\u017d\79\2\2\u017dG\3\2\2\2\u017e\u017f\7<\2\2\u017fI\3\2\2\2\u0180\u0181"+
		"\5L\'\2\u0181\u0182\7Z\2\2\u0182K\3\2\2\2\u0183\u0184\b\'\1\2\u0184\u0185"+
		"\5> \2\u0185\u0186\5L\'\27\u0186\u01ee\3\2\2\2\u0187\u0188\7D\2\2\u0188"+
		"\u0189\5b\62\2\u0189\u018a\7P\2\2\u018a\u018b\5L\'\26\u018b\u01ee\3\2"+
		"\2\2\u018c\u018d\7:\2\2\u018d\u018e\5b\62\2\u018e\u018f\7P\2\2\u018f\u0190"+
		"\5L\'\25\u0190\u01ee\3\2\2\2\u0191\u0192\7\36\2\2\u0192\u01ee\5L\'\4\u0193"+
		"\u0196\5j\66\2\u0194\u0195\7>\2\2\u0195\u0197\5\32\16\2\u0196\u0194\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7<\2\2\u0199"+
		"\u019a\5L\'\3\u019a\u01ee\3\2\2\2\u019b\u01ee\5N(\2\u019c\u01ee\5r:\2"+
		"\u019d\u01ee\7V\2\2\u019e\u019f\7,\2\2\u019f\u01a5\5p9\2\u01a0\u01a2\7"+
		"\17\2\2\u01a1\u01a3\5P)\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\7K\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01ee\3\2\2\2\u01a7\u01a8\7\63\2\2\u01a8\u01a9\5L\'\2\u01a9"+
		"\u01aa\7%\2\2\u01aa\u01ab\5L\'\2\u01ab\u01ac\7J\2\2\u01ac\u01ad\5L\'\2"+
		"\u01ad\u01ee\3\2\2\2\u01ae\u01af\7;\2\2\u01af\u01b0\5L\'\2\u01b0\u01b1"+
		"\7*\2\2\u01b1\u01b2\5X-\2\u01b2\u01ee\3\2\2\2\u01b3\u01b5\7\7\2\2\u01b4"+
		"\u01b6\5n8\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2"+
		"\2\u01b7\u01ee\7\62\2\2\u01b8\u01b9\7\7\2\2\u01b9\u01ba\5L\'\2\u01ba\u01bb"+
		"\7\t\2\2\u01bb\u01bc\5L\'\2\u01bc\u01bd\7\62\2\2\u01bd\u01ee\3\2\2\2\u01be"+
		"\u01bf\7\7\2\2\u01bf\u01c0\5L\'\2\u01c0\u01c1\7@\2\2\u01c1\u01c2\5b\62"+
		"\2\u01c2\u01c3\7P\2\2\u01c3\u01c4\5L\'\2\u01c4\u01c5\7\62\2\2\u01c5\u01ee"+
		"\3\2\2\2\u01c6\u01c8\7?\2\2\u01c7\u01c9\5n8\2\u01c8\u01c7\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01ee\7\35\2\2\u01cb\u01cc\7"+
		"?\2\2\u01cc\u01cd\5L\'\2\u01cd\u01ce\7\t\2\2\u01ce\u01cf\5L\'\2\u01cf"+
		"\u01d0\7\35\2\2\u01d0\u01ee\3\2\2\2\u01d1\u01d2\7?\2\2\u01d2\u01d3\5L"+
		"\'\2\u01d3\u01d4\7@\2\2\u01d4\u01d5\5j\66\2\u01d5\u01d6\7>\2\2\u01d6\u01d7"+
		"\5L\'\2\u01d7\u01d8\7P\2\2\u01d8\u01d9\5L\'\2\u01d9\u01da\7\35\2\2\u01da"+
		"\u01ee\3\2\2\2\u01db\u01dd\7\33\2\2\u01dc\u01de\5^\60\2\u01dd\u01dc\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01ee\7B\2\2\u01e0"+
		"\u01e1\7\33\2\2\u01e1\u01e2\5`\61\2\u01e2\u01e3\7@\2\2\u01e3\u01e4\5b"+
		"\62\2\u01e4\u01e5\7P\2\2\u01e5\u01e6\5L\'\2\u01e6\u01e7\7B\2\2\u01e7\u01ee"+
		"\3\2\2\2\u01e8\u01e9\7\34\2\2\u01e9\u01ea\7\17\2\2\u01ea\u01eb\5L\'\2"+
		"\u01eb\u01ec\7K\2\2\u01ec\u01ee\3\2\2\2\u01ed\u0183\3\2\2\2\u01ed\u0187"+
		"\3\2\2\2\u01ed\u018c\3\2\2\2\u01ed\u0191\3\2\2\2\u01ed\u0193\3\2\2\2\u01ed"+
		"\u019b\3\2\2\2\u01ed\u019c\3\2\2\2\u01ed\u019d\3\2\2\2\u01ed\u019e\3\2"+
		"\2\2\u01ed\u01a7\3\2\2\2\u01ed\u01ae\3\2\2\2\u01ed\u01b3\3\2\2\2\u01ed"+
		"\u01b8\3\2\2\2\u01ed\u01be\3\2\2\2\u01ed\u01c6\3\2\2\2\u01ed\u01cb\3\2"+
		"\2\2\u01ed\u01d1\3\2\2\2\u01ed\u01db\3\2\2\2\u01ed\u01e0\3\2\2\2\u01ed"+
		"\u01e8\3\2\2\2\u01ee\u021e\3\2\2\2\u01ef\u01f0\f\f\2\2\u01f0\u01f1\t\16"+
		"\2\2\u01f1\u021d\5L\'\r\u01f2\u01f3\f\13\2\2\u01f3\u01f4\t\17\2\2\u01f4"+
		"\u021d\5L\'\f\u01f5\u0202\f\n\2\2\u01f6\u0203\5\66\34\2\u01f7\u0203\5"+
		"8\35\2\u01f8\u0203\5\62\32\2\u01f9\u0203\5\64\33\2\u01fa\u0203\5D#\2\u01fb"+
		"\u01fc\5> \2\u01fc\u01fd\5D#\2\u01fd\u0203\3\2\2\2\u01fe\u0203\7\4\2\2"+
		"\u01ff\u0203\7\3\2\2\u0200\u0203\7\'\2\2\u0201\u0203\7\21\2\2\u0202\u01f6"+
		"\3\2\2\2\u0202\u01f7\3\2\2\2\u0202\u01f8\3\2\2\2\u0202\u01f9\3\2\2\2\u0202"+
		"\u01fa\3\2\2\2\u0202\u01fb\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u021d\5L\'\13\u0205\u0206\f\t\2\2\u0206\u0207\5:\36\2\u0207\u0208\5L"+
		"\'\n\u0208\u021d\3\2\2\2\u0209\u020a\f\b\2\2\u020a\u020b\5<\37\2\u020b"+
		"\u020c\5L\'\t\u020c\u021d\3\2\2\2\u020d\u0210\f\7\2\2\u020e\u0211\5@!"+
		"\2\u020f\u0211\5B\"\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\5L\'\b\u0213\u021d\3\2\2\2\u0214\u0215\f\6\2\2\u0215"+
		"\u0216\7\64\2\2\u0216\u021d\5L\'\7\u0217\u0218\f\34\2\2\u0218\u0219\7"+
		"P\2\2\u0219\u021d\7V\2\2\u021a\u021b\f\32\2\2\u021b\u021d\5N(\2\u021c"+
		"\u01ef\3\2\2\2\u021c\u01f2\3\2\2\2\u021c\u01f5\3\2\2\2\u021c\u0205\3\2"+
		"\2\2\u021c\u0209\3\2\2\2\u021c\u020d\3\2\2\2\u021c\u0214\3\2\2\2\u021c"+
		"\u0217\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021fM\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222"+
		"\7\17\2\2\u0222\u0223\5L\'\2\u0223\u0224\7K\2\2\u0224\u0230\3\2\2\2\u0225"+
		"\u0226\7\17\2\2\u0226\u0229\5L\'\2\u0227\u0228\7\22\2\2\u0228\u022a\5"+
		"L\'\2\u0229\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7K\2\2\u022e\u0230\3\2"+
		"\2\2\u022f\u0221\3\2\2\2\u022f\u0225\3\2\2\2\u0230O\3\2\2\2\u0231\u0236"+
		"\5R*\2\u0232\u0233\7\22\2\2\u0233\u0235\5R*\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237Q\3\2\2\2"+
		"\u0238\u0236\3\2\2\2\u0239\u023a\7V\2\2\u023a\u023b\7>\2\2\u023b\u023c"+
		"\5L\'\2\u023cS\3\2\2\2\u023d\u0242\5V,\2\u023e\u023f\7\22\2\2\u023f\u0241"+
		"\5V,\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243U\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7V\2\2\u0246"+
		"\u0247\7\64\2\2\u0247\u0248\5L\'\2\u0248W\3\2\2\2\u0249\u024a\5Z.\2\u024a"+
		"\u024b\7F\2\2\u024b\u024e\5L\'\2\u024c\u024d\7@\2\2\u024d\u024f\5X-\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fY\3\2\2\2\u0250\u026b\5"+
		"r:\2\u0251\u026b\7C\2\2\u0252\u025e\7V\2\2\u0253\u0254\7\17\2\2\u0254"+
		"\u0259\5\\/\2\u0255\u0256\7\22\2\2\u0256\u0258\5\\/\2\u0257\u0255\3\2"+
		"\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\7K\2\2\u025d\u025f\3\2"+
		"\2\2\u025e\u0253\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u026b\3\2\2\2\u0260"+
		"\u0261\7\17\2\2\u0261\u0264\5Z.\2\u0262\u0263\7\22\2\2\u0263\u0265\5Z"+
		".\2\u0264\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7K\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0250\3\2\2\2\u026a\u0251\3\2\2\2\u026a\u0252\3\2\2\2\u026a"+
		"\u0260\3\2\2\2\u026b[\3\2\2\2\u026c\u026d\7V\2\2\u026d\u026e\7\n\2\2\u026e"+
		"\u026f\5Z.\2\u026f]\3\2\2\2\u0270\u0275\5`\61\2\u0271\u0272\7\22\2\2\u0272"+
		"\u0274\5`\61\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276_\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279"+
		"\5L\'\2\u0279\u027a\7>\2\2\u027a\u027b\5L\'\2\u027ba\3\2\2\2\u027c\u0281"+
		"\5d\63\2\u027d\u027e\7\22\2\2\u027e\u0280\5d\63\2\u027f\u027d\3\2\2\2"+
		"\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282c\3"+
		"\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\5f\64\2\u0285\u0286\7>\2\2\u0286"+
		"\u0287\5h\65\2\u0287e\3\2\2\2\u0288\u028d\5j\66\2\u0289\u028a\7\22\2\2"+
		"\u028a\u028c\5j\66\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028eg\3\2\2\2\u028f\u028d\3\2\2\2\u0290"+
		"\u0293\5L\'\2\u0291\u0293\5\32\16\2\u0292\u0290\3\2\2\2\u0292\u0291\3"+
		"\2\2\2\u0293i\3\2\2\2\u0294\u02a0\7V\2\2\u0295\u0296\7\17\2\2\u0296\u0299"+
		"\5j\66\2\u0297\u0298\7\22\2\2\u0298\u029a\5j\66\2\u0299\u0297\3\2\2\2"+
		"\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d"+
		"\3\2\2\2\u029d\u029e\7K\2\2\u029e\u02a0\3\2\2\2\u029f\u0294\3\2\2\2\u029f"+
		"\u0295\3\2\2\2\u02a0k\3\2\2\2\u02a1\u02a6\7V\2\2\u02a2\u02a3\7\22\2\2"+
		"\u02a3\u02a5\7V\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7m\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02ae\5L\'\2\u02aa\u02ab\7\22\2\2\u02ab\u02ad\5L\'\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"o\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b6\7V\2\2\u02b2\u02b3\7P\2\2\u02b3"+
		"\u02b5\7V\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7q\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba"+
		"\t\20\2\2\u02bas\3\2\2\2=uz\u0080\u0087\u0090\u0095\u0098\u009b\u00a1"+
		"\u00ae\u00b6\u00bd\u00c9\u00d2\u00d9\u00f3\u00ff\u0105\u0109\u010b\u0110"+
		"\u0118\u0124\u012a\u0135\u013f\u014b\u0150\u0159\u0160\u0196\u01a2\u01a5"+
		"\u01b5\u01c8\u01dd\u01ed\u0202\u0210\u021c\u021e\u022b\u022f\u0236\u0242"+
		"\u024e\u0259\u025e\u0266\u026a\u0275\u0281\u028d\u0292\u029b\u029f\u02a6"+
		"\u02ae\u02b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}