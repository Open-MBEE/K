// Generated from ..\grammar\Model.g4 by ANTLR 4.4
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
		T__91=1, T__90=2, T__89=3, T__88=4, T__87=5, T__86=6, T__85=7, T__84=8, 
		T__83=9, T__82=10, T__81=11, T__80=12, T__79=13, T__78=14, T__77=15, T__76=16, 
		T__75=17, T__74=18, T__73=19, T__72=20, T__71=21, T__70=22, T__69=23, 
		T__68=24, T__67=25, T__66=26, T__65=27, T__64=28, T__63=29, T__62=30, 
		T__61=31, T__60=32, T__59=33, T__58=34, T__57=35, T__56=36, T__55=37, 
		T__54=38, T__53=39, T__52=40, T__51=41, T__50=42, T__49=43, T__48=44, 
		T__47=45, T__46=46, T__45=47, T__44=48, T__43=49, T__42=50, T__41=51, 
		T__40=52, T__39=53, T__38=54, T__37=55, T__36=56, T__35=57, T__34=58, 
		T__33=59, T__32=60, T__31=61, T__30=62, T__29=63, T__28=64, T__27=65, 
		T__26=66, T__25=67, T__24=68, T__23=69, T__22=70, T__21=71, T__20=72, 
		T__19=73, T__18=74, T__17=75, T__16=76, T__15=77, T__14=78, T__13=79, 
		T__12=80, T__11=81, T__10=82, T__9=83, T__8=84, T__7=85, T__6=86, T__5=87, 
		T__4=88, T__3=89, T__2=90, T__1=91, T__0=92, SUCHTHAT=93, IntegerLiteral=94, 
		FloatingPointLiteral=95, BooleanLiteral=96, NullLiteral=97, ThisLiteral=98, 
		CharacterLiteral=99, StringLiteral=100, Identifier=101, COMMENT=102, LINE_COMMENT=103, 
		WS=104, SEP=105, SEPSEP=106;
	public static final String[] tokenNames = {
		"<INVALID>", "'implies'", "'or'", "'['", "'*'", "'<'", "'!isin'", "'continue'", 
		"'<='", "'Bool'", "'}'", "'subset'", "'eq'", "'lt'", "'case'", "'do'", 
		"'->'", "'%'", "'Unit'", "'union'", "')'", "'_'", "'iff'", "'gt'", "'='", 
		"'<=>'", "'String'", "'psubset'", "'fun'", "'Int'", "'\\'", "'gte'", "'Char'", 
		"'val'", "'req'", "'class'", "'|'", "'assert'", "'!'", "'..'", "']'", 
		"'in'", "','", "'while'", "'-'", "'ref'", "':'", "'('", "'not'", "'if'", 
		"'lte'", "'part'", "'match'", "'var'", "'?'", "'package'", "'as'", "'{|'", 
		"'{'", "'and'", "'break'", "'extends'", "'isin'", "'else'", "'++'", "'$'", 
		"'import'", "'^'", "'is'", "'inter'", "'pre'", "'assoc'", "'=>'", "'+'", 
		"'for'", "'forall'", "'return'", "'|}'", "'&&'", "'with'", "'||'", "'>'", 
		"'exists'", "'Real'", "'type'", "':='", "'then'", "'post'", "'/'", "'~'", 
		"'>='", "'#'", "'end'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "'null'", "'this'", "CharacterLiteral", "StringLiteral", 
		"Identifier", "COMMENT", "LINE_COMMENT", "WS", "';'", "';;'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclarationList = 1, RULE_topDeclaration = 2, 
		RULE_packageDeclaration = 3, RULE_importDeclaration = 4, RULE_memberDeclarationList = 5, 
		RULE_assocMemberDeclarationList = 6, RULE_classDeclaration = 7, RULE_assocDeclaration = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11, 
		RULE_extending = 12, RULE_type = 13, RULE_expressionOrStar = 14, RULE_typeArguments = 15, 
		RULE_memberDeclaration = 16, RULE_assocMemberDeclaration = 17, RULE_valueDeclaration = 18, 
		RULE_sortDeclaration = 19, RULE_typeDeclaration = 20, RULE_variableDeclaration = 21, 
		RULE_roleDeclaration = 22, RULE_partDeclaration = 23, RULE_refDeclaration = 24, 
		RULE_multiplicity = 25, RULE_functionDeclaration = 26, RULE_shortFunctionDeclaration = 27, 
		RULE_longFunctionDeclaration = 28, RULE_functionSpecification = 29, RULE_constraint = 30, 
		RULE_primitiveType = 31, RULE_tokenLessThan = 32, RULE_tokenGreatherThan = 33, 
		RULE_tokenLessThanEqual = 34, RULE_tokenGreaterThanEqual = 35, RULE_tokenAnd = 36, 
		RULE_tokenOr = 37, RULE_tokenNot = 38, RULE_tokenImplies = 39, RULE_tokenIFF = 40, 
		RULE_tokenEquals = 41, RULE_tokenStar = 42, RULE_tokenArrow = 43, RULE_tokenEnd = 44, 
		RULE_effect = 45, RULE_expression = 46, RULE_argumentList = 47, RULE_positionalArgumentList = 48, 
		RULE_namedArgumentList = 49, RULE_namedArgument = 50, RULE_bracketedExpression = 51, 
		RULE_idValueList = 52, RULE_idValuePair = 53, RULE_match = 54, RULE_mapPairList = 55, 
		RULE_mapPair = 56, RULE_rngBindingList = 57, RULE_rngBinding = 58, RULE_patternList = 59, 
		RULE_collectionOrType = 60, RULE_pattern = 61, RULE_identifierList = 62, 
		RULE_expressionList = 63, RULE_qualifiedName = 64, RULE_literal = 65;
	public static final String[] ruleNames = {
		"model", "topDeclarationList", "topDeclaration", "packageDeclaration", 
		"importDeclaration", "memberDeclarationList", "assocMemberDeclarationList", 
		"classDeclaration", "assocDeclaration", "typeParameters", "typeParameter", 
		"typeBound", "extending", "type", "expressionOrStar", "typeArguments", 
		"memberDeclaration", "assocMemberDeclaration", "valueDeclaration", "sortDeclaration", 
		"typeDeclaration", "variableDeclaration", "roleDeclaration", "partDeclaration", 
		"refDeclaration", "multiplicity", "functionDeclaration", "shortFunctionDeclaration", 
		"longFunctionDeclaration", "functionSpecification", "constraint", "primitiveType", 
		"tokenLessThan", "tokenGreatherThan", "tokenLessThanEqual", "tokenGreaterThanEqual", 
		"tokenAnd", "tokenOr", "tokenNot", "tokenImplies", "tokenIFF", "tokenEquals", 
		"tokenStar", "tokenArrow", "tokenEnd", "effect", "expression", "argumentList", 
		"positionalArgumentList", "namedArgumentList", "namedArgument", "bracketedExpression", 
		"idValueList", "idValuePair", "match", "mapPairList", "mapPair", "rngBindingList", 
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
		public TopDeclarationListContext topDeclarationList() {
			return getRuleContext(TopDeclarationListContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
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
			setState(133);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(132); packageDeclaration();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(135); importDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__21 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(141); topDeclarationList();
				}
			}

			setState(144); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopDeclarationListContext extends ParserRuleContext {
		public List<TopDeclarationContext> topDeclaration() {
			return getRuleContexts(TopDeclarationContext.class);
		}
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
		}
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public TopDeclarationContext topDeclaration(int i) {
			return getRuleContext(TopDeclarationContext.class,i);
		}
		public TopDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTopDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopDeclarationListContext topDeclarationList() throws RecognitionException {
		TopDeclarationListContext _localctx = new TopDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topDeclarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146); topDeclaration();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); match(SEP);
					setState(148); topDeclaration();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(155);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(154); match(SEP);
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
		enterRule(_localctx, 4, RULE_topDeclaration);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__89:
			case T__87:
			case T__85:
			case T__71:
			case T__64:
			case T__59:
			case T__58:
			case T__55:
			case T__54:
			case T__49:
			case T__45:
			case T__44:
			case T__43:
			case T__40:
			case T__39:
			case T__34:
			case T__32:
			case T__27:
			case T__18:
			case T__17:
			case T__16:
			case T__10:
			case T__8:
			case T__3:
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
				setState(157); memberDeclaration();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); classDeclaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); assocDeclaration();
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
		enterRule(_localctx, 6, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__37);
			setState(163); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__26);
			setState(166); qualifiedName();
			setState(169);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(167); match(SUCHTHAT);
				setState(168); match(T__88);
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

	public static class MemberDeclarationListContext extends ParserRuleContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
		}
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public MemberDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMemberDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationListContext memberDeclarationList() throws RecognitionException {
		MemberDeclarationListContext _localctx = new MemberDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); memberDeclaration();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172); match(SEP);
					setState(173); memberDeclaration();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(180);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(179); match(SEP);
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

	public static class AssocMemberDeclarationListContext extends ParserRuleContext {
		public AssocMemberDeclarationContext assocMemberDeclaration(int i) {
			return getRuleContext(AssocMemberDeclarationContext.class,i);
		}
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
		}
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public List<AssocMemberDeclarationContext> assocMemberDeclaration() {
			return getRuleContexts(AssocMemberDeclarationContext.class);
		}
		public AssocMemberDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assocMemberDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssocMemberDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssocMemberDeclarationListContext assocMemberDeclarationList() throws RecognitionException {
		AssocMemberDeclarationListContext _localctx = new AssocMemberDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assocMemberDeclarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182); assocMemberDeclaration();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183); match(SEP);
					setState(184); assocMemberDeclaration();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(191);
			_la = _input.LA(1);
			if (_la==SEP) {
				{
				setState(190); match(SEP);
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public MemberDeclarationListContext memberDeclarationList() {
			return getRuleContext(MemberDeclarationListContext.class,0);
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
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(T__57);
			setState(194); match(Identifier);
			setState(196);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(195); typeParameters();
				}
			}

			setState(199);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(198); extending();
				}
			}

			setState(201); match(T__34);
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(202); memberDeclarationList();
				}
			}

			setState(205); match(T__82);
			}
		}
		catch (RecognitionException re) {
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
		public AssocMemberDeclarationListContext assocMemberDeclarationList() {
			return getRuleContext(AssocMemberDeclarationListContext.class,0);
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
		enterRule(_localctx, 16, RULE_assocDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(T__21);
			setState(208); match(Identifier);
			setState(209); match(T__34);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__47) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(210); assocMemberDeclarationList();
				}
			}

			setState(213); match(T__82);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(T__89);
			setState(216); typeParameter();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(217); match(T__50);
				setState(218); typeParameter();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(Identifier);
			setState(229);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(227); match(T__46);
				setState(228); typeBound();
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
		enterRule(_localctx, 22, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); type(0);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(232); match(T__19);
				setState(233); type(0);
				}
				}
				setState(238);
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
		enterRule(_localctx, 24, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__31);
			setState(240); type(0);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(241); match(T__50);
				setState(242); type(0);
				}
				}
				setState(247);
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			switch (_input.LA(1)) {
			case T__83:
			case T__74:
			case T__66:
			case T__63:
			case T__60:
			case T__9:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); qualifiedName();
				setState(252);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(251); typeArguments();
					}
					break;
				}
				}
				break;
			case T__34:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(T__34);
				setState(255); type(0);
				setState(256); match(T__82);
				}
				break;
			case T__89:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); match(T__89);
				setState(259); type(0);
				setState(260); match(T__52);
				}
				break;
			case T__87:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); match(T__87);
				setState(263); type(0);
				setState(264); match(T__50);
				setState(265); type(0);
				setState(266); match(T__11);
				}
				break;
			case T__45:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); match(T__45);
				setState(269); type(0);
				setState(270); match(T__72);
				}
				break;
			case T__35:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); match(T__35);
				setState(273); match(Identifier);
				setState(274); match(T__46);
				setState(275); type(0);
				setState(276); match(SUCHTHAT);
				setState(277); expression(0);
				setState(278); match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(282);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(283); tokenArrow();
						setState(284); type(8);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(286);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(290); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(287); tokenStar();
								setState(288); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(292); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(294);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(295); match(T__38);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 28, RULE_expressionOrStar);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case T__89:
			case T__87:
			case T__85:
			case T__71:
			case T__55:
			case T__54:
			case T__49:
			case T__45:
			case T__44:
			case T__43:
			case T__40:
			case T__34:
			case T__32:
			case T__27:
			case T__18:
			case T__17:
			case T__16:
			case T__10:
			case T__3:
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
				setState(301); expression(0);
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(T__88);
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
		enterRule(_localctx, 30, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(T__89);
			setState(306); type(0);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(307); match(T__50);
				setState(308); type(0);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 32, RULE_memberDeclaration);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(321); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322); expression(0);
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
		enterRule(_localctx, 34, RULE_assocMemberDeclaration);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case T__47:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); roleDeclaration();
				}
				break;
			case T__89:
			case T__87:
			case T__85:
			case T__71:
			case T__64:
			case T__59:
			case T__58:
			case T__55:
			case T__54:
			case T__49:
			case T__45:
			case T__44:
			case T__43:
			case T__40:
			case T__39:
			case T__34:
			case T__32:
			case T__27:
			case T__18:
			case T__17:
			case T__16:
			case T__10:
			case T__8:
			case T__3:
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
				setState(326); memberDeclaration();
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
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
		enterRule(_localctx, 36, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(T__59);
			setState(330); pattern(0);
			setState(333);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(331); match(T__68);
				setState(332); expression(0);
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
		enterRule(_localctx, 38, RULE_sortDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(T__8);
			setState(336); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(T__8);
			setState(339); match(Identifier);
			setState(341);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(340); typeParameters();
				}
			}

			setState(343); match(T__68);
			setState(344); type(0);
			}
		}
		catch (RecognitionException re) {
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
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
		enterRule(_localctx, 42, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(T__39);
			setState(347); pattern(0);
			setState(350);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(348); match(T__68);
				setState(349); expression(0);
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
			setState(354);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); partDeclaration();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); refDeclaration();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(T__41);
			setState(357); match(Identifier);
			setState(358); match(T__46);
			setState(359); match(Identifier);
			setState(361);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(360); multiplicity();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(T__47);
			setState(364); match(Identifier);
			setState(365); match(T__46);
			setState(366); match(Identifier);
			setState(368);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__88) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(367); multiplicity();
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
			setState(370); expressionOrStar();
			setState(373);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(371); match(T__53);
				setState(372); expressionOrStar();
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
		public LongFunctionDeclarationContext longFunctionDeclaration() {
			return getRuleContext(LongFunctionDeclarationContext.class,0);
		}
		public ShortFunctionDeclarationContext shortFunctionDeclaration() {
			return getRuleContext(ShortFunctionDeclarationContext.class,0);
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
		try {
			setState(377);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); shortFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); longFunctionDeclaration();
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

	public static class ShortFunctionDeclarationContext extends ParserRuleContext {
		public PatternListContext patternList(int i) {
			return getRuleContext(PatternListContext.class,i);
		}
		public List<PatternListContext> patternList() {
			return getRuleContexts(PatternListContext.class);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShortFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortFunctionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitShortFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortFunctionDeclarationContext shortFunctionDeclaration() throws RecognitionException {
		ShortFunctionDeclarationContext _localctx = new ShortFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shortFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(T__64);
			setState(380); match(Identifier);
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381); match(T__45);
				setState(383);
				_la = _input.LA(1);
				if (_la==T__71 || _la==T__45 || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (IntegerLiteral - 94)) | (1L << (FloatingPointLiteral - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (NullLiteral - 94)) | (1L << (ThisLiteral - 94)) | (1L << (CharacterLiteral - 94)) | (1L << (StringLiteral - 94)) | (1L << (Identifier - 94)))) != 0)) {
					{
					setState(382); patternList();
					}
				}

				setState(385); match(T__72);
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__45 );
			setState(392);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(390); match(T__46);
				setState(391); type(0);
				}
			}

			setState(394); match(T__68);
			setState(395); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongFunctionDeclarationContext extends ParserRuleContext {
		public PatternListContext patternList(int i) {
			return getRuleContext(PatternListContext.class,i);
		}
		public List<FunctionSpecificationContext> functionSpecification() {
			return getRuleContexts(FunctionSpecificationContext.class);
		}
		public List<PatternListContext> patternList() {
			return getRuleContexts(PatternListContext.class);
		}
		public FunctionSpecificationContext functionSpecification(int i) {
			return getRuleContext(FunctionSpecificationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MemberDeclarationListContext memberDeclarationList() {
			return getRuleContext(MemberDeclarationListContext.class,0);
		}
		public LongFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longFunctionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLongFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongFunctionDeclarationContext longFunctionDeclaration() throws RecognitionException {
		LongFunctionDeclarationContext _localctx = new LongFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_longFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(T__64);
			setState(398); match(Identifier);
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399); match(T__45);
				setState(401);
				_la = _input.LA(1);
				if (_la==T__71 || _la==T__45 || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (IntegerLiteral - 94)) | (1L << (FloatingPointLiteral - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (NullLiteral - 94)) | (1L << (ThisLiteral - 94)) | (1L << (CharacterLiteral - 94)) | (1L << (StringLiteral - 94)) | (1L << (Identifier - 94)))) != 0)) {
					{
					setState(400); patternList();
					}
				}

				setState(403); match(T__72);
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__45 );
			setState(410);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(408); match(T__46);
				setState(409); type(0);
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__5) {
				{
				{
				setState(412); functionSpecification();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418); match(T__34);
			setState(420);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(419); memberDeclarationList();
				}
			}

			setState(422); match(T__82);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_functionSpecification);
		try {
			setState(428);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); match(T__22);
				setState(425); expression(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); match(T__5);
				setState(427); expression(0);
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
		enterRule(_localctx, 60, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(T__58);
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(431); match(Identifier);
				setState(432); match(T__46);
				}
				break;
			}
			setState(435); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__74) | (1L << T__66) | (1L << T__63) | (1L << T__60))) != 0) || _la==T__9) ) {
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
		enterRule(_localctx, 64, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==T__87 || _la==T__79) ) {
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
		enterRule(_localctx, 66, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__11) ) {
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
		enterRule(_localctx, 68, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==T__84 || _la==T__42) ) {
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
		enterRule(_localctx, 70, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==T__61 || _la==T__2) ) {
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
		enterRule(_localctx, 72, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__14) ) {
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
		enterRule(_localctx, 74, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==T__90 || _la==T__12) ) {
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
		enterRule(_localctx, 76, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__44) ) {
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
		enterRule(_localctx, 78, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==T__91 || _la==T__20) ) {
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
		enterRule(_localctx, 80, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==T__70 || _la==T__67) ) {
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
		enterRule(_localctx, 82, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__68) ) {
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
		enterRule(_localctx, 84, RULE_tokenStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(T__88);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_tokenArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(T__76);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenEndContext extends ParserRuleContext {
		public TokenEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTokenEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenEndContext tokenEnd() throws RecognitionException {
		TokenEndContext _localctx = new TokenEndContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tokenEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EffectContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
		}
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); expression(0);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(466); match(SEP);
				setState(467); expression(0);
				}
				}
				setState(472);
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
	public static class ResultExpContext extends ExpressionContext {
		public ResultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitResultExp(this);
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
	public static class ForExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberDeclarationListContext memberDeclarationList() {
			return getRuleContext(MemberDeclarationListContext.class,0);
		}
		public TokenEndContext tokenEnd() {
			return getRuleContext(TokenEndContext.class,0);
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
	public static class TypeCheckExpContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCheckExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeCheckExp(this);
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
	public static class TypeCastExpContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypeCastExp(this);
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
	public static class ContinueExpContext extends ExpressionContext {
		public ContinueExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitContinueExp(this);
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
	public static class ReturnExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpressionContext {
		public MemberDeclarationListContext memberDeclarationList(int i) {
			return getRuleContext(MemberDeclarationListContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MemberDeclarationListContext> memberDeclarationList() {
			return getRuleContexts(MemberDeclarationListContext.class);
		}
		public TokenEndContext tokenEnd() {
			return getRuleContext(TokenEndContext.class,0);
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
	public static class BreakExpContext extends ExpressionContext {
		public BreakExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBreakExp(this);
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
		public MatchContext match(int i) {
			return getRuleContext(MatchContext.class,i);
		}
		public List<MatchContext> match() {
			return getRuleContexts(MatchContext.class);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberDeclarationListContext memberDeclarationList() {
			return getRuleContext(MemberDeclarationListContext.class,0);
		}
		public TokenEndContext tokenEnd() {
			return getRuleContext(TokenEndContext.class,0);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(474); tokenNot();
				setState(475); expression(27);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(477); match(T__17);
				setState(478); rngBindingList();
				setState(479); match(SUCHTHAT);
				setState(480); expression(26);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482); match(T__10);
				setState(483); rngBindingList();
				setState(484); match(SUCHTHAT);
				setState(485); expression(25);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(487); match(T__3);
				setState(488); expression(6);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489); pattern(0);
				setState(490); match(T__76);
				setState(491); expression(5);
				}
				break;
			case 6:
				{
				_localctx = new BracketedExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493); bracketedExpression();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494); literal();
				}
				break;
			case 8:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495); match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496); match(T__43);
				setState(497); expression(0);
				setState(498); match(T__6);
				setState(500);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(499); memberDeclarationList();
					}
				}

				setState(506);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(502); match(T__29);
					setState(504);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
						{
						setState(503); memberDeclarationList();
						}
					}

					}
				}

				setState(508); tokenEnd();
				}
				break;
			case 10:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510); match(T__49);
				setState(511); expression(0);
				setState(512); match(T__77);
				setState(514);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(513); memberDeclarationList();
					}
				}

				setState(516); tokenEnd();
				}
				break;
			case 11:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518); match(T__18);
				setState(519); match(T__45);
				setState(520); pattern(0);
				setState(521); match(T__51);
				setState(522); expression(0);
				setState(523); match(T__72);
				setState(524); match(T__77);
				setState(526);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__64) | (1L << T__59) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__39) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(525); memberDeclarationList();
					}
				}

				setState(528); tokenEnd();
				}
				break;
			case 12:
				{
				_localctx = new MatchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(530); match(T__40);
				setState(531); expression(0);
				setState(532); match(T__13);
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533); match();
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__78 );
				setState(538); match(T__0);
				}
				break;
			case 13:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540); match(T__34);
				setState(542);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(541); expressionList();
					}
				}

				setState(544); match(T__82);
				}
				break;
			case 14:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(545); match(T__34);
				setState(546); expression(0);
				setState(547); match(T__53);
				setState(548); expression(0);
				setState(549); match(T__82);
				}
				break;
			case 15:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(551); match(T__34);
				setState(552); expression(0);
				setState(553); match(T__56);
				setState(554); rngBindingList();
				setState(555); match(SUCHTHAT);
				setState(556); expression(0);
				setState(557); match(T__82);
				}
				break;
			case 16:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559); match(T__89);
				setState(561);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(560); expressionList();
					}
				}

				setState(563); match(T__52);
				}
				break;
			case 17:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(564); match(T__89);
				setState(565); expression(0);
				setState(566); match(T__53);
				setState(567); expression(0);
				setState(568); match(T__52);
				}
				break;
			case 18:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(570); match(T__89);
				setState(571); expression(0);
				setState(572); match(T__56);
				setState(573); pattern(0);
				setState(574); match(T__51);
				setState(575); expression(0);
				setState(576); match(SUCHTHAT);
				setState(577); expression(0);
				setState(578); match(T__52);
				}
				break;
			case 19:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580); match(T__87);
				setState(582);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(581); mapPairList();
					}
				}

				setState(584); match(T__11);
				}
				break;
			case 20:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(585); match(T__87);
				setState(586); mapPair();
				setState(587); match(T__56);
				setState(588); rngBindingList();
				setState(589); match(SUCHTHAT);
				setState(590); expression(0);
				setState(591); match(T__11);
				}
				break;
			case 21:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593); match(T__55);
				setState(594); match(T__45);
				setState(595); expression(0);
				setState(596); match(T__72);
				}
				break;
			case 22:
				{
				_localctx = new ContinueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(598); match(T__85);
				}
				break;
			case 23:
				{
				_localctx = new BreakExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(599); match(T__32);
				}
				break;
			case 24:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(600); match(T__16);
				setState(602);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(601); expression(0);
					}
					break;
				}
				}
				break;
			case 25:
				{
				_localctx = new ResultExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(604); match(T__27);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(662);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(607);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(608);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__75) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__28 - 64)) | (1L << (T__25 - 64)) | (1L << (T__23 - 64)) | (1L << (T__4 - 64)) | (1L << (T__1 - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(609); expression(17);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(610);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(611);
						_la = _input.LA(1);
						if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__73 - 19)) | (1L << (T__48 - 19)) | (1L << (T__19 - 19)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(612); expression(16);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(613);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(626);
						switch (_input.LA(1)) {
						case T__84:
						case T__42:
							{
							setState(614); tokenLessThanEqual();
							}
							break;
						case T__61:
						case T__2:
							{
							setState(615); tokenGreaterThanEqual();
							}
							break;
						case T__87:
						case T__79:
							{
							setState(616); tokenLessThan();
							}
							break;
						case T__69:
						case T__11:
							{
							setState(617); tokenGreatherThan();
							}
							break;
						case T__80:
						case T__68:
							{
							setState(618); tokenEquals();
							}
							break;
						case T__54:
						case T__44:
							{
							setState(619); tokenNot();
							setState(620); tokenEquals();
							}
							break;
						case T__30:
							{
							setState(622); match(T__30);
							}
							break;
						case T__86:
							{
							setState(623); match(T__86);
							}
							break;
						case T__81:
							{
							setState(624); match(T__81);
							}
							break;
						case T__65:
							{
							setState(625); match(T__65);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(628); expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(630); tokenAnd();
						setState(631); expression(14);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(633);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(634); tokenOr();
						setState(635); expression(13);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(637);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(640);
						switch (_input.LA(1)) {
						case T__91:
						case T__20:
							{
							setState(638); tokenImplies();
							}
							break;
						case T__70:
						case T__67:
							{
							setState(639); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(642); expression(12);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(644);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(645); match(T__7);
						setState(646); expression(11);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(648); match(SUCHTHAT);
						setState(649); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(650);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(651); match(T__45);
						setState(653);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__89) | (1L << T__87) | (1L << T__85) | (1L << T__71) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__27 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__10 - 65)) | (1L << (T__3 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(652); argumentList();
							}
						}

						setState(655); match(T__72);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(656);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(657); match(T__24);
						setState(658); type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(660); match(T__36);
						setState(661); type(0);
						}
						break;
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedArgListContext extends ArgumentListContext {
		public NamedArgumentListContext namedArgumentList() {
			return getRuleContext(NamedArgumentListContext.class,0);
		}
		public NamedArgListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitNamedArgList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PosArgListContext extends ArgumentListContext {
		public PositionalArgumentListContext positionalArgumentList() {
			return getRuleContext(PositionalArgumentListContext.class,0);
		}
		public PosArgListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPosArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_argumentList);
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new PosArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(667); positionalArgumentList();
				}
				break;
			case 2:
				_localctx = new NamedArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(668); namedArgumentList();
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
		enterRule(_localctx, 96, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671); expression(0);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(672); match(T__50);
				setState(673); expression(0);
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
		enterRule(_localctx, 98, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); namedArgument();
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(680); match(T__50);
				setState(681); namedArgument();
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
		enterRule(_localctx, 100, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); match(Identifier);
			setState(688); match(T__68);
			setState(689); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_bracketedExpression);
		int _la;
		try {
			setState(705);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(691); match(T__45);
				setState(692); expression(0);
				setState(693); match(T__72);
				}
				break;
			case 2:
				_localctx = new TupleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(695); match(T__45);
				setState(696); expression(0);
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(697); match(T__50);
					setState(698); expression(0);
					}
					}
					setState(701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__50 );
				setState(703); match(T__72);
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
		enterRule(_localctx, 104, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707); idValuePair();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(708); match(T__50);
				setState(709); idValuePair();
				}
				}
				setState(714);
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
		enterRule(_localctx, 106, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); match(Identifier);
			setState(716); match(T__7);
			setState(717); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
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
		enterRule(_localctx, 108, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); match(T__78);
			setState(720); pattern(0);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56) {
				{
				{
				setState(721); match(T__56);
				setState(722); pattern(0);
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728); match(T__20);
			setState(729); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); mapPair();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(732); match(T__50);
				setState(733); mapPair();
				}
				}
				setState(738);
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
		enterRule(_localctx, 112, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); expression(0);
			setState(740); match(T__46);
			setState(741); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); rngBinding();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(744); match(T__50);
				setState(745); rngBinding();
				}
				}
				setState(750);
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
		enterRule(_localctx, 116, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); patternList();
			setState(752); match(T__46);
			setState(753); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755); pattern(0);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(756); match(T__50);
				setState(757); pattern(0);
				}
				}
				setState(762);
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
		enterRule(_localctx, 120, RULE_collectionOrType);
		try {
			setState(765);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764); type(0);
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
	public static class TypedPatternContext extends PatternContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTypedPattern(this);
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
	public static class IdentPatternContext extends PatternContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public IdentPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitIdentPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DontCarePatternContext extends PatternContext {
		public DontCarePatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitDontCarePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralPatternContext extends PatternContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(768); literal();
				}
				break;
			case T__71:
				{
				_localctx = new DontCarePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(769); match(T__71);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(770); match(Identifier);
				}
				break;
			case T__45:
				{
				_localctx = new CartesianPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(771); match(T__45);
				setState(772); pattern(0);
				setState(775); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(773); match(T__50);
					setState(774); pattern(0);
					}
					}
					setState(777); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__50 );
				setState(779); match(T__72);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypedPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(783);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(784); match(T__46);
					setState(785); type(0);
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		enterRule(_localctx, 124, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); match(Identifier);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(792); match(T__50);
				setState(793); match(Identifier);
				}
				}
				setState(798);
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
		enterRule(_localctx, 126, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); expression(0);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(800); match(T__50);
				setState(801); expression(0);
				}
				}
				setState(806);
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
		enterRule(_localctx, 128, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(807); match(Identifier);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808); match(SUCHTHAT);
					setState(809); match(Identifier);
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (IntegerLiteral - 94)) | (1L << (FloatingPointLiteral - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (NullLiteral - 94)) | (1L << (ThisLiteral - 94)) | (1L << (CharacterLiteral - 94)) | (1L << (StringLiteral - 94)))) != 0)) ) {
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
		case 13: return type_sempred((TypeContext)_localctx, predIndex);
		case 46: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 61: return pattern_sempred((PatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 16);
		case 4: return precpred(_ctx, 15);
		case 5: return precpred(_ctx, 14);
		case 6: return precpred(_ctx, 13);
		case 7: return precpred(_ctx, 12);
		case 8: return precpred(_ctx, 11);
		case 9: return precpred(_ctx, 10);
		case 10: return precpred(_ctx, 33);
		case 11: return precpred(_ctx, 32);
		case 12: return precpred(_ctx, 9);
		case 13: return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return precpred(_ctx, 1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3l\u0334\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\5\2\u0088\n\2\3\2\7\2\u008b\n"+
		"\2\f\2\16\2\u008e\13\2\3\2\5\2\u0091\n\2\3\2\3\2\3\3\3\3\3\3\7\3\u0098"+
		"\n\3\f\3\16\3\u009b\13\3\3\3\5\3\u009e\n\3\3\4\3\4\3\4\5\4\u00a3\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\7\3\7\3\7\7\7\u00b1\n\7\f\7"+
		"\16\7\u00b4\13\7\3\7\5\7\u00b7\n\7\3\b\3\b\3\b\7\b\u00bc\n\b\f\b\16\b"+
		"\u00bf\13\b\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\5\t\u00ca"+
		"\n\t\3\t\3\t\5\t\u00ce\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00d6\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13\u00de\n\13\f\13\16\13\u00e1\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u00e8\n\f\3\r\3\r\3\r\7\r\u00ed\n\r\f\r\16\r\u00f0\13"+
		"\r\3\16\3\16\3\16\3\16\7\16\u00f6\n\16\f\16\16\16\u00f9\13\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00ff\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u011b\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\6\17\u0125\n\17\r\17\16\17\u0126\3\17\3\17\7\17\u012b\n\17\f\17\16\17"+
		"\u012e\13\17\3\20\3\20\5\20\u0132\n\20\3\21\3\21\3\21\3\21\7\21\u0138"+
		"\n\21\f\21\16\21\u013b\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u0146\n\22\3\23\3\23\5\23\u014a\n\23\3\24\3\24\3\24\3\24\5\24"+
		"\u0150\n\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0158\n\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u0161\n\27\3\30\3\30\5\30\u0165\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u016c\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0173"+
		"\n\32\3\33\3\33\3\33\5\33\u0178\n\33\3\34\3\34\5\34\u017c\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0182\n\35\3\35\6\35\u0185\n\35\r\35\16\35\u0186\3"+
		"\35\3\35\5\35\u018b\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0194"+
		"\n\36\3\36\6\36\u0197\n\36\r\36\16\36\u0198\3\36\3\36\5\36\u019d\n\36"+
		"\3\36\7\36\u01a0\n\36\f\36\16\36\u01a3\13\36\3\36\3\36\5\36\u01a7\n\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01af\n\37\3 \3 \3 \5 \u01b4\n \3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u01d7\n/\f/\16/\u01da\13/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01f7\n\60"+
		"\3\60\3\60\5\60\u01fb\n\60\5\60\u01fd\n\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0205\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0211\n\60\3\60\3\60\3\60\3\60\3\60\3\60\6\60\u0219\n\60\r\60\16"+
		"\60\u021a\3\60\3\60\3\60\3\60\5\60\u0221\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0234"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0249\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u025d\n\60\3\60\5\60\u0260\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0275"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0283\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0290\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0299\n\60\f\60\16"+
		"\60\u029c\13\60\3\61\3\61\5\61\u02a0\n\61\3\62\3\62\3\62\7\62\u02a5\n"+
		"\62\f\62\16\62\u02a8\13\62\3\63\3\63\3\63\7\63\u02ad\n\63\f\63\16\63\u02b0"+
		"\13\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\6\65"+
		"\u02be\n\65\r\65\16\65\u02bf\3\65\3\65\5\65\u02c4\n\65\3\66\3\66\3\66"+
		"\7\66\u02c9\n\66\f\66\16\66\u02cc\13\66\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\78\u02d6\n8\f8\168\u02d9\138\38\38\38\39\39\39\79\u02e1\n9\f9\169\u02e4"+
		"\139\3:\3:\3:\3:\3;\3;\3;\7;\u02ed\n;\f;\16;\u02f0\13;\3<\3<\3<\3<\3="+
		"\3=\3=\7=\u02f9\n=\f=\16=\u02fc\13=\3>\3>\5>\u0300\n>\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\6?\u030a\n?\r?\16?\u030b\3?\3?\5?\u0310\n?\3?\3?\3?\7?\u0315\n"+
		"?\f?\16?\u0318\13?\3@\3@\3@\7@\u031d\n@\f@\16@\u0320\13@\3A\3A\3A\7A\u0325"+
		"\nA\fA\16A\u0328\13A\3B\3B\3B\7B\u032d\nB\fB\16B\u0330\13B\3C\3C\3C\2"+
		"\5\34^|D\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\2\20\b\2\13\13"+
		"\24\24\34\34\37\37\"\"UU\4\2\7\7\17\17\4\2\31\31SS\4\2\n\n\64\64\4\2!"+
		"!\\\\\4\2==PP\4\2\4\4RR\4\2((\62\62\4\2\3\3JJ\4\2\30\30\33\33\4\2\16\16"+
		"\32\32\n\2\6\6\23\23  BBEEGGZZ]]\5\2\25\25..KK\3\2`f\u0377\2\u0087\3\2"+
		"\2\2\4\u0094\3\2\2\2\6\u00a2\3\2\2\2\b\u00a4\3\2\2\2\n\u00a7\3\2\2\2\f"+
		"\u00ad\3\2\2\2\16\u00b8\3\2\2\2\20\u00c3\3\2\2\2\22\u00d1\3\2\2\2\24\u00d9"+
		"\3\2\2\2\26\u00e4\3\2\2\2\30\u00e9\3\2\2\2\32\u00f1\3\2\2\2\34\u011a\3"+
		"\2\2\2\36\u0131\3\2\2\2 \u0133\3\2\2\2\"\u0145\3\2\2\2$\u0149\3\2\2\2"+
		"&\u014b\3\2\2\2(\u0151\3\2\2\2*\u0154\3\2\2\2,\u015c\3\2\2\2.\u0164\3"+
		"\2\2\2\60\u0166\3\2\2\2\62\u016d\3\2\2\2\64\u0174\3\2\2\2\66\u017b\3\2"+
		"\2\28\u017d\3\2\2\2:\u018f\3\2\2\2<\u01ae\3\2\2\2>\u01b0\3\2\2\2@\u01b7"+
		"\3\2\2\2B\u01b9\3\2\2\2D\u01bb\3\2\2\2F\u01bd\3\2\2\2H\u01bf\3\2\2\2J"+
		"\u01c1\3\2\2\2L\u01c3\3\2\2\2N\u01c5\3\2\2\2P\u01c7\3\2\2\2R\u01c9\3\2"+
		"\2\2T\u01cb\3\2\2\2V\u01cd\3\2\2\2X\u01cf\3\2\2\2Z\u01d1\3\2\2\2\\\u01d3"+
		"\3\2\2\2^\u025f\3\2\2\2`\u029f\3\2\2\2b\u02a1\3\2\2\2d\u02a9\3\2\2\2f"+
		"\u02b1\3\2\2\2h\u02c3\3\2\2\2j\u02c5\3\2\2\2l\u02cd\3\2\2\2n\u02d1\3\2"+
		"\2\2p\u02dd\3\2\2\2r\u02e5\3\2\2\2t\u02e9\3\2\2\2v\u02f1\3\2\2\2x\u02f5"+
		"\3\2\2\2z\u02ff\3\2\2\2|\u030f\3\2\2\2~\u0319\3\2\2\2\u0080\u0321\3\2"+
		"\2\2\u0082\u0329\3\2\2\2\u0084\u0331\3\2\2\2\u0086\u0088\5\b\5\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\n"+
		"\6\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\4"+
		"\3\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7\2\2\3\u0093\3\3\2\2\2\u0094\u0099\5\6\4\2\u0095\u0096\7k\2\2"+
		"\u0096\u0098\5\6\4\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009e\7k\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\5\3\2\2\2"+
		"\u009f\u00a3\5\"\22\2\u00a0\u00a3\5\20\t\2\u00a1\u00a3\5\22\n\2\u00a2"+
		"\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\7\3\2\2\2"+
		"\u00a4\u00a5\79\2\2\u00a5\u00a6\5\u0082B\2\u00a6\t\3\2\2\2\u00a7\u00a8"+
		"\7D\2\2\u00a8\u00ab\5\u0082B\2\u00a9\u00aa\7_\2\2\u00aa\u00ac\7\6\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00b2"+
		"\5\"\22\2\u00ae\u00af\7k\2\2\u00af\u00b1\5\"\22\2\u00b0\u00ae\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7k\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00bd\5$\23\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\7k\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\17\3\2\2\2"+
		"\u00c3\u00c4\7%\2\2\u00c4\u00c6\7g\2\2\u00c5\u00c7\5\24\13\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\5\32\16\2"+
		"\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\7<\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\21\3\2\2\2\u00d1\u00d2\7I\2\2"+
		"\u00d2\u00d3\7g\2\2\u00d3\u00d5\7<\2\2\u00d4\u00d6\5\16\b\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\f\2\2\u00d8"+
		"\23\3\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00df\5\26\f\2\u00db\u00dc\7,\2"+
		"\2\u00dc\u00de\5\26\f\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e3\7*\2\2\u00e3\25\3\2\2\2\u00e4\u00e7\7g\2\2\u00e5\u00e6"+
		"\7\60\2\2\u00e6\u00e8\5\30\r\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\27\3\2\2\2\u00e9\u00ee\5\34\17\2\u00ea\u00eb\7K\2\2\u00eb\u00ed"+
		"\5\34\17\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2\u00f7\5\34\17\2\u00f3\u00f4\7,\2\2\u00f4\u00f6\5\34\17\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\33\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\17\1\2\u00fb"+
		"\u011b\5@!\2\u00fc\u00fe\5\u0082B\2\u00fd\u00ff\5 \21\2\u00fe\u00fd\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u011b\3\2\2\2\u0100\u0101\7<\2\2\u0101"+
		"\u0102\5\34\17\2\u0102\u0103\7\f\2\2\u0103\u011b\3\2\2\2\u0104\u0105\7"+
		"\5\2\2\u0105\u0106\5\34\17\2\u0106\u0107\7*\2\2\u0107\u011b\3\2\2\2\u0108"+
		"\u0109\7\7\2\2\u0109\u010a\5\34\17\2\u010a\u010b\7,\2\2\u010b\u010c\5"+
		"\34\17\2\u010c\u010d\7S\2\2\u010d\u011b\3\2\2\2\u010e\u010f\7\61\2\2\u010f"+
		"\u0110\5\34\17\2\u0110\u0111\7\26\2\2\u0111\u011b\3\2\2\2\u0112\u0113"+
		"\7;\2\2\u0113\u0114\7g\2\2\u0114\u0115\7\60\2\2\u0115\u0116\5\34\17\2"+
		"\u0116\u0117\7_\2\2\u0117\u0118\5^\60\2\u0118\u0119\7O\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u00fa\3\2\2\2\u011a\u00fc\3\2\2\2\u011a\u0100\3\2\2\2\u011a"+
		"\u0104\3\2\2\2\u011a\u0108\3\2\2\2\u011a\u010e\3\2\2\2\u011a\u0112\3\2"+
		"\2\2\u011b\u012c\3\2\2\2\u011c\u011d\f\t\2\2\u011d\u011e\5X-\2\u011e\u011f"+
		"\5\34\17\n\u011f\u012b\3\2\2\2\u0120\u0124\f\n\2\2\u0121\u0122\5V,\2\u0122"+
		"\u0123\5\34\17\2\u0123\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\3\2\2\2\u0128"+
		"\u0129\f\3\2\2\u0129\u012b\78\2\2\u012a\u011c\3\2\2\2\u012a\u0120\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\35\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0132\5^\60"+
		"\2\u0130\u0132\7\6\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\37"+
		"\3\2\2\2\u0133\u0134\7\5\2\2\u0134\u0139\5\34\17\2\u0135\u0136\7,\2\2"+
		"\u0136\u0138\5\34\17\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7*\2\2\u013d!\3\2\2\2\u013e\u0146\5(\25\2\u013f\u0146\5*\26\2\u0140"+
		"\u0146\5&\24\2\u0141\u0146\5,\27\2\u0142\u0146\5\66\34\2\u0143\u0146\5"+
		"> \2\u0144\u0146\5^\60\2\u0145\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145"+
		"\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0144\3\2\2\2\u0146#\3\2\2\2\u0147\u014a\5.\30\2\u0148\u014a"+
		"\5\"\22\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a%\3\2\2\2\u014b"+
		"\u014c\7#\2\2\u014c\u014f\5|?\2\u014d\u014e\7\32\2\2\u014e\u0150\5^\60"+
		"\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\'\3\2\2\2\u0151\u0152"+
		"\7V\2\2\u0152\u0153\7g\2\2\u0153)\3\2\2\2\u0154\u0155\7V\2\2\u0155\u0157"+
		"\7g\2\2\u0156\u0158\5\24\13\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015a\7\32\2\2\u015a\u015b\5\34\17\2\u015b"+
		"+\3\2\2\2\u015c\u015d\7\67\2\2\u015d\u0160\5|?\2\u015e\u015f\7\32\2\2"+
		"\u015f\u0161\5^\60\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161-\3"+
		"\2\2\2\u0162\u0165\5\60\31\2\u0163\u0165\5\62\32\2\u0164\u0162\3\2\2\2"+
		"\u0164\u0163\3\2\2\2\u0165/\3\2\2\2\u0166\u0167\7\65\2\2\u0167\u0168\7"+
		"g\2\2\u0168\u0169\7\60\2\2\u0169\u016b\7g\2\2\u016a\u016c\5\64\33\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\61\3\2\2\2\u016d\u016e\7/\2\2"+
		"\u016e\u016f\7g\2\2\u016f\u0170\7\60\2\2\u0170\u0172\7g\2\2\u0171\u0173"+
		"\5\64\33\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\63\3\2\2\2\u0174"+
		"\u0177\5\36\20\2\u0175\u0176\7)\2\2\u0176\u0178\5\36\20\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\65\3\2\2\2\u0179\u017c\58\35\2\u017a"+
		"\u017c\5:\36\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c\67\3\2\2"+
		"\2\u017d\u017e\7\36\2\2\u017e\u0184\7g\2\2\u017f\u0181\7\61\2\2\u0180"+
		"\u0182\5x=\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2"+
		"\2\u0183\u0185\7\26\2\2\u0184\u017f\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0189\7\60"+
		"\2\2\u0189\u018b\5\34\17\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\7\32\2\2\u018d\u018e\5^\60\2\u018e9\3\2\2\2"+
		"\u018f\u0190\7\36\2\2\u0190\u0196\7g\2\2\u0191\u0193\7\61\2\2\u0192\u0194"+
		"\5x=\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\7\26\2\2\u0196\u0191\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u019b\7\60\2\2\u019b"+
		"\u019d\5\34\17\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a1\3"+
		"\2\2\2\u019e\u01a0\5<\37\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\7<\2\2\u01a5\u01a7\5\f\7\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7\f\2\2\u01a9;\3\2\2\2"+
		"\u01aa\u01ab\7H\2\2\u01ab\u01af\5^\60\2\u01ac\u01ad\7Y\2\2\u01ad\u01af"+
		"\5^\60\2\u01ae\u01aa\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af=\3\2\2\2\u01b0"+
		"\u01b3\7$\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b4\7\60\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5^\60\2\u01b6"+
		"?\3\2\2\2\u01b7\u01b8\t\2\2\2\u01b8A\3\2\2\2\u01b9\u01ba\t\3\2\2\u01ba"+
		"C\3\2\2\2\u01bb\u01bc\t\4\2\2\u01bcE\3\2\2\2\u01bd\u01be\t\5\2\2\u01be"+
		"G\3\2\2\2\u01bf\u01c0\t\6\2\2\u01c0I\3\2\2\2\u01c1\u01c2\t\7\2\2\u01c2"+
		"K\3\2\2\2\u01c3\u01c4\t\b\2\2\u01c4M\3\2\2\2\u01c5\u01c6\t\t\2\2\u01c6"+
		"O\3\2\2\2\u01c7\u01c8\t\n\2\2\u01c8Q\3\2\2\2\u01c9\u01ca\t\13\2\2\u01ca"+
		"S\3\2\2\2\u01cb\u01cc\t\f\2\2\u01ccU\3\2\2\2\u01cd\u01ce\7\6\2\2\u01ce"+
		"W\3\2\2\2\u01cf\u01d0\7\22\2\2\u01d0Y\3\2\2\2\u01d1\u01d2\7^\2\2\u01d2"+
		"[\3\2\2\2\u01d3\u01d8\5^\60\2\u01d4\u01d5\7k\2\2\u01d5\u01d7\5^\60\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9]\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\b\60\1\2\u01dc\u01dd"+
		"\5N(\2\u01dd\u01de\5^\60\35\u01de\u0260\3\2\2\2\u01df\u01e0\7M\2\2\u01e0"+
		"\u01e1\5t;\2\u01e1\u01e2\7_\2\2\u01e2\u01e3\5^\60\34\u01e3\u0260\3\2\2"+
		"\2\u01e4\u01e5\7T\2\2\u01e5\u01e6\5t;\2\u01e6\u01e7\7_\2\2\u01e7\u01e8"+
		"\5^\60\33\u01e8\u0260\3\2\2\2\u01e9\u01ea\7[\2\2\u01ea\u0260\5^\60\b\u01eb"+
		"\u01ec\5|?\2\u01ec\u01ed\7\22\2\2\u01ed\u01ee\5^\60\7\u01ee\u0260\3\2"+
		"\2\2\u01ef\u0260\5h\65\2\u01f0\u0260\5\u0084C\2\u01f1\u0260\7g\2\2\u01f2"+
		"\u01f3\7\63\2\2\u01f3\u01f4\5^\60\2\u01f4\u01f6\7X\2\2\u01f5\u01f7\5\f"+
		"\7\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fc\3\2\2\2\u01f8"+
		"\u01fa\7A\2\2\u01f9\u01fb\5\f\7\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\5Z.\2\u01ff\u0260\3\2\2\2\u0200\u0201\7-\2"+
		"\2\u0201\u0202\5^\60\2\u0202\u0204\7\21\2\2\u0203\u0205\5\f\7\2\u0204"+
		"\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\5Z"+
		".\2\u0207\u0260\3\2\2\2\u0208\u0209\7L\2\2\u0209\u020a\7\61\2\2\u020a"+
		"\u020b\5|?\2\u020b\u020c\7+\2\2\u020c\u020d\5^\60\2\u020d\u020e\7\26\2"+
		"\2\u020e\u0210\7\21\2\2\u020f\u0211\5\f\7\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5Z.\2\u0213\u0260\3\2\2"+
		"\2\u0214\u0215\7\66\2\2\u0215\u0216\5^\60\2\u0216\u0218\7Q\2\2\u0217\u0219"+
		"\5n8\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7^\2\2\u021d\u0260\3\2"+
		"\2\2\u021e\u0220\7<\2\2\u021f\u0221\5\u0080A\2\u0220\u021f\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0260\7\f\2\2\u0223\u0224\7<"+
		"\2\2\u0224\u0225\5^\60\2\u0225\u0226\7)\2\2\u0226\u0227\5^\60\2\u0227"+
		"\u0228\7\f\2\2\u0228\u0260\3\2\2\2\u0229\u022a\7<\2\2\u022a\u022b\5^\60"+
		"\2\u022b\u022c\7&\2\2\u022c\u022d\5t;\2\u022d\u022e\7_\2\2\u022e\u022f"+
		"\5^\60\2\u022f\u0230\7\f\2\2\u0230\u0260\3\2\2\2\u0231\u0233\7\5\2\2\u0232"+
		"\u0234\5\u0080A\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0260\7*\2\2\u0236\u0237\7\5\2\2\u0237\u0238\5^\60\2\u0238"+
		"\u0239\7)\2\2\u0239\u023a\5^\60\2\u023a\u023b\7*\2\2\u023b\u0260\3\2\2"+
		"\2\u023c\u023d\7\5\2\2\u023d\u023e\5^\60\2\u023e\u023f\7&\2\2\u023f\u0240"+
		"\5|?\2\u0240\u0241\7+\2\2\u0241\u0242\5^\60\2\u0242\u0243\7_\2\2\u0243"+
		"\u0244\5^\60\2\u0244\u0245\7*\2\2\u0245\u0260\3\2\2\2\u0246\u0248\7\7"+
		"\2\2\u0247\u0249\5p9\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u0260\7S\2\2\u024b\u024c\7\7\2\2\u024c\u024d\5r:\2\u024d"+
		"\u024e\7&\2\2\u024e\u024f\5t;\2\u024f\u0250\7_\2\2\u0250\u0251\5^\60\2"+
		"\u0251\u0252\7S\2\2\u0252\u0260\3\2\2\2\u0253\u0254\7\'\2\2\u0254\u0255"+
		"\7\61\2\2\u0255\u0256\5^\60\2\u0256\u0257\7\26\2\2\u0257\u0260\3\2\2\2"+
		"\u0258\u0260\7\t\2\2\u0259\u0260\7>\2\2\u025a\u025c\7N\2\2\u025b\u025d"+
		"\5^\60\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u0260\7C\2\2\u025f\u01db\3\2\2\2\u025f\u01df\3\2\2\2\u025f\u01e4\3\2"+
		"\2\2\u025f\u01e9\3\2\2\2\u025f\u01eb\3\2\2\2\u025f\u01ef\3\2\2\2\u025f"+
		"\u01f0\3\2\2\2\u025f\u01f1\3\2\2\2\u025f\u01f2\3\2\2\2\u025f\u0200\3\2"+
		"\2\2\u025f\u0208\3\2\2\2\u025f\u0214\3\2\2\2\u025f\u021e\3\2\2\2\u025f"+
		"\u0223\3\2\2\2\u025f\u0229\3\2\2\2\u025f\u0231\3\2\2\2\u025f\u0236\3\2"+
		"\2\2\u025f\u023c\3\2\2\2\u025f\u0246\3\2\2\2\u025f\u024b\3\2\2\2\u025f"+
		"\u0253\3\2\2\2\u025f\u0258\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2"+
		"\2\2\u025f\u025e\3\2\2\2\u0260\u029a\3\2\2\2\u0261\u0262\f\22\2\2\u0262"+
		"\u0263\t\r\2\2\u0263\u0299\5^\60\23\u0264\u0265\f\21\2\2\u0265\u0266\t"+
		"\16\2\2\u0266\u0299\5^\60\22\u0267\u0274\f\20\2\2\u0268\u0275\5F$\2\u0269"+
		"\u0275\5H%\2\u026a\u0275\5B\"\2\u026b\u0275\5D#\2\u026c\u0275\5T+\2\u026d"+
		"\u026e\5N(\2\u026e\u026f\5T+\2\u026f\u0275\3\2\2\2\u0270\u0275\7@\2\2"+
		"\u0271\u0275\7\b\2\2\u0272\u0275\7\r\2\2\u0273\u0275\7\35\2\2\u0274\u0268"+
		"\3\2\2\2\u0274\u0269\3\2\2\2\u0274\u026a\3\2\2\2\u0274\u026b\3\2\2\2\u0274"+
		"\u026c\3\2\2\2\u0274\u026d\3\2\2\2\u0274\u0270\3\2\2\2\u0274\u0271\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0299\5^\60\21\u0277\u0278\f\17\2\2\u0278\u0279\5J&\2\u0279\u027a\5^"+
		"\60\20\u027a\u0299\3\2\2\2\u027b\u027c\f\16\2\2\u027c\u027d\5L\'\2\u027d"+
		"\u027e\5^\60\17\u027e\u0299\3\2\2\2\u027f\u0282\f\r\2\2\u0280\u0283\5"+
		"P)\2\u0281\u0283\5R*\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0285\5^\60\16\u0285\u0299\3\2\2\2\u0286\u0287\f\f\2\2"+
		"\u0287\u0288\7W\2\2\u0288\u0299\5^\60\r\u0289\u028a\f#\2\2\u028a\u028b"+
		"\7_\2\2\u028b\u0299\7g\2\2\u028c\u028d\f\"\2\2\u028d\u028f\7\61\2\2\u028e"+
		"\u0290\5`\61\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0299\7\26\2\2\u0292\u0293\f\13\2\2\u0293\u0294\7F\2\2\u0294"+
		"\u0299\5\34\17\2\u0295\u0296\f\n\2\2\u0296\u0297\7:\2\2\u0297\u0299\5"+
		"\34\17\2\u0298\u0261\3\2\2\2\u0298\u0264\3\2\2\2\u0298\u0267\3\2\2\2\u0298"+
		"\u0277\3\2\2\2\u0298\u027b\3\2\2\2\u0298\u027f\3\2\2\2\u0298\u0286\3\2"+
		"\2\2\u0298\u0289\3\2\2\2\u0298\u028c\3\2\2\2\u0298\u0292\3\2\2\2\u0298"+
		"\u0295\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b_\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02a0\5b\62\2\u029e\u02a0"+
		"\5d\63\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0a\3\2\2\2\u02a1"+
		"\u02a6\5^\60\2\u02a2\u02a3\7,\2\2\u02a3\u02a5\5^\60\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"c\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ae\5f\64\2\u02aa\u02ab\7,\2\2\u02ab"+
		"\u02ad\5f\64\2\u02ac\u02aa\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02afe\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2"+
		"\7g\2\2\u02b2\u02b3\7\32\2\2\u02b3\u02b4\5^\60\2\u02b4g\3\2\2\2\u02b5"+
		"\u02b6\7\61\2\2\u02b6\u02b7\5^\60\2\u02b7\u02b8\7\26\2\2\u02b8\u02c4\3"+
		"\2\2\2\u02b9\u02ba\7\61\2\2\u02ba\u02bd\5^\60\2\u02bb\u02bc\7,\2\2\u02bc"+
		"\u02be\5^\60\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02bd\3\2"+
		"\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\7\26\2\2\u02c2"+
		"\u02c4\3\2\2\2\u02c3\u02b5\3\2\2\2\u02c3\u02b9\3\2\2\2\u02c4i\3\2\2\2"+
		"\u02c5\u02ca\5l\67\2\u02c6\u02c7\7,\2\2\u02c7\u02c9\5l\67\2\u02c8\u02c6"+
		"\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"k\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7g\2\2\u02ce\u02cf\7W\2\2\u02cf"+
		"\u02d0\5^\60\2\u02d0m\3\2\2\2\u02d1\u02d2\7\20\2\2\u02d2\u02d7\5|?\2\u02d3"+
		"\u02d4\7&\2\2\u02d4\u02d6\5|?\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9\3\2\2"+
		"\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02db\7J\2\2\u02db\u02dc\5^\60\2\u02dco\3\2\2\2\u02dd\u02e2"+
		"\5r:\2\u02de\u02df\7,\2\2\u02df\u02e1\5r:\2\u02e0\u02de\3\2\2\2\u02e1"+
		"\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3q\3\2\2\2"+
		"\u02e4\u02e2\3\2\2\2\u02e5\u02e6\5^\60\2\u02e6\u02e7\7\60\2\2\u02e7\u02e8"+
		"\5^\60\2\u02e8s\3\2\2\2\u02e9\u02ee\5v<\2\u02ea\u02eb\7,\2\2\u02eb\u02ed"+
		"\5v<\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02efu\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\5x=\2\u02f2"+
		"\u02f3\7\60\2\2\u02f3\u02f4\5z>\2\u02f4w\3\2\2\2\u02f5\u02fa\5|?\2\u02f6"+
		"\u02f7\7,\2\2\u02f7\u02f9\5|?\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2"+
		"\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fby\3\2\2\2\u02fc\u02fa"+
		"\3\2\2\2\u02fd\u0300\5^\60\2\u02fe\u0300\5\34\17\2\u02ff\u02fd\3\2\2\2"+
		"\u02ff\u02fe\3\2\2\2\u0300{\3\2\2\2\u0301\u0302\b?\1\2\u0302\u0310\5\u0084"+
		"C\2\u0303\u0310\7\27\2\2\u0304\u0310\7g\2\2\u0305\u0306\7\61\2\2\u0306"+
		"\u0309\5|?\2\u0307\u0308\7,\2\2\u0308\u030a\5|?\2\u0309\u0307\3\2\2\2"+
		"\u030a\u030b\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\u030e\7\26\2\2\u030e\u0310\3\2\2\2\u030f\u0301\3\2\2\2"+
		"\u030f\u0303\3\2\2\2\u030f\u0304\3\2\2\2\u030f\u0305\3\2\2\2\u0310\u0316"+
		"\3\2\2\2\u0311\u0312\f\3\2\2\u0312\u0313\7\60\2\2\u0313\u0315\5\34\17"+
		"\2\u0314\u0311\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317}\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031e\7g\2\2\u031a\u031b"+
		"\7,\2\2\u031b\u031d\7g\2\2\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\177\3\2\2\2\u0320\u031e\3\2\2"+
		"\2\u0321\u0326\5^\60\2\u0322\u0323\7,\2\2\u0323\u0325\5^\60\2\u0324\u0322"+
		"\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0081\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032e\7g\2\2\u032a\u032b\7_\2"+
		"\2\u032b\u032d\7g\2\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c"+
		"\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0083\3\2\2\2\u0330\u032e\3\2\2\2\u0331"+
		"\u0332\t\17\2\2\u0332\u0085\3\2\2\2R\u0087\u008c\u0090\u0099\u009d\u00a2"+
		"\u00ab\u00b2\u00b6\u00bd\u00c1\u00c6\u00c9\u00cd\u00d5\u00df\u00e7\u00ee"+
		"\u00f7\u00fe\u011a\u0126\u012a\u012c\u0131\u0139\u0145\u0149\u014f\u0157"+
		"\u0160\u0164\u016b\u0172\u0177\u017b\u0181\u0186\u018a\u0193\u0198\u019c"+
		"\u01a1\u01a6\u01ae\u01b3\u01d8\u01f6\u01fa\u01fc\u0204\u0210\u021a\u0220"+
		"\u0233\u0248\u025c\u025f\u0274\u0282\u028f\u0298\u029a\u029f\u02a6\u02ae"+
		"\u02bf\u02c3\u02ca\u02d7\u02e2\u02ee\u02fa\u02ff\u030b\u030f\u0316\u031e"+
		"\u0326\u032e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}