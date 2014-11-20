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
		T__85=1, T__84=2, T__83=3, T__82=4, T__81=5, T__80=6, T__79=7, T__78=8, 
		T__77=9, T__76=10, T__75=11, T__74=12, T__73=13, T__72=14, T__71=15, T__70=16, 
		T__69=17, T__68=18, T__67=19, T__66=20, T__65=21, T__64=22, T__63=23, 
		T__62=24, T__61=25, T__60=26, T__59=27, T__58=28, T__57=29, T__56=30, 
		T__55=31, T__54=32, T__53=33, T__52=34, T__51=35, T__50=36, T__49=37, 
		T__48=38, T__47=39, T__46=40, T__45=41, T__44=42, T__43=43, T__42=44, 
		T__41=45, T__40=46, T__39=47, T__38=48, T__37=49, T__36=50, T__35=51, 
		T__34=52, T__33=53, T__32=54, T__31=55, T__30=56, T__29=57, T__28=58, 
		T__27=59, T__26=60, T__25=61, T__24=62, T__23=63, T__22=64, T__21=65, 
		T__20=66, T__19=67, T__18=68, T__17=69, T__16=70, T__15=71, T__14=72, 
		T__13=73, T__12=74, T__11=75, T__10=76, T__9=77, T__8=78, T__7=79, T__6=80, 
		T__5=81, T__4=82, T__3=83, T__2=84, T__1=85, T__0=86, SUCHTHAT=87, IntegerLiteral=88, 
		FloatingPointLiteral=89, BooleanLiteral=90, NullLiteral=91, ThisLiteral=92, 
		CharacterLiteral=93, StringLiteral=94, Identifier=95, COMMENT=96, LINE_COMMENT=97, 
		WS=98, SEP=99;
	public static final String[] tokenNames = {
		"<INVALID>", "'implies'", "'or'", "'['", "'*'", "'<'", "'!isin'", "'<='", 
		"'Bool'", "'}'", "'subset'", "'eq'", "'lt'", "'case'", "'do'", "'->'", 
		"'%'", "'Unit'", "'union'", "')'", "'_'", "'iff'", "'gt'", "'='", "'<=>'", 
		"'String'", "'psubset'", "'fun'", "'Int'", "'\\'", "'gte'", "'Char'", 
		"'val'", "'req'", "'class'", "'|'", "'assert'", "'!'", "'..'", "']'", 
		"'in'", "','", "'of'", "'while'", "'-'", "'ref'", "':'", "'('", "'not'", 
		"'if'", "'lte'", "'part'", "'var'", "'?'", "'package'", "'as'", "'{|'", 
		"'{'", "'and'", "'extends'", "'isin'", "'else'", "'++'", "'import'", "'^'", 
		"'is'", "'inter'", "'pre'", "'assoc'", "'=>'", "'+'", "'for'", "'forall'", 
		"'|}'", "'&&'", "'||'", "'>'", "'exists'", "'Real'", "'type'", "':='", 
		"'then'", "'post'", "'/'", "'~'", "'>='", "'#'", "'.'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "'null'", "'this'", "CharacterLiteral", 
		"StringLiteral", "Identifier", "COMMENT", "LINE_COMMENT", "WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclaration = 1, RULE_packageDeclaration = 2, 
		RULE_importDeclaration = 3, RULE_classDeclaration = 4, RULE_assocDeclaration = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeBound = 8, RULE_valueParameters = 9, 
		RULE_typingList = 10, RULE_extending = 11, RULE_type = 12, RULE_expressionOrStar = 13, 
		RULE_typeArguments = 14, RULE_memberDeclaration = 15, RULE_assocMemberDeclaration = 16, 
		RULE_valueDeclaration = 17, RULE_sortDeclaration = 18, RULE_typeDeclaration = 19, 
		RULE_variableDeclaration = 20, RULE_typing = 21, RULE_roleDeclaration = 22, 
		RULE_partDeclaration = 23, RULE_refDeclaration = 24, RULE_multiplicity = 25, 
		RULE_functionDeclaration = 26, RULE_functionSpecification = 27, RULE_constraint = 28, 
		RULE_primitiveType = 29, RULE_tokenLessThan = 30, RULE_tokenGreatherThan = 31, 
		RULE_tokenLessThanEqual = 32, RULE_tokenGreaterThanEqual = 33, RULE_tokenAnd = 34, 
		RULE_tokenOr = 35, RULE_tokenNot = 36, RULE_tokenImplies = 37, RULE_tokenIFF = 38, 
		RULE_tokenEquals = 39, RULE_tokenStar = 40, RULE_tokenArrow = 41, RULE_expressionsWithSeparator = 42, 
		RULE_expression = 43, RULE_argumentList = 44, RULE_positionalArgumentList = 45, 
		RULE_namedArgumentList = 46, RULE_namedArgument = 47, RULE_bracketedExpression = 48, 
		RULE_idValueList = 49, RULE_idValuePair = 50, RULE_match = 51, RULE_matchPattern = 52, 
		RULE_matchArgument = 53, RULE_mapPairList = 54, RULE_mapPair = 55, RULE_rngBindingList = 56, 
		RULE_rngBinding = 57, RULE_patternList = 58, RULE_collectionOrType = 59, 
		RULE_pattern = 60, RULE_identifierList = 61, RULE_expressionList = 62, 
		RULE_qualifiedName = 63, RULE_literal = 64;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "assocDeclaration", "typeParameters", "typeParameter", 
		"typeBound", "valueParameters", "typingList", "extending", "type", "expressionOrStar", 
		"typeArguments", "memberDeclaration", "assocMemberDeclaration", "valueDeclaration", 
		"sortDeclaration", "typeDeclaration", "variableDeclaration", "typing", 
		"roleDeclaration", "partDeclaration", "refDeclaration", "multiplicity", 
		"functionDeclaration", "functionSpecification", "constraint", "primitiveType", 
		"tokenLessThan", "tokenGreatherThan", "tokenLessThanEqual", "tokenGreaterThanEqual", 
		"tokenAnd", "tokenOr", "tokenNot", "tokenImplies", "tokenIFF", "tokenEquals", 
		"tokenStar", "tokenArrow", "expressionsWithSeparator", "expression", "argumentList", 
		"positionalArgumentList", "namedArgumentList", "namedArgument", "bracketedExpression", 
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
			setState(131);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(130); packageDeclaration();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(133); importDeclaration();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__52) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__18 - 68)) | (1L << (T__15 - 68)) | (1L << (T__14 - 68)) | (1L << (T__9 - 68)) | (1L << (T__7 - 68)) | (1L << (T__2 - 68)) | (1L << (IntegerLiteral - 68)) | (1L << (FloatingPointLiteral - 68)) | (1L << (BooleanLiteral - 68)) | (1L << (NullLiteral - 68)) | (1L << (ThisLiteral - 68)) | (1L << (CharacterLiteral - 68)) | (1L << (StringLiteral - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				{
				setState(139); topDeclaration();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public AssocDeclarationContext assocDeclaration() {
			return getRuleContext(AssocDeclarationContext.class,0);
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
			setState(150);
			switch (_input.LA(1)) {
			case T__83:
			case T__81:
			case T__73:
			case T__72:
			case T__59:
			case T__54:
			case T__53:
			case T__50:
			case T__49:
			case T__43:
			case T__39:
			case T__38:
			case T__37:
			case T__34:
			case T__29:
			case T__15:
			case T__14:
			case T__9:
			case T__7:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); memberDeclaration();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); classDeclaration();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); assocDeclaration();
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
			setState(152); match(T__32);
			setState(153); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
			setState(155); match(T__23);
			setState(156); qualifiedName();
			setState(159);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(157); match(SUCHTHAT);
				setState(158); match(T__82);
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
			setState(161); match(T__52);
			setState(162); match(Identifier);
			setState(164);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(163); typeParameters();
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(166); valueParameters();
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(169); extending();
				}
			}

			setState(172); match(T__29);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				{
				setState(173); memberDeclaration();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); match(T__77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssocDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public AssocMemberDeclarationContext assocMemberDeclaration(int i) {
			return getRuleContext(AssocMemberDeclarationContext.class,i);
		}
		public List<AssocMemberDeclarationContext> assocMemberDeclaration() {
			return getRuleContexts(AssocMemberDeclarationContext.class);
		}
		public AssocDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assocDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssocDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssocDeclarationContext assocDeclaration() throws RecognitionException {
		AssocDeclarationContext _localctx = new AssocDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assocDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(T__18);
			setState(182); match(Identifier);
			setState(183); match(T__29);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__41) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__35) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				{
				setState(184); assocMemberDeclaration();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190); match(T__77);
			}
		}
		catch (RecognitionException re) {
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
			setState(192); match(T__83);
			setState(193); typeParameter();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(194); match(T__45);
				setState(195); typeParameter();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201); match(T__47);
			}
		}
		catch (RecognitionException re) {
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
			setState(203); match(Identifier);
			setState(206);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(204); match(T__40);
				setState(205); typeBound();
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
			setState(208); type(0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(209); match(T__16);
				setState(210); type(0);
				}
				}
				setState(215);
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
			setState(216); match(T__39);
			setState(217); typingList();
			setState(218); match(T__67);
			}
		}
		catch (RecognitionException re) {
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
			setState(220); typing();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(221); match(T__45);
				setState(222); typing();
				}
				}
				setState(227);
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
			setState(228); match(T__27);
			setState(229); type(0);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(230); match(T__45);
				setState(231); type(0);
				}
				}
				setState(236);
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
	public static class FuncTypeContext extends TypeContext {
		public TokenArrowContext tokenArrow() {
			return getRuleContext(TokenArrowContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
	public static class IdentTypeContext extends TypeContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianTypeContext extends TypeContext {
		public List<TokenStarContext> tokenStar() {
			return getRuleContexts(TokenStarContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TokenStarContext tokenStar(int i) {
			return getRuleContext(TokenStarContext.class,i);
		}
		public CartesianTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCartesianType(this);
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
	public static class SubTypeContext extends TypeContext {
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public SubTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSubType(this);
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
			setState(267);
			switch (_input.LA(1)) {
			case T__78:
			case T__69:
			case T__61:
			case T__58:
			case T__55:
			case T__8:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(238); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); qualifiedName();
				setState(241);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(240); typeArguments();
					}
					break;
				}
				}
				break;
			case T__29:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); match(T__29);
				setState(244); type(0);
				setState(245); match(T__77);
				}
				break;
			case T__83:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); match(T__83);
				setState(248); type(0);
				setState(249); match(T__47);
				}
				break;
			case T__81:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(T__81);
				setState(252); type(0);
				setState(253); match(T__45);
				setState(254); type(0);
				setState(255); match(T__10);
				}
				break;
			case T__39:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257); match(T__39);
				setState(258); type(0);
				setState(259); match(T__67);
				}
				break;
			case T__30:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); match(T__30);
				setState(262); typing();
				setState(263); match(SUCHTHAT);
				setState(264); expression(0);
				setState(265); match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(269);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(270); tokenArrow();
						setState(271); type(8);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(273);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(277); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(274); tokenStar();
								setState(275); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(279); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(281);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(282); match(T__33);
						}
						break;
					}
					} 
				}
				setState(287);
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
			setState(290);
			switch (_input.LA(1)) {
			case T__83:
			case T__81:
			case T__73:
			case T__72:
			case T__50:
			case T__49:
			case T__43:
			case T__39:
			case T__38:
			case T__37:
			case T__29:
			case T__15:
			case T__14:
			case T__9:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); expression(0);
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); match(T__82);
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
			setState(292); match(T__83);
			setState(293); type(0);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(294); match(T__45);
				setState(295); type(0);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301); match(T__47);
			}
		}
		catch (RecognitionException re) {
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
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309); expressionsWithSeparator();
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

	public static class AssocMemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public RoleDeclarationContext roleDeclaration() {
			return getRuleContext(RoleDeclarationContext.class,0);
		}
		public AssocMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assocMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssocMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssocMemberDeclarationContext assocMemberDeclaration() throws RecognitionException {
		AssocMemberDeclarationContext _localctx = new AssocMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assocMemberDeclaration);
		try {
			setState(314);
			switch (_input.LA(1)) {
			case T__41:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); roleDeclaration();
				}
				break;
			case T__83:
			case T__81:
			case T__73:
			case T__72:
			case T__59:
			case T__54:
			case T__53:
			case T__50:
			case T__49:
			case T__43:
			case T__39:
			case T__38:
			case T__37:
			case T__34:
			case T__29:
			case T__15:
			case T__14:
			case T__9:
			case T__7:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); memberDeclaration();
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
		enterRule(_localctx, 34, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(T__54);
			setState(317); typing();
			setState(320);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(318); match(T__63);
				setState(319); expression(0);
				}
			}

			setState(322); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_sortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(T__7);
			setState(325); match(Identifier);
			setState(326); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(T__7);
			setState(329); match(Identifier);
			setState(331);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(330); typeParameters();
				}
			}

			setState(333); match(T__63);
			setState(334); type(0);
			setState(335); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(T__34);
			setState(338); typing();
			setState(341);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(339); match(T__63);
				setState(340); expression(0);
				}
			}

			setState(343); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_typing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(Identifier);
			setState(346); match(T__40);
			setState(347); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleDeclarationContext extends ParserRuleContext {
		public RefDeclarationContext refDeclaration() {
			return getRuleContext(RefDeclarationContext.class,0);
		}
		public PartDeclarationContext partDeclaration() {
			return getRuleContext(PartDeclarationContext.class,0);
		}
		public RoleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRoleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleDeclarationContext roleDeclaration() throws RecognitionException {
		RoleDeclarationContext _localctx = new RoleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_roleDeclaration);
		try {
			setState(351);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); partDeclaration();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(350); refDeclaration();
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

	public static class PartDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public PartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartDeclarationContext partDeclaration() throws RecognitionException {
		PartDeclarationContext _localctx = new PartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_partDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(T__35);
			setState(354); match(Identifier);
			setState(355); match(T__40);
			setState(356); match(Identifier);
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(357); multiplicity();
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

	public static class RefDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public RefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitRefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefDeclarationContext refDeclaration() throws RecognitionException {
		RefDeclarationContext _localctx = new RefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_refDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(T__41);
			setState(361); match(Identifier);
			setState(362); match(T__40);
			setState(363); match(Identifier);
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(364); multiplicity();
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

	public static class MultiplicityContext extends ParserRuleContext {
		public List<ExpressionOrStarContext> expressionOrStar() {
			return getRuleContexts(ExpressionOrStarContext.class);
		}
		public ExpressionOrStarContext expressionOrStar(int i) {
			return getRuleContext(ExpressionOrStarContext.class,i);
		}
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); expressionOrStar();
			setState(370);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(368); match(T__48);
				setState(369); expressionOrStar();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TypingListContext> typingList() {
			return getRuleContexts(TypingListContext.class);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public List<FunctionSpecificationContext> functionSpecification() {
			return getRuleContexts(FunctionSpecificationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public FunctionSpecificationContext functionSpecification(int i) {
			return getRuleContext(FunctionSpecificationContext.class,i);
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
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); match(T__59);
			setState(373); match(Identifier);
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374); match(T__39);
				setState(376);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(375); typingList();
					}
				}

				setState(378); match(T__67);
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__39 );
			setState(385);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(383); match(T__40);
				setState(384); type(0);
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__4) {
				{
				{
				setState(387); functionSpecification();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393); match(T__29);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
				{
				{
				setState(394); memberDeclaration();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400); match(T__77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecificationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitFunctionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecificationContext functionSpecification() throws RecognitionException {
		FunctionSpecificationContext _localctx = new FunctionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionSpecification);
		try {
			setState(406);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); match(T__19);
				setState(403); expression(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(404); match(T__4);
				setState(405); expression(0);
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
		enterRule(_localctx, 56, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(T__53);
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(409); match(Identifier);
				setState(410); match(T__40);
				}
				break;
			}
			setState(413); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__69) | (1L << T__61) | (1L << T__58) | (1L << T__55))) != 0) || _la==T__8) ) {
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
		enterRule(_localctx, 60, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__74) ) {
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
		enterRule(_localctx, 62, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__10) ) {
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
		enterRule(_localctx, 64, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==T__79 || _la==T__36) ) {
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
		enterRule(_localctx, 66, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__1) ) {
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
		enterRule(_localctx, 68, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__12) ) {
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
		enterRule(_localctx, 70, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==T__84 || _la==T__11) ) {
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
		enterRule(_localctx, 72, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__38) ) {
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
		enterRule(_localctx, 74, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==T__85 || _la==T__17) ) {
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
		enterRule(_localctx, 76, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__62) ) {
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
		enterRule(_localctx, 78, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__63) ) {
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
		enterRule(_localctx, 80, RULE_tokenStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(T__82);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_tokenArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(T__71);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); expression(0);
			setState(442); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
	public static class DoExpContext extends ExpressionContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public DoExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitDoExp(this);
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
	public static class TypeCheckContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCheckContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForExpContext extends ExpressionContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitForExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppExpContext extends ExpressionContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
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
	public static class ListCompExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ListCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitListCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedExpContext extends ExpressionContext {
		public BracketedExpressionContext bracketedExpression() {
			return getRuleContext(BracketedExpressionContext.class,0);
		}
		public BracketedExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBracketedExp(this);
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
	public static class BinOp3ExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TokenLessThanEqualContext tokenLessThanEqual() {
			return getRuleContext(TokenLessThanEqualContext.class,0);
		}
		public TokenLessThanContext tokenLessThan() {
			return getRuleContext(TokenLessThanContext.class,0);
		}
		public TokenNotContext tokenNot() {
			return getRuleContext(TokenNotContext.class,0);
		}
		public TokenGreatherThanContext tokenGreatherThan() {
			return getRuleContext(TokenGreatherThanContext.class,0);
		}
		public TokenGreaterThanEqualContext tokenGreaterThanEqual() {
			return getRuleContext(TokenGreaterThanEqualContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TokenEqualsContext tokenEquals() {
			return getRuleContext(TokenEqualsContext.class,0);
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
	public static class ExistsExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ExistsExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExistsExp(this);
			else return visitor.visitChildren(this);
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
	public static class TypeCastContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeCast(this);
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
	public static class MapCompExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public MapPairContext mapPair() {
			return getRuleContext(MapPairContext.class,0);
		}
		public MapCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMapCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TokenOrContext tokenOr() {
			return getRuleContext(TokenOrContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCompExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public SetCompExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitSetCompExp(this);
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
	public static class AndExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TokenAndContext tokenAnd() {
			return getRuleContext(TokenAndContext.class,0);
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
	public static class ForallExpContext extends ExpressionContext {
		public RngBindingListContext rngBindingList() {
			return getRuleContext(RngBindingListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(ModelParser.SUCHTHAT, 0); }
		public ForallExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitForallExp(this);
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
	public static class WhileExpContext extends ExpressionContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitWhileExp(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(445); tokenNot();
				setState(446); expression(23);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(448); match(T__14);
				setState(449); rngBindingList();
				setState(450); match(SUCHTHAT);
				setState(451); expression(22);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(453); match(T__9);
				setState(454); rngBindingList();
				setState(455); match(SUCHTHAT);
				setState(456); expression(21);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458); match(T__2);
				setState(459); expression(2);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460); pattern();
				setState(463);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(461); match(T__40);
					setState(462); type(0);
					}
				}

				setState(465); match(T__71);
				setState(466); expression(1);
				}
				break;
			case 6:
				{
				_localctx = new BracketedExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468); bracketedExpression();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469); literal();
				}
				break;
			case 8:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(470); match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471); match(T__37);
				setState(472); match(T__39);
				setState(473); expression(0);
				setState(474); match(T__67);
				setState(475); match(T__5);
				setState(476); expression(0);
				setState(479);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(477); match(T__25);
					setState(478); expression(0);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new DoExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481); match(T__72);
				setState(482); match(T__29);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					{
					setState(483); memberDeclaration();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489); match(T__77);
				}
				break;
			case 11:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490); match(T__43);
				setState(491); match(T__39);
				setState(492); expression(0);
				setState(493); match(T__67);
				setState(494); match(T__72);
				setState(495); match(T__29);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					{
					setState(496); memberDeclaration();
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502); match(T__77);
				}
				break;
			case 12:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504); match(T__15);
				setState(505); match(T__39);
				setState(506); pattern();
				setState(509);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(507); match(T__40);
					setState(508); type(0);
					}
				}

				setState(511); match(T__46);
				setState(512); expression(0);
				setState(513); match(T__67);
				setState(514); match(T__72);
				setState(515); match(T__29);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__59) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__34) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__7 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					{
					setState(516); memberDeclaration();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522); match(T__77);
				}
				break;
			case 13:
				{
				_localctx = new MatchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524); match(T__73);
				setState(525); expression(0);
				setState(526); match(T__44);
				setState(527); match();
				}
				break;
			case 14:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529); match(T__29);
				setState(531);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(530); expressionList();
					}
				}

				setState(533); match(T__77);
				}
				break;
			case 15:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(534); match(T__29);
				setState(535); expression(0);
				setState(536); match(T__48);
				setState(537); expression(0);
				setState(538); match(T__77);
				}
				break;
			case 16:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540); match(T__29);
				setState(541); expression(0);
				setState(542); match(T__51);
				setState(543); rngBindingList();
				setState(544); match(SUCHTHAT);
				setState(545); expression(0);
				setState(546); match(T__77);
				}
				break;
			case 17:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548); match(T__83);
				setState(550);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(549); expressionList();
					}
				}

				setState(552); match(T__47);
				}
				break;
			case 18:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553); match(T__83);
				setState(554); expression(0);
				setState(555); match(T__48);
				setState(556); expression(0);
				setState(557); match(T__47);
				}
				break;
			case 19:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559); match(T__83);
				setState(560); expression(0);
				setState(561); match(T__51);
				setState(562); pattern();
				setState(563); match(T__40);
				setState(564); expression(0);
				setState(565); match(SUCHTHAT);
				setState(566); expression(0);
				setState(567); match(T__47);
				}
				break;
			case 20:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569); match(T__81);
				setState(571);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
					{
					setState(570); mapPairList();
					}
				}

				setState(573); match(T__10);
				}
				break;
			case 21:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(574); match(T__81);
				setState(575); mapPair();
				setState(576); match(T__51);
				setState(577); rngBindingList();
				setState(578); match(SUCHTHAT);
				setState(579); expression(0);
				setState(580); match(T__10);
				}
				break;
			case 22:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582); match(T__50);
				setState(583); match(T__39);
				setState(584); expression(0);
				setState(585); match(T__67);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(644);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(589);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(590);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__82) | (1L << T__70) | (1L << T__57) | (1L << T__24))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__22 - 64)) | (1L << (T__20 - 64)) | (1L << (T__3 - 64)) | (1L << (T__0 - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(591); expression(13);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(592);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(593);
						_la = _input.LA(1);
						if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__68 - 18)) | (1L << (T__42 - 18)) | (1L << (T__16 - 18)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(594); expression(12);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(595);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(608);
						switch (_input.LA(1)) {
						case T__79:
						case T__36:
							{
							setState(596); tokenLessThanEqual();
							}
							break;
						case T__56:
						case T__1:
							{
							setState(597); tokenGreaterThanEqual();
							}
							break;
						case T__81:
						case T__74:
							{
							setState(598); tokenLessThan();
							}
							break;
						case T__64:
						case T__10:
							{
							setState(599); tokenGreatherThan();
							}
							break;
						case T__75:
						case T__63:
							{
							setState(600); tokenEquals();
							}
							break;
						case T__49:
						case T__38:
							{
							setState(601); tokenNot();
							setState(602); tokenEquals();
							}
							break;
						case T__26:
							{
							setState(604); match(T__26);
							}
							break;
						case T__80:
							{
							setState(605); match(T__80);
							}
							break;
						case T__76:
							{
							setState(606); match(T__76);
							}
							break;
						case T__60:
							{
							setState(607); match(T__60);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(610); expression(11);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(612); tokenAnd();
						setState(613); expression(10);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(616); tokenOr();
						setState(617); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(619);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(622);
						switch (_input.LA(1)) {
						case T__85:
						case T__17:
							{
							setState(620); tokenImplies();
							}
							break;
						case T__65:
						case T__62:
							{
							setState(621); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(624); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(626);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(627); match(T__6);
						setState(628); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(630); match(SUCHTHAT);
						setState(631); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(633); match(T__39);
						setState(635);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__73) | (1L << T__72) | (1L << T__50) | (1L << T__49) | (1L << T__43) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__29))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__15 - 71)) | (1L << (T__14 - 71)) | (1L << (T__9 - 71)) | (1L << (T__2 - 71)) | (1L << (IntegerLiteral - 71)) | (1L << (FloatingPointLiteral - 71)) | (1L << (BooleanLiteral - 71)) | (1L << (NullLiteral - 71)) | (1L << (ThisLiteral - 71)) | (1L << (CharacterLiteral - 71)) | (1L << (StringLiteral - 71)) | (1L << (Identifier - 71)))) != 0)) {
							{
							setState(634); argumentList();
							}
						}

						setState(637); match(T__67);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(638);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(639); match(T__21);
						setState(640); type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(641);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(642); match(T__31);
						setState(643); type(0);
						}
						break;
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public NamedArgumentListContext namedArgumentList() {
			return getRuleContext(NamedArgumentListContext.class,0);
		}
		public PositionalArgumentListContext positionalArgumentList() {
			return getRuleContext(PositionalArgumentListContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentList);
		try {
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649); positionalArgumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650); namedArgumentList();
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

	public static class PositionalArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PositionalArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPositionalArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionalArgumentListContext positionalArgumentList() throws RecognitionException {
		PositionalArgumentListContext _localctx = new PositionalArgumentListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); expression(0);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(654); match(T__45);
				setState(655); expression(0);
				}
				}
				setState(660);
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

	public static class NamedArgumentListContext extends ParserRuleContext {
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNamedArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentListContext namedArgumentList() throws RecognitionException {
		NamedArgumentListContext _localctx = new NamedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); namedArgument();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(662); match(T__45);
				setState(663); namedArgument();
				}
				}
				setState(668);
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); match(Identifier);
			setState(670); match(T__63);
			setState(671); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketedExpressionContext extends ParserRuleContext {
		public BracketedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedExpression; }
	 
		public BracketedExpressionContext() { }
		public void copyFrom(BracketedExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TupleExpContext extends BracketedExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TupleExpContext(BracketedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTupleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends BracketedExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpContext(BracketedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketedExpressionContext bracketedExpression() throws RecognitionException {
		BracketedExpressionContext _localctx = new BracketedExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bracketedExpression);
		int _la;
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(673); match(T__39);
				setState(674); expression(0);
				setState(675); match(T__67);
				}
				break;
			case 2:
				_localctx = new TupleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(677); match(T__39);
				setState(678); expression(0);
				setState(681); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(679); match(T__45);
					setState(680); expression(0);
					}
					}
					setState(683); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__45 );
				setState(685); match(T__67);
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
		enterRule(_localctx, 98, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); idValuePair();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(690); match(T__45);
				setState(691); idValuePair();
				}
				}
				setState(696);
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
		enterRule(_localctx, 100, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(Identifier);
			setState(698); match(T__6);
			setState(699); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); matchPattern();
			setState(702); match(T__17);
			setState(703); expression(0);
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(704); match(T__51);
				setState(705); match();
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
		enterRule(_localctx, 104, RULE_matchPattern);
		int _la;
		try {
			setState(734);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(708); literal();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(709); match(T__66);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(710); match(Identifier);
				setState(722);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(711); match(T__39);
					setState(712); matchArgument();
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45) {
						{
						{
						setState(713); match(T__45);
						setState(714); matchArgument();
						}
						}
						setState(719);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(720); match(T__67);
					}
				}

				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(724); match(T__39);
				setState(725); matchPattern();
				setState(728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(726); match(T__45);
					setState(727); matchPattern();
					}
					}
					setState(730); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__45 );
				setState(732); match(T__67);
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
		enterRule(_localctx, 106, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(Identifier);
			setState(737); match(T__63);
			setState(738); matchPattern();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); mapPair();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(741); match(T__45);
				setState(742); mapPair();
				}
				}
				setState(747);
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
		enterRule(_localctx, 110, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); expression(0);
			setState(749); match(T__40);
			setState(750); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); rngBinding();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(753); match(T__45);
				setState(754); rngBinding();
				}
				}
				setState(759);
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
		enterRule(_localctx, 114, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); patternList();
			setState(761); match(T__40);
			setState(762); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764); pattern();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(765); match(T__45);
				setState(766); pattern();
				}
				}
				setState(771);
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
		enterRule(_localctx, 118, RULE_collectionOrType);
		try {
			setState(774);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773); type(0);
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
	public static class IdentPatternContext extends PatternContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pattern);
		int _la;
		try {
			setState(787);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(776); match(Identifier);
				}
				break;
			case T__39:
				_localctx = new CartesianPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(777); match(T__39);
				setState(778); pattern();
				setState(781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(779); match(T__45);
					setState(780); pattern();
					}
					}
					setState(783); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__45 );
				setState(785); match(T__67);
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
		enterRule(_localctx, 122, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); match(Identifier);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(790); match(T__45);
				setState(791); match(Identifier);
				}
				}
				setState(796);
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
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); expression(0);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(798); match(T__45);
				setState(799); expression(0);
				}
				}
				setState(804);
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
		enterRule(_localctx, 126, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805); match(Identifier);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(806); match(SUCHTHAT);
					setState(807); match(Identifier);
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		public TerminalNode NullLiteral() { return getToken(ModelParser.NullLiteral, 0); }
		public TerminalNode ThisLiteral() { return getToken(ModelParser.ThisLiteral, 0); }
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
		enterRule(_localctx, 128, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (IntegerLiteral - 88)) | (1L << (FloatingPointLiteral - 88)) | (1L << (BooleanLiteral - 88)) | (1L << (NullLiteral - 88)) | (1L << (ThisLiteral - 88)) | (1L << (CharacterLiteral - 88)) | (1L << (StringLiteral - 88)))) != 0)) ) {
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
		case 43: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 12);
		case 4: return precpred(_ctx, 11);
		case 5: return precpred(_ctx, 10);
		case 6: return precpred(_ctx, 9);
		case 7: return precpred(_ctx, 8);
		case 8: return precpred(_ctx, 7);
		case 9: return precpred(_ctx, 6);
		case 10: return precpred(_ctx, 30);
		case 11: return precpred(_ctx, 29);
		case 12: return precpred(_ctx, 5);
		case 13: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 8);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3e\u0332\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\5\2\u0086\n\2\3\2\7\2\u0089\n\2\f\2"+
		"\16\2\u008c\13\2\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\5\3\u0099\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3"+
		"\6\5\6\u00a7\n\6\3\6\5\6\u00aa\n\6\3\6\5\6\u00ad\n\6\3\6\3\6\7\6\u00b1"+
		"\n\6\f\6\16\6\u00b4\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00bc\n\7\f\7\16"+
		"\7\u00bf\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16"+
		"\n\u00d9\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f\u00e5"+
		"\13\f\3\r\3\r\3\r\3\r\7\r\u00eb\n\r\f\r\16\r\u00ee\13\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00f4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u010e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0118\n"+
		"\16\r\16\16\16\u0119\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13\16"+
		"\3\17\3\17\5\17\u0125\n\17\3\20\3\20\3\20\3\20\7\20\u012b\n\20\f\20\16"+
		"\20\u012e\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0139"+
		"\n\21\3\22\3\22\5\22\u013d\n\22\3\23\3\23\3\23\3\23\5\23\u0143\n\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u014e\n\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0158\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u0162\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0169\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\5\32\u0170\n\32\3\33\3\33\3\33\5\33\u0175"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u017b\n\34\3\34\6\34\u017e\n\34\r\34\16"+
		"\34\u017f\3\34\3\34\5\34\u0184\n\34\3\34\7\34\u0187\n\34\f\34\16\34\u018a"+
		"\13\34\3\34\3\34\7\34\u018e\n\34\f\34\16\34\u0191\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\5\35\u0199\n\35\3\36\3\36\3\36\5\36\u019e\n\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u01d2\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\5-\u01e2\n-\3-\3-\3-\7-\u01e7\n-\f-\16-\u01ea\13-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\7-\u01f4\n-\f-\16-\u01f7\13-\3-\3-\3-\3-\3-\3-\3-\5-\u0200\n-\3"+
		"-\3-\3-\3-\3-\3-\7-\u0208\n-\f-\16-\u020b\13-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u0216\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u0229\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u023e\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u024e\n-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0263\n-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0271\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u027e\n-\3-\3-\3-\3-\3-\3-\3-\7-\u0287\n-\f-\16-\u028a\13-\3"+
		".\3.\5.\u028e\n.\3/\3/\3/\7/\u0293\n/\f/\16/\u0296\13/\3\60\3\60\3\60"+
		"\7\60\u029b\n\60\f\60\16\60\u029e\13\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\6\62\u02ac\n\62\r\62\16\62\u02ad\3\62\3"+
		"\62\5\62\u02b2\n\62\3\63\3\63\3\63\7\63\u02b7\n\63\f\63\16\63\u02ba\13"+
		"\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u02c5\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02ce\n\66\f\66\16\66\u02d1\13\66"+
		"\3\66\3\66\5\66\u02d5\n\66\3\66\3\66\3\66\3\66\6\66\u02db\n\66\r\66\16"+
		"\66\u02dc\3\66\3\66\5\66\u02e1\n\66\3\67\3\67\3\67\3\67\38\38\38\78\u02ea"+
		"\n8\f8\168\u02ed\138\39\39\39\39\3:\3:\3:\7:\u02f6\n:\f:\16:\u02f9\13"+
		":\3;\3;\3;\3;\3<\3<\3<\7<\u0302\n<\f<\16<\u0305\13<\3=\3=\5=\u0309\n="+
		"\3>\3>\3>\3>\3>\6>\u0310\n>\r>\16>\u0311\3>\3>\5>\u0316\n>\3?\3?\3?\7"+
		"?\u031b\n?\f?\16?\u031e\13?\3@\3@\3@\7@\u0323\n@\f@\16@\u0326\13@\3A\3"+
		"A\3A\7A\u032b\nA\fA\16A\u032e\13A\3B\3B\3B\2\4\32XC\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\2\20\b\2\n\n\23\23\33\33\36\36!!PP\4\2\7\7\16\16"+
		"\4\2\30\30NN\4\2\t\t\64\64\4\2  WW\4\2<<LL\4\2\4\4MM\4\2\'\'\62\62\4\2"+
		"\3\3GG\4\2\27\27\32\32\4\2\r\r\31\31\n\2\6\6\22\22\37\37@@BBDDUUXX\5\2"+
		"\24\24..HH\3\2Z`\u036c\2\u0085\3\2\2\2\4\u0098\3\2\2\2\6\u009a\3\2\2\2"+
		"\b\u009d\3\2\2\2\n\u00a3\3\2\2\2\f\u00b7\3\2\2\2\16\u00c2\3\2\2\2\20\u00cd"+
		"\3\2\2\2\22\u00d2\3\2\2\2\24\u00da\3\2\2\2\26\u00de\3\2\2\2\30\u00e6\3"+
		"\2\2\2\32\u010d\3\2\2\2\34\u0124\3\2\2\2\36\u0126\3\2\2\2 \u0138\3\2\2"+
		"\2\"\u013c\3\2\2\2$\u013e\3\2\2\2&\u0146\3\2\2\2(\u014a\3\2\2\2*\u0153"+
		"\3\2\2\2,\u015b\3\2\2\2.\u0161\3\2\2\2\60\u0163\3\2\2\2\62\u016a\3\2\2"+
		"\2\64\u0171\3\2\2\2\66\u0176\3\2\2\28\u0198\3\2\2\2:\u019a\3\2\2\2<\u01a1"+
		"\3\2\2\2>\u01a3\3\2\2\2@\u01a5\3\2\2\2B\u01a7\3\2\2\2D\u01a9\3\2\2\2F"+
		"\u01ab\3\2\2\2H\u01ad\3\2\2\2J\u01af\3\2\2\2L\u01b1\3\2\2\2N\u01b3\3\2"+
		"\2\2P\u01b5\3\2\2\2R\u01b7\3\2\2\2T\u01b9\3\2\2\2V\u01bb\3\2\2\2X\u024d"+
		"\3\2\2\2Z\u028d\3\2\2\2\\\u028f\3\2\2\2^\u0297\3\2\2\2`\u029f\3\2\2\2"+
		"b\u02b1\3\2\2\2d\u02b3\3\2\2\2f\u02bb\3\2\2\2h\u02bf\3\2\2\2j\u02e0\3"+
		"\2\2\2l\u02e2\3\2\2\2n\u02e6\3\2\2\2p\u02ee\3\2\2\2r\u02f2\3\2\2\2t\u02fa"+
		"\3\2\2\2v\u02fe\3\2\2\2x\u0308\3\2\2\2z\u0315\3\2\2\2|\u0317\3\2\2\2~"+
		"\u031f\3\2\2\2\u0080\u0327\3\2\2\2\u0082\u032f\3\2\2\2\u0084\u0086\5\6"+
		"\4\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2\2\2\u0087"+
		"\u0089\5\b\5\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\2\2\3\u0094\3\3\2\2\2\u0095\u0099\5 \21\2\u0096\u0099\5\n\6\2"+
		"\u0097\u0099\5\f\7\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\5\3\2\2\2\u009a\u009b\78\2\2\u009b\u009c\5\u0080A\2\u009c"+
		"\7\3\2\2\2\u009d\u009e\7A\2\2\u009e\u00a1\5\u0080A\2\u009f\u00a0\7Y\2"+
		"\2\u00a0\u00a2\7\6\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\t"+
		"\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a6\7a\2\2\u00a5\u00a7\5\16\b\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5\24"+
		"\13\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00ad\5\30\r\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00b2\7;\2\2\u00af\u00b1\5 \21\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6\13\3\2\2\2\u00b7\u00b8"+
		"\7F\2\2\u00b8\u00b9\7a\2\2\u00b9\u00bd\7;\2\2\u00ba\u00bc\5\"\22\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\13\2\2\u00c1"+
		"\r\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c8\5\20\t\2\u00c4\u00c5\7+\2\2"+
		"\u00c5\u00c7\5\20\t\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7)\2\2\u00cc\17\3\2\2\2\u00cd\u00d0\7a\2\2\u00ce\u00cf\7\60\2\2"+
		"\u00cf\u00d1\5\22\n\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d7\5\32\16\2\u00d3\u00d4\7H\2\2\u00d4\u00d6\5\32\16"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\61\2\2\u00db"+
		"\u00dc\5\26\f\2\u00dc\u00dd\7\25\2\2\u00dd\25\3\2\2\2\u00de\u00e3\5,\27"+
		"\2\u00df\u00e0\7+\2\2\u00e0\u00e2\5,\27\2\u00e1\u00df\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7\u00ec\5\32\16\2\u00e8\u00e9\7"+
		"+\2\2\u00e9\u00eb\5\32\16\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\31\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f0\b\16\1\2\u00f0\u010e\5<\37\2\u00f1\u00f3\5\u0080A\2\u00f2"+
		"\u00f4\5\36\20\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u010e\3"+
		"\2\2\2\u00f5\u00f6\7;\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8\7\13\2\2\u00f8"+
		"\u010e\3\2\2\2\u00f9\u00fa\7\5\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\7"+
		")\2\2\u00fc\u010e\3\2\2\2\u00fd\u00fe\7\7\2\2\u00fe\u00ff\5\32\16\2\u00ff"+
		"\u0100\7+\2\2\u0100\u0101\5\32\16\2\u0101\u0102\7N\2\2\u0102\u010e\3\2"+
		"\2\2\u0103\u0104\7\61\2\2\u0104\u0105\5\32\16\2\u0105\u0106\7\25\2\2\u0106"+
		"\u010e\3\2\2\2\u0107\u0108\7:\2\2\u0108\u0109\5,\27\2\u0109\u010a\7Y\2"+
		"\2\u010a\u010b\5X-\2\u010b\u010c\7K\2\2\u010c\u010e\3\2\2\2\u010d\u00ef"+
		"\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f5\3\2\2\2\u010d\u00f9\3\2\2\2\u010d"+
		"\u00fd\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0107\3\2\2\2\u010e\u011f\3\2"+
		"\2\2\u010f\u0110\f\t\2\2\u0110\u0111\5T+\2\u0111\u0112\5\32\16\n\u0112"+
		"\u011e\3\2\2\2\u0113\u0117\f\n\2\2\u0114\u0115\5R*\2\u0115\u0116\5\32"+
		"\16\2\u0116\u0118\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011c\f\3"+
		"\2\2\u011c\u011e\7\67\2\2\u011d\u010f\3\2\2\2\u011d\u0113\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\33\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0125\5X-\2\u0123\u0125"+
		"\7\6\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\35\3\2\2\2\u0126"+
		"\u0127\7\5\2\2\u0127\u012c\5\32\16\2\u0128\u0129\7+\2\2\u0129\u012b\5"+
		"\32\16\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7)"+
		"\2\2\u0130\37\3\2\2\2\u0131\u0139\5&\24\2\u0132\u0139\5(\25\2\u0133\u0139"+
		"\5$\23\2\u0134\u0139\5*\26\2\u0135\u0139\5\66\34\2\u0136\u0139\5:\36\2"+
		"\u0137\u0139\5V,\2\u0138\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133"+
		"\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139!\3\2\2\2\u013a\u013d\5.\30\2\u013b\u013d\5 \21\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d#\3\2\2\2\u013e\u013f\7"+
		"\"\2\2\u013f\u0142\5,\27\2\u0140\u0141\7\31\2\2\u0141\u0143\5X-\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7e"+
		"\2\2\u0145%\3\2\2\2\u0146\u0147\7Q\2\2\u0147\u0148\7a\2\2\u0148\u0149"+
		"\7e\2\2\u0149\'\3\2\2\2\u014a\u014b\7Q\2\2\u014b\u014d\7a\2\2\u014c\u014e"+
		"\5\16\b\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0150\7\31\2\2\u0150\u0151\5\32\16\2\u0151\u0152\7e\2\2\u0152)"+
		"\3\2\2\2\u0153\u0154\7\66\2\2\u0154\u0157\5,\27\2\u0155\u0156\7\31\2\2"+
		"\u0156\u0158\5X-\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\7e\2\2\u015a+\3\2\2\2\u015b\u015c\7a\2\2\u015c\u015d"+
		"\7\60\2\2\u015d\u015e\5\32\16\2\u015e-\3\2\2\2\u015f\u0162\5\60\31\2\u0160"+
		"\u0162\5\62\32\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162/\3\2\2"+
		"\2\u0163\u0164\7\65\2\2\u0164\u0165\7a\2\2\u0165\u0166\7\60\2\2\u0166"+
		"\u0168\7a\2\2\u0167\u0169\5\64\33\2\u0168\u0167\3\2\2\2\u0168\u0169\3"+
		"\2\2\2\u0169\61\3\2\2\2\u016a\u016b\7/\2\2\u016b\u016c\7a\2\2\u016c\u016d"+
		"\7\60\2\2\u016d\u016f\7a\2\2\u016e\u0170\5\64\33\2\u016f\u016e\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\63\3\2\2\2\u0171\u0174\5\34\17\2\u0172\u0173"+
		"\7(\2\2\u0173\u0175\5\34\17\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2"+
		"\u0175\65\3\2\2\2\u0176\u0177\7\35\2\2\u0177\u017d\7a\2\2\u0178\u017a"+
		"\7\61\2\2\u0179\u017b\5\26\f\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017e\7\25\2\2\u017d\u0178\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u0182\7\60\2\2\u0182\u0184\5\32\16\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0187\58\35\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018f\7;\2\2\u018c\u018e\5 \21\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\13\2\2\u0193"+
		"\67\3\2\2\2\u0194\u0195\7E\2\2\u0195\u0199\5X-\2\u0196\u0197\7T\2\2\u0197"+
		"\u0199\5X-\2\u0198\u0194\3\2\2\2\u0198\u0196\3\2\2\2\u01999\3\2\2\2\u019a"+
		"\u019d\7#\2\2\u019b\u019c\7a\2\2\u019c\u019e\7\60\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5X-\2\u01a0;"+
		"\3\2\2\2\u01a1\u01a2\t\2\2\2\u01a2=\3\2\2\2\u01a3\u01a4\t\3\2\2\u01a4"+
		"?\3\2\2\2\u01a5\u01a6\t\4\2\2\u01a6A\3\2\2\2\u01a7\u01a8\t\5\2\2\u01a8"+
		"C\3\2\2\2\u01a9\u01aa\t\6\2\2\u01aaE\3\2\2\2\u01ab\u01ac\t\7\2\2\u01ac"+
		"G\3\2\2\2\u01ad\u01ae\t\b\2\2\u01aeI\3\2\2\2\u01af\u01b0\t\t\2\2\u01b0"+
		"K\3\2\2\2\u01b1\u01b2\t\n\2\2\u01b2M\3\2\2\2\u01b3\u01b4\t\13\2\2\u01b4"+
		"O\3\2\2\2\u01b5\u01b6\t\f\2\2\u01b6Q\3\2\2\2\u01b7\u01b8\7\6\2\2\u01b8"+
		"S\3\2\2\2\u01b9\u01ba\7\21\2\2\u01baU\3\2\2\2\u01bb\u01bc\5X-\2\u01bc"+
		"\u01bd\7e\2\2\u01bdW\3\2\2\2\u01be\u01bf\b-\1\2\u01bf\u01c0\5J&\2\u01c0"+
		"\u01c1\5X-\31\u01c1\u024e\3\2\2\2\u01c2\u01c3\7J\2\2\u01c3\u01c4\5r:\2"+
		"\u01c4\u01c5\7Y\2\2\u01c5\u01c6\5X-\30\u01c6\u024e\3\2\2\2\u01c7\u01c8"+
		"\7O\2\2\u01c8\u01c9\5r:\2\u01c9\u01ca\7Y\2\2\u01ca\u01cb\5X-\27\u01cb"+
		"\u024e\3\2\2\2\u01cc\u01cd\7V\2\2\u01cd\u024e\5X-\4\u01ce\u01d1\5z>\2"+
		"\u01cf\u01d0\7\60\2\2\u01d0\u01d2\5\32\16\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7\21\2\2\u01d4\u01d5\5"+
		"X-\3\u01d5\u024e\3\2\2\2\u01d6\u024e\5b\62\2\u01d7\u024e\5\u0082B\2\u01d8"+
		"\u024e\7a\2\2\u01d9\u01da\7\63\2\2\u01da\u01db\7\61\2\2\u01db\u01dc\5"+
		"X-\2\u01dc\u01dd\7\25\2\2\u01dd\u01de\7S\2\2\u01de\u01e1\5X-\2\u01df\u01e0"+
		"\7?\2\2\u01e0\u01e2\5X-\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u024e\3\2\2\2\u01e3\u01e4\7\20\2\2\u01e4\u01e8\7;\2\2\u01e5\u01e7\5 "+
		"\21\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u024e\7\13"+
		"\2\2\u01ec\u01ed\7-\2\2\u01ed\u01ee\7\61\2\2\u01ee\u01ef\5X-\2\u01ef\u01f0"+
		"\7\25\2\2\u01f0\u01f1\7\20\2\2\u01f1\u01f5\7;\2\2\u01f2\u01f4\5 \21\2"+
		"\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\13\2\2"+
		"\u01f9\u024e\3\2\2\2\u01fa\u01fb\7I\2\2\u01fb\u01fc\7\61\2\2\u01fc\u01ff"+
		"\5z>\2\u01fd\u01fe\7\60\2\2\u01fe\u0200\5\32\16\2\u01ff\u01fd\3\2\2\2"+
		"\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7*\2\2\u0202\u0203"+
		"\5X-\2\u0203\u0204\7\25\2\2\u0204\u0205\7\20\2\2\u0205\u0209\7;\2\2\u0206"+
		"\u0208\5 \21\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020d\7\13\2\2\u020d\u024e\3\2\2\2\u020e\u020f\7\17\2\2\u020f\u0210\5"+
		"X-\2\u0210\u0211\7,\2\2\u0211\u0212\5h\65\2\u0212\u024e\3\2\2\2\u0213"+
		"\u0215\7;\2\2\u0214\u0216\5~@\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u024e\7\13\2\2\u0218\u0219\7;\2\2\u0219\u021a"+
		"\5X-\2\u021a\u021b\7(\2\2\u021b\u021c\5X-\2\u021c\u021d\7\13\2\2\u021d"+
		"\u024e\3\2\2\2\u021e\u021f\7;\2\2\u021f\u0220\5X-\2\u0220\u0221\7%\2\2"+
		"\u0221\u0222\5r:\2\u0222\u0223\7Y\2\2\u0223\u0224\5X-\2\u0224\u0225\7"+
		"\13\2\2\u0225\u024e\3\2\2\2\u0226\u0228\7\5\2\2\u0227\u0229\5~@\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u024e\7)"+
		"\2\2\u022b\u022c\7\5\2\2\u022c\u022d\5X-\2\u022d\u022e\7(\2\2\u022e\u022f"+
		"\5X-\2\u022f\u0230\7)\2\2\u0230\u024e\3\2\2\2\u0231\u0232\7\5\2\2\u0232"+
		"\u0233\5X-\2\u0233\u0234\7%\2\2\u0234\u0235\5z>\2\u0235\u0236\7\60\2\2"+
		"\u0236\u0237\5X-\2\u0237\u0238\7Y\2\2\u0238\u0239\5X-\2\u0239\u023a\7"+
		")\2\2\u023a\u024e\3\2\2\2\u023b\u023d\7\7\2\2\u023c\u023e\5n8\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u024e\7N"+
		"\2\2\u0240\u0241\7\7\2\2\u0241\u0242\5p9\2\u0242\u0243\7%\2\2\u0243\u0244"+
		"\5r:\2\u0244\u0245\7Y\2\2\u0245\u0246\5X-\2\u0246\u0247\7N\2\2\u0247\u024e"+
		"\3\2\2\2\u0248\u0249\7&\2\2\u0249\u024a\7\61\2\2\u024a\u024b\5X-\2\u024b"+
		"\u024c\7\25\2\2\u024c\u024e\3\2\2\2\u024d\u01be\3\2\2\2\u024d\u01c2\3"+
		"\2\2\2\u024d\u01c7\3\2\2\2\u024d\u01cc\3\2\2\2\u024d\u01ce\3\2\2\2\u024d"+
		"\u01d6\3\2\2\2\u024d\u01d7\3\2\2\2\u024d\u01d8\3\2\2\2\u024d\u01d9\3\2"+
		"\2\2\u024d\u01e3\3\2\2\2\u024d\u01ec\3\2\2\2\u024d\u01fa\3\2\2\2\u024d"+
		"\u020e\3\2\2\2\u024d\u0213\3\2\2\2\u024d\u0218\3\2\2\2\u024d\u021e\3\2"+
		"\2\2\u024d\u0226\3\2\2\2\u024d\u022b\3\2\2\2\u024d\u0231\3\2\2\2\u024d"+
		"\u023b\3\2\2\2\u024d\u0240\3\2\2\2\u024d\u0248\3\2\2\2\u024e\u0288\3\2"+
		"\2\2\u024f\u0250\f\16\2\2\u0250\u0251\t\r\2\2\u0251\u0287\5X-\17\u0252"+
		"\u0253\f\r\2\2\u0253\u0254\t\16\2\2\u0254\u0287\5X-\16\u0255\u0262\f\f"+
		"\2\2\u0256\u0263\5B\"\2\u0257\u0263\5D#\2\u0258\u0263\5> \2\u0259\u0263"+
		"\5@!\2\u025a\u0263\5P)\2\u025b\u025c\5J&\2\u025c\u025d\5P)\2\u025d\u0263"+
		"\3\2\2\2\u025e\u0263\7>\2\2\u025f\u0263\7\b\2\2\u0260\u0263\7\f\2\2\u0261"+
		"\u0263\7\34\2\2\u0262\u0256\3\2\2\2\u0262\u0257\3\2\2\2\u0262\u0258\3"+
		"\2\2\2\u0262\u0259\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0262"+
		"\u025e\3\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0287\5X-\r\u0265\u0266\f\13\2\2\u0266"+
		"\u0267\5F$\2\u0267\u0268\5X-\f\u0268\u0287\3\2\2\2\u0269\u026a\f\n\2\2"+
		"\u026a\u026b\5H%\2\u026b\u026c\5X-\13\u026c\u0287\3\2\2\2\u026d\u0270"+
		"\f\t\2\2\u026e\u0271\5L\'\2\u026f\u0271\5N(\2\u0270\u026e\3\2\2\2\u0270"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\5X-\n\u0273\u0287\3\2\2"+
		"\2\u0274\u0275\f\b\2\2\u0275\u0276\7R\2\2\u0276\u0287\5X-\t\u0277\u0278"+
		"\f \2\2\u0278\u0279\7Y\2\2\u0279\u0287\7a\2\2\u027a\u027b\f\37\2\2\u027b"+
		"\u027d\7\61\2\2\u027c\u027e\5Z.\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0287\7\25\2\2\u0280\u0281\f\7\2\2\u0281"+
		"\u0282\7C\2\2\u0282\u0287\5\32\16\2\u0283\u0284\f\6\2\2\u0284\u0285\7"+
		"9\2\2\u0285\u0287\5\32\16\2\u0286\u024f\3\2\2\2\u0286\u0252\3\2\2\2\u0286"+
		"\u0255\3\2\2\2\u0286\u0265\3\2\2\2\u0286\u0269\3\2\2\2\u0286\u026d\3\2"+
		"\2\2\u0286\u0274\3\2\2\2\u0286\u0277\3\2\2\2\u0286\u027a\3\2\2\2\u0286"+
		"\u0280\3\2\2\2\u0286\u0283\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289Y\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e"+
		"\5\\/\2\u028c\u028e\5^\60\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e"+
		"[\3\2\2\2\u028f\u0294\5X-\2\u0290\u0291\7+\2\2\u0291\u0293\5X-\2\u0292"+
		"\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295]\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u029c\5`\61\2\u0298\u0299"+
		"\7+\2\2\u0299\u029b\5`\61\2\u029a\u0298\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d_\3\2\2\2\u029e\u029c\3\2\2\2"+
		"\u029f\u02a0\7a\2\2\u02a0\u02a1\7\31\2\2\u02a1\u02a2\5X-\2\u02a2a\3\2"+
		"\2\2\u02a3\u02a4\7\61\2\2\u02a4\u02a5\5X-\2\u02a5\u02a6\7\25\2\2\u02a6"+
		"\u02b2\3\2\2\2\u02a7\u02a8\7\61\2\2\u02a8\u02ab\5X-\2\u02a9\u02aa\7+\2"+
		"\2\u02aa\u02ac\5X-\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\7\25\2\2"+
		"\u02b0\u02b2\3\2\2\2\u02b1\u02a3\3\2\2\2\u02b1\u02a7\3\2\2\2\u02b2c\3"+
		"\2\2\2\u02b3\u02b8\5f\64\2\u02b4\u02b5\7+\2\2\u02b5\u02b7\5f\64\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9e\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7a\2\2\u02bc\u02bd"+
		"\7R\2\2\u02bd\u02be\5X-\2\u02beg\3\2\2\2\u02bf\u02c0\5j\66\2\u02c0\u02c1"+
		"\7G\2\2\u02c1\u02c4\5X-\2\u02c2\u02c3\7%\2\2\u02c3\u02c5\5h\65\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5i\3\2\2\2\u02c6\u02e1\5\u0082"+
		"B\2\u02c7\u02e1\7\26\2\2\u02c8\u02d4\7a\2\2\u02c9\u02ca\7\61\2\2\u02ca"+
		"\u02cf\5l\67\2\u02cb\u02cc\7+\2\2\u02cc\u02ce\5l\67\2\u02cd\u02cb\3\2"+
		"\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\7\25\2\2\u02d3\u02d5\3"+
		"\2\2\2\u02d4\u02c9\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02e1\3\2\2\2\u02d6"+
		"\u02d7\7\61\2\2\u02d7\u02da\5j\66\2\u02d8\u02d9\7+\2\2\u02d9\u02db\5j"+
		"\66\2\u02da\u02d8\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7\25\2\2\u02df\u02e1\3"+
		"\2\2\2\u02e0\u02c6\3\2\2\2\u02e0\u02c7\3\2\2\2\u02e0\u02c8\3\2\2\2\u02e0"+
		"\u02d6\3\2\2\2\u02e1k\3\2\2\2\u02e2\u02e3\7a\2\2\u02e3\u02e4\7\31\2\2"+
		"\u02e4\u02e5\5j\66\2\u02e5m\3\2\2\2\u02e6\u02eb\5p9\2\u02e7\u02e8\7+\2"+
		"\2\u02e8\u02ea\5p9\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02eco\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02ef\5X-\2\u02ef\u02f0\7\60\2\2\u02f0\u02f1\5X-\2\u02f1q\3\2\2\2\u02f2"+
		"\u02f7\5t;\2\u02f3\u02f4\7+\2\2\u02f4\u02f6\5t;\2\u02f5\u02f3\3\2\2\2"+
		"\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8s\3"+
		"\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\5v<\2\u02fb\u02fc\7\60\2\2\u02fc"+
		"\u02fd\5x=\2\u02fdu\3\2\2\2\u02fe\u0303\5z>\2\u02ff\u0300\7+\2\2\u0300"+
		"\u0302\5z>\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2"+
		"\2\u0303\u0304\3\2\2\2\u0304w\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0309"+
		"\5X-\2\u0307\u0309\5\32\16\2\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309"+
		"y\3\2\2\2\u030a\u0316\7a\2\2\u030b\u030c\7\61\2\2\u030c\u030f\5z>\2\u030d"+
		"\u030e\7+\2\2\u030e\u0310\5z>\2\u030f\u030d\3\2\2\2\u0310\u0311\3\2\2"+
		"\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314"+
		"\7\25\2\2\u0314\u0316\3\2\2\2\u0315\u030a\3\2\2\2\u0315\u030b\3\2\2\2"+
		"\u0316{\3\2\2\2\u0317\u031c\7a\2\2\u0318\u0319\7+\2\2\u0319\u031b\7a\2"+
		"\2\u031a\u0318\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d}\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0324\5X-\2\u0320\u0321"+
		"\7+\2\2\u0321\u0323\5X-\2\u0322\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\177\3\2\2\2\u0326\u0324\3\2\2"+
		"\2\u0327\u032c\7a\2\2\u0328\u0329\7Y\2\2\u0329\u032b\7a\2\2\u032a\u0328"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u0081\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\t\17\2\2\u0330\u0083\3"+
		"\2\2\2K\u0085\u008a\u0090\u0098\u00a1\u00a6\u00a9\u00ac\u00b2\u00bd\u00c8"+
		"\u00d0\u00d7\u00e3\u00ec\u00f3\u010d\u0119\u011d\u011f\u0124\u012c\u0138"+
		"\u013c\u0142\u014d\u0157\u0161\u0168\u016f\u0174\u017a\u017f\u0183\u0188"+
		"\u018f\u0198\u019d\u01d1\u01e1\u01e8\u01f5\u01ff\u0209\u0215\u0228\u023d"+
		"\u024d\u0262\u0270\u027d\u0286\u0288\u028d\u0294\u029c\u02ad\u02b1\u02b8"+
		"\u02c4\u02cf\u02d4\u02dc\u02e0\u02eb\u02f7\u0303\u0308\u0311\u0315\u031c"+
		"\u0324\u032c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}