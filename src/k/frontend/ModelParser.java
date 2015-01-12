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
		CharacterLiteral=93, StringLiteral=94, Identifier=95, CommentBorder=96, 
		COMMENT=97, LINE_COMMENT=98, WS=99, SEP=100;
	public static final String[] tokenNames = {
		"<INVALID>", "'!isin'", "'isin'", "'fun'", "'!='", "'Bool'", "'while'", 
		"'{'", "'&&'", "'..'", "'='", "'^'", "'for'", "'$'", "'viewpoint'", "'union'", 
		"'do'", "'('", "'view'", "'package'", "'psubset'", "','", "'Real'", "'var'", 
		"'>='", "'++'", "'Unit'", "'String'", "'<'", "'assert'", "'pre'", "']'", 
		"'~'", "'<=>'", "'type'", "'{|'", "'#'", "'match'", "'Char'", "'then'", 
		"'+'", "'subset'", "'ref'", "'/'", "'continue'", "'as'", "'assoc'", "'return'", 
		"'inter'", "'class'", "'||'", "'\\'", "'extends'", "'}'", "'if'", "':='", 
		"'?'", "'<='", "'break'", "'|}'", "'post'", "'req'", "'part'", "'is'", 
		"'*'", "'exists'", "'case'", "'->'", "'Int'", "':'", "'['", "'|'", "'with'", 
		"'val'", "'>'", "'_'", "'forall'", "'=>'", "'!'", "'%'", "'in'", "'else'", 
		"'begin'", "'end'", "')'", "'-'", "'import'", "'.'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "'null'", "'this'", "CharacterLiteral", 
		"StringLiteral", "Identifier", "CommentBorder", "COMMENT", "LINE_COMMENT", 
		"WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_topDeclaration = 3, RULE_classDeclaration = 4, RULE_typeParameters = 5, 
		RULE_typeParameter = 6, RULE_typeBound = 7, RULE_extending = 8, RULE_assocDeclaration = 9, 
		RULE_block = 10, RULE_assocBlock = 11, RULE_memberDeclaration = 12, RULE_typeDeclaration = 13, 
		RULE_propertyDeclaration = 14, RULE_functionDeclaration = 15, RULE_shortFunctionDeclaration = 16, 
		RULE_longFunctionDeclaration = 17, RULE_functionSpecification = 18, RULE_constraint = 19, 
		RULE_assocMemberDeclaration = 20, RULE_roleDeclaration = 21, RULE_multiplicity = 22, 
		RULE_expressionOrStar = 23, RULE_type = 24, RULE_typeArguments = 25, RULE_primitiveType = 26, 
		RULE_expression = 27, RULE_match = 28, RULE_argumentList = 29, RULE_positionalArgumentList = 30, 
		RULE_namedArgumentList = 31, RULE_namedArgument = 32, RULE_mapPairList = 33, 
		RULE_mapPair = 34, RULE_rngBindingList = 35, RULE_rngBinding = 36, RULE_patternList = 37, 
		RULE_collectionOrType = 38, RULE_pattern = 39, RULE_identifierList = 40, 
		RULE_expressionList = 41, RULE_qualifiedName = 42, RULE_literal = 43;
	public static final String[] ruleNames = {
		"model", "packageDeclaration", "importDeclaration", "topDeclaration", 
		"classDeclaration", "typeParameters", "typeParameter", "typeBound", "extending", 
		"assocDeclaration", "block", "assocBlock", "memberDeclaration", "typeDeclaration", 
		"propertyDeclaration", "functionDeclaration", "shortFunctionDeclaration", 
		"longFunctionDeclaration", "functionSpecification", "constraint", "assocMemberDeclaration", 
		"roleDeclaration", "multiplicity", "expressionOrStar", "type", "typeArguments", 
		"primitiveType", "expression", "match", "argumentList", "positionalArgumentList", 
		"namedArgumentList", "namedArgument", "mapPairList", "mapPair", "rngBindingList", 
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
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
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
			setState(91);
			_la = _input.LA(1);
			if (_la==T__67) {
				{
				setState(88); packageDeclaration();
				setState(89); match(SEP);
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(93); importDeclaration();
				setState(94); match(SEP);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__69) | (1L << T__68) | (1L << T__63) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__42) | (1L << T__40) | (1L << T__39) | (1L << T__37) | (1L << T__32) | (1L << T__28) | (1L << T__25))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__13 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(101); topDeclaration();
				setState(102); match(SEP);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(T__67);
			setState(112); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(T__0);
			setState(115); qualifiedName();
			setState(118);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(116); match(SUCHTHAT);
				setState(117); match(T__22);
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public AssocDeclarationContext assocDeclaration() {
			return getRuleContext(AssocDeclarationContext.class,0);
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
		enterRule(_localctx, 6, RULE_topDeclaration);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case T__68:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); classDeclaration();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); assocDeclaration();
				}
				break;
			case T__83:
			case T__80:
			case T__79:
			case T__74:
			case T__73:
			case T__72:
			case T__69:
			case T__63:
			case T__58:
			case T__57:
			case T__54:
			case T__52:
			case T__49:
			case T__42:
			case T__39:
			case T__32:
			case T__28:
			case T__25:
			case T__21:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__4:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); memberDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__68 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(126); match(Identifier);
			setState(128);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(127); typeParameters();
				}
			}

			setState(131);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(130); extending();
				}
			}

			setState(137);
			_la = _input.LA(1);
			if (_la==T__79) {
				{
				setState(133); match(T__79);
				setState(134); block();
				setState(135); match(T__33);
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
		enterRule(_localctx, 10, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(T__16);
			setState(140); typeParameter();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(141); match(T__65);
				setState(142); typeParameter();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); match(T__55);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(Identifier);
			setState(153);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(151); match(T__17);
				setState(152); typeBound();
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
		enterRule(_localctx, 14, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); type(0);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(156); match(T__46);
				setState(157); type(0);
				}
				}
				setState(162);
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
		enterRule(_localctx, 16, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(T__34);
			setState(164); type(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(165); match(T__65);
				setState(166); type(0);
				}
				}
				setState(171);
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

	public static class AssocDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public AssocBlockContext assocBlock() {
			return getRuleContext(AssocBlockContext.class,0);
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
		enterRule(_localctx, 18, RULE_assocDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(T__40);
			setState(173); match(Identifier);
			setState(174); match(T__79);
			setState(175); assocBlock();
			setState(176); match(T__33);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
		}
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__69) | (1L << T__63) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28) | (1L << T__25))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__13 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(178); memberDeclaration();
				setState(179); match(SEP);
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

	public static class AssocBlockContext extends ParserRuleContext {
		public List<AssocMemberDeclarationContext> assocMemberDeclaration() {
			return getRuleContexts(AssocMemberDeclarationContext.class);
		}
		public List<TerminalNode> SEP() { return getTokens(ModelParser.SEP); }
		public AssocMemberDeclarationContext assocMemberDeclaration(int i) {
			return getRuleContext(AssocMemberDeclarationContext.class,i);
		}
		public TerminalNode SEP(int i) {
			return getToken(ModelParser.SEP, i);
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
		enterRule(_localctx, 22, RULE_assocBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__69) | (1L << T__63) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__44) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28) | (1L << T__25) | (1L << T__24))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__13 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(186); assocMemberDeclaration();
				setState(187); match(SEP);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_memberDeclaration);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); typeDeclaration();
				}
				break;
			case T__63:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); propertyDeclaration();
				}
				break;
			case T__83:
			case T__72:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); functionDeclaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); constraint();
				}
				break;
			case T__80:
			case T__79:
			case T__74:
			case T__73:
			case T__69:
			case T__58:
			case T__57:
			case T__54:
			case T__49:
			case T__42:
			case T__39:
			case T__32:
			case T__28:
			case T__21:
			case T__16:
			case T__11:
			case T__10:
			case T__8:
			case T__4:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(198); expression(0);
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
		enterRule(_localctx, 26, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__52);
			setState(202); match(Identifier);
			setState(208);
			_la = _input.LA(1);
			if (_la==T__76 || _la==T__16) {
				{
				setState(204);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(203); typeParameters();
					}
				}

				setState(206); match(T__76);
				setState(207); type(0);
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__63 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(211); pattern(0);
			setState(214);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(212); match(T__76);
				setState(213); expression(0);
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
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); shortFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); longFunctionDeclaration();
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public List<PatternListContext> patternList() {
			return getRuleContexts(PatternListContext.class);
		}
		public PatternListContext patternList(int i) {
			return getRuleContext(PatternListContext.class,i);
		}
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
		enterRule(_localctx, 32, RULE_shortFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==T__83 || _la==T__72) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(221); match(Identifier);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222); match(T__69);
				setState(224);
				_la = _input.LA(1);
				if (_la==T__69 || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__11 - 75)) | (1L << (IntegerLiteral - 75)) | (1L << (FloatingPointLiteral - 75)) | (1L << (BooleanLiteral - 75)) | (1L << (NullLiteral - 75)) | (1L << (ThisLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (StringLiteral - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(223); patternList();
					}
				}

				setState(226); match(T__2);
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__69 );
			setState(233);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(231); match(T__17);
				setState(232); type(0);
				}
			}

			setState(237);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(235); match(T__76);
				setState(236); expression(0);
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public List<FunctionSpecificationContext> functionSpecification() {
			return getRuleContexts(FunctionSpecificationContext.class);
		}
		public List<PatternListContext> patternList() {
			return getRuleContexts(PatternListContext.class);
		}
		public PatternListContext patternList(int i) {
			return getRuleContext(PatternListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionSpecificationContext functionSpecification(int i) {
			return getRuleContext(FunctionSpecificationContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_longFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__83);
			setState(240); match(Identifier);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241); match(T__69);
				setState(243);
				_la = _input.LA(1);
				if (_la==T__69 || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__11 - 75)) | (1L << (IntegerLiteral - 75)) | (1L << (FloatingPointLiteral - 75)) | (1L << (BooleanLiteral - 75)) | (1L << (NullLiteral - 75)) | (1L << (ThisLiteral - 75)) | (1L << (CharacterLiteral - 75)) | (1L << (StringLiteral - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(242); patternList();
					}
				}

				setState(245); match(T__2);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__69 );
			setState(252);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(250); match(T__17);
				setState(251); type(0);
				}
			}

			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56 || _la==T__26) {
				{
				{
				setState(254); functionSpecification();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_la = _input.LA(1);
			if (_la==T__79) {
				{
				setState(260); match(T__79);
				setState(261); block();
				setState(262); match(T__33);
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
		enterRule(_localctx, 36, RULE_functionSpecification);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); match(T__56);
				setState(267); expression(0);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(T__26);
				setState(269); expression(0);
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
		enterRule(_localctx, 38, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(T__25);
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(273); match(Identifier);
				setState(274); match(T__17);
				}
				break;
			}
			setState(277); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_assocMemberDeclaration);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case T__44:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); roleDeclaration();
				}
				break;
			case T__83:
			case T__80:
			case T__79:
			case T__74:
			case T__73:
			case T__72:
			case T__69:
			case T__63:
			case T__58:
			case T__57:
			case T__54:
			case T__52:
			case T__49:
			case T__42:
			case T__39:
			case T__32:
			case T__28:
			case T__25:
			case T__21:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__4:
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
				setState(280); memberDeclaration();
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

	public static class RoleDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
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
		enterRule(_localctx, 42, RULE_roleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(284); match(Identifier);
			setState(285); match(T__17);
			setState(286); match(Identifier);
			setState(288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__69) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__22 - 64)) | (1L << (T__21 - 64)) | (1L << (T__16 - 64)) | (1L << (T__11 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__4 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (ThisLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(287); multiplicity();
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
		enterRule(_localctx, 44, RULE_multiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); expressionOrStar();
			setState(293);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(291); match(T__77);
				setState(292); expressionOrStar();
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
		enterRule(_localctx, 46, RULE_expressionOrStar);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case T__80:
			case T__79:
			case T__74:
			case T__73:
			case T__69:
			case T__58:
			case T__57:
			case T__54:
			case T__49:
			case T__42:
			case T__39:
			case T__32:
			case T__28:
			case T__21:
			case T__16:
			case T__11:
			case T__10:
			case T__8:
			case T__4:
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
				setState(295); expression(0);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(T__22);
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
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			switch (_input.LA(1)) {
			case T__81:
			case T__64:
			case T__60:
			case T__59:
			case T__48:
			case T__18:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(300); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301); qualifiedName();
				setState(303);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(302); typeArguments();
					}
					break;
				}
				}
				break;
			case T__79:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305); match(T__79);
				setState(306); type(0);
				setState(307); match(T__33);
				}
				break;
			case T__16:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309); match(T__16);
				setState(310); type(0);
				setState(311); match(T__55);
				}
				break;
			case T__58:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313); match(T__58);
				setState(314); type(0);
				setState(315); match(T__65);
				setState(316); type(0);
				setState(317); match(T__12);
				}
				break;
			case T__69:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319); match(T__69);
				setState(320); type(0);
				setState(321); match(T__2);
				}
				break;
			case T__51:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323); match(T__51);
				setState(324); match(Identifier);
				setState(325); match(T__17);
				setState(326); type(0);
				setState(327); match(SUCHTHAT);
				setState(328); expression(0);
				setState(329); match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(333);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(334); match(T__19);
						setState(335); type(8);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(336);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(339); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(337); match(T__22);
								setState(338); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(341); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(343);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(344); match(T__30);
						}
						break;
					}
					} 
				}
				setState(349);
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
		enterRule(_localctx, 50, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(T__16);
			setState(351); type(0);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(352); match(T__65);
				setState(353); type(0);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(T__55);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__81 - 5)) | (1L << (T__64 - 5)) | (1L << (T__60 - 5)) | (1L << (T__59 - 5)) | (1L << (T__48 - 5)) | (1L << (T__18 - 5)))) != 0)) ) {
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
	public static class BreakExpContext extends ExpressionContext {
		public BreakExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBreakExp(this);
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
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
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
	public static class ResultExpContext extends ExpressionContext {
		public ResultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitResultExp(this);
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
	public static class ForExpContext extends ExpressionContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
	public static class ContinueExpContext extends ExpressionContext {
		public ContinueExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitContinueExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatchExpContext extends ExpressionContext {
		public List<MatchContext> match() {
			return getRuleContexts(MatchContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchContext match(int i) {
			return getRuleContext(MatchContext.class,i);
		}
		public MatchExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitMatchExp(this);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(364); match(T__8);
				setState(365); expression(32);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366); match(T__10);
				setState(367); rngBindingList();
				setState(368); match(SUCHTHAT);
				setState(369); expression(26);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371); match(T__21);
				setState(372); rngBindingList();
				setState(373); match(SUCHTHAT);
				setState(374); expression(25);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(376); match(T__54);
				setState(377); expression(6);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378); pattern(0);
				setState(379); match(T__19);
				setState(380); expression(5);
				}
				break;
			case 6:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382); match(T__69);
				setState(383); expression(0);
				setState(384); match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new TupleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386); match(T__69);
				setState(387); expression(0);
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388); match(T__65);
					setState(389); expression(0);
					}
					}
					setState(392); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__65 );
				setState(394); match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396); literal();
				}
				break;
			case 9:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397); match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new BlockExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398); match(T__4);
				setState(399); block();
				setState(400); match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(402); match(T__32);
				setState(403); expression(0);
				setState(404); match(T__47);
				setState(406);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(405); expression(0);
					}
					break;
				}
				setState(412);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(408); match(T__5);
					setState(410);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(409); expression(0);
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
				setState(414); match(T__49);
				setState(415); expression(0);
				setState(416); match(T__14);
				setState(418); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(417); match();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(420); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 13:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422); match(T__80);
				setState(423); expression(0);
				setState(424); match(T__70);
				setState(425); expression(0);
				}
				break;
			case 14:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(427); match(T__74);
				setState(428); match(T__69);
				setState(429); pattern(0);
				setState(430); match(T__6);
				setState(431); expression(0);
				setState(432); match(T__2);
				setState(433); match(T__70);
				setState(434); expression(0);
				}
				break;
			case 15:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(436); match(T__79);
				setState(438);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__69) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(437); expressionList();
					}
				}

				setState(440); match(T__33);
				}
				break;
			case 16:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(441); match(T__79);
				setState(442); expression(0);
				setState(443); match(T__77);
				setState(444); expression(0);
				setState(445); match(T__33);
				}
				break;
			case 17:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(447); match(T__79);
				setState(448); expression(0);
				setState(449); match(T__15);
				setState(450); rngBindingList();
				setState(451); match(SUCHTHAT);
				setState(452); expression(0);
				setState(453); match(T__33);
				}
				break;
			case 18:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455); match(T__16);
				setState(457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__69) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(456); expressionList();
					}
				}

				setState(459); match(T__55);
				}
				break;
			case 19:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460); match(T__16);
				setState(461); expression(0);
				setState(462); match(T__77);
				setState(463); expression(0);
				setState(464); match(T__55);
				}
				break;
			case 20:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466); match(T__16);
				setState(467); expression(0);
				setState(468); match(T__15);
				setState(469); pattern(0);
				setState(470); match(T__6);
				setState(471); expression(0);
				setState(472); match(SUCHTHAT);
				setState(473); expression(0);
				setState(474); match(T__55);
				}
				break;
			case 21:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476); match(T__58);
				setState(478);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__69) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(477); mapPairList();
					}
				}

				setState(480); match(T__12);
				}
				break;
			case 22:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481); match(T__58);
				setState(482); mapPair();
				setState(483); match(T__15);
				setState(484); rngBindingList();
				setState(485); match(SUCHTHAT);
				setState(486); expression(0);
				setState(487); match(T__12);
				}
				break;
			case 23:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489); match(T__57);
				setState(490); match(T__69);
				setState(491); expression(0);
				setState(492); match(T__2);
				}
				break;
			case 24:
				{
				_localctx = new ContinueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494); match(T__42);
				}
				break;
			case 25:
				{
				_localctx = new BreakExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495); match(T__28);
				}
				break;
			case 26:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496); match(T__39);
				setState(498);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(497); expression(0);
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
				setState(500); match(T__73);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(539);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(503);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(504);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__61) | (1L << T__50) | (1L << T__43) | (1L << T__38) | (1L << T__35))) != 0) || _la==T__22 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(505); expression(17);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(507);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__46 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(508); expression(16);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(509);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(510);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__85) | (1L << T__84) | (1L << T__82) | (1L << T__76) | (1L << T__66) | (1L << T__62) | (1L << T__58) | (1L << T__45) | (1L << T__29))) != 0) || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(511); expression(15);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(512);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(513); match(T__78);
						setState(514); expression(14);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(515);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(516); match(T__36);
						setState(517); expression(13);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(518);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(519);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(520); expression(12);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(521);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(522); match(T__31);
						setState(523); expression(11);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(524);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(525); match(SUCHTHAT);
						setState(526); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(527);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(528); match(T__69);
						setState(530);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__74) | (1L << T__73) | (1L << T__69) | (1L << T__58) | (1L << T__57) | (1L << T__54) | (1L << T__49) | (1L << T__42) | (1L << T__39) | (1L << T__32) | (1L << T__28))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__21 - 65)) | (1L << (T__16 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__4 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(529); argumentList();
							}
						}

						setState(532); match(T__2);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(534); match(T__23);
						setState(535); type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(536);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(537); match(T__41);
						setState(538); type(0);
						}
						break;
					}
					} 
				}
				setState(543);
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
		enterRule(_localctx, 56, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); match(T__20);
			setState(545); pattern(0);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(546); match(T__15);
				setState(547); pattern(0);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553); match(T__9);
			setState(554); expression(0);
			}
		}
		catch (RecognitionException re) {
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

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentList);
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new PosArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556); positionalArgumentList();
				}
				break;
			case 2:
				_localctx = new NamedArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557); namedArgumentList();
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
		enterRule(_localctx, 60, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); expression(0);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(561); match(T__65);
				setState(562); expression(0);
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

	public static class NamedArgumentListContext extends ParserRuleContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
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
		enterRule(_localctx, 62, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); namedArgument();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(569); match(T__65);
				setState(570); namedArgument();
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
		enterRule(_localctx, 64, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(Identifier);
			setState(577); match(T__76);
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
		enterRule(_localctx, 66, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); mapPair();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(581); match(T__65);
				setState(582); mapPair();
				}
				}
				setState(587);
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
		enterRule(_localctx, 68, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); expression(0);
			setState(589); match(T__17);
			setState(590); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); rngBinding();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(593); match(T__65);
				setState(594); rngBinding();
				}
				}
				setState(599);
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
		enterRule(_localctx, 72, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); patternList();
			setState(601); match(T__17);
			setState(602); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); pattern(0);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(605); match(T__65);
				setState(606); pattern(0);
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
		enterRule(_localctx, 76, RULE_collectionOrType);
		try {
			setState(614);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613); type(0);
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
	public static class DontCarePatternContext extends PatternContext {
		public DontCarePatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitDontCarePattern(this);
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

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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

				setState(617); literal();
				}
				break;
			case T__11:
				{
				_localctx = new DontCarePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618); match(T__11);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619); match(Identifier);
				}
				break;
			case T__69:
				{
				_localctx = new CartesianPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620); match(T__69);
				setState(621); pattern(0);
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(622); match(T__65);
					setState(623); pattern(0);
					}
					}
					setState(626); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__65 );
				setState(628); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypedPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(632);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(633); match(T__17);
					setState(634); type(0);
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 80, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(Identifier);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(641); match(T__65);
				setState(642); match(Identifier);
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
		enterRule(_localctx, 82, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); expression(0);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(649); match(T__65);
				setState(650); expression(0);
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
		enterRule(_localctx, 84, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656); match(Identifier);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(657); match(SUCHTHAT);
					setState(658); match(Identifier);
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		public TerminalNode NullLiteral() { return getToken(ModelParser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ModelParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ModelParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ModelParser.CharacterLiteral, 0); }
		public TerminalNode ThisLiteral() { return getToken(ModelParser.ThisLiteral, 0); }
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
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
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
		case 24: return type_sempred((TypeContext)_localctx, predIndex);
		case 27: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39: return pattern_sempred((PatternContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3f\u029d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\5\2^\n\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3"+
		"\2\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4y\n\4\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\6\5\6\u0083\n\6\3\6\5\6\u0086"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16"+
		"\7\u0095\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\7\t\u00a1"+
		"\n\t\f\t\16\t\u00a4\13\t\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00b8\n\f\f\f\16\f"+
		"\u00bb\13\f\3\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17\5\17\u00cf\n\17\3\17\3\17"+
		"\5\17\u00d3\n\17\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\21\3\21\5\21\u00dd"+
		"\n\21\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3\22\6\22\u00e6\n\22\r\22\16"+
		"\22\u00e7\3\22\3\22\5\22\u00ec\n\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00f6\n\23\3\23\6\23\u00f9\n\23\r\23\16\23\u00fa\3\23"+
		"\3\23\5\23\u00ff\n\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13\23\3\23"+
		"\3\23\3\23\3\23\5\23\u010b\n\23\3\24\3\24\3\24\3\24\5\24\u0111\n\24\3"+
		"\25\3\25\3\25\5\25\u0116\n\25\3\25\3\25\3\26\3\26\5\26\u011c\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0123\n\27\3\30\3\30\3\30\5\30\u0128\n\30\3"+
		"\31\3\31\5\31\u012c\n\31\3\32\3\32\3\32\3\32\5\32\u0132\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014e\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\6\32\u0156\n\32\r\32\16\32\u0157\3\32\3\32\7"+
		"\32\u015c\n\32\f\32\16\32\u015f\13\32\3\33\3\33\3\33\3\33\7\33\u0165\n"+
		"\33\f\33\16\33\u0168\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u0189\n\35\r\35\16\35\u018a"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0199"+
		"\n\35\3\35\3\35\5\35\u019d\n\35\5\35\u019f\n\35\3\35\3\35\3\35\3\35\6"+
		"\35\u01a5\n\35\r\35\16\35\u01a6\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b9\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u01cc\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e1\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01f5\n\35\3\35\5\35\u01f8\n\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0215\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u021e\n\35\f\35\16\35\u0221\13\35\3\36\3\36"+
		"\3\36\3\36\7\36\u0227\n\36\f\36\16\36\u022a\13\36\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u0231\n\37\3 \3 \3 \7 \u0236\n \f \16 \u0239\13 \3!\3!\3!\7"+
		"!\u023e\n!\f!\16!\u0241\13!\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u024a\n#\f#\16"+
		"#\u024d\13#\3$\3$\3$\3$\3%\3%\3%\7%\u0256\n%\f%\16%\u0259\13%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\7\'\u0262\n\'\f\'\16\'\u0265\13\'\3(\3(\5(\u0269\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\6)\u0273\n)\r)\16)\u0274\3)\3)\5)\u0279\n)\3)\3"+
		")\3)\7)\u027e\n)\f)\16)\u0281\13)\3*\3*\3*\7*\u0286\n*\f*\16*\u0289\13"+
		"*\3+\3+\3+\7+\u028e\n+\f+\16+\u0291\13+\3,\3,\3,\7,\u0296\n,\f,\16,\u0299"+
		"\13,\3-\3-\3-\2\5\628P.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVX\2\f\4\2\24\24\63\63\4\2\31\31KK\4\2\5"+
		"\5\20\20\4\2,,@@\7\2\7\7\30\30\34\35((FF\n\2\r\r\33\33&&--\62\62\65\65"+
		"BBQQ\5\2\21\21**WW\13\2\3\4\6\6\f\f\26\26\32\32\36\36++;;LL\4\2##OO\3"+
		"\2Z`\u02e1\2]\3\2\2\2\4q\3\2\2\2\6t\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f"+
		"\u008d\3\2\2\2\16\u0098\3\2\2\2\20\u009d\3\2\2\2\22\u00a5\3\2\2\2\24\u00ae"+
		"\3\2\2\2\26\u00b9\3\2\2\2\30\u00c1\3\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3"+
		"\2\2\2\36\u00d4\3\2\2\2 \u00dc\3\2\2\2\"\u00de\3\2\2\2$\u00f1\3\2\2\2"+
		"&\u0110\3\2\2\2(\u0112\3\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u0124\3"+
		"\2\2\2\60\u012b\3\2\2\2\62\u014d\3\2\2\2\64\u0160\3\2\2\2\66\u016b\3\2"+
		"\2\28\u01f7\3\2\2\2:\u0222\3\2\2\2<\u0230\3\2\2\2>\u0232\3\2\2\2@\u023a"+
		"\3\2\2\2B\u0242\3\2\2\2D\u0246\3\2\2\2F\u024e\3\2\2\2H\u0252\3\2\2\2J"+
		"\u025a\3\2\2\2L\u025e\3\2\2\2N\u0268\3\2\2\2P\u0278\3\2\2\2R\u0282\3\2"+
		"\2\2T\u028a\3\2\2\2V\u0292\3\2\2\2X\u029a\3\2\2\2Z[\5\4\3\2[\\\7f\2\2"+
		"\\^\3\2\2\2]Z\3\2\2\2]^\3\2\2\2^d\3\2\2\2_`\5\6\4\2`a\7f\2\2ac\3\2\2\2"+
		"b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fd\3\2\2\2gh\5\b\5\2"+
		"hi\7f\2\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2op\7\2\2\3p\3\3\2\2\2qr\7\25\2\2rs\5V,\2s\5\3\2\2\2tu\7X\2\2"+
		"ux\5V,\2vw\7Y\2\2wy\7B\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2z~\5\n\6\2{~"+
		"\5\24\13\2|~\5\32\16\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\t\3\2\2\2\177\u0080"+
		"\t\2\2\2\u0080\u0082\7a\2\2\u0081\u0083\5\f\7\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0088\7\t\2\2\u0088"+
		"\u0089\5\26\f\2\u0089\u008a\7\67\2\2\u008a\u008c\3\2\2\2\u008b\u0087\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d\u008e\7H\2\2\u008e\u0093"+
		"\5\16\b\2\u008f\u0090\7\27\2\2\u0090\u0092\5\16\b\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7!\2\2\u0097\r\3\2\2\2\u0098"+
		"\u009b\7a\2\2\u0099\u009a\7G\2\2\u009a\u009c\5\20\t\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u00a2\5\62\32\2\u009e"+
		"\u009f\7*\2\2\u009f\u00a1\5\62\32\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7\66\2\2\u00a6\u00ab\5\62\32\2\u00a7\u00a8"+
		"\7\27\2\2\u00a8\u00aa\5\62\32\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2"+
		"\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\7\60\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7\t\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\u00b3\7\67\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\5\32"+
		"\16\2\u00b5\u00b6\7f\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5*\26\2\u00bd\u00be\7f\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00ca\5\34\17"+
		"\2\u00c5\u00ca\5\36\20\2\u00c6\u00ca\5 \21\2\u00c7\u00ca\5(\25\2\u00c8"+
		"\u00ca\58\35\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc"+
		"\7$\2\2\u00cc\u00d2\7a\2\2\u00cd\u00cf\5\f\7\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\f\2\2\u00d1\u00d3\5\62"+
		"\32\2\u00d2\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5"+
		"\t\3\2\2\u00d5\u00d8\5P)\2\u00d6\u00d7\7\f\2\2\u00d7\u00d9\58\35\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\37\3\2\2\2\u00da\u00dd\5\"\22"+
		"\2\u00db\u00dd\5$\23\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd!"+
		"\3\2\2\2\u00de\u00df\t\4\2\2\u00df\u00e5\7a\2\2\u00e0\u00e2\7\23\2\2\u00e1"+
		"\u00e3\5L\'\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\7V\2\2\u00e5\u00e0\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00ea\7G"+
		"\2\2\u00ea\u00ec\5\62\32\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00ee\7\f\2\2\u00ee\u00f0\58\35\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7\5\2\2\u00f2\u00f8"+
		"\7a\2\2\u00f3\u00f5\7\23\2\2\u00f4\u00f6\5L\'\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7V\2\2\u00f8\u00f3\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fd\7G\2\2\u00fd\u00ff\5\62\32\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\5&\24\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u010a\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\t\2\2\u0107"+
		"\u0108\5\26\f\2\u0108\u0109\7\67\2\2\u0109\u010b\3\2\2\2\u010a\u0106\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b%\3\2\2\2\u010c\u010d\7 \2\2\u010d\u0111"+
		"\58\35\2\u010e\u010f\7>\2\2\u010f\u0111\58\35\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\'\3\2\2\2\u0112\u0115\7?\2\2\u0113\u0114\7a\2\2\u0114"+
		"\u0116\7G\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0118\58\35\2\u0118)\3\2\2\2\u0119\u011c\5,\27\2\u011a\u011c"+
		"\5\32\16\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c+\3\2\2\2\u011d"+
		"\u011e\t\5\2\2\u011e\u011f\7a\2\2\u011f\u0120\7G\2\2\u0120\u0122\7a\2"+
		"\2\u0121\u0123\5.\30\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123-"+
		"\3\2\2\2\u0124\u0127\5\60\31\2\u0125\u0126\7\13\2\2\u0126\u0128\5\60\31"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128/\3\2\2\2\u0129\u012c"+
		"\58\35\2\u012a\u012c\7B\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\61\3\2\2\2\u012d\u012e\b\32\1\2\u012e\u014e\5\66\34\2\u012f\u0131\5V"+
		",\2\u0130\u0132\5\64\33\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u014e\3\2\2\2\u0133\u0134\7\t\2\2\u0134\u0135\5\62\32\2\u0135\u0136\7"+
		"\67\2\2\u0136\u014e\3\2\2\2\u0137\u0138\7H\2\2\u0138\u0139\5\62\32\2\u0139"+
		"\u013a\7!\2\2\u013a\u014e\3\2\2\2\u013b\u013c\7\36\2\2\u013c\u013d\5\62"+
		"\32\2\u013d\u013e\7\27\2\2\u013e\u013f\5\62\32\2\u013f\u0140\7L\2\2\u0140"+
		"\u014e\3\2\2\2\u0141\u0142\7\23\2\2\u0142\u0143\5\62\32\2\u0143\u0144"+
		"\7V\2\2\u0144\u014e\3\2\2\2\u0145\u0146\7%\2\2\u0146\u0147\7a\2\2\u0147"+
		"\u0148\7G\2\2\u0148\u0149\5\62\32\2\u0149\u014a\7Y\2\2\u014a\u014b\58"+
		"\35\2\u014b\u014c\7=\2\2\u014c\u014e\3\2\2\2\u014d\u012d\3\2\2\2\u014d"+
		"\u012f\3\2\2\2\u014d\u0133\3\2\2\2\u014d\u0137\3\2\2\2\u014d\u013b\3\2"+
		"\2\2\u014d\u0141\3\2\2\2\u014d\u0145\3\2\2\2\u014e\u015d\3\2\2\2\u014f"+
		"\u0150\f\t\2\2\u0150\u0151\7E\2\2\u0151\u015c\5\62\32\n\u0152\u0155\f"+
		"\n\2\2\u0153\u0154\7B\2\2\u0154\u0156\5\62\32\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2"+
		"\2\2\u0159\u015a\f\3\2\2\u015a\u015c\7:\2\2\u015b\u014f\3\2\2\2\u015b"+
		"\u0152\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\63\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161"+
		"\7H\2\2\u0161\u0166\5\62\32\2\u0162\u0163\7\27\2\2\u0163\u0165\5\62\32"+
		"\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7!\2\2\u016a"+
		"\65\3\2\2\2\u016b\u016c\t\6\2\2\u016c\67\3\2\2\2\u016d\u016e\b\35\1\2"+
		"\u016e\u016f\7P\2\2\u016f\u01f8\58\35\"\u0170\u0171\7N\2\2\u0171\u0172"+
		"\5H%\2\u0172\u0173\7Y\2\2\u0173\u0174\58\35\34\u0174\u01f8\3\2\2\2\u0175"+
		"\u0176\7C\2\2\u0176\u0177\5H%\2\u0177\u0178\7Y\2\2\u0178\u0179\58\35\33"+
		"\u0179\u01f8\3\2\2\2\u017a\u017b\7\"\2\2\u017b\u01f8\58\35\b\u017c\u017d"+
		"\5P)\2\u017d\u017e\7E\2\2\u017e\u017f\58\35\7\u017f\u01f8\3\2\2\2\u0180"+
		"\u0181\7\23\2\2\u0181\u0182\58\35\2\u0182\u0183\7V\2\2\u0183\u01f8\3\2"+
		"\2\2\u0184\u0185\7\23\2\2\u0185\u0188\58\35\2\u0186\u0187\7\27\2\2\u0187"+
		"\u0189\58\35\2\u0188\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7V\2\2\u018d"+
		"\u01f8\3\2\2\2\u018e\u01f8\5X-\2\u018f\u01f8\7a\2\2\u0190\u0191\7T\2\2"+
		"\u0191\u0192\5\26\f\2\u0192\u0193\7U\2\2\u0193\u01f8\3\2\2\2\u0194\u0195"+
		"\78\2\2\u0195\u0196\58\35\2\u0196\u0198\7)\2\2\u0197\u0199\58\35\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2\2\2\u019a\u019c\7S"+
		"\2\2\u019b\u019d\58\35\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01f8\3\2"+
		"\2\2\u01a0\u01a1\7\'\2\2\u01a1\u01a2\58\35\2\u01a2\u01a4\7J\2\2\u01a3"+
		"\u01a5\5:\36\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01f8\3\2\2\2\u01a8\u01a9\7\b\2\2\u01a9"+
		"\u01aa\58\35\2\u01aa\u01ab\7\22\2\2\u01ab\u01ac\58\35\2\u01ac\u01f8\3"+
		"\2\2\2\u01ad\u01ae\7\16\2\2\u01ae\u01af\7\23\2\2\u01af\u01b0\5P)\2\u01b0"+
		"\u01b1\7R\2\2\u01b1\u01b2\58\35\2\u01b2\u01b3\7V\2\2\u01b3\u01b4\7\22"+
		"\2\2\u01b4\u01b5\58\35\2\u01b5\u01f8\3\2\2\2\u01b6\u01b8\7\t\2\2\u01b7"+
		"\u01b9\5T+\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2"+
		"\2\u01ba\u01f8\7\67\2\2\u01bb\u01bc\7\t\2\2\u01bc\u01bd\58\35\2\u01bd"+
		"\u01be\7\13\2\2\u01be\u01bf\58\35\2\u01bf\u01c0\7\67\2\2\u01c0\u01f8\3"+
		"\2\2\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\58\35\2\u01c3\u01c4\7I\2\2\u01c4"+
		"\u01c5\5H%\2\u01c5\u01c6\7Y\2\2\u01c6\u01c7\58\35\2\u01c7\u01c8\7\67\2"+
		"\2\u01c8\u01f8\3\2\2\2\u01c9\u01cb\7H\2\2\u01ca\u01cc\5T+\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01f8\7!\2\2\u01ce"+
		"\u01cf\7H\2\2\u01cf\u01d0\58\35\2\u01d0\u01d1\7\13\2\2\u01d1\u01d2\58"+
		"\35\2\u01d2\u01d3\7!\2\2\u01d3\u01f8\3\2\2\2\u01d4\u01d5\7H\2\2\u01d5"+
		"\u01d6\58\35\2\u01d6\u01d7\7I\2\2\u01d7\u01d8\5P)\2\u01d8\u01d9\7R\2\2"+
		"\u01d9\u01da\58\35\2\u01da\u01db\7Y\2\2\u01db\u01dc\58\35\2\u01dc\u01dd"+
		"\7!\2\2\u01dd\u01f8\3\2\2\2\u01de\u01e0\7\36\2\2\u01df\u01e1\5D#\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01f8\7L"+
		"\2\2\u01e3\u01e4\7\36\2\2\u01e4\u01e5\5F$\2\u01e5\u01e6\7I\2\2\u01e6\u01e7"+
		"\5H%\2\u01e7\u01e8\7Y\2\2\u01e8\u01e9\58\35\2\u01e9\u01ea\7L\2\2\u01ea"+
		"\u01f8\3\2\2\2\u01eb\u01ec\7\37\2\2\u01ec\u01ed\7\23\2\2\u01ed\u01ee\5"+
		"8\35\2\u01ee\u01ef\7V\2\2\u01ef\u01f8\3\2\2\2\u01f0\u01f8\7.\2\2\u01f1"+
		"\u01f8\7<\2\2\u01f2\u01f4\7\61\2\2\u01f3\u01f5\58\35\2\u01f4\u01f3\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f8\7\17\2\2\u01f7"+
		"\u016d\3\2\2\2\u01f7\u0170\3\2\2\2\u01f7\u0175\3\2\2\2\u01f7\u017a\3\2"+
		"\2\2\u01f7\u017c\3\2\2\2\u01f7\u0180\3\2\2\2\u01f7\u0184\3\2\2\2\u01f7"+
		"\u018e\3\2\2\2\u01f7\u018f\3\2\2\2\u01f7\u0190\3\2\2\2\u01f7\u0194\3\2"+
		"\2\2\u01f7\u01a0\3\2\2\2\u01f7\u01a8\3\2\2\2\u01f7\u01ad\3\2\2\2\u01f7"+
		"\u01b6\3\2\2\2\u01f7\u01bb\3\2\2\2\u01f7\u01c1\3\2\2\2\u01f7\u01c9\3\2"+
		"\2\2\u01f7\u01ce\3\2\2\2\u01f7\u01d4\3\2\2\2\u01f7\u01de\3\2\2\2\u01f7"+
		"\u01e3\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f7\u01f1\3\2"+
		"\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u021f\3\2\2\2\u01f9"+
		"\u01fa\f\22\2\2\u01fa\u01fb\t\7\2\2\u01fb\u021e\58\35\23\u01fc\u01fd\f"+
		"\21\2\2\u01fd\u01fe\t\b\2\2\u01fe\u021e\58\35\22\u01ff\u0200\f\20\2\2"+
		"\u0200\u0201\t\t\2\2\u0201\u021e\58\35\21\u0202\u0203\f\17\2\2\u0203\u0204"+
		"\7\n\2\2\u0204\u021e\58\35\20\u0205\u0206\f\16\2\2\u0206\u0207\7\64\2"+
		"\2\u0207\u021e\58\35\17\u0208\u0209\f\r\2\2\u0209\u020a\t\n\2\2\u020a"+
		"\u021e\58\35\16\u020b\u020c\f\f\2\2\u020c\u020d\79\2\2\u020d\u021e\58"+
		"\35\r\u020e\u020f\f$\2\2\u020f\u0210\7Y\2\2\u0210\u021e\7a\2\2\u0211\u0212"+
		"\f#\2\2\u0212\u0214\7\23\2\2\u0213\u0215\5<\37\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021e\7V\2\2\u0217\u0218\f\13"+
		"\2\2\u0218\u0219\7A\2\2\u0219\u021e\5\62\32\2\u021a\u021b\f\n\2\2\u021b"+
		"\u021c\7/\2\2\u021c\u021e\5\62\32\2\u021d\u01f9\3\2\2\2\u021d\u01fc\3"+
		"\2\2\2\u021d\u01ff\3\2\2\2\u021d\u0202\3\2\2\2\u021d\u0205\3\2\2\2\u021d"+
		"\u0208\3\2\2\2\u021d\u020b\3\2\2\2\u021d\u020e\3\2\2\2\u021d\u0211\3\2"+
		"\2\2\u021d\u0217\3\2\2\2\u021d\u021a\3\2\2\2\u021e\u0221\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u02209\3\2\2\2\u0221\u021f\3\2\2\2"+
		"\u0222\u0223\7D\2\2\u0223\u0228\5P)\2\u0224\u0225\7I\2\2\u0225\u0227\5"+
		"P)\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7O"+
		"\2\2\u022c\u022d\58\35\2\u022d;\3\2\2\2\u022e\u0231\5> \2\u022f\u0231"+
		"\5@!\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231=\3\2\2\2\u0232\u0237"+
		"\58\35\2\u0233\u0234\7\27\2\2\u0234\u0236\58\35\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238?\3"+
		"\2\2\2\u0239\u0237\3\2\2\2\u023a\u023f\5B\"\2\u023b\u023c\7\27\2\2\u023c"+
		"\u023e\5B\"\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240A\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243"+
		"\7a\2\2\u0243\u0244\7\f\2\2\u0244\u0245\58\35\2\u0245C\3\2\2\2\u0246\u024b"+
		"\5F$\2\u0247\u0248\7\27\2\2\u0248\u024a\5F$\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cE\3\2\2\2"+
		"\u024d\u024b\3\2\2\2\u024e\u024f\58\35\2\u024f\u0250\7G\2\2\u0250\u0251"+
		"\58\35\2\u0251G\3\2\2\2\u0252\u0257\5J&\2\u0253\u0254\7\27\2\2\u0254\u0256"+
		"\5J&\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258I\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\5L\'\2\u025b"+
		"\u025c\7G\2\2\u025c\u025d\5N(\2\u025dK\3\2\2\2\u025e\u0263\5P)\2\u025f"+
		"\u0260\7\27\2\2\u0260\u0262\5P)\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264M\3\2\2\2\u0265\u0263"+
		"\3\2\2\2\u0266\u0269\58\35\2\u0267\u0269\5\62\32\2\u0268\u0266\3\2\2\2"+
		"\u0268\u0267\3\2\2\2\u0269O\3\2\2\2\u026a\u026b\b)\1\2\u026b\u0279\5X"+
		"-\2\u026c\u0279\7M\2\2\u026d\u0279\7a\2\2\u026e\u026f\7\23\2\2\u026f\u0272"+
		"\5P)\2\u0270\u0271\7\27\2\2\u0271\u0273\5P)\2\u0272\u0270\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0277\7V\2\2\u0277\u0279\3\2\2\2\u0278\u026a\3\2\2\2\u0278"+
		"\u026c\3\2\2\2\u0278\u026d\3\2\2\2\u0278\u026e\3\2\2\2\u0279\u027f\3\2"+
		"\2\2\u027a\u027b\f\3\2\2\u027b\u027c\7G\2\2\u027c\u027e\5\62\32\2\u027d"+
		"\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280Q\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0287\7a\2\2\u0283\u0284"+
		"\7\27\2\2\u0284\u0286\7a\2\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288S\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028f\58\35\2\u028b\u028c\7\27\2\2\u028c\u028e\58\35\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"U\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0297\7a\2\2\u0293\u0294\7Y\2\2\u0294"+
		"\u0296\7a\2\2\u0295\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298W\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b"+
		"\t\13\2\2\u029bY\3\2\2\2E]dlx}\u0082\u0085\u008b\u0093\u009b\u00a2\u00ab"+
		"\u00b9\u00c1\u00c9\u00ce\u00d2\u00d8\u00dc\u00e2\u00e7\u00eb\u00ef\u00f5"+
		"\u00fa\u00fe\u0103\u010a\u0110\u0115\u011b\u0122\u0127\u012b\u0131\u014d"+
		"\u0157\u015b\u015d\u0166\u018a\u0198\u019c\u019e\u01a6\u01b8\u01cb\u01e0"+
		"\u01f4\u01f7\u0214\u021d\u021f\u0228\u0230\u0237\u023f\u024b\u0257\u0263"+
		"\u0268\u0274\u0278\u027f\u0287\u028f\u0297";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}