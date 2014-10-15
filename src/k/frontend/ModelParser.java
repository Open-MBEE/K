package k.frontend;

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
		"<INVALID>", "'implies'", "'or'", "'['", "'*'", "'<'", "'!isin'", "'<='", 
		"'Bool'", "'}'", "'subset'", "'eq'", "'lt'", "'case'", "'->'", "'%'", 
		"'Unit'", "'union'", "')'", "'_'", "'-\\'", "'iff'", "'gt'", "'='", "'<=>'", 
		"'String'", "'psubset'", "'fun'", "'Int'", "'\\'", "'gte'", "'Char'", 
		"'val'", "'req'", "'class'", "'|'", "'assert'", "'!'", "'..'", "']'", 
		"','", "'of'", "'-'", "'not'", "':'", "'('", "'if'", "'lte'", "'var'", 
		"'?'", "'package'", "'{|'", "'{'", "'and'", "'extends'", "'isin'", "'else'", 
		"'++'", "'import'", "'^'", "'inter'", "'assoc'", "'=>'", "'+'", "'create'", 
		"'forall'", "'|}'", "'&&'", "'||'", "'>'", "'exists'", "'Real'", "'type'", 
		"':='", "'then'", "'/'", "'>='", "'#'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
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
		RULE_tokenEquals = 33, RULE_expressionsWithSeparator = 34, RULE_expression = 35, 
		RULE_classArgumentList = 36, RULE_classArgument = 37, RULE_idValueList = 38, 
		RULE_idValuePair = 39, RULE_match = 40, RULE_matchPattern = 41, RULE_matchArgument = 42, 
		RULE_mapPairList = 43, RULE_mapPair = 44, RULE_rngBindingList = 45, RULE_rngBinding = 46, 
		RULE_patternList = 47, RULE_collectionOrType = 48, RULE_pattern = 49, 
		RULE_identifierList = 50, RULE_expressionList = 51, RULE_qualifiedName = 52, 
		RULE_literal = 53;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "classToken", "typeParameters", "typeParameter", "typeBound", 
		"valueParameters", "typingList", "extending", "type", "expressionOrStar", 
		"typeArguments", "memberDeclaration", "valueDeclaration", "sortDeclaration", 
		"typeDeclaration", "variableDeclaration", "typing", "functionDeclaration", 
		"constraint", "primitiveType", "tokenLessThan", "tokenGreatherThan", "tokenLessThanEqual", 
		"tokenGreaterThanEqual", "tokenAnd", "tokenOr", "tokenNot", "tokenImplies", 
		"tokenIFF", "tokenEquals", "expressionsWithSeparator", "expression", "classArgumentList", 
		"classArgument", "idValueList", "idValuePair", "match", "matchPattern", 
		"matchArgument", "mapPairList", "mapPair", "rngBindingList", "rngBinding", 
		"patternList", "collectionOrType", "pattern", "identifierList", "expressionList", 
		"qualifiedName", "literal"
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
			setState(108); packageDeclaration();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
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
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__50) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__25) | (1L << T__16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (T__5 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(115); topDeclaration();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTopDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopDeclarationContext topDeclaration() throws RecognitionException {
		TopDeclarationContext _localctx = new TopDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topDeclaration);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case T__74:
			case T__72:
			case T__64:
			case T__57:
			case T__50:
			case T__45:
			case T__44:
			case T__41:
			case T__40:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__29:
			case T__25:
			case T__13:
			case T__12:
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
				setState(123); memberDeclaration();
				}
				break;
			case T__43:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); classDeclaration();
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
			setState(127); match(T__27);
			setState(128); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
			setState(130); match(T__19);
			setState(131); qualifiedName();
			setState(134);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(132); match(SUCHTHAT);
				setState(133); match(T__73);
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
		public ClassTokenContext classToken() {
			return getRuleContext(ClassTokenContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
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
			setState(136); classToken();
			setState(137); match(Identifier);
			setState(139);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(138); typeParameters();
				}
			}

			setState(142);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(141); valueParameters();
				}
			}

			setState(145);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(144); extending();
				}
			}

			setState(147); match(T__25);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__50) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (T__5 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(148); memberDeclaration();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(T__68);
			}
		}
		catch (RecognitionException re) {
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
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__16) ) {
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
			setState(158); match(T__74);
			setState(159); typeParameter();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(160); match(T__37);
				setState(161); typeParameter();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167); match(T__38);
			}
		}
		catch (RecognitionException re) {
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
			setState(169); match(Identifier);
			setState(172);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(170); match(T__33);
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
			setState(174); type(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(175); match(T__14);
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
			setState(182); match(T__32);
			setState(183); typingList();
			setState(184); match(T__59);
			}
		}
		catch (RecognitionException re) {
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
			setState(186); typing();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(187); match(T__37);
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
			setState(194); match(T__23);
			setState(195); type(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(196); match(T__37);
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
		public List<ExpressionOrStarContext> expressionOrStar() {
			return getRuleContexts(ExpressionOrStarContext.class);
		}
		public ExpressionOrStarContext expressionOrStar(int i) {
			return getRuleContext(ExpressionOrStarContext.class,i);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitType(this);
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
			setState(233);
			switch (_input.LA(1)) {
			case T__69:
			case T__61:
			case T__52:
			case T__49:
			case T__46:
			case T__6:
				{
				setState(204); primitiveType();
				}
				break;
			case Identifier:
				{
				setState(205); qualifiedName();
				setState(207);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(206); typeArguments();
					}
					break;
				}
				}
				break;
			case T__32:
				{
				setState(209); match(T__32);
				setState(210); type(0);
				setState(211); match(T__59);
				}
				break;
			case T__26:
				{
				setState(213); match(T__26);
				setState(214); typing();
				setState(215); match(SUCHTHAT);
				setState(216); expression(0);
				setState(217); match(T__11);
				}
				break;
			case T__25:
				{
				setState(219); match(T__25);
				setState(220); type(0);
				setState(221); match(T__68);
				}
				break;
			case T__74:
				{
				setState(223); match(T__74);
				setState(224); type(0);
				setState(225); match(T__38);
				}
				break;
			case T__72:
				{
				setState(227); match(T__72);
				setState(228); type(0);
				setState(229); match(T__37);
				setState(230); type(0);
				setState(231); match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(235);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(236); match(T__63);
						setState(237); type(9);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(241); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(239); match(T__73);
								setState(240); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(243); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246); expressionOrStar();
						setState(249);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(247); match(T__39);
							setState(248); expressionOrStar();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(251);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(252); match(T__28);
						}
						break;
					}
					} 
				}
				setState(257);
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
			setState(260);
			switch (_input.LA(1)) {
			case T__74:
			case T__72:
			case T__64:
			case T__57:
			case T__41:
			case T__40:
			case T__35:
			case T__34:
			case T__32:
			case T__31:
			case T__25:
			case T__13:
			case T__12:
			case T__7:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); expression(0);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(T__73);
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
			setState(262); match(T__74);
			setState(263); type(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(264); match(T__37);
				setState(265); type(0);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271); match(T__38);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279); expressionsWithSeparator();
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
			setState(282); match(T__45);
			setState(283); typing();
			setState(286);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(284); match(T__54);
				setState(285); expression(0);
				}
			}

			setState(288); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(290); match(T__5);
			setState(291); match(Identifier);
			setState(292); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(294); match(T__5);
			setState(295); match(Identifier);
			setState(297);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(296); typeParameters();
				}
			}

			setState(299); match(T__54);
			setState(300); type(0);
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
			setState(303); match(T__29);
			setState(304); typing();
			setState(307);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(305); match(T__54);
				setState(306); expression(0);
				}
			}

			setState(309); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(311); match(Identifier);
			setState(312); match(T__33);
			setState(313); type(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(315); match(T__50);
			setState(316); match(Identifier);
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317); match(T__32);
				setState(319);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(318); typingList();
					}
				}

				setState(321); match(T__59);
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__32 );
			{
			setState(326); match(T__33);
			setState(327); type(0);
			}
			setState(329); match(T__25);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__50) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (T__5 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(330); memberDeclaration();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336); match(T__68);
			}
		}
		catch (RecognitionException re) {
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
			setState(338); match(T__44);
			setState(340);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(339); match(Identifier);
				}
			}

			setState(342); match(T__25);
			setState(343); expression(0);
			setState(344); match(T__68);
			}
		}
		catch (RecognitionException re) {
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
			setState(346);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__69 - 8)) | (1L << (T__61 - 8)) | (1L << (T__52 - 8)) | (1L << (T__49 - 8)) | (1L << (T__46 - 8)) | (1L << (T__6 - 8)))) != 0)) ) {
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
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==T__72 || _la==T__65) ) {
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
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==T__55 || _la==T__8) ) {
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
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==T__70 || _la==T__30) ) {
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
			setState(354);
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
			setState(356);
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
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__9) ) {
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
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__34) ) {
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
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==T__76 || _la==T__15) ) {
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
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__53) ) {
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
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==T__66 || _la==T__54) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpressionsWithSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsWithSeparatorContext expressionsWithSeparator() throws RecognitionException {
		ExpressionsWithSeparatorContext _localctx = new ExpressionsWithSeparatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); expression(0);
			setState(369); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(372); match(T__35);
				setState(373); expression(22);
				}
				break;
			case 2:
				{
				setState(374); tokenNot();
				setState(375); expression(21);
				}
				break;
			case 3:
				{
				setState(377); match(T__12);
				setState(378); rngBindingList();
				setState(379); match(SUCHTHAT);
				setState(380); expression(20);
				}
				break;
			case 4:
				{
				setState(382); match(T__7);
				setState(383); rngBindingList();
				setState(384); match(SUCHTHAT);
				setState(385); expression(19);
				}
				break;
			case 5:
				{
				setState(387); match(T__57);
				setState(388); pattern();
				setState(391);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(389); match(T__33);
					setState(390); type(0);
					}
				}

				setState(393); match(SUCHTHAT);
				setState(394); expression(9);
				}
				break;
			case 6:
				{
				setState(396); match(T__32);
				setState(397); expression(0);
				setState(398); match(T__59);
				}
				break;
			case 7:
				{
				setState(400); literal();
				}
				break;
			case 8:
				{
				setState(401); match(Identifier);
				}
				break;
			case 9:
				{
				setState(402); match(T__13);
				setState(403); qualifiedName();
				setState(409);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(404); match(T__32);
					setState(406);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(405); classArgumentList();
						}
					}

					setState(408); match(T__59);
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(411); match(T__31);
				setState(412); expression(0);
				setState(413); match(T__3);
				setState(414); expression(0);
				setState(415); match(T__21);
				setState(416); expression(0);
				}
				break;
			case 11:
				{
				setState(418); match(T__64);
				setState(419); expression(0);
				setState(420); match(T__36);
				setState(421); match();
				}
				break;
			case 12:
				{
				setState(423); match(T__32);
				setState(424); expression(0);
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(425); match(T__37);
					setState(426); expression(0);
					}
					}
					setState(429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__37 );
				setState(431); match(T__59);
				}
				break;
			case 13:
				{
				setState(433); match(T__25);
				setState(435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(434); expressionList();
					}
				}

				setState(437); match(T__68);
				}
				break;
			case 14:
				{
				setState(438); match(T__25);
				setState(439); expression(0);
				setState(440); match(T__39);
				setState(441); expression(0);
				setState(442); match(T__68);
				}
				break;
			case 15:
				{
				setState(444); match(T__25);
				setState(445); expression(0);
				setState(446); match(T__42);
				setState(447); rngBindingList();
				setState(448); match(SUCHTHAT);
				setState(449); expression(0);
				setState(450); match(T__68);
				}
				break;
			case 16:
				{
				setState(452); match(T__74);
				setState(454);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(453); expressionList();
					}
				}

				setState(456); match(T__38);
				}
				break;
			case 17:
				{
				setState(457); match(T__74);
				setState(458); expression(0);
				setState(459); match(T__39);
				setState(460); expression(0);
				setState(461); match(T__38);
				}
				break;
			case 18:
				{
				setState(463); match(T__74);
				setState(464); expression(0);
				setState(465); match(T__42);
				setState(466); pattern();
				setState(467); match(T__33);
				setState(468); expression(0);
				setState(469); match(SUCHTHAT);
				setState(470); expression(0);
				setState(471); match(T__38);
				}
				break;
			case 19:
				{
				setState(473); match(T__72);
				setState(475);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__72) | (1L << T__64) | (1L << T__57) | (1L << T__41) | (1L << T__40) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__25))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__13 - 64)) | (1L << (T__12 - 64)) | (1L << (T__7 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(474); mapPairList();
					}
				}

				setState(477); match(T__8);
				}
				break;
			case 20:
				{
				setState(478); match(T__72);
				setState(479); mapPair();
				setState(480); match(T__42);
				setState(481); rngBindingList();
				setState(482); match(SUCHTHAT);
				setState(483); expression(0);
				setState(484); match(T__8);
				}
				break;
			case 21:
				{
				setState(486); match(T__41);
				setState(487); match(T__32);
				setState(488); expression(0);
				setState(489); match(T__59);
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
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(494);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__62) | (1L << T__48) | (1L << T__20) | (1L << T__18) | (1L << T__17))) != 0) || _la==T__2 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(495); expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(497);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__35) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(498); expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(512);
						switch (_input.LA(1)) {
						case T__70:
						case T__30:
							{
							setState(500); tokenLessThanEqual();
							}
							break;
						case T__47:
						case T__1:
							{
							setState(501); tokenGreaterThanEqual();
							}
							break;
						case T__72:
						case T__65:
							{
							setState(502); tokenLessThan();
							}
							break;
						case T__55:
						case T__8:
							{
							setState(503); tokenGreatherThan();
							}
							break;
						case T__66:
						case T__54:
							{
							setState(504); tokenEquals();
							}
							break;
						case T__40:
						case T__34:
							{
							setState(505); tokenNot();
							setState(506); tokenEquals();
							}
							break;
						case T__22:
							{
							setState(508); match(T__22);
							}
							break;
						case T__71:
							{
							setState(509); match(T__71);
							}
							break;
						case T__67:
							{
							setState(510); match(T__67);
							}
							break;
						case T__51:
							{
							setState(511); match(T__51);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(514); expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(515);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(516); tokenAnd();
						setState(517); expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(519);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(520); tokenOr();
						setState(521); expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(526);
						switch (_input.LA(1)) {
						case T__76:
						case T__15:
							{
							setState(524); tokenImplies();
							}
							break;
						case T__56:
						case T__53:
							{
							setState(525); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(528); expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(530);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(531); match(T__4);
						setState(532); expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(534); match(SUCHTHAT);
						setState(535); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(536);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(537); expression(0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassArgumentListContext classArgumentList() throws RecognitionException {
		ClassArgumentListContext _localctx = new ClassArgumentListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); classArgument();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(544); match(T__37);
				setState(545); classArgument();
				}
				}
				setState(550);
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
		enterRule(_localctx, 74, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(Identifier);
			setState(552); match(T__33);
			setState(553); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdValueListContext idValueList() throws RecognitionException {
		IdValueListContext _localctx = new IdValueListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); idValuePair();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(556); match(T__37);
				setState(557); idValuePair();
				}
				}
				setState(562);
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
		enterRule(_localctx, 78, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(Identifier);
			setState(564); match(T__4);
			setState(565); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); matchPattern();
			setState(568); match(T__15);
			setState(569); expression(0);
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(570); match(T__42);
				setState(571); match();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchPatternContext matchPattern() throws RecognitionException {
		MatchPatternContext _localctx = new MatchPatternContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_matchPattern);
		int _la;
		try {
			setState(600);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(574); literal();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(575); match(T__58);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(576); match(Identifier);
				setState(588);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(577); match(T__32);
					setState(578); matchArgument();
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__37) {
						{
						{
						setState(579); match(T__37);
						setState(580); matchArgument();
						}
						}
						setState(585);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(586); match(T__59);
					}
				}

				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(590); match(T__32);
				setState(591); matchPattern();
				setState(594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(592); match(T__37);
					setState(593); matchPattern();
					}
					}
					setState(596); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__37 );
				setState(598); match(T__59);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArgumentContext matchArgument() throws RecognitionException {
		MatchArgumentContext _localctx = new MatchArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(Identifier);
			setState(603); match(T__54);
			setState(604); matchPattern();
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapPairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairListContext mapPairList() throws RecognitionException {
		MapPairListContext _localctx = new MapPairListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); mapPair();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(607); match(T__37);
				setState(608); mapPair();
				}
				}
				setState(613);
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
		enterRule(_localctx, 88, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); expression(0);
			setState(615); match(T__33);
			setState(616); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); rngBinding();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(619); match(T__37);
				setState(620); rngBinding();
				}
				}
				setState(625);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRngBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RngBindingContext rngBinding() throws RecognitionException {
		RngBindingContext _localctx = new RngBindingContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); patternList();
			setState(627); match(T__33);
			setState(628); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); pattern();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(631); match(T__37);
				setState(632); pattern();
				}
				}
				setState(637);
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
		enterRule(_localctx, 96, RULE_collectionOrType);
		try {
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639); type(0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pattern);
		int _la;
		try {
			setState(653);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(642); match(Identifier);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(643); match(T__32);
				setState(644); pattern();
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(645); match(T__37);
					setState(646); pattern();
					}
					}
					setState(649); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__37 );
				setState(651); match(T__59);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); match(Identifier);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(656); match(T__37);
				setState(657); match(Identifier);
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
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); expression(0);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(664); match(T__37);
				setState(665); expression(0);
				}
				}
				setState(670);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671); match(Identifier);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672); match(SUCHTHAT);
					setState(673); match(Identifier);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
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
		case 35: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 4);
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		case 11: return precpred(_ctx, 27);
		case 12: return precpred(_ctx, 25);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Z\u02ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2"+
		"\7\2w\n\2\f\2\16\2z\13\2\3\2\3\2\3\3\3\3\5\3\u0080\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\5\6\u008e\n\6\3\6\5\6\u0091\n\6"+
		"\3\6\5\6\u0094\n\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u00af\n\t\3\n\3\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\r\3\r"+
		"\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\16\3\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ec\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00f4\n\16\r\16\16\16\u00f5\3\16\3"+
		"\16\3\16\3\16\5\16\u00fc\n\16\3\16\3\16\7\16\u0100\n\16\f\16\16\16\u0103"+
		"\13\16\3\17\3\17\5\17\u0107\n\17\3\20\3\20\3\20\3\20\7\20\u010d\n\20\f"+
		"\20\16\20\u0110\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u011b\n\21\3\22\3\22\3\22\3\22\5\22\u0121\n\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\5\24\u012c\n\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\5\25\u0136\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0142\n\27\3\27\6\27\u0145\n\27\r\27\16\27\u0146\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u014e\n\27\f\27\16\27\u0151\13\27\3\27\3\27\3\30"+
		"\3\30\5\30\u0157\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u018a\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0199\n%\3%\5%\u019c"+
		"\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u01ae\n%\r%\16"+
		"%\u01af\3%\3%\3%\3%\5%\u01b6\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u01c9\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u01de\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u01ee\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u0203\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0211\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u021d\n%\f%\16%\u0220\13%\3&\3&\3&\7&\u0225\n&"+
		"\f&\16&\u0228\13&\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0231\n(\f(\16(\u0234\13"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u023f\n*\3+\3+\3+\3+\3+\3+\3+\7+\u0248"+
		"\n+\f+\16+\u024b\13+\3+\3+\5+\u024f\n+\3+\3+\3+\3+\6+\u0255\n+\r+\16+"+
		"\u0256\3+\3+\5+\u025b\n+\3,\3,\3,\3,\3-\3-\3-\7-\u0264\n-\f-\16-\u0267"+
		"\13-\3.\3.\3.\3.\3/\3/\3/\7/\u0270\n/\f/\16/\u0273\13/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\7\61\u027c\n\61\f\61\16\61\u027f\13\61\3\62\3\62"+
		"\5\62\u0283\n\62\3\63\3\63\3\63\3\63\3\63\6\63\u028a\n\63\r\63\16\63\u028b"+
		"\3\63\3\63\5\63\u0290\n\63\3\64\3\64\3\64\7\64\u0295\n\64\f\64\16\64\u0298"+
		"\13\64\3\65\3\65\3\65\7\65\u029d\n\65\f\65\16\65\u02a0\13\65\3\66\3\66"+
		"\3\66\7\66\u02a5\n\66\f\66\16\66\u02a8\13\66\3\67\3\67\3\67\2\4\32H8\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjl\2\21\4\2$$??\b\2\n\n\22\22\33\33\36\36!!II\4\2\7\7\16"+
		"\16\4\2\30\30GG\4\2\t\t\61\61\4\2  NN\4\2\67\67EE\4\2\4\4FF\4\2\'\'--"+
		"\4\2\3\3@@\4\2\27\27\32\32\4\2\r\r\31\31\t\2\6\6\21\21\37\37;;=>MMOO\5"+
		"\2\23\23,,AA\3\2QU\u02de\2n\3\2\2\2\4\177\3\2\2\2\6\u0081\3\2\2\2\b\u0084"+
		"\3\2\2\2\n\u008a\3\2\2\2\f\u009e\3\2\2\2\16\u00a0\3\2\2\2\20\u00ab\3\2"+
		"\2\2\22\u00b0\3\2\2\2\24\u00b8\3\2\2\2\26\u00bc\3\2\2\2\30\u00c4\3\2\2"+
		"\2\32\u00eb\3\2\2\2\34\u0106\3\2\2\2\36\u0108\3\2\2\2 \u011a\3\2\2\2\""+
		"\u011c\3\2\2\2$\u0124\3\2\2\2&\u0128\3\2\2\2(\u0131\3\2\2\2*\u0139\3\2"+
		"\2\2,\u013d\3\2\2\2.\u0154\3\2\2\2\60\u015c\3\2\2\2\62\u015e\3\2\2\2\64"+
		"\u0160\3\2\2\2\66\u0162\3\2\2\28\u0164\3\2\2\2:\u0166\3\2\2\2<\u0168\3"+
		"\2\2\2>\u016a\3\2\2\2@\u016c\3\2\2\2B\u016e\3\2\2\2D\u0170\3\2\2\2F\u0172"+
		"\3\2\2\2H\u01ed\3\2\2\2J\u0221\3\2\2\2L\u0229\3\2\2\2N\u022d\3\2\2\2P"+
		"\u0235\3\2\2\2R\u0239\3\2\2\2T\u025a\3\2\2\2V\u025c\3\2\2\2X\u0260\3\2"+
		"\2\2Z\u0268\3\2\2\2\\\u026c\3\2\2\2^\u0274\3\2\2\2`\u0278\3\2\2\2b\u0282"+
		"\3\2\2\2d\u028f\3\2\2\2f\u0291\3\2\2\2h\u0299\3\2\2\2j\u02a1\3\2\2\2l"+
		"\u02a9\3\2\2\2nr\5\6\4\2oq\5\b\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2sx\3\2\2\2tr\3\2\2\2uw\5\4\3\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y{\3\2\2\2zx\3\2\2\2{|\7\2\2\3|\3\3\2\2\2}\u0080\5 \21\2~\u0080\5"+
		"\n\6\2\177}\3\2\2\2\177~\3\2\2\2\u0080\5\3\2\2\2\u0081\u0082\7\64\2\2"+
		"\u0082\u0083\5j\66\2\u0083\7\3\2\2\2\u0084\u0085\7<\2\2\u0085\u0088\5"+
		"j\66\2\u0086\u0087\7P\2\2\u0087\u0089\7\6\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\5\f\7\2\u008b\u008d\7V\2\2"+
		"\u008c\u008e\5\16\b\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u0091\5\24\13\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0093\3\2\2\2\u0092\u0094\5\30\r\2\u0093\u0092\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\7\66\2\2\u0096\u0098\5 \21\2"+
		"\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\13\2\2"+
		"\u009d\13\3\2\2\2\u009e\u009f\t\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7\5"+
		"\2\2\u00a1\u00a6\5\20\t\2\u00a2\u00a3\7*\2\2\u00a3\u00a5\5\20\t\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa"+
		"\17\3\2\2\2\u00ab\u00ae\7V\2\2\u00ac\u00ad\7.\2\2\u00ad\u00af\5\22\n\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00b5"+
		"\5\32\16\2\u00b1\u00b2\7A\2\2\u00b2\u00b4\5\32\16\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\23"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\5\26\f\2\u00ba"+
		"\u00bb\7\24\2\2\u00bb\25\3\2\2\2\u00bc\u00c1\5*\26\2\u00bd\u00be\7*\2"+
		"\2\u00be\u00c0\5*\26\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\78\2\2\u00c5\u00ca\5\32\16\2\u00c6\u00c7\7*\2\2\u00c7\u00c9\5\32"+
		"\16\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\16\1"+
		"\2\u00ce\u00ec\5\60\31\2\u00cf\u00d1\5j\66\2\u00d0\u00d2\5\36\20\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00ec\3\2\2\2\u00d3\u00d4\7/"+
		"\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\7\24\2\2\u00d6\u00ec\3\2\2\2\u00d7"+
		"\u00d8\7\65\2\2\u00d8\u00d9\5*\26\2\u00d9\u00da\7P\2\2\u00da\u00db\5H"+
		"%\2\u00db\u00dc\7D\2\2\u00dc\u00ec\3\2\2\2\u00dd\u00de\7\66\2\2\u00de"+
		"\u00df\5\32\16\2\u00df\u00e0\7\13\2\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2"+
		"\7\5\2\2\u00e2\u00e3\5\32\16\2\u00e3\u00e4\7)\2\2\u00e4\u00ec\3\2\2\2"+
		"\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\7*\2\2\u00e8\u00e9"+
		"\5\32\16\2\u00e9\u00ea\7G\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00cd\3\2\2\2"+
		"\u00eb\u00cf\3\2\2\2\u00eb\u00d3\3\2\2\2\u00eb\u00d7\3\2\2\2\u00eb\u00dd"+
		"\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e5\3\2\2\2\u00ec\u0101\3\2\2\2\u00ed"+
		"\u00ee\f\n\2\2\u00ee\u00ef\7\20\2\2\u00ef\u0100\5\32\16\13\u00f0\u00f3"+
		"\f\13\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f4\5\32\16\2\u00f3\u00f1\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0100"+
		"\3\2\2\2\u00f7\u00f8\f\4\2\2\u00f8\u00fb\5\34\17\2\u00f9\u00fa\7(\2\2"+
		"\u00fa\u00fc\5\34\17\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100"+
		"\3\2\2\2\u00fd\u00fe\f\3\2\2\u00fe\u0100\7\63\2\2\u00ff\u00ed\3\2\2\2"+
		"\u00ff\u00f0\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\5H%\2\u0105\u0107\7\6\2\2\u0106\u0104\3\2\2"+
		"\2\u0106\u0105\3\2\2\2\u0107\35\3\2\2\2\u0108\u0109\7\5\2\2\u0109\u010e"+
		"\5\32\16\2\u010a\u010b\7*\2\2\u010b\u010d\5\32\16\2\u010c\u010a\3\2\2"+
		"\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7)\2\2\u0112\37\3\2\2\2\u0113"+
		"\u011b\5$\23\2\u0114\u011b\5&\24\2\u0115\u011b\5\"\22\2\u0116\u011b\5"+
		"(\25\2\u0117\u011b\5,\27\2\u0118\u011b\5.\30\2\u0119\u011b\5F$\2\u011a"+
		"\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2"+
		"\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b"+
		"!\3\2\2\2\u011c\u011d\7\"\2\2\u011d\u0120\5*\26\2\u011e\u011f\7\31\2\2"+
		"\u011f\u0121\5H%\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\7Z\2\2\u0123#\3\2\2\2\u0124\u0125\7J\2\2\u0125\u0126"+
		"\7V\2\2\u0126\u0127\7Z\2\2\u0127%\3\2\2\2\u0128\u0129\7J\2\2\u0129\u012b"+
		"\7V\2\2\u012a\u012c\5\16\b\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\7\31\2\2\u012e\u012f\5\32\16\2\u012f\u0130"+
		"\7Z\2\2\u0130\'\3\2\2\2\u0131\u0132\7\62\2\2\u0132\u0135\5*\26\2\u0133"+
		"\u0134\7\31\2\2\u0134\u0136\5H%\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7Z\2\2\u0138)\3\2\2\2\u0139\u013a"+
		"\7V\2\2\u013a\u013b\7.\2\2\u013b\u013c\5\32\16\2\u013c+\3\2\2\2\u013d"+
		"\u013e\7\35\2\2\u013e\u0144\7V\2\2\u013f\u0141\7/\2\2\u0140\u0142\5\26"+
		"\f\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\7\24\2\2\u0144\u013f\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7.\2\2\u0149"+
		"\u014a\5\32\16\2\u014a\u014b\3\2\2\2\u014b\u014f\7\66\2\2\u014c\u014e"+
		"\5 \21\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\13"+
		"\2\2\u0153-\3\2\2\2\u0154\u0156\7#\2\2\u0155\u0157\7V\2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\66\2\2"+
		"\u0159\u015a\5H%\2\u015a\u015b\7\13\2\2\u015b/\3\2\2\2\u015c\u015d\t\3"+
		"\2\2\u015d\61\3\2\2\2\u015e\u015f\t\4\2\2\u015f\63\3\2\2\2\u0160\u0161"+
		"\t\5\2\2\u0161\65\3\2\2\2\u0162\u0163\t\6\2\2\u0163\67\3\2\2\2\u0164\u0165"+
		"\t\7\2\2\u01659\3\2\2\2\u0166\u0167\t\b\2\2\u0167;\3\2\2\2\u0168\u0169"+
		"\t\t\2\2\u0169=\3\2\2\2\u016a\u016b\t\n\2\2\u016b?\3\2\2\2\u016c\u016d"+
		"\t\13\2\2\u016dA\3\2\2\2\u016e\u016f\t\f\2\2\u016fC\3\2\2\2\u0170\u0171"+
		"\t\r\2\2\u0171E\3\2\2\2\u0172\u0173\5H%\2\u0173\u0174\7Z\2\2\u0174G\3"+
		"\2\2\2\u0175\u0176\b%\1\2\u0176\u0177\7,\2\2\u0177\u01ee\5H%\30\u0178"+
		"\u0179\5> \2\u0179\u017a\5H%\27\u017a\u01ee\3\2\2\2\u017b\u017c\7C\2\2"+
		"\u017c\u017d\5\\/\2\u017d\u017e\7P\2\2\u017e\u017f\5H%\26\u017f\u01ee"+
		"\3\2\2\2\u0180\u0181\7H\2\2\u0181\u0182\5\\/\2\u0182\u0183\7P\2\2\u0183"+
		"\u0184\5H%\25\u0184\u01ee\3\2\2\2\u0185\u0186\7\26\2\2\u0186\u0189\5d"+
		"\63\2\u0187\u0188\7.\2\2\u0188\u018a\5\32\16\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7P\2\2\u018c\u018d\5H%"+
		"\13\u018d\u01ee\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\5H%\2\u0190\u0191"+
		"\7\24\2\2\u0191\u01ee\3\2\2\2\u0192\u01ee\5l\67\2\u0193\u01ee\7V\2\2\u0194"+
		"\u0195\7B\2\2\u0195\u019b\5j\66\2\u0196\u0198\7/\2\2\u0197\u0199\5J&\2"+
		"\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c"+
		"\7\24\2\2\u019b\u0196\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01ee\3\2\2\2"+
		"\u019d\u019e\7\60\2\2\u019e\u019f\5H%\2\u019f\u01a0\7L\2\2\u01a0\u01a1"+
		"\5H%\2\u01a1\u01a2\7:\2\2\u01a2\u01a3\5H%\2\u01a3\u01ee\3\2\2\2\u01a4"+
		"\u01a5\7\17\2\2\u01a5\u01a6\5H%\2\u01a6\u01a7\7+\2\2\u01a7\u01a8\5R*\2"+
		"\u01a8\u01ee\3\2\2\2\u01a9\u01aa\7/\2\2\u01aa\u01ad\5H%\2\u01ab\u01ac"+
		"\7*\2\2\u01ac\u01ae\5H%\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7\24"+
		"\2\2\u01b2\u01ee\3\2\2\2\u01b3\u01b5\7\66\2\2\u01b4\u01b6\5h\65\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ee\7\13"+
		"\2\2\u01b8\u01b9\7\66\2\2\u01b9\u01ba\5H%\2\u01ba\u01bb\7(\2\2\u01bb\u01bc"+
		"\5H%\2\u01bc\u01bd\7\13\2\2\u01bd\u01ee\3\2\2\2\u01be\u01bf\7\66\2\2\u01bf"+
		"\u01c0\5H%\2\u01c0\u01c1\7%\2\2\u01c1\u01c2\5\\/\2\u01c2\u01c3\7P\2\2"+
		"\u01c3\u01c4\5H%\2\u01c4\u01c5\7\13\2\2\u01c5\u01ee\3\2\2\2\u01c6\u01c8"+
		"\7\5\2\2\u01c7\u01c9\5h\65\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01ee\7)\2\2\u01cb\u01cc\7\5\2\2\u01cc\u01cd\5H%"+
		"\2\u01cd\u01ce\7(\2\2\u01ce\u01cf\5H%\2\u01cf\u01d0\7)\2\2\u01d0\u01ee"+
		"\3\2\2\2\u01d1\u01d2\7\5\2\2\u01d2\u01d3\5H%\2\u01d3\u01d4\7%\2\2\u01d4"+
		"\u01d5\5d\63\2\u01d5\u01d6\7.\2\2\u01d6\u01d7\5H%\2\u01d7\u01d8\7P\2\2"+
		"\u01d8\u01d9\5H%\2\u01d9\u01da\7)\2\2\u01da\u01ee\3\2\2\2\u01db\u01dd"+
		"\7\7\2\2\u01dc\u01de\5X-\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01ee\7G\2\2\u01e0\u01e1\7\7\2\2\u01e1\u01e2\5Z."+
		"\2\u01e2\u01e3\7%\2\2\u01e3\u01e4\5\\/\2\u01e4\u01e5\7P\2\2\u01e5\u01e6"+
		"\5H%\2\u01e6\u01e7\7G\2\2\u01e7\u01ee\3\2\2\2\u01e8\u01e9\7&\2\2\u01e9"+
		"\u01ea\7/\2\2\u01ea\u01eb\5H%\2\u01eb\u01ec\7\24\2\2\u01ec\u01ee\3\2\2"+
		"\2\u01ed\u0175\3\2\2\2\u01ed\u0178\3\2\2\2\u01ed\u017b\3\2\2\2\u01ed\u0180"+
		"\3\2\2\2\u01ed\u0185\3\2\2\2\u01ed\u018e\3\2\2\2\u01ed\u0192\3\2\2\2\u01ed"+
		"\u0193\3\2\2\2\u01ed\u0194\3\2\2\2\u01ed\u019d\3\2\2\2\u01ed\u01a4\3\2"+
		"\2\2\u01ed\u01a9\3\2\2\2\u01ed\u01b3\3\2\2\2\u01ed\u01b8\3\2\2\2\u01ed"+
		"\u01be\3\2\2\2\u01ed\u01c6\3\2\2\2\u01ed\u01cb\3\2\2\2\u01ed\u01d1\3\2"+
		"\2\2\u01ed\u01db\3\2\2\2\u01ed\u01e0\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee"+
		"\u021e\3\2\2\2\u01ef\u01f0\f\n\2\2\u01f0\u01f1\t\16\2\2\u01f1\u021d\5"+
		"H%\13\u01f2\u01f3\f\t\2\2\u01f3\u01f4\t\17\2\2\u01f4\u021d\5H%\n\u01f5"+
		"\u0202\f\b\2\2\u01f6\u0203\5\66\34\2\u01f7\u0203\58\35\2\u01f8\u0203\5"+
		"\62\32\2\u01f9\u0203\5\64\33\2\u01fa\u0203\5D#\2\u01fb\u01fc\5> \2\u01fc"+
		"\u01fd\5D#\2\u01fd\u0203\3\2\2\2\u01fe\u0203\79\2\2\u01ff\u0203\7\b\2"+
		"\2\u0200\u0203\7\f\2\2\u0201\u0203\7\34\2\2\u0202\u01f6\3\2\2\2\u0202"+
		"\u01f7\3\2\2\2\u0202\u01f8\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u01fa\3\2"+
		"\2\2\u0202\u01fb\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u021d\5H"+
		"%\t\u0205\u0206\f\7\2\2\u0206\u0207\5:\36\2\u0207\u0208\5H%\b\u0208\u021d"+
		"\3\2\2\2\u0209\u020a\f\6\2\2\u020a\u020b\5<\37\2\u020b\u020c\5H%\7\u020c"+
		"\u021d\3\2\2\2\u020d\u0210\f\5\2\2\u020e\u0211\5@!\2\u020f\u0211\5B\""+
		"\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213"+
		"\5H%\6\u0213\u021d\3\2\2\2\u0214\u0215\f\4\2\2\u0215\u0216\7K\2\2\u0216"+
		"\u021d\5H%\5\u0217\u0218\f\35\2\2\u0218\u0219\7P\2\2\u0219\u021d\7V\2"+
		"\2\u021a\u021b\f\33\2\2\u021b\u021d\5H%\2\u021c\u01ef\3\2\2\2\u021c\u01f2"+
		"\3\2\2\2\u021c\u01f5\3\2\2\2\u021c\u0205\3\2\2\2\u021c\u0209\3\2\2\2\u021c"+
		"\u020d\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0217\3\2\2\2\u021c\u021a\3\2"+
		"\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"I\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0226\5L\'\2\u0222\u0223\7*\2\2\u0223"+
		"\u0225\5L\'\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227K\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a"+
		"\7V\2\2\u022a\u022b\7.\2\2\u022b\u022c\5H%\2\u022cM\3\2\2\2\u022d\u0232"+
		"\5P)\2\u022e\u022f\7*\2\2\u022f\u0231\5P)\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233O\3\2\2\2"+
		"\u0234\u0232\3\2\2\2\u0235\u0236\7V\2\2\u0236\u0237\7K\2\2\u0237\u0238"+
		"\5H%\2\u0238Q\3\2\2\2\u0239\u023a\5T+\2\u023a\u023b\7@\2\2\u023b\u023e"+
		"\5H%\2\u023c\u023d\7%\2\2\u023d\u023f\5R*\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023fS\3\2\2\2\u0240\u025b\5l\67\2\u0241\u025b\7\25\2\2"+
		"\u0242\u024e\7V\2\2\u0243\u0244\7/\2\2\u0244\u0249\5V,\2\u0245\u0246\7"+
		"*\2\2\u0246\u0248\5V,\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u024d\7\24\2\2\u024d\u024f\3\2\2\2\u024e\u0243\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u025b\3\2\2\2\u0250\u0251\7/\2\2\u0251\u0254\5T+"+
		"\2\u0252\u0253\7*\2\2\u0253\u0255\5T+\2\u0254\u0252\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\7\24\2\2\u0259\u025b\3\2\2\2\u025a\u0240\3\2\2\2\u025a\u0241\3"+
		"\2\2\2\u025a\u0242\3\2\2\2\u025a\u0250\3\2\2\2\u025bU\3\2\2\2\u025c\u025d"+
		"\7V\2\2\u025d\u025e\7\31\2\2\u025e\u025f\5T+\2\u025fW\3\2\2\2\u0260\u0265"+
		"\5Z.\2\u0261\u0262\7*\2\2\u0262\u0264\5Z.\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266Y\3\2\2\2"+
		"\u0267\u0265\3\2\2\2\u0268\u0269\5H%\2\u0269\u026a\7.\2\2\u026a\u026b"+
		"\5H%\2\u026b[\3\2\2\2\u026c\u0271\5^\60\2\u026d\u026e\7*\2\2\u026e\u0270"+
		"\5^\60\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272]\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\5`\61\2"+
		"\u0275\u0276\7.\2\2\u0276\u0277\5b\62\2\u0277_\3\2\2\2\u0278\u027d\5d"+
		"\63\2\u0279\u027a\7*\2\2\u027a\u027c\5d\63\2\u027b\u0279\3\2\2\2\u027c"+
		"\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027ea\3\2\2\2"+
		"\u027f\u027d\3\2\2\2\u0280\u0283\5H%\2\u0281\u0283\5\32\16\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0281\3\2\2\2\u0283c\3\2\2\2\u0284\u0290\7V\2\2\u0285\u0286"+
		"\7/\2\2\u0286\u0289\5d\63\2\u0287\u0288\7*\2\2\u0288\u028a\5d\63\2\u0289"+
		"\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7\24\2\2\u028e\u0290\3\2\2\2\u028f"+
		"\u0284\3\2\2\2\u028f\u0285\3\2\2\2\u0290e\3\2\2\2\u0291\u0296\7V\2\2\u0292"+
		"\u0293\7*\2\2\u0293\u0295\7V\2\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2"+
		"\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297g\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029e\5H%\2\u029a\u029b\7*\2\2\u029b\u029d\5H%\2\u029c"+
		"\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029fi\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a6\7V\2\2\u02a2\u02a3"+
		"\7P\2\2\u02a3\u02a5\7V\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7k\3\2\2\2\u02a8\u02a6\3\2\2\2"+
		"\u02a9\u02aa\t\20\2\2\u02aam\3\2\2\2;rx\177\u0088\u008d\u0090\u0093\u0099"+
		"\u00a6\u00ae\u00b5\u00c1\u00ca\u00d1\u00eb\u00f5\u00fb\u00ff\u0101\u0106"+
		"\u010e\u011a\u0120\u012b\u0135\u0141\u0146\u014f\u0156\u0189\u0198\u019b"+
		"\u01af\u01b5\u01c8\u01dd\u01ed\u0202\u0210\u021c\u021e\u0226\u0232\u023e"+
		"\u0249\u024e\u0256\u025a\u0265\u0271\u027d\u0282\u028b\u028f\u0296\u029e"+
		"\u02a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}