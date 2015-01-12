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
		T__83=1, T__82=2, T__81=3, T__80=4, T__79=5, T__78=6, T__77=7, T__76=8, 
		T__75=9, T__74=10, T__73=11, T__72=12, T__71=13, T__70=14, T__69=15, T__68=16, 
		T__67=17, T__66=18, T__65=19, T__64=20, T__63=21, T__62=22, T__61=23, 
		T__60=24, T__59=25, T__58=26, T__57=27, T__56=28, T__55=29, T__54=30, 
		T__53=31, T__52=32, T__51=33, T__50=34, T__49=35, T__48=36, T__47=37, 
		T__46=38, T__45=39, T__44=40, T__43=41, T__42=42, T__41=43, T__40=44, 
		T__39=45, T__38=46, T__37=47, T__36=48, T__35=49, T__34=50, T__33=51, 
		T__32=52, T__31=53, T__30=54, T__29=55, T__28=56, T__27=57, T__26=58, 
		T__25=59, T__24=60, T__23=61, T__22=62, T__21=63, T__20=64, T__19=65, 
		T__18=66, T__17=67, T__16=68, T__15=69, T__14=70, T__13=71, T__12=72, 
		T__11=73, T__10=74, T__9=75, T__8=76, T__7=77, T__6=78, T__5=79, T__4=80, 
		T__3=81, T__2=82, T__1=83, T__0=84, SUCHTHAT=85, IntegerLiteral=86, FloatingPointLiteral=87, 
		BooleanLiteral=88, NullLiteral=89, ThisLiteral=90, CharacterLiteral=91, 
		StringLiteral=92, Identifier=93, CommentBorder=94, COMMENT=95, LINE_COMMENT=96, 
		WS=97, SEP=98;
	public static final String[] tokenNames = {
		"<INVALID>", "'['", "'*'", "'<'", "'!isin'", "'continue'", "'!='", "'<='", 
		"'Bool'", "'}'", "'subset'", "'case'", "'do'", "'->'", "'%'", "'Unit'", 
		"'union'", "')'", "'_'", "'='", "'<=>'", "'String'", "'psubset'", "'fun'", 
		"'Int'", "'\\'", "'Char'", "'val'", "'req'", "'begin'", "'class'", "'|'", 
		"'assert'", "'!'", "'..'", "']'", "'in'", "','", "'while'", "'-'", "'ref'", 
		"':'", "'('", "'if'", "'match'", "'part'", "'var'", "'?'", "'package'", 
		"'as'", "'{|'", "'{'", "'break'", "'extends'", "'isin'", "'else'", "'++'", 
		"'$'", "'import'", "'^'", "'is'", "'inter'", "'pre'", "'assoc'", "'=>'", 
		"'+'", "'for'", "'forall'", "'return'", "'|}'", "'&&'", "'with'", "'||'", 
		"'>'", "'exists'", "'Real'", "'type'", "':='", "'then'", "'post'", "'/'", 
		"'~'", "'#'", "'>='", "'end'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "'null'", "'this'", "CharacterLiteral", "StringLiteral", 
		"Identifier", "CommentBorder", "COMMENT", "LINE_COMMENT", "WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclarationList = 1, RULE_topDeclaration = 2, 
		RULE_packageDeclaration = 3, RULE_importDeclaration = 4, RULE_memberDeclarationList = 5, 
		RULE_assocBlock = 6, RULE_classDeclaration = 7, RULE_assocDeclaration = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11, 
		RULE_extending = 12, RULE_type = 13, RULE_expressionOrStar = 14, RULE_typeArguments = 15, 
		RULE_memberDeclaration = 16, RULE_assocMemberDeclaration = 17, RULE_valueDeclaration = 18, 
		RULE_sortDeclaration = 19, RULE_typeDeclaration = 20, RULE_variableDeclaration = 21, 
		RULE_roleDeclaration = 22, RULE_partDeclaration = 23, RULE_refDeclaration = 24, 
		RULE_multiplicity = 25, RULE_functionDeclaration = 26, RULE_shortFunctionDeclaration = 27, 
		RULE_longFunctionDeclaration = 28, RULE_functionSpecification = 29, RULE_constraint = 30, 
		RULE_primitiveType = 31, RULE_block = 32, RULE_expression = 33, RULE_match = 34, 
		RULE_argumentList = 35, RULE_positionalArgumentList = 36, RULE_namedArgumentList = 37, 
		RULE_namedArgument = 38, RULE_mapPairList = 39, RULE_mapPair = 40, RULE_rngBindingList = 41, 
		RULE_rngBinding = 42, RULE_patternList = 43, RULE_collectionOrType = 44, 
		RULE_pattern = 45, RULE_identifierList = 46, RULE_expressionList = 47, 
		RULE_qualifiedName = 48, RULE_literal = 49;
	public static final String[] ruleNames = {
		"model", "topDeclarationList", "topDeclaration", "packageDeclaration", 
		"importDeclaration", "memberDeclarationList", "assocBlock", "classDeclaration", 
		"assocDeclaration", "typeParameters", "typeParameter", "typeBound", "extending", 
		"type", "expressionOrStar", "typeArguments", "memberDeclaration", "assocMemberDeclaration", 
		"valueDeclaration", "sortDeclaration", "typeDeclaration", "variableDeclaration", 
		"roleDeclaration", "partDeclaration", "refDeclaration", "multiplicity", 
		"functionDeclaration", "shortFunctionDeclaration", "longFunctionDeclaration", 
		"functionSpecification", "constraint", "primitiveType", "block", "expression", 
		"match", "argumentList", "positionalArgumentList", "namedArgumentList", 
		"namedArgument", "mapPairList", "mapPair", "rngBindingList", "rngBinding", 
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
			setState(101);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(100); packageDeclaration();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(103); importDeclaration();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(109); topDeclarationList();
				}
				break;
			}
			setState(112); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__61) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__54) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__33) | (1L << T__32) | (1L << T__27) | (1L << T__21))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__8 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(114); topDeclaration();
				setState(115); match(SEP);
				}
				}
				setState(121);
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

	public static class TopDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public AssocDeclarationContext assocDeclaration() {
			return getRuleContext(AssocDeclarationContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ModelParser.SEP, 0); }
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
			setState(127);
			switch (_input.LA(1)) {
			case T__83:
			case T__81:
			case T__79:
			case T__66:
			case T__61:
			case T__57:
			case T__56:
			case T__55:
			case T__52:
			case T__51:
			case T__46:
			case T__42:
			case T__41:
			case T__40:
			case T__38:
			case T__33:
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
				setState(122); memberDeclaration();
				setState(123); match(SEP);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); classDeclaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); assocDeclaration();
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
		public TerminalNode SEP() { return getToken(ModelParser.SEP, 0); }
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
			setState(129); match(T__36);
			setState(130); qualifiedName();
			setState(131); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SEP() { return getToken(ModelParser.SEP, 0); }
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
			setState(133); match(T__26);
			setState(134); qualifiedName();
			setState(137);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(135); match(SUCHTHAT);
				setState(136); match(T__82);
				}
			}

			setState(139); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); memberDeclaration();
				setState(142); match(SEP);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__61) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__8 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssocBlockContext extends ParserRuleContext {
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
		public AssocBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assocBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAssocBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssocBlockContext assocBlock() throws RecognitionException {
		AssocBlockContext _localctx = new AssocBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assocBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); assocMemberDeclaration();
				setState(149); match(SEP);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__61) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__8 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(155); match(T__54);
			setState(156); match(Identifier);
			setState(158);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(157); typeParameters();
				}
			}

			setState(161);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(160); extending();
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(163); match(T__33);
				setState(164); block();
				setState(165); match(T__75);
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

	public static class AssocDeclarationContext extends ParserRuleContext {
		public AssocBlockContext assocBlock() {
			return getRuleContext(AssocBlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(T__21);
			setState(170); match(Identifier);
			setState(171); match(T__33);
			setState(172); assocBlock();
			setState(173); match(T__75);
			}
		}
		catch (RecognitionException re) {
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
			setState(175); match(T__83);
			setState(176); typeParameter();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(177); match(T__47);
				setState(178); typeParameter();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(T__49);
			}
		}
		catch (RecognitionException re) {
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
			setState(186); match(Identifier);
			setState(189);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(187); match(T__43);
				setState(188); typeBound();
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
			setState(191); type(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(192); match(T__19);
				setState(193); type(0);
				}
				}
				setState(198);
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
			setState(199); match(T__31);
			setState(200); type(0);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(201); match(T__47);
				setState(202); type(0);
				}
				}
				setState(207);
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
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(240);
			switch (_input.LA(1)) {
			case T__76:
			case T__69:
			case T__63:
			case T__60:
			case T__58:
			case T__9:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(209); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210); qualifiedName();
				setState(212);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(211); typeArguments();
					}
					break;
				}
				}
				break;
			case T__33:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); match(T__33);
				setState(215); type(0);
				setState(216); match(T__75);
				}
				break;
			case T__83:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218); match(T__83);
				setState(219); type(0);
				setState(220); match(T__49);
				}
				break;
			case T__81:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222); match(T__81);
				setState(223); type(0);
				setState(224); match(T__47);
				setState(225); type(0);
				setState(226); match(T__11);
				}
				break;
			case T__42:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228); match(T__42);
				setState(229); type(0);
				setState(230); match(T__67);
				}
				break;
			case T__34:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); match(T__34);
				setState(233); match(Identifier);
				setState(234); match(T__43);
				setState(235); type(0);
				setState(236); match(SUCHTHAT);
				setState(237); expression(0);
				setState(238); match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243); match(T__71);
						setState(244); type(8);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(248); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(246); match(T__82);
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
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(252);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(253); match(T__37);
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
			setState(261);
			switch (_input.LA(1)) {
			case T__83:
			case T__81:
			case T__79:
			case T__66:
			case T__55:
			case T__52:
			case T__51:
			case T__46:
			case T__42:
			case T__41:
			case T__40:
			case T__33:
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
				setState(259); expression(0);
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(T__82);
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
			setState(263); match(T__83);
			setState(264); type(0);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(265); match(T__47);
				setState(266); type(0);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272); match(T__49);
			}
		}
		catch (RecognitionException re) {
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
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280); expression(0);
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
			setState(285);
			switch (_input.LA(1)) {
			case T__44:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); roleDeclaration();
				}
				break;
			case T__83:
			case T__81:
			case T__79:
			case T__66:
			case T__61:
			case T__57:
			case T__56:
			case T__55:
			case T__52:
			case T__51:
			case T__46:
			case T__42:
			case T__41:
			case T__40:
			case T__38:
			case T__33:
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
				setState(284); memberDeclaration();
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
			setState(287); match(T__57);
			setState(288); pattern(0);
			setState(291);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(289); match(T__65);
				setState(290); expression(0);
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
			setState(293); match(T__8);
			setState(294); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
			setState(296); match(T__8);
			setState(297); match(Identifier);
			setState(299);
			_la = _input.LA(1);
			if (_la==T__83) {
				{
				setState(298); typeParameters();
				}
			}

			setState(301); match(T__65);
			setState(302); type(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(304); match(T__38);
			setState(305); pattern(0);
			setState(308);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(306); match(T__65);
				setState(307); expression(0);
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
			setState(312);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); partDeclaration();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); refDeclaration();
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
			setState(314); match(T__39);
			setState(315); match(Identifier);
			setState(316); match(T__43);
			setState(317); match(Identifier);
			setState(319);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(318); multiplicity();
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
			setState(321); match(T__44);
			setState(322); match(Identifier);
			setState(323); match(T__43);
			setState(324); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(325); multiplicity();
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
			setState(328); expressionOrStar();
			setState(331);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(329); match(T__50);
				setState(330); expressionOrStar();
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
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333); shortFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334); longFunctionDeclaration();
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
			setState(337); match(T__61);
			setState(338); match(Identifier);
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339); match(T__42);
				setState(341);
				_la = _input.LA(1);
				if (_la==T__66 || _la==T__42 || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (IntegerLiteral - 86)) | (1L << (FloatingPointLiteral - 86)) | (1L << (BooleanLiteral - 86)) | (1L << (NullLiteral - 86)) | (1L << (ThisLiteral - 86)) | (1L << (CharacterLiteral - 86)) | (1L << (StringLiteral - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(340); patternList();
					}
				}

				setState(343); match(T__67);
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__42 );
			setState(350);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(348); match(T__43);
				setState(349); type(0);
				}
			}

			setState(354);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(352); match(T__65);
				setState(353); expression(0);
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
			setState(356); match(T__61);
			setState(357); match(Identifier);
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358); match(T__42);
				setState(360);
				_la = _input.LA(1);
				if (_la==T__66 || _la==T__42 || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (IntegerLiteral - 86)) | (1L << (FloatingPointLiteral - 86)) | (1L << (BooleanLiteral - 86)) | (1L << (NullLiteral - 86)) | (1L << (ThisLiteral - 86)) | (1L << (CharacterLiteral - 86)) | (1L << (StringLiteral - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(359); patternList();
					}
				}

				setState(362); match(T__67);
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__42 );
			setState(369);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(367); match(T__43);
				setState(368); type(0);
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__5) {
				{
				{
				setState(371); functionSpecification();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(377); match(T__33);
				setState(379);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__61) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__8 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(378); memberDeclarationList();
					}
				}

				setState(381); match(T__75);
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
			setState(388);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(384); match(T__22);
				setState(385); expression(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); match(T__5);
				setState(387); expression(0);
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
			setState(390); match(T__56);
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(391); match(Identifier);
				setState(392); match(T__43);
				}
				break;
			}
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
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__76) | (1L << T__69) | (1L << T__63) | (1L << T__60) | (1L << T__58))) != 0) || _la==T__9) ) {
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

	public static class BlockContext extends ParserRuleContext {
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__61) | (1L << T__57) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__8 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(399); memberDeclaration();
				setState(400); match(SEP);
				}
				}
				setState(406);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
	public static class TupleExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TupleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitTupleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParenExp(this);
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
	public static class BlockExpContext extends ExpressionContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBlockExp(this);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(408); match(T__51);
				setState(409); expression(32);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410); match(T__17);
				setState(411); rngBindingList();
				setState(412); match(SUCHTHAT);
				setState(413); expression(26);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415); match(T__10);
				setState(416); rngBindingList();
				setState(417); match(SUCHTHAT);
				setState(418); expression(25);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420); match(T__3);
				setState(421); expression(6);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422); pattern(0);
				setState(423); match(T__71);
				setState(424); expression(5);
				}
				break;
			case 6:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426); match(T__42);
				setState(427); expression(0);
				setState(428); match(T__67);
				}
				break;
			case 7:
				{
				_localctx = new TupleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430); match(T__42);
				setState(431); expression(0);
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(432); match(T__47);
					setState(433); expression(0);
					}
					}
					setState(436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__47 );
				setState(438); match(T__67);
				}
				break;
			case 8:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(440); literal();
				}
				break;
			case 9:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(441); match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new BlockExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(442); match(T__55);
				setState(443); block();
				setState(444); match(T__0);
				}
				break;
			case 11:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(446); match(T__41);
				setState(447); expression(0);
				setState(448); match(T__6);
				setState(450);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(449); expression(0);
					}
					break;
				}
				setState(456);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(452); match(T__29);
					setState(454);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(453); expression(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new MatchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458); match(T__40);
				setState(459); expression(0);
				setState(460); match(T__13);
				setState(462); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(461); match();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(464); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 13:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466); match(T__46);
				setState(467); expression(0);
				setState(468); match(T__72);
				setState(469); expression(0);
				}
				break;
			case 14:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471); match(T__18);
				setState(472); match(T__42);
				setState(473); pattern(0);
				setState(474); match(T__48);
				setState(475); expression(0);
				setState(476); match(T__67);
				setState(477); match(T__72);
				setState(478); expression(0);
				}
				break;
			case 15:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480); match(T__33);
				setState(482);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(481); expressionList();
					}
				}

				setState(484); match(T__75);
				}
				break;
			case 16:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485); match(T__33);
				setState(486); expression(0);
				setState(487); match(T__50);
				setState(488); expression(0);
				setState(489); match(T__75);
				}
				break;
			case 17:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491); match(T__33);
				setState(492); expression(0);
				setState(493); match(T__53);
				setState(494); rngBindingList();
				setState(495); match(SUCHTHAT);
				setState(496); expression(0);
				setState(497); match(T__75);
				}
				break;
			case 18:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499); match(T__83);
				setState(501);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(500); expressionList();
					}
				}

				setState(503); match(T__49);
				}
				break;
			case 19:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504); match(T__83);
				setState(505); expression(0);
				setState(506); match(T__50);
				setState(507); expression(0);
				setState(508); match(T__49);
				}
				break;
			case 20:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510); match(T__83);
				setState(511); expression(0);
				setState(512); match(T__53);
				setState(513); pattern(0);
				setState(514); match(T__48);
				setState(515); expression(0);
				setState(516); match(SUCHTHAT);
				setState(517); expression(0);
				setState(518); match(T__49);
				}
				break;
			case 21:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520); match(T__81);
				setState(522);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(521); mapPairList();
					}
				}

				setState(524); match(T__11);
				}
				break;
			case 22:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(525); match(T__81);
				setState(526); mapPair();
				setState(527); match(T__53);
				setState(528); rngBindingList();
				setState(529); match(SUCHTHAT);
				setState(530); expression(0);
				setState(531); match(T__11);
				}
				break;
			case 23:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(533); match(T__52);
				setState(534); match(T__42);
				setState(535); expression(0);
				setState(536); match(T__67);
				}
				break;
			case 24:
				{
				_localctx = new ContinueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(538); match(T__79);
				}
				break;
			case 25:
				{
				_localctx = new BreakExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539); match(T__32);
				}
				break;
			case 26:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540); match(T__16);
				setState(542);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(541); expression(0);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new ResultExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544); match(T__27);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(583);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(547);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(548);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__82) | (1L << T__70) | (1L << T__59) | (1L << T__28) | (1L << T__25) | (1L << T__23))) != 0) || _la==T__4 || _la==T__2) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(549); expression(17);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(550);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(551);
						_la = _input.LA(1);
						if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__68 - 16)) | (1L << (T__45 - 16)) | (1L << (T__19 - 16)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(552); expression(16);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(554);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__80) | (1L << T__78) | (1L << T__77) | (1L << T__74) | (1L << T__65) | (1L << T__62) | (1L << T__30))) != 0) || _la==T__11 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(555); expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(556);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(557); match(T__14);
						setState(558); expression(14);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(560); match(T__12);
						setState(561); expression(13);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(563);
						_la = _input.LA(1);
						if ( !(_la==T__64 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(564); expression(12);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(566); match(T__7);
						setState(567); expression(11);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(568);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(569); match(SUCHTHAT);
						setState(570); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(571);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(572); match(T__42);
						setState(574);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__66) | (1L << T__55) | (1L << T__52) | (1L << T__51) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__33) | (1L << T__32) | (1L << T__27))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__18 - 66)) | (1L << (T__17 - 66)) | (1L << (T__16 - 66)) | (1L << (T__10 - 66)) | (1L << (T__3 - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (ThisLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
							{
							setState(573); argumentList();
							}
						}

						setState(576); match(T__67);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(578); match(T__24);
						setState(579); type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(580);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(581); match(T__35);
						setState(582); type(0);
						}
						break;
					}
					} 
				}
				setState(587);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 68, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); match(T__73);
			setState(589); pattern(0);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53) {
				{
				{
				setState(590); match(T__53);
				setState(591); pattern(0);
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597); match(T__20);
			setState(598); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 70, RULE_argumentList);
		try {
			setState(602);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new PosArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(600); positionalArgumentList();
				}
				break;
			case 2:
				_localctx = new NamedArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(601); namedArgumentList();
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
		enterRule(_localctx, 72, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); expression(0);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(605); match(T__47);
				setState(606); expression(0);
				}
				}
				setState(611);
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
		enterRule(_localctx, 74, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); namedArgument();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(613); match(T__47);
				setState(614); namedArgument();
				}
				}
				setState(619);
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
		enterRule(_localctx, 76, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); match(Identifier);
			setState(621); match(T__65);
			setState(622); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); mapPair();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(625); match(T__47);
				setState(626); mapPair();
				}
				}
				setState(631);
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
		enterRule(_localctx, 80, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); expression(0);
			setState(633); match(T__43);
			setState(634); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); rngBinding();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(637); match(T__47);
				setState(638); rngBinding();
				}
				}
				setState(643);
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
		enterRule(_localctx, 84, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644); patternList();
			setState(645); match(T__43);
			setState(646); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); pattern(0);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(649); match(T__47);
				setState(650); pattern(0);
				}
				}
				setState(655);
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
		enterRule(_localctx, 88, RULE_collectionOrType);
		try {
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657); type(0);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
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

				setState(661); literal();
				}
				break;
			case T__66:
				{
				_localctx = new DontCarePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(662); match(T__66);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663); match(Identifier);
				}
				break;
			case T__42:
				{
				_localctx = new CartesianPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(664); match(T__42);
				setState(665); pattern(0);
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(666); match(T__47);
					setState(667); pattern(0);
					}
					}
					setState(670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__47 );
				setState(672); match(T__67);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypedPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(676);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(677); match(T__43);
					setState(678); type(0);
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		enterRule(_localctx, 92, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(Identifier);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(685); match(T__47);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692); expression(0);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47) {
				{
				{
				setState(693); match(T__47);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700); match(Identifier);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
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
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 98, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (IntegerLiteral - 86)) | (1L << (FloatingPointLiteral - 86)) | (1L << (BooleanLiteral - 86)) | (1L << (NullLiteral - 86)) | (1L << (ThisLiteral - 86)) | (1L << (CharacterLiteral - 86)) | (1L << (StringLiteral - 86)))) != 0)) ) {
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
		case 33: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 45: return pattern_sempred((PatternContext)_localctx, predIndex);
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
		case 10: return precpred(_ctx, 34);
		case 11: return precpred(_ctx, 33);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u02c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\5\2"+
		"h\n\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\5\2q\n\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"x\n\3\f\3\16\3{\13\3\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\6\3\6\3\7\3\7\3\7\6\7\u0093\n\7\r\7\16"+
		"\7\u0094\3\b\3\b\3\b\6\b\u009a\n\b\r\b\16\b\u009b\3\t\3\t\3\t\5\t\u00a1"+
		"\n\t\3\t\5\t\u00a4\n\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\7\13\u00b6\n\13\f\13\16\13\u00b9\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8"+
		"\13\r\3\16\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\17"+
		"\3\17\3\17\3\17\5\17\u00d7\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00f3\n\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17"+
		"\u00fb\n\17\r\17\16\17\u00fc\3\17\3\17\7\17\u0101\n\17\f\17\16\17\u0104"+
		"\13\17\3\20\3\20\5\20\u0108\n\20\3\21\3\21\3\21\3\21\7\21\u010e\n\21\f"+
		"\21\16\21\u0111\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u011c\n\22\3\23\3\23\5\23\u0120\n\23\3\24\3\24\3\24\3\24\5\24\u0126\n"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u012e\n\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\5\27\u0137\n\27\3\30\3\30\5\30\u013b\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u0142\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0149\n\32"+
		"\3\33\3\33\3\33\5\33\u014e\n\33\3\34\3\34\5\34\u0152\n\34\3\35\3\35\3"+
		"\35\3\35\5\35\u0158\n\35\3\35\6\35\u015b\n\35\r\35\16\35\u015c\3\35\3"+
		"\35\5\35\u0161\n\35\3\35\3\35\5\35\u0165\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u016b\n\36\3\36\6\36\u016e\n\36\r\36\16\36\u016f\3\36\3\36\5\36\u0174"+
		"\n\36\3\36\7\36\u0177\n\36\f\36\16\36\u017a\13\36\3\36\3\36\5\36\u017e"+
		"\n\36\3\36\5\36\u0181\n\36\3\37\3\37\3\37\3\37\5\37\u0187\n\37\3 \3 \3"+
		" \5 \u018c\n \3 \3 \3!\3!\3\"\3\"\3\"\7\"\u0195\n\"\f\"\16\"\u0198\13"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\6#\u01b5\n#\r#\16#\u01b6\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u01c5\n#\3#\3#\5#\u01c9\n#\5#\u01cb\n#\3#\3#\3#\3#\6#\u01d1\n"+
		"#\r#\16#\u01d2\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01e5"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01f8\n#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u020d\n#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0221\n#\3#\5#"+
		"\u0224\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u0241\n#\3#\3#\3#\3#\3#\3#\3#\7#\u024a\n#\f#"+
		"\16#\u024d\13#\3$\3$\3$\3$\7$\u0253\n$\f$\16$\u0256\13$\3$\3$\3$\3%\3"+
		"%\5%\u025d\n%\3&\3&\3&\7&\u0262\n&\f&\16&\u0265\13&\3\'\3\'\3\'\7\'\u026a"+
		"\n\'\f\'\16\'\u026d\13\'\3(\3(\3(\3(\3)\3)\3)\7)\u0276\n)\f)\16)\u0279"+
		"\13)\3*\3*\3*\3*\3+\3+\3+\7+\u0282\n+\f+\16+\u0285\13+\3,\3,\3,\3,\3-"+
		"\3-\3-\7-\u028e\n-\f-\16-\u0291\13-\3.\3.\5.\u0295\n.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\6/\u029f\n/\r/\16/\u02a0\3/\3/\5/\u02a5\n/\3/\3/\3/\7/\u02aa\n"+
		"/\f/\16/\u02ad\13/\3\60\3\60\3\60\7\60\u02b2\n\60\f\60\16\60\u02b5\13"+
		"\60\3\61\3\61\3\61\7\61\u02ba\n\61\f\61\16\61\u02bd\13\61\3\62\3\62\3"+
		"\62\7\62\u02c2\n\62\f\62\16\62\u02c5\13\62\3\63\3\63\3\63\2\5\34D\\\64"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bd\2\b\b\2\n\n\21\21\27\27\32\32\34\34MM\n\2\4\4\20\20\33"+
		"\33::==??RRTT\5\2\22\22))CC\n\2\5\6\b\t\f\f\25\25\30\3088KKUU\4\2\26\26"+
		"BB\3\2X^\u030e\2g\3\2\2\2\4y\3\2\2\2\6\u0081\3\2\2\2\b\u0083\3\2\2\2\n"+
		"\u0087\3\2\2\2\f\u0092\3\2\2\2\16\u0099\3\2\2\2\20\u009d\3\2\2\2\22\u00ab"+
		"\3\2\2\2\24\u00b1\3\2\2\2\26\u00bc\3\2\2\2\30\u00c1\3\2\2\2\32\u00c9\3"+
		"\2\2\2\34\u00f2\3\2\2\2\36\u0107\3\2\2\2 \u0109\3\2\2\2\"\u011b\3\2\2"+
		"\2$\u011f\3\2\2\2&\u0121\3\2\2\2(\u0127\3\2\2\2*\u012a\3\2\2\2,\u0132"+
		"\3\2\2\2.\u013a\3\2\2\2\60\u013c\3\2\2\2\62\u0143\3\2\2\2\64\u014a\3\2"+
		"\2\2\66\u0151\3\2\2\28\u0153\3\2\2\2:\u0166\3\2\2\2<\u0186\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018f\3\2\2\2B\u0196\3\2\2\2D\u0223\3\2\2\2F\u024e\3\2\2\2H"+
		"\u025c\3\2\2\2J\u025e\3\2\2\2L\u0266\3\2\2\2N\u026e\3\2\2\2P\u0272\3\2"+
		"\2\2R\u027a\3\2\2\2T\u027e\3\2\2\2V\u0286\3\2\2\2X\u028a\3\2\2\2Z\u0294"+
		"\3\2\2\2\\\u02a4\3\2\2\2^\u02ae\3\2\2\2`\u02b6\3\2\2\2b\u02be\3\2\2\2"+
		"d\u02c6\3\2\2\2fh\5\b\5\2gf\3\2\2\2gh\3\2\2\2hl\3\2\2\2ik\5\n\6\2ji\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\4\3\2po\3"+
		"\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\2\2\3s\3\3\2\2\2tu\5\6\4\2uv\7d\2\2vx\3"+
		"\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\5\3\2\2\2{y\3\2\2\2|}"+
		"\5\"\22\2}~\7d\2\2~\u0082\3\2\2\2\177\u0082\5\20\t\2\u0080\u0082\5\22"+
		"\n\2\u0081|\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\7\3\2"+
		"\2\2\u0083\u0084\7\62\2\2\u0084\u0085\5b\62\2\u0085\u0086\7d\2\2\u0086"+
		"\t\3\2\2\2\u0087\u0088\7<\2\2\u0088\u008b\5b\62\2\u0089\u008a\7W\2\2\u008a"+
		"\u008c\7\4\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\7d\2\2\u008e\13\3\2\2\2\u008f\u0090\5\"\22\2\u0090\u0091"+
		"\7d\2\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\5$\23\2"+
		"\u0097\u0098\7d\2\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d"+
		"\u009e\7 \2\2\u009e\u00a0\7_\2\2\u009f\u00a1\5\24\13\2\u00a0\u009f\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4\5\32\16\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\7\65"+
		"\2\2\u00a6\u00a7\5B\"\2\u00a7\u00a8\7\13\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7A\2\2"+
		"\u00ac\u00ad\7_\2\2\u00ad\u00ae\7\65\2\2\u00ae\u00af\5\16\b\2\u00af\u00b0"+
		"\7\13\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b7\5\26\f\2\u00b3"+
		"\u00b4\7\'\2\2\u00b4\u00b6\5\26\f\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\7%\2\2\u00bb\25\3\2\2\2\u00bc\u00bf\7_\2\2"+
		"\u00bd\u00be\7+\2\2\u00be\u00c0\5\30\r\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c6\5\34\17\2\u00c2\u00c3\7C\2\2\u00c3"+
		"\u00c5\5\34\17\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\67\2\2\u00ca\u00cf\5\34\17\2\u00cb\u00cc\7\'\2\2\u00cc\u00ce"+
		"\5\34\17\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\b\17\1\2\u00d3\u00f3\5@!\2\u00d4\u00d6\5b\62\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00f3\3\2\2\2\u00d8\u00d9\7\65"+
		"\2\2\u00d9\u00da\5\34\17\2\u00da\u00db\7\13\2\2\u00db\u00f3\3\2\2\2\u00dc"+
		"\u00dd\7\3\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\7%\2\2\u00df\u00f3\3"+
		"\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\'\2\2\u00e3"+
		"\u00e4\5\34\17\2\u00e4\u00e5\7K\2\2\u00e5\u00f3\3\2\2\2\u00e6\u00e7\7"+
		",\2\2\u00e7\u00e8\5\34\17\2\u00e8\u00e9\7\23\2\2\u00e9\u00f3\3\2\2\2\u00ea"+
		"\u00eb\7\64\2\2\u00eb\u00ec\7_\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\5\34"+
		"\17\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\5D#\2\u00f0\u00f1\7G\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00d2\3\2\2\2\u00f2\u00d4\3\2\2\2\u00f2\u00d8\3\2\2\2\u00f2"+
		"\u00dc\3\2\2\2\u00f2\u00e0\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00ea\3\2"+
		"\2\2\u00f3\u0102\3\2\2\2\u00f4\u00f5\f\t\2\2\u00f5\u00f6\7\17\2\2\u00f6"+
		"\u0101\5\34\17\n\u00f7\u00fa\f\n\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fb\5"+
		"\34\17\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u00ff\f\3\2\2\u00ff\u0101\7\61"+
		"\2\2\u0100\u00f4\3\2\2\2\u0100\u00f7\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\35\3\2\2"+
		"\2\u0104\u0102\3\2\2\2\u0105\u0108\5D#\2\u0106\u0108\7\4\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108\37\3\2\2\2\u0109\u010a\7\3\2\2\u010a"+
		"\u010f\5\34\17\2\u010b\u010c\7\'\2\2\u010c\u010e\5\34\17\2\u010d\u010b"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7%\2\2\u0113!\3\2\2\2\u0114"+
		"\u011c\5(\25\2\u0115\u011c\5*\26\2\u0116\u011c\5&\24\2\u0117\u011c\5,"+
		"\27\2\u0118\u011c\5\66\34\2\u0119\u011c\5> \2\u011a\u011c\5D#\2\u011b"+
		"\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2"+
		"\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"#\3\2\2\2\u011d\u0120\5.\30\2\u011e\u0120\5\"\22\2\u011f\u011d\3\2\2\2"+
		"\u011f\u011e\3\2\2\2\u0120%\3\2\2\2\u0121\u0122\7\35\2\2\u0122\u0125\5"+
		"\\/\2\u0123\u0124\7\25\2\2\u0124\u0126\5D#\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\'\3\2\2\2\u0127\u0128\7N\2\2\u0128\u0129\7_\2\2\u0129"+
		")\3\2\2\2\u012a\u012b\7N\2\2\u012b\u012d\7_\2\2\u012c\u012e\5\24\13\2"+
		"\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\7\25\2\2\u0130\u0131\5\34\17\2\u0131+\3\2\2\2\u0132\u0133\7\60\2\2\u0133"+
		"\u0136\5\\/\2\u0134\u0135\7\25\2\2\u0135\u0137\5D#\2\u0136\u0134\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137-\3\2\2\2\u0138\u013b\5\60\31\2\u0139\u013b"+
		"\5\62\32\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b/\3\2\2\2\u013c"+
		"\u013d\7/\2\2\u013d\u013e\7_\2\2\u013e\u013f\7+\2\2\u013f\u0141\7_\2\2"+
		"\u0140\u0142\5\64\33\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\61"+
		"\3\2\2\2\u0143\u0144\7*\2\2\u0144\u0145\7_\2\2\u0145\u0146\7+\2\2\u0146"+
		"\u0148\7_\2\2\u0147\u0149\5\64\33\2\u0148\u0147\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\63\3\2\2\2\u014a\u014d\5\36\20\2\u014b\u014c\7$\2\2\u014c"+
		"\u014e\5\36\20\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\65\3\2"+
		"\2\2\u014f\u0152\58\35\2\u0150\u0152\5:\36\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\67\3\2\2\2\u0153\u0154\7\31\2\2\u0154\u015a\7_\2"+
		"\2\u0155\u0157\7,\2\2\u0156\u0158\5X-\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\23\2\2\u015a\u0155\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015f\7+\2\2\u015f\u0161\5\34\17\2\u0160\u015e\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0163\7\25\2\2\u0163\u0165"+
		"\5D#\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u01659\3\2\2\2\u0166\u0167"+
		"\7\31\2\2\u0167\u016d\7_\2\2\u0168\u016a\7,\2\2\u0169\u016b\5X-\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\7\23"+
		"\2\2\u016d\u0168\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u0172\7+\2\2\u0172\u0174\5\34"+
		"\17\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0178\3\2\2\2\u0175"+
		"\u0177\5<\37\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u0180\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017d\7\65\2\2\u017c\u017e\5\f\7\2\u017d\u017c\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\7\13\2\2\u0180\u017b\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181;\3\2\2\2\u0182\u0183\7@\2\2\u0183\u0187\5D#\2\u0184"+
		"\u0185\7Q\2\2\u0185\u0187\5D#\2\u0186\u0182\3\2\2\2\u0186\u0184\3\2\2"+
		"\2\u0187=\3\2\2\2\u0188\u018b\7\36\2\2\u0189\u018a\7_\2\2\u018a\u018c"+
		"\7+\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\5D#\2\u018e?\3\2\2\2\u018f\u0190\t\2\2\2\u0190A\3\2\2\2\u0191\u0192"+
		"\5\"\22\2\u0192\u0193\7d\2\2\u0193\u0195\3\2\2\2\u0194\u0191\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197C\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0199\u019a\b#\1\2\u019a\u019b\7#\2\2\u019b\u0224"+
		"\5D#\"\u019c\u019d\7E\2\2\u019d\u019e\5T+\2\u019e\u019f\7W\2\2\u019f\u01a0"+
		"\5D#\34\u01a0\u0224\3\2\2\2\u01a1\u01a2\7L\2\2\u01a2\u01a3\5T+\2\u01a3"+
		"\u01a4\7W\2\2\u01a4\u01a5\5D#\33\u01a5\u0224\3\2\2\2\u01a6\u01a7\7S\2"+
		"\2\u01a7\u0224\5D#\b\u01a8\u01a9\5\\/\2\u01a9\u01aa\7\17\2\2\u01aa\u01ab"+
		"\5D#\7\u01ab\u0224\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\5D#\2\u01ae"+
		"\u01af\7\23\2\2\u01af\u0224\3\2\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b4\5D"+
		"#\2\u01b2\u01b3\7\'\2\2\u01b3\u01b5\5D#\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\7\23\2\2\u01b9\u0224\3\2\2\2\u01ba\u0224\5d\63\2\u01bb\u0224\7"+
		"_\2\2\u01bc\u01bd\7\37\2\2\u01bd\u01be\5B\"\2\u01be\u01bf\7V\2\2\u01bf"+
		"\u0224\3\2\2\2\u01c0\u01c1\7-\2\2\u01c1\u01c2\5D#\2\u01c2\u01c4\7P\2\2"+
		"\u01c3\u01c5\5D#\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01ca"+
		"\3\2\2\2\u01c6\u01c8\79\2\2\u01c7\u01c9\5D#\2\u01c8\u01c7\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u0224\3\2\2\2\u01cc\u01cd\7.\2\2\u01cd\u01ce\5D#\2\u01ce\u01d0"+
		"\7I\2\2\u01cf\u01d1\5F$\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u0224\3\2\2\2\u01d4\u01d5\7("+
		"\2\2\u01d5\u01d6\5D#\2\u01d6\u01d7\7\16\2\2\u01d7\u01d8\5D#\2\u01d8\u0224"+
		"\3\2\2\2\u01d9\u01da\7D\2\2\u01da\u01db\7,\2\2\u01db\u01dc\5\\/\2\u01dc"+
		"\u01dd\7&\2\2\u01dd\u01de\5D#\2\u01de\u01df\7\23\2\2\u01df\u01e0\7\16"+
		"\2\2\u01e0\u01e1\5D#\2\u01e1\u0224\3\2\2\2\u01e2\u01e4\7\65\2\2\u01e3"+
		"\u01e5\5`\61\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u0224\7\13\2\2\u01e7\u01e8\7\65\2\2\u01e8\u01e9\5D#\2\u01e9"+
		"\u01ea\7$\2\2\u01ea\u01eb\5D#\2\u01eb\u01ec\7\13\2\2\u01ec\u0224\3\2\2"+
		"\2\u01ed\u01ee\7\65\2\2\u01ee\u01ef\5D#\2\u01ef\u01f0\7!\2\2\u01f0\u01f1"+
		"\5T+\2\u01f1\u01f2\7W\2\2\u01f2\u01f3\5D#\2\u01f3\u01f4\7\13\2\2\u01f4"+
		"\u0224\3\2\2\2\u01f5\u01f7\7\3\2\2\u01f6\u01f8\5`\61\2\u01f7\u01f6\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0224\7%\2\2\u01fa"+
		"\u01fb\7\3\2\2\u01fb\u01fc\5D#\2\u01fc\u01fd\7$\2\2\u01fd\u01fe\5D#\2"+
		"\u01fe\u01ff\7%\2\2\u01ff\u0224\3\2\2\2\u0200\u0201\7\3\2\2\u0201\u0202"+
		"\5D#\2\u0202\u0203\7!\2\2\u0203\u0204\5\\/\2\u0204\u0205\7&\2\2\u0205"+
		"\u0206\5D#\2\u0206\u0207\7W\2\2\u0207\u0208\5D#\2\u0208\u0209\7%\2\2\u0209"+
		"\u0224\3\2\2\2\u020a\u020c\7\5\2\2\u020b\u020d\5P)\2\u020c\u020b\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0224\7K\2\2\u020f\u0210"+
		"\7\5\2\2\u0210\u0211\5R*\2\u0211\u0212\7!\2\2\u0212\u0213\5T+\2\u0213"+
		"\u0214\7W\2\2\u0214\u0215\5D#\2\u0215\u0216\7K\2\2\u0216\u0224\3\2\2\2"+
		"\u0217\u0218\7\"\2\2\u0218\u0219\7,\2\2\u0219\u021a\5D#\2\u021a\u021b"+
		"\7\23\2\2\u021b\u0224\3\2\2\2\u021c\u0224\7\7\2\2\u021d\u0224\7\66\2\2"+
		"\u021e\u0220\7F\2\2\u021f\u0221\5D#\2\u0220\u021f\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0224\7;\2\2\u0223\u0199\3\2\2\2\u0223"+
		"\u019c\3\2\2\2\u0223\u01a1\3\2\2\2\u0223\u01a6\3\2\2\2\u0223\u01a8\3\2"+
		"\2\2\u0223\u01ac\3\2\2\2\u0223\u01b0\3\2\2\2\u0223\u01ba\3\2\2\2\u0223"+
		"\u01bb\3\2\2\2\u0223\u01bc\3\2\2\2\u0223\u01c0\3\2\2\2\u0223\u01cc\3\2"+
		"\2\2\u0223\u01d4\3\2\2\2\u0223\u01d9\3\2\2\2\u0223\u01e2\3\2\2\2\u0223"+
		"\u01e7\3\2\2\2\u0223\u01ed\3\2\2\2\u0223\u01f5\3\2\2\2\u0223\u01fa\3\2"+
		"\2\2\u0223\u0200\3\2\2\2\u0223\u020a\3\2\2\2\u0223\u020f\3\2\2\2\u0223"+
		"\u0217\3\2\2\2\u0223\u021c\3\2\2\2\u0223\u021d\3\2\2\2\u0223\u021e\3\2"+
		"\2\2\u0223\u0222\3\2\2\2\u0224\u024b\3\2\2\2\u0225\u0226\f\22\2\2\u0226"+
		"\u0227\t\3\2\2\u0227\u024a\5D#\23\u0228\u0229\f\21\2\2\u0229\u022a\t\4"+
		"\2\2\u022a\u024a\5D#\22\u022b\u022c\f\20\2\2\u022c\u022d\t\5\2\2\u022d"+
		"\u024a\5D#\21\u022e\u022f\f\17\2\2\u022f\u0230\7H\2\2\u0230\u024a\5D#"+
		"\20\u0231\u0232\f\16\2\2\u0232\u0233\7J\2\2\u0233\u024a\5D#\17\u0234\u0235"+
		"\f\r\2\2\u0235\u0236\t\6\2\2\u0236\u024a\5D#\16\u0237\u0238\f\f\2\2\u0238"+
		"\u0239\7O\2\2\u0239\u024a\5D#\r\u023a\u023b\f$\2\2\u023b\u023c\7W\2\2"+
		"\u023c\u024a\7_\2\2\u023d\u023e\f#\2\2\u023e\u0240\7,\2\2\u023f\u0241"+
		"\5H%\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u024a\7\23\2\2\u0243\u0244\f\13\2\2\u0244\u0245\7>\2\2\u0245\u024a\5"+
		"\34\17\2\u0246\u0247\f\n\2\2\u0247\u0248\7\63\2\2\u0248\u024a\5\34\17"+
		"\2\u0249\u0225\3\2\2\2\u0249\u0228\3\2\2\2\u0249\u022b\3\2\2\2\u0249\u022e"+
		"\3\2\2\2\u0249\u0231\3\2\2\2\u0249\u0234\3\2\2\2\u0249\u0237\3\2\2\2\u0249"+
		"\u023a\3\2\2\2\u0249\u023d\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0246\3\2"+
		"\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"E\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\7\r\2\2\u024f\u0254\5\\/\2\u0250"+
		"\u0251\7!\2\2\u0251\u0253\5\\/\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2"+
		"\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254"+
		"\3\2\2\2\u0257\u0258\7B\2\2\u0258\u0259\5D#\2\u0259G\3\2\2\2\u025a\u025d"+
		"\5J&\2\u025b\u025d\5L\'\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d"+
		"I\3\2\2\2\u025e\u0263\5D#\2\u025f\u0260\7\'\2\2\u0260\u0262\5D#\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264K\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026b\5N(\2\u0267\u0268"+
		"\7\'\2\2\u0268\u026a\5N(\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cM\3\2\2\2\u026d\u026b\3\2\2\2"+
		"\u026e\u026f\7_\2\2\u026f\u0270\7\25\2\2\u0270\u0271\5D#\2\u0271O\3\2"+
		"\2\2\u0272\u0277\5R*\2\u0273\u0274\7\'\2\2\u0274\u0276\5R*\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"Q\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027b\5D#\2\u027b\u027c\7+\2\2\u027c"+
		"\u027d\5D#\2\u027dS\3\2\2\2\u027e\u0283\5V,\2\u027f\u0280\7\'\2\2\u0280"+
		"\u0282\5V,\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284U\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287"+
		"\5X-\2\u0287\u0288\7+\2\2\u0288\u0289\5Z.\2\u0289W\3\2\2\2\u028a\u028f"+
		"\5\\/\2\u028b\u028c\7\'\2\2\u028c\u028e\5\\/\2\u028d\u028b\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290Y\3\2\2\2"+
		"\u0291\u028f\3\2\2\2\u0292\u0295\5D#\2\u0293\u0295\5\34\17\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0293\3\2\2\2\u0295[\3\2\2\2\u0296\u0297\b/\1\2\u0297\u02a5"+
		"\5d\63\2\u0298\u02a5\7\24\2\2\u0299\u02a5\7_\2\2\u029a\u029b\7,\2\2\u029b"+
		"\u029e\5\\/\2\u029c\u029d\7\'\2\2\u029d\u029f\5\\/\2\u029e\u029c\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a3\7\23\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0296\3\2\2\2"+
		"\u02a4\u0298\3\2\2\2\u02a4\u0299\3\2\2\2\u02a4\u029a\3\2\2\2\u02a5\u02ab"+
		"\3\2\2\2\u02a6\u02a7\f\3\2\2\u02a7\u02a8\7+\2\2\u02a8\u02aa\5\34\17\2"+
		"\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac]\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b3\7_\2\2\u02af\u02b0"+
		"\7\'\2\2\u02b0\u02b2\7_\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4_\3\2\2\2\u02b5\u02b3\3\2\2\2"+
		"\u02b6\u02bb\5D#\2\u02b7\u02b8\7\'\2\2\u02b8\u02ba\5D#\2\u02b9\u02b7\3"+
		"\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"a\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c3\7_\2\2\u02bf\u02c0\7W\2\2\u02c0"+
		"\u02c2\7_\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4c\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7"+
		"\t\7\2\2\u02c7e\3\2\2\2Jglpy\u0081\u008b\u0094\u009b\u00a0\u00a3\u00a9"+
		"\u00b7\u00bf\u00c6\u00cf\u00d6\u00f2\u00fc\u0100\u0102\u0107\u010f\u011b"+
		"\u011f\u0125\u012d\u0136\u013a\u0141\u0148\u014d\u0151\u0157\u015c\u0160"+
		"\u0164\u016a\u016f\u0173\u0178\u017d\u0180\u0186\u018b\u0196\u01b6\u01c4"+
		"\u01c8\u01ca\u01d2\u01e4\u01f7\u020c\u0220\u0223\u0240\u0249\u024b\u0254"+
		"\u025c\u0263\u026b\u0277\u0283\u028f\u0294\u02a0\u02a4\u02ab\u02b3\u02bb"+
		"\u02c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}