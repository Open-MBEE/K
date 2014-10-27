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
		T__82=1, T__81=2, T__80=3, T__79=4, T__78=5, T__77=6, T__76=7, T__75=8, 
		T__74=9, T__73=10, T__72=11, T__71=12, T__70=13, T__69=14, T__68=15, T__67=16, 
		T__66=17, T__65=18, T__64=19, T__63=20, T__62=21, T__61=22, T__60=23, 
		T__59=24, T__58=25, T__57=26, T__56=27, T__55=28, T__54=29, T__53=30, 
		T__52=31, T__51=32, T__50=33, T__49=34, T__48=35, T__47=36, T__46=37, 
		T__45=38, T__44=39, T__43=40, T__42=41, T__41=42, T__40=43, T__39=44, 
		T__38=45, T__37=46, T__36=47, T__35=48, T__34=49, T__33=50, T__32=51, 
		T__31=52, T__30=53, T__29=54, T__28=55, T__27=56, T__26=57, T__25=58, 
		T__24=59, T__23=60, T__22=61, T__21=62, T__20=63, T__19=64, T__18=65, 
		T__17=66, T__16=67, T__15=68, T__14=69, T__13=70, T__12=71, T__11=72, 
		T__10=73, T__9=74, T__8=75, T__7=76, T__6=77, T__5=78, T__4=79, T__3=80, 
		T__2=81, T__1=82, T__0=83, SUCHTHAT=84, IntegerLiteral=85, FloatingPointLiteral=86, 
		BooleanLiteral=87, NullLiteral=88, CharacterLiteral=89, StringLiteral=90, 
		Identifier=91, COMMENT=92, LINE_COMMENT=93, WS=94, SEP=95;
	public static final String[] tokenNames = {
		"<INVALID>", "'implies'", "'or'", "'['", "'*'", "'<'", "'!isin'", "'<='", 
		"'Bool'", "'}'", "'subset'", "'eq'", "'lt'", "'case'", "'do'", "'->'", 
		"'%'", "'Unit'", "'union'", "')'", "'_'", "'iff'", "'gt'", "'='", "'<=>'", 
		"'String'", "'psubset'", "'fun'", "'Int'", "'\\'", "'gte'", "'Char'", 
		"'val'", "'req'", "'class'", "'|'", "'assert'", "'!'", "'..'", "']'", 
		"'in'", "','", "'of'", "'while'", "'-'", "':'", "'('", "'not'", "'if'", 
		"'lte'", "'var'", "'?'", "'package'", "'{|'", "'{'", "'and'", "'extends'", 
		"'isin'", "'else'", "'++'", "'import'", "'^'", "'inter'", "'pre'", "'assoc'", 
		"'=>'", "'+'", "'for'", "'create'", "'forall'", "'|}'", "'&&'", "'||'", 
		"'>'", "'exists'", "'Real'", "'type'", "':='", "'then'", "'post'", "'/'", 
		"'~'", "'>='", "'#'", "'.'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "'null'", "CharacterLiteral", "StringLiteral", "Identifier", 
		"COMMENT", "LINE_COMMENT", "WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_topDeclaration = 1, RULE_packageDeclaration = 2, 
		RULE_importDeclaration = 3, RULE_classDeclaration = 4, RULE_classToken = 5, 
		RULE_typeParameters = 6, RULE_typeParameter = 7, RULE_typeBound = 8, RULE_valueParameters = 9, 
		RULE_typingList = 10, RULE_extending = 11, RULE_type = 12, RULE_expressionOrStar = 13, 
		RULE_typeArguments = 14, RULE_memberDeclaration = 15, RULE_valueDeclaration = 16, 
		RULE_sortDeclaration = 17, RULE_typeDeclaration = 18, RULE_variableDeclaration = 19, 
		RULE_typing = 20, RULE_functionDeclaration = 21, RULE_functionSpecification = 22, 
		RULE_constraint = 23, RULE_primitiveType = 24, RULE_tokenLessThan = 25, 
		RULE_tokenGreatherThan = 26, RULE_tokenLessThanEqual = 27, RULE_tokenGreaterThanEqual = 28, 
		RULE_tokenAnd = 29, RULE_tokenOr = 30, RULE_tokenNot = 31, RULE_tokenImplies = 32, 
		RULE_tokenIFF = 33, RULE_tokenEquals = 34, RULE_tokenStar = 35, RULE_tokenArrow = 36, 
		RULE_expressionsWithSeparator = 37, RULE_expression = 38, RULE_bracketedexpression = 39, 
		RULE_classArgumentList = 40, RULE_classArgument = 41, RULE_idValueList = 42, 
		RULE_idValuePair = 43, RULE_match = 44, RULE_matchPattern = 45, RULE_matchArgument = 46, 
		RULE_mapPairList = 47, RULE_mapPair = 48, RULE_rngBindingList = 49, RULE_rngBinding = 50, 
		RULE_patternList = 51, RULE_collectionOrType = 52, RULE_pattern = 53, 
		RULE_identifierList = 54, RULE_expressionList = 55, RULE_qualifiedName = 56, 
		RULE_literal = 57;
	public static final String[] ruleNames = {
		"model", "topDeclaration", "packageDeclaration", "importDeclaration", 
		"classDeclaration", "classToken", "typeParameters", "typeParameter", "typeBound", 
		"valueParameters", "typingList", "extending", "type", "expressionOrStar", 
		"typeArguments", "memberDeclaration", "valueDeclaration", "sortDeclaration", 
		"typeDeclaration", "variableDeclaration", "typing", "functionDeclaration", 
		"functionSpecification", "constraint", "primitiveType", "tokenLessThan", 
		"tokenGreatherThan", "tokenLessThanEqual", "tokenGreaterThanEqual", "tokenAnd", 
		"tokenOr", "tokenNot", "tokenImplies", "tokenIFF", "tokenEquals", "tokenStar", 
		"tokenArrow", "expressionsWithSeparator", "expression", "bracketedexpression", 
		"classArgumentList", "classArgument", "idValueList", "idValuePair", "match", 
		"matchPattern", "matchArgument", "mapPairList", "mapPair", "rngBindingList", 
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
			setState(117);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(116); packageDeclaration();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(119); importDeclaration();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__49) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__19 - 64)) | (1L << (T__16 - 64)) | (1L << (T__15 - 64)) | (1L << (T__14 - 64)) | (1L << (T__9 - 64)) | (1L << (T__7 - 64)) | (1L << (T__2 - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(125); topDeclaration();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(135);
			switch (_input.LA(1)) {
			case T__80:
			case T__78:
			case T__70:
			case T__69:
			case T__56:
			case T__51:
			case T__50:
			case T__47:
			case T__46:
			case T__40:
			case T__37:
			case T__36:
			case T__35:
			case T__33:
			case T__29:
			case T__16:
			case T__15:
			case T__14:
			case T__9:
			case T__7:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); memberDeclaration();
				}
				break;
			case T__49:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); classDeclaration();
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
			setState(137); match(T__31);
			setState(138); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
			setState(140); match(T__23);
			setState(141); qualifiedName();
			setState(144);
			_la = _input.LA(1);
			if (_la==SUCHTHAT) {
				{
				setState(142); match(SUCHTHAT);
				setState(143); match(T__79);
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
			setState(146); classToken();
			setState(147); match(Identifier);
			setState(149);
			_la = _input.LA(1);
			if (_la==T__80) {
				{
				setState(148); typeParameters();
				}
			}

			setState(152);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(151); valueParameters();
				}
			}

			setState(155);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(154); extending();
				}
			}

			setState(157); match(T__29);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				{
				setState(158); memberDeclaration();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164); match(T__74);
			}
		}
		catch (RecognitionException re) {
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
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__19) ) {
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
			setState(168); match(T__80);
			setState(169); typeParameter();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(170); match(T__42);
				setState(171); typeParameter();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(T__44);
			}
		}
		catch (RecognitionException re) {
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
			setState(179); match(Identifier);
			setState(182);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(180); match(T__38);
				setState(181); typeBound();
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
			setState(184); type(0);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(185); match(T__17);
				setState(186); type(0);
				}
				}
				setState(191);
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
			setState(192); match(T__37);
			setState(193); typingList();
			setState(194); match(T__64);
			}
		}
		catch (RecognitionException re) {
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
			setState(196); typing();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(197); match(T__42);
				setState(198); typing();
				}
				}
				setState(203);
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
			setState(204); match(T__27);
			setState(205); type(0);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(206); match(T__42);
				setState(207); type(0);
				}
				}
				setState(212);
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
			setState(243);
			switch (_input.LA(1)) {
			case T__75:
			case T__66:
			case T__58:
			case T__55:
			case T__52:
			case T__8:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214); primitiveType();
				}
				break;
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); qualifiedName();
				setState(217);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(216); typeArguments();
					}
					break;
				}
				}
				break;
			case T__37:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219); match(T__37);
				setState(220); type(0);
				setState(221); match(T__64);
				}
				break;
			case T__30:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223); match(T__30);
				setState(224); typing();
				setState(225); match(SUCHTHAT);
				setState(226); expression(0);
				setState(227); match(T__13);
				}
				break;
			case T__29:
				{
				_localctx = new SetTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); match(T__29);
				setState(230); type(0);
				setState(231); match(T__74);
				}
				break;
			case T__80:
				{
				_localctx = new ListTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); match(T__80);
				setState(234); type(0);
				setState(235); match(T__44);
				}
				break;
			case T__78:
				{
				_localctx = new MapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); match(T__78);
				setState(238); type(0);
				setState(239); match(T__42);
				setState(240); type(0);
				setState(241); match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246); tokenArrow();
						setState(247); type(9);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(249);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(250); tokenStar();
								setState(251); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(255); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new RangeTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258); expressionOrStar();
						setState(261);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(259); match(T__45);
							setState(260); expressionOrStar();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new OptionalTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(263);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(264); match(T__32);
						}
						break;
					}
					} 
				}
				setState(269);
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
			setState(272);
			switch (_input.LA(1)) {
			case T__80:
			case T__78:
			case T__70:
			case T__69:
			case T__47:
			case T__46:
			case T__40:
			case T__37:
			case T__36:
			case T__35:
			case T__29:
			case T__16:
			case T__15:
			case T__14:
			case T__9:
			case T__2:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); expression(0);
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); match(T__79);
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
			setState(274); match(T__80);
			setState(275); type(0);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(276); match(T__42);
				setState(277); type(0);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283); match(T__44);
			}
		}
		catch (RecognitionException re) {
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
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); sortDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); valueDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288); variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(289); functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290); constraint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(291); expressionsWithSeparator();
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
			setState(294); match(T__51);
			setState(295); typing();
			setState(298);
			_la = _input.LA(1);
			if (_la==T__60) {
				{
				setState(296); match(T__60);
				setState(297); expression(0);
				}
			}

			setState(300); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(302); match(T__7);
			setState(303); match(Identifier);
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
			setState(306); match(T__7);
			setState(307); match(Identifier);
			setState(309);
			_la = _input.LA(1);
			if (_la==T__80) {
				{
				setState(308); typeParameters();
				}
			}

			setState(311); match(T__60);
			setState(312); type(0);
			setState(313); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(315); match(T__33);
			setState(316); typing();
			setState(319);
			_la = _input.LA(1);
			if (_la==T__60) {
				{
				setState(317); match(T__60);
				setState(318); expression(0);
				}
			}

			setState(321); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
			setState(323); match(Identifier);
			setState(324); match(T__38);
			setState(325); type(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(T__56);
			setState(328); match(Identifier);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329); match(T__37);
				setState(331);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(330); typingList();
					}
				}

				setState(333); match(T__64);
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
			setState(340);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(338); match(T__38);
				setState(339); type(0);
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__4) {
				{
				{
				setState(342); functionSpecification();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348); match(T__29);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				{
				setState(349); memberDeclaration();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(T__74);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_functionSpecification);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); match(T__20);
				setState(358); match(T__37);
				setState(359); expression(0);
				setState(360); match(T__64);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(362); match(T__4);
				setState(363); match(T__37);
				setState(364); expression(0);
				setState(365); match(T__64);
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
		enterRule(_localctx, 46, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(T__50);
			setState(371);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(370); match(Identifier);
				}
			}

			setState(373); match(T__29);
			setState(374); expression(0);
			setState(375); match(T__74);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__75) | (1L << T__66) | (1L << T__58) | (1L << T__55) | (1L << T__52))) != 0) || _la==T__8) ) {
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
		enterRule(_localctx, 50, RULE_tokenLessThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==T__71) ) {
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
		enterRule(_localctx, 52, RULE_tokenGreatherThan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==T__61 || _la==T__10) ) {
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
		enterRule(_localctx, 54, RULE_tokenLessThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==T__76 || _la==T__34) ) {
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
		enterRule(_localctx, 56, RULE_tokenGreaterThanEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__1) ) {
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
		enterRule(_localctx, 58, RULE_tokenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 60, RULE_tokenOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__11) ) {
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
		enterRule(_localctx, 62, RULE_tokenNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__36) ) {
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
		enterRule(_localctx, 64, RULE_tokenImplies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==T__82 || _la==T__18) ) {
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
		enterRule(_localctx, 66, RULE_tokenIFF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==T__62 || _la==T__59) ) {
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
		enterRule(_localctx, 68, RULE_tokenEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==T__72 || _la==T__60) ) {
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
		enterRule(_localctx, 70, RULE_tokenStar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(T__79);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_tokenArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); match(T__68);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_expressionsWithSeparator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); expression(0);
			setState(404); match(SEP);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(407); tokenNot();
				setState(408); expression(21);
				}
				break;
			case 2:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410); match(T__14);
				setState(411); rngBindingList();
				setState(412); match(SUCHTHAT);
				setState(413); expression(20);
				}
				break;
			case 3:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415); match(T__9);
				setState(416); rngBindingList();
				setState(417); match(SUCHTHAT);
				setState(418); expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420); match(T__2);
				setState(421); expression(2);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422); pattern();
				setState(425);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(423); match(T__38);
					setState(424); type(0);
					}
				}

				setState(427); match(T__68);
				setState(428); expression(1);
				}
				break;
			case 6:
				{
				_localctx = new BracketedExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430); bracketedexpression();
				}
				break;
			case 7:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(431); literal();
				}
				break;
			case 8:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432); match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new CreateExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433); match(T__15);
				setState(434); qualifiedName();
				setState(440);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(435); match(T__37);
					setState(437);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(436); classArgumentList();
						}
					}

					setState(439); match(T__64);
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
				setState(442); match(T__35);
				setState(443); match(T__37);
				setState(444); expression(0);
				setState(445); match(T__64);
				setState(446); match(T__5);
				setState(447); expression(0);
				setState(448); match(T__25);
				setState(449); expression(0);
				}
				break;
			case 11:
				{
				_localctx = new DoExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(451); match(T__69);
				setState(452); match(T__29);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					{
					setState(453); memberDeclaration();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459); match(T__74);
				}
				break;
			case 12:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460); match(T__40);
				setState(461); match(T__37);
				setState(462); expression(0);
				setState(463); match(T__64);
				setState(464); match(T__69);
				setState(465); match(T__29);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					{
					setState(466); memberDeclaration();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472); match(T__74);
				}
				break;
			case 13:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474); match(T__16);
				setState(475); match(T__37);
				setState(476); pattern();
				setState(479);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(477); match(T__38);
					setState(478); type(0);
					}
				}

				setState(481); match(T__43);
				setState(482); expression(0);
				setState(483); match(T__64);
				setState(484); match(T__69);
				setState(485); match(T__29);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__56) | (1L << T__51) | (1L << T__50) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__33) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					{
					setState(486); memberDeclaration();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492); match(T__74);
				}
				break;
			case 14:
				{
				_localctx = new MatchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494); match(T__70);
				setState(495); expression(0);
				setState(496); match(T__41);
				setState(497); match();
				}
				break;
			case 15:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499); match(T__29);
				setState(501);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(500); expressionList();
					}
				}

				setState(503); match(T__74);
				}
				break;
			case 16:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504); match(T__29);
				setState(505); expression(0);
				setState(506); match(T__45);
				setState(507); expression(0);
				setState(508); match(T__74);
				}
				break;
			case 17:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510); match(T__29);
				setState(511); expression(0);
				setState(512); match(T__48);
				setState(513); rngBindingList();
				setState(514); match(SUCHTHAT);
				setState(515); expression(0);
				setState(516); match(T__74);
				}
				break;
			case 18:
				{
				_localctx = new ListEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518); match(T__80);
				setState(520);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(519); expressionList();
					}
				}

				setState(522); match(T__44);
				}
				break;
			case 19:
				{
				_localctx = new ListRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523); match(T__80);
				setState(524); expression(0);
				setState(525); match(T__45);
				setState(526); expression(0);
				setState(527); match(T__44);
				}
				break;
			case 20:
				{
				_localctx = new ListCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529); match(T__80);
				setState(530); expression(0);
				setState(531); match(T__48);
				setState(532); pattern();
				setState(533); match(T__38);
				setState(534); expression(0);
				setState(535); match(SUCHTHAT);
				setState(536); expression(0);
				setState(537); match(T__44);
				}
				break;
			case 21:
				{
				_localctx = new MapEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539); match(T__78);
				setState(541);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__78) | (1L << T__70) | (1L << T__69) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__29))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__15 - 67)) | (1L << (T__14 - 67)) | (1L << (T__9 - 67)) | (1L << (T__2 - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(540); mapPairList();
					}
				}

				setState(543); match(T__10);
				}
				break;
			case 22:
				{
				_localctx = new MapCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544); match(T__78);
				setState(545); mapPair();
				setState(546); match(T__48);
				setState(547); rngBindingList();
				setState(548); match(SUCHTHAT);
				setState(549); expression(0);
				setState(550); match(T__10);
				}
				break;
			case 23:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(552); match(T__47);
				setState(553); match(T__37);
				setState(554); expression(0);
				setState(555); match(T__64);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(604);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(560);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__79) | (1L << T__67) | (1L << T__54) | (1L << T__24) | (1L << T__22) | (1L << T__21))) != 0) || _la==T__3 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(561); expression(11);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(563);
						_la = _input.LA(1);
						if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__65 - 18)) | (1L << (T__39 - 18)) | (1L << (T__17 - 18)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(564); expression(10);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(578);
						switch (_input.LA(1)) {
						case T__76:
						case T__34:
							{
							setState(566); tokenLessThanEqual();
							}
							break;
						case T__53:
						case T__1:
							{
							setState(567); tokenGreaterThanEqual();
							}
							break;
						case T__78:
						case T__71:
							{
							setState(568); tokenLessThan();
							}
							break;
						case T__61:
						case T__10:
							{
							setState(569); tokenGreatherThan();
							}
							break;
						case T__72:
						case T__60:
							{
							setState(570); tokenEquals();
							}
							break;
						case T__46:
						case T__36:
							{
							setState(571); tokenNot();
							setState(572); tokenEquals();
							}
							break;
						case T__26:
							{
							setState(574); match(T__26);
							}
							break;
						case T__77:
							{
							setState(575); match(T__77);
							}
							break;
						case T__73:
							{
							setState(576); match(T__73);
							}
							break;
						case T__57:
							{
							setState(577); match(T__57);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(580); expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(581);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(582); tokenAnd();
						setState(583); expression(8);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(586); tokenOr();
						setState(587); expression(7);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(589);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(592);
						switch (_input.LA(1)) {
						case T__82:
						case T__18:
							{
							setState(590); tokenImplies();
							}
							break;
						case T__62:
						case T__59:
							{
							setState(591); tokenIFF();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(594); expression(6);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(597); match(T__6);
						setState(598); expression(5);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(600); match(SUCHTHAT);
						setState(601); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(603); bracketedexpression();
						}
						break;
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public final BracketedexpressionContext bracketedexpression() throws RecognitionException {
		BracketedexpressionContext _localctx = new BracketedexpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bracketedexpression);
		int _la;
		try {
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(609); match(T__37);
				setState(610); expression(0);
				setState(611); match(T__64);
				}
				break;
			case 2:
				_localctx = new TupleExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(613); match(T__37);
				setState(614); expression(0);
				setState(617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(615); match(T__42);
					setState(616); expression(0);
					}
					}
					setState(619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__42 );
				setState(621); match(T__64);
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
		enterRule(_localctx, 80, RULE_classArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); classArgument();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(626); match(T__42);
				setState(627); classArgument();
				}
				}
				setState(632);
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
		enterRule(_localctx, 82, RULE_classArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(Identifier);
			setState(634); match(T__38);
			setState(635); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_idValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); idValuePair();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(638); match(T__42);
				setState(639); idValuePair();
				}
				}
				setState(644);
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
		enterRule(_localctx, 86, RULE_idValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); match(Identifier);
			setState(646); match(T__6);
			setState(647); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); matchPattern();
			setState(650); match(T__18);
			setState(651); expression(0);
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(652); match(T__48);
				setState(653); match();
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
		enterRule(_localctx, 90, RULE_matchPattern);
		int _la;
		try {
			setState(682);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); literal();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(657); match(T__63);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(658); match(Identifier);
				setState(670);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(659); match(T__37);
					setState(660); matchArgument();
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__42) {
						{
						{
						setState(661); match(T__42);
						setState(662); matchArgument();
						}
						}
						setState(667);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(668); match(T__64);
					}
				}

				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(672); match(T__37);
				setState(673); matchPattern();
				setState(676); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(674); match(T__42);
					setState(675); matchPattern();
					}
					}
					setState(678); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__42 );
				setState(680); match(T__64);
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
		enterRule(_localctx, 92, RULE_matchArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(Identifier);
			setState(685); match(T__60);
			setState(686); matchPattern();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_mapPairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); mapPair();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(689); match(T__42);
				setState(690); mapPair();
				}
				}
				setState(695);
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
		enterRule(_localctx, 96, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); expression(0);
			setState(697); match(T__38);
			setState(698); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700); rngBinding();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(701); match(T__42);
				setState(702); rngBinding();
				}
				}
				setState(707);
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
		enterRule(_localctx, 100, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708); patternList();
			setState(709); match(T__38);
			setState(710); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); pattern();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(713); match(T__42);
				setState(714); pattern();
				}
				}
				setState(719);
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
		enterRule(_localctx, 104, RULE_collectionOrType);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721); type(0);
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
		enterRule(_localctx, 106, RULE_pattern);
		int _la;
		try {
			setState(735);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(724); match(Identifier);
				}
				break;
			case T__37:
				_localctx = new CartesianPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(725); match(T__37);
				setState(726); pattern();
				setState(729); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(727); match(T__42);
					setState(728); pattern();
					}
					}
					setState(731); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__42 );
				setState(733); match(T__64);
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
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); match(Identifier);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(738); match(T__42);
				setState(739); match(Identifier);
				}
				}
				setState(744);
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
		enterRule(_localctx, 110, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); expression(0);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(746); match(T__42);
				setState(747); expression(0);
				}
				}
				setState(752);
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
		enterRule(_localctx, 112, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(753); match(Identifier);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754); match(SUCHTHAT);
					setState(755); match(Identifier);
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 114, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (IntegerLiteral - 85)) | (1L << (FloatingPointLiteral - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (NullLiteral - 85)) | (1L << (CharacterLiteral - 85)) | (1L << (StringLiteral - 85)))) != 0)) ) {
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
		case 38: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		case 11: return precpred(_ctx, 29);
		case 12: return precpred(_ctx, 27);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3a\u02fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\5\2x\n\2"+
		"\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2"+
		"\3\2\3\3\3\3\5\3\u008a\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3"+
		"\6\3\6\3\6\5\6\u0098\n\6\3\6\5\6\u009b\n\6\3\6\5\6\u009e\n\6\3\6\3\6\7"+
		"\6\u00a2\n\6\f\6\16\6\u00a5\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00af"+
		"\n\b\f\b\16\b\u00b2\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b9\n\t\3\n\3\n\3\n"+
		"\7\n\u00be\n\n\f\n\16\n\u00c1\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f"+
		"\u00ca\n\f\f\f\16\f\u00cd\13\f\3\r\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r"+
		"\u00d6\13\r\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f6\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\6\16\u0100\n\16\r\16\16\16\u0101\3\16\3\16\3\16\3\16\5"+
		"\16\u0108\n\16\3\16\3\16\7\16\u010c\n\16\f\16\16\16\u010f\13\16\3\17\3"+
		"\17\5\17\u0113\n\17\3\20\3\20\3\20\3\20\7\20\u0119\n\20\f\20\16\20\u011c"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0127\n\21\3"+
		"\22\3\22\3\22\3\22\5\22\u012d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\5\24\u0138\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0142\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u014e"+
		"\n\27\3\27\6\27\u0151\n\27\r\27\16\27\u0152\3\27\3\27\5\27\u0157\n\27"+
		"\3\27\7\27\u015a\n\27\f\27\16\27\u015d\13\27\3\27\3\27\7\27\u0161\n\27"+
		"\f\27\16\27\u0164\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0172\n\30\3\31\3\31\5\31\u0176\n\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01ac\n(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u01b8\n(\3(\5(\u01bb\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\7(\u01c9\n(\f(\16(\u01cc\13(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01d6\n"+
		"(\f(\16(\u01d9\13(\3(\3(\3(\3(\3(\3(\3(\5(\u01e2\n(\3(\3(\3(\3(\3(\3("+
		"\7(\u01ea\n(\f(\16(\u01ed\13(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01f8\n(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u020b\n(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0220\n(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0230\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0245\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u0253\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u025f\n(\f"+
		"(\16(\u0262\13(\3)\3)\3)\3)\3)\3)\3)\3)\6)\u026c\n)\r)\16)\u026d\3)\3"+
		")\5)\u0272\n)\3*\3*\3*\7*\u0277\n*\f*\16*\u027a\13*\3+\3+\3+\3+\3,\3,"+
		"\3,\7,\u0283\n,\f,\16,\u0286\13,\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0291\n"+
		".\3/\3/\3/\3/\3/\3/\3/\7/\u029a\n/\f/\16/\u029d\13/\3/\3/\5/\u02a1\n/"+
		"\3/\3/\3/\3/\6/\u02a7\n/\r/\16/\u02a8\3/\3/\5/\u02ad\n/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\7\61\u02b6\n\61\f\61\16\61\u02b9\13\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\7\63\u02c2\n\63\f\63\16\63\u02c5\13\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u02ce\n\65\f\65\16\65\u02d1\13\65"+
		"\3\66\3\66\5\66\u02d5\n\66\3\67\3\67\3\67\3\67\3\67\6\67\u02dc\n\67\r"+
		"\67\16\67\u02dd\3\67\3\67\5\67\u02e2\n\67\38\38\38\78\u02e7\n8\f8\168"+
		"\u02ea\138\39\39\39\79\u02ef\n9\f9\169\u02f2\139\3:\3:\3:\7:\u02f7\n:"+
		"\f:\16:\u02fa\13:\3;\3;\3;\2\4\32N<\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\21\4\2$$BB"+
		"\b\2\n\n\23\23\33\33\36\36!!MM\4\2\7\7\16\16\4\2\30\30KK\4\2\t\t\63\63"+
		"\4\2  TT\4\299II\4\2\4\4JJ\4\2\'\'\61\61\4\2\3\3CC\4\2\27\27\32\32\4\2"+
		"\r\r\31\31\t\2\6\6\22\22\37\37==?@RRUU\5\2\24\24..DD\3\2W\\\u0337\2w\3"+
		"\2\2\2\4\u0089\3\2\2\2\6\u008b\3\2\2\2\b\u008e\3\2\2\2\n\u0094\3\2\2\2"+
		"\f\u00a8\3\2\2\2\16\u00aa\3\2\2\2\20\u00b5\3\2\2\2\22\u00ba\3\2\2\2\24"+
		"\u00c2\3\2\2\2\26\u00c6\3\2\2\2\30\u00ce\3\2\2\2\32\u00f5\3\2\2\2\34\u0112"+
		"\3\2\2\2\36\u0114\3\2\2\2 \u0126\3\2\2\2\"\u0128\3\2\2\2$\u0130\3\2\2"+
		"\2&\u0134\3\2\2\2(\u013d\3\2\2\2*\u0145\3\2\2\2,\u0149\3\2\2\2.\u0171"+
		"\3\2\2\2\60\u0173\3\2\2\2\62\u017b\3\2\2\2\64\u017d\3\2\2\2\66\u017f\3"+
		"\2\2\28\u0181\3\2\2\2:\u0183\3\2\2\2<\u0185\3\2\2\2>\u0187\3\2\2\2@\u0189"+
		"\3\2\2\2B\u018b\3\2\2\2D\u018d\3\2\2\2F\u018f\3\2\2\2H\u0191\3\2\2\2J"+
		"\u0193\3\2\2\2L\u0195\3\2\2\2N\u022f\3\2\2\2P\u0271\3\2\2\2R\u0273\3\2"+
		"\2\2T\u027b\3\2\2\2V\u027f\3\2\2\2X\u0287\3\2\2\2Z\u028b\3\2\2\2\\\u02ac"+
		"\3\2\2\2^\u02ae\3\2\2\2`\u02b2\3\2\2\2b\u02ba\3\2\2\2d\u02be\3\2\2\2f"+
		"\u02c6\3\2\2\2h\u02ca\3\2\2\2j\u02d4\3\2\2\2l\u02e1\3\2\2\2n\u02e3\3\2"+
		"\2\2p\u02eb\3\2\2\2r\u02f3\3\2\2\2t\u02fb\3\2\2\2vx\5\6\4\2wv\3\2\2\2"+
		"wx\3\2\2\2x|\3\2\2\2y{\5\b\5\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\u0082\3\2\2\2~|\3\2\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u008a\5 \21\2"+
		"\u0088\u008a\5\n\6\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\5\3"+
		"\2\2\2\u008b\u008c\7\66\2\2\u008c\u008d\5r:\2\u008d\7\3\2\2\2\u008e\u008f"+
		"\7>\2\2\u008f\u0092\5r:\2\u0090\u0091\7V\2\2\u0091\u0093\7\6\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\t\3\2\2\2\u0094\u0095\5\f\7\2"+
		"\u0095\u0097\7]\2\2\u0096\u0098\5\16\b\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5\24\13\2\u009a\u0099\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5\30\r\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\78\2\2\u00a0"+
		"\u00a2\5 \21\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\13\2\2\u00a7\13\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\r\3\2\2\2\u00aa"+
		"\u00ab\7\5\2\2\u00ab\u00b0\5\20\t\2\u00ac\u00ad\7+\2\2\u00ad\u00af\5\20"+
		"\t\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7)"+
		"\2\2\u00b4\17\3\2\2\2\u00b5\u00b8\7]\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b9"+
		"\5\22\n\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba"+
		"\u00bf\5\32\16\2\u00bb\u00bc\7D\2\2\u00bc\u00be\5\32\16\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\23\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\60\2\2\u00c3\u00c4\5\26"+
		"\f\2\u00c4\u00c5\7\25\2\2\u00c5\25\3\2\2\2\u00c6\u00cb\5*\26\2\u00c7\u00c8"+
		"\7+\2\2\u00c8\u00ca\5*\26\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\27\3\2\2\2\u00cd\u00cb\3\2\2"+
		"\2\u00ce\u00cf\7:\2\2\u00cf\u00d4\5\32\16\2\u00d0\u00d1\7+\2\2\u00d1\u00d3"+
		"\5\32\16\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\b\16\1\2\u00d8\u00f6\5\62\32\2\u00d9\u00db\5r:\2\u00da\u00dc\5\36\20"+
		"\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00f6\3\2\2\2\u00dd\u00de"+
		"\7\60\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7\25\2\2\u00e0\u00f6\3\2\2"+
		"\2\u00e1\u00e2\7\67\2\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\7V\2\2\u00e4\u00e5"+
		"\5N(\2\u00e5\u00e6\7H\2\2\u00e6\u00f6\3\2\2\2\u00e7\u00e8\78\2\2\u00e8"+
		"\u00e9\5\32\16\2\u00e9\u00ea\7\13\2\2\u00ea\u00f6\3\2\2\2\u00eb\u00ec"+
		"\7\5\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7)\2\2\u00ee\u00f6\3\2\2\2"+
		"\u00ef\u00f0\7\7\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\7+\2\2\u00f2\u00f3"+
		"\5\32\16\2\u00f3\u00f4\7K\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00d7\3\2\2\2"+
		"\u00f5\u00d9\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e7"+
		"\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\u010d\3\2\2\2\u00f7"+
		"\u00f8\f\n\2\2\u00f8\u00f9\5J&\2\u00f9\u00fa\5\32\16\13\u00fa\u010c\3"+
		"\2\2\2\u00fb\u00ff\f\13\2\2\u00fc\u00fd\5H%\2\u00fd\u00fe\5\32\16\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u010c\3\2\2\2\u0103\u0104\f\4\2\2\u0104"+
		"\u0107\5\34\17\2\u0105\u0106\7(\2\2\u0106\u0108\5\34\17\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\3\2\2\2\u0109\u010a\f\3\2\2\u010a"+
		"\u010c\7\65\2\2\u010b\u00f7\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u0103\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\33\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5N(\2"+
		"\u0111\u0113\7\6\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\35"+
		"\3\2\2\2\u0114\u0115\7\5\2\2\u0115\u011a\5\32\16\2\u0116\u0117\7+\2\2"+
		"\u0117\u0119\5\32\16\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7)\2\2\u011e\37\3\2\2\2\u011f\u0127\5$\23\2\u0120\u0127\5&\24\2"+
		"\u0121\u0127\5\"\22\2\u0122\u0127\5(\25\2\u0123\u0127\5,\27\2\u0124\u0127"+
		"\5\60\31\2\u0125\u0127\5L\'\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2"+
		"\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127!\3\2\2\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012c\5*\26\2\u012a\u012b\7\31\2\2\u012b\u012d\5N(\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7a\2\2\u012f"+
		"#\3\2\2\2\u0130\u0131\7N\2\2\u0131\u0132\7]\2\2\u0132\u0133\7a\2\2\u0133"+
		"%\3\2\2\2\u0134\u0135\7N\2\2\u0135\u0137\7]\2\2\u0136\u0138\5\16\b\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\31"+
		"\2\2\u013a\u013b\5\32\16\2\u013b\u013c\7a\2\2\u013c\'\3\2\2\2\u013d\u013e"+
		"\7\64\2\2\u013e\u0141\5*\26\2\u013f\u0140\7\31\2\2\u0140\u0142\5N(\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7a"+
		"\2\2\u0144)\3\2\2\2\u0145\u0146\7]\2\2\u0146\u0147\7/\2\2\u0147\u0148"+
		"\5\32\16\2\u0148+\3\2\2\2\u0149\u014a\7\35\2\2\u014a\u0150\7]\2\2\u014b"+
		"\u014d\7\60\2\2\u014c\u014e\5\26\f\2\u014d\u014c\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7\25\2\2\u0150\u014b\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0155\7/\2\2\u0155\u0157\5\32\16\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u015b\3\2\2\2\u0158\u015a\5.\30\2\u0159\u0158\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0162\78\2\2\u015f\u0161\5 \21"+
		"\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\13\2\2"+
		"\u0166-\3\2\2\2\u0167\u0168\7A\2\2\u0168\u0169\7\60\2\2\u0169\u016a\5"+
		"N(\2\u016a\u016b\7\25\2\2\u016b\u0172\3\2\2\2\u016c\u016d\7Q\2\2\u016d"+
		"\u016e\7\60\2\2\u016e\u016f\5N(\2\u016f\u0170\7\25\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u0167\3\2\2\2\u0171\u016c\3\2\2\2\u0172/\3\2\2\2\u0173\u0175"+
		"\7#\2\2\u0174\u0176\7]\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\78\2\2\u0178\u0179\5N(\2\u0179\u017a\7\13\2"+
		"\2\u017a\61\3\2\2\2\u017b\u017c\t\3\2\2\u017c\63\3\2\2\2\u017d\u017e\t"+
		"\4\2\2\u017e\65\3\2\2\2\u017f\u0180\t\5\2\2\u0180\67\3\2\2\2\u0181\u0182"+
		"\t\6\2\2\u01829\3\2\2\2\u0183\u0184\t\7\2\2\u0184;\3\2\2\2\u0185\u0186"+
		"\t\b\2\2\u0186=\3\2\2\2\u0187\u0188\t\t\2\2\u0188?\3\2\2\2\u0189\u018a"+
		"\t\n\2\2\u018aA\3\2\2\2\u018b\u018c\t\13\2\2\u018cC\3\2\2\2\u018d\u018e"+
		"\t\f\2\2\u018eE\3\2\2\2\u018f\u0190\t\r\2\2\u0190G\3\2\2\2\u0191\u0192"+
		"\7\6\2\2\u0192I\3\2\2\2\u0193\u0194\7\21\2\2\u0194K\3\2\2\2\u0195\u0196"+
		"\5N(\2\u0196\u0197\7a\2\2\u0197M\3\2\2\2\u0198\u0199\b(\1\2\u0199\u019a"+
		"\5@!\2\u019a\u019b\5N(\27\u019b\u0230\3\2\2\2\u019c\u019d\7G\2\2\u019d"+
		"\u019e\5d\63\2\u019e\u019f\7V\2\2\u019f\u01a0\5N(\26\u01a0\u0230\3\2\2"+
		"\2\u01a1\u01a2\7L\2\2\u01a2\u01a3\5d\63\2\u01a3\u01a4\7V\2\2\u01a4\u01a5"+
		"\5N(\25\u01a5\u0230\3\2\2\2\u01a6\u01a7\7S\2\2\u01a7\u0230\5N(\4\u01a8"+
		"\u01ab\5l\67\2\u01a9\u01aa\7/\2\2\u01aa\u01ac\5\32\16\2\u01ab\u01a9\3"+
		"\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\21\2\2\u01ae"+
		"\u01af\5N(\3\u01af\u0230\3\2\2\2\u01b0\u0230\5P)\2\u01b1\u0230\5t;\2\u01b2"+
		"\u0230\7]\2\2\u01b3\u01b4\7F\2\2\u01b4\u01ba\5r:\2\u01b5\u01b7\7\60\2"+
		"\2\u01b6\u01b8\5R*\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bb\7\25\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u0230\3\2\2\2\u01bc\u01bd\7\62\2\2\u01bd\u01be\7\60\2\2\u01be\u01bf"+
		"\5N(\2\u01bf\u01c0\7\25\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c2\5N(\2\u01c2"+
		"\u01c3\7<\2\2\u01c3\u01c4\5N(\2\u01c4\u0230\3\2\2\2\u01c5\u01c6\7\20\2"+
		"\2\u01c6\u01ca\78\2\2\u01c7\u01c9\5 \21\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u0230\7\13\2\2\u01ce\u01cf\7-\2\2\u01cf\u01d0\7\60"+
		"\2\2\u01d0\u01d1\5N(\2\u01d1\u01d2\7\25\2\2\u01d2\u01d3\7\20\2\2\u01d3"+
		"\u01d7\78\2\2\u01d4\u01d6\5 \21\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01da\u01db\7\13\2\2\u01db\u0230\3\2\2\2\u01dc\u01dd\7"+
		"E\2\2\u01dd\u01de\7\60\2\2\u01de\u01e1\5l\67\2\u01df\u01e0\7/\2\2\u01e0"+
		"\u01e2\5\32\16\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3"+
		"\2\2\2\u01e3\u01e4\7*\2\2\u01e4\u01e5\5N(\2\u01e5\u01e6\7\25\2\2\u01e6"+
		"\u01e7\7\20\2\2\u01e7\u01eb\78\2\2\u01e8\u01ea\5 \21\2\u01e9\u01e8\3\2"+
		"\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\13\2\2\u01ef\u0230\3"+
		"\2\2\2\u01f0\u01f1\7\17\2\2\u01f1\u01f2\5N(\2\u01f2\u01f3\7,\2\2\u01f3"+
		"\u01f4\5Z.\2\u01f4\u0230\3\2\2\2\u01f5\u01f7\78\2\2\u01f6\u01f8\5p9\2"+
		"\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0230"+
		"\7\13\2\2\u01fa\u01fb\78\2\2\u01fb\u01fc\5N(\2\u01fc\u01fd\7(\2\2\u01fd"+
		"\u01fe\5N(\2\u01fe\u01ff\7\13\2\2\u01ff\u0230\3\2\2\2\u0200\u0201\78\2"+
		"\2\u0201\u0202\5N(\2\u0202\u0203\7%\2\2\u0203\u0204\5d\63\2\u0204\u0205"+
		"\7V\2\2\u0205\u0206\5N(\2\u0206\u0207\7\13\2\2\u0207\u0230\3\2\2\2\u0208"+
		"\u020a\7\5\2\2\u0209\u020b\5p9\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u0230\7)\2\2\u020d\u020e\7\5\2\2\u020e\u020f"+
		"\5N(\2\u020f\u0210\7(\2\2\u0210\u0211\5N(\2\u0211\u0212\7)\2\2\u0212\u0230"+
		"\3\2\2\2\u0213\u0214\7\5\2\2\u0214\u0215\5N(\2\u0215\u0216\7%\2\2\u0216"+
		"\u0217\5l\67\2\u0217\u0218\7/\2\2\u0218\u0219\5N(\2\u0219\u021a\7V\2\2"+
		"\u021a\u021b\5N(\2\u021b\u021c\7)\2\2\u021c\u0230\3\2\2\2\u021d\u021f"+
		"\7\7\2\2\u021e\u0220\5`\61\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0230\7K\2\2\u0222\u0223\7\7\2\2\u0223\u0224\5b\62"+
		"\2\u0224\u0225\7%\2\2\u0225\u0226\5d\63\2\u0226\u0227\7V\2\2\u0227\u0228"+
		"\5N(\2\u0228\u0229\7K\2\2\u0229\u0230\3\2\2\2\u022a\u022b\7&\2\2\u022b"+
		"\u022c\7\60\2\2\u022c\u022d\5N(\2\u022d\u022e\7\25\2\2\u022e\u0230\3\2"+
		"\2\2\u022f\u0198\3\2\2\2\u022f\u019c\3\2\2\2\u022f\u01a1\3\2\2\2\u022f"+
		"\u01a6\3\2\2\2\u022f\u01a8\3\2\2\2\u022f\u01b0\3\2\2\2\u022f\u01b1\3\2"+
		"\2\2\u022f\u01b2\3\2\2\2\u022f\u01b3\3\2\2\2\u022f\u01bc\3\2\2\2\u022f"+
		"\u01c5\3\2\2\2\u022f\u01ce\3\2\2\2\u022f\u01dc\3\2\2\2\u022f\u01f0\3\2"+
		"\2\2\u022f\u01f5\3\2\2\2\u022f\u01fa\3\2\2\2\u022f\u0200\3\2\2\2\u022f"+
		"\u0208\3\2\2\2\u022f\u020d\3\2\2\2\u022f\u0213\3\2\2\2\u022f\u021d\3\2"+
		"\2\2\u022f\u0222\3\2\2\2\u022f\u022a\3\2\2\2\u0230\u0260\3\2\2\2\u0231"+
		"\u0232\f\f\2\2\u0232\u0233\t\16\2\2\u0233\u025f\5N(\r\u0234\u0235\f\13"+
		"\2\2\u0235\u0236\t\17\2\2\u0236\u025f\5N(\f\u0237\u0244\f\n\2\2\u0238"+
		"\u0245\58\35\2\u0239\u0245\5:\36\2\u023a\u0245\5\64\33\2\u023b\u0245\5"+
		"\66\34\2\u023c\u0245\5F$\2\u023d\u023e\5@!\2\u023e\u023f\5F$\2\u023f\u0245"+
		"\3\2\2\2\u0240\u0245\7;\2\2\u0241\u0245\7\b\2\2\u0242\u0245\7\f\2\2\u0243"+
		"\u0245\7\34\2\2\u0244\u0238\3\2\2\2\u0244\u0239\3\2\2\2\u0244\u023a\3"+
		"\2\2\2\u0244\u023b\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u023d\3\2\2\2\u0244"+
		"\u0240\3\2\2\2\u0244\u0241\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u025f\5N(\13\u0247\u0248\f\t\2\2\u0248"+
		"\u0249\5<\37\2\u0249\u024a\5N(\n\u024a\u025f\3\2\2\2\u024b\u024c\f\b\2"+
		"\2\u024c\u024d\5> \2\u024d\u024e\5N(\t\u024e\u025f\3\2\2\2\u024f\u0252"+
		"\f\7\2\2\u0250\u0253\5B\"\2\u0251\u0253\5D#\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\5N(\b\u0255\u025f\3\2\2"+
		"\2\u0256\u0257\f\6\2\2\u0257\u0258\7O\2\2\u0258\u025f\5N(\7\u0259\u025a"+
		"\f\37\2\2\u025a\u025b\7V\2\2\u025b\u025f\7]\2\2\u025c\u025d\f\35\2\2\u025d"+
		"\u025f\5P)\2\u025e\u0231\3\2\2\2\u025e\u0234\3\2\2\2\u025e\u0237\3\2\2"+
		"\2\u025e\u0247\3\2\2\2\u025e\u024b\3\2\2\2\u025e\u024f\3\2\2\2\u025e\u0256"+
		"\3\2\2\2\u025e\u0259\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261O\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0264\7\60\2\2\u0264\u0265\5N(\2\u0265\u0266\7\25\2\2\u0266\u0272"+
		"\3\2\2\2\u0267\u0268\7\60\2\2\u0268\u026b\5N(\2\u0269\u026a\7+\2\2\u026a"+
		"\u026c\5N(\2\u026b\u0269\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\25\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u0263\3\2\2\2\u0271\u0267\3\2\2\2\u0272Q\3\2\2\2"+
		"\u0273\u0278\5T+\2\u0274\u0275\7+\2\2\u0275\u0277\5T+\2\u0276\u0274\3"+
		"\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"S\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7]\2\2\u027c\u027d\7/\2\2\u027d"+
		"\u027e\5N(\2\u027eU\3\2\2\2\u027f\u0284\5X-\2\u0280\u0281\7+\2\2\u0281"+
		"\u0283\5X-\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285W\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288"+
		"\7]\2\2\u0288\u0289\7O\2\2\u0289\u028a\5N(\2\u028aY\3\2\2\2\u028b\u028c"+
		"\5\\/\2\u028c\u028d\7C\2\2\u028d\u0290\5N(\2\u028e\u028f\7%\2\2\u028f"+
		"\u0291\5Z.\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291[\3\2\2\2\u0292"+
		"\u02ad\5t;\2\u0293\u02ad\7\26\2\2\u0294\u02a0\7]\2\2\u0295\u0296\7\60"+
		"\2\2\u0296\u029b\5^\60\2\u0297\u0298\7+\2\2\u0298\u029a\5^\60\2\u0299"+
		"\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7\25\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02ad\3\2"+
		"\2\2\u02a2\u02a3\7\60\2\2\u02a3\u02a6\5\\/\2\u02a4\u02a5\7+\2\2\u02a5"+
		"\u02a7\5\\/\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\25\2\2\u02ab"+
		"\u02ad\3\2\2\2\u02ac\u0292\3\2\2\2\u02ac\u0293\3\2\2\2\u02ac\u0294\3\2"+
		"\2\2\u02ac\u02a2\3\2\2\2\u02ad]\3\2\2\2\u02ae\u02af\7]\2\2\u02af\u02b0"+
		"\7\31\2\2\u02b0\u02b1\5\\/\2\u02b1_\3\2\2\2\u02b2\u02b7\5b\62\2\u02b3"+
		"\u02b4\7+\2\2\u02b4\u02b6\5b\62\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2"+
		"\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8a\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02ba\u02bb\5N(\2\u02bb\u02bc\7/\2\2\u02bc\u02bd\5N(\2\u02bd"+
		"c\3\2\2\2\u02be\u02c3\5f\64\2\u02bf\u02c0\7+\2\2\u02c0\u02c2\5f\64\2\u02c1"+
		"\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4e\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\5h\65\2\u02c7\u02c8"+
		"\7/\2\2\u02c8\u02c9\5j\66\2\u02c9g\3\2\2\2\u02ca\u02cf\5l\67\2\u02cb\u02cc"+
		"\7+\2\2\u02cc\u02ce\5l\67\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0i\3\2\2\2\u02d1\u02cf\3\2\2\2"+
		"\u02d2\u02d5\5N(\2\u02d3\u02d5\5\32\16\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5k\3\2\2\2\u02d6\u02e2\7]\2\2\u02d7\u02d8\7\60\2\2\u02d8"+
		"\u02db\5l\67\2\u02d9\u02da\7+\2\2\u02da\u02dc\5l\67\2\u02db\u02d9\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\7\25\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02d6\3"+
		"\2\2\2\u02e1\u02d7\3\2\2\2\u02e2m\3\2\2\2\u02e3\u02e8\7]\2\2\u02e4\u02e5"+
		"\7+\2\2\u02e5\u02e7\7]\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9o\3\2\2\2\u02ea\u02e8\3\2\2\2"+
		"\u02eb\u02f0\5N(\2\u02ec\u02ed\7+\2\2\u02ed\u02ef\5N(\2\u02ee\u02ec\3"+
		"\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"q\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f8\7]\2\2\u02f4\u02f5\7V\2\2\u02f5"+
		"\u02f7\7]\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9s\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc"+
		"\t\20\2\2\u02fcu\3\2\2\2Dw|\u0082\u0089\u0092\u0097\u009a\u009d\u00a3"+
		"\u00b0\u00b8\u00bf\u00cb\u00d4\u00db\u00f5\u0101\u0107\u010b\u010d\u0112"+
		"\u011a\u0126\u012c\u0137\u0141\u014d\u0152\u0156\u015b\u0162\u0171\u0175"+
		"\u01ab\u01b7\u01ba\u01ca\u01d7\u01e1\u01eb\u01f7\u020a\u021f\u022f\u0244"+
		"\u0252\u025e\u0260\u026d\u0271\u0278\u0284\u0290\u029b\u02a0\u02a8\u02ac"+
		"\u02b7\u02c3\u02cf\u02d4\u02dd\u02e1\u02e8\u02f0\u02f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}