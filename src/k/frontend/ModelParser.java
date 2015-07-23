// Generated from Model.g4 by ANTLR 4.4
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
		T__92=1, T__91=2, T__90=3, T__89=4, T__88=5, T__87=6, T__86=7, T__85=8, 
		T__84=9, T__83=10, T__82=11, T__81=12, T__80=13, T__79=14, T__78=15, T__77=16, 
		T__76=17, T__75=18, T__74=19, T__73=20, T__72=21, T__71=22, T__70=23, 
		T__69=24, T__68=25, T__67=26, T__66=27, T__65=28, T__64=29, T__63=30, 
		T__62=31, T__61=32, T__60=33, T__59=34, T__58=35, T__57=36, T__56=37, 
		T__55=38, T__54=39, T__53=40, T__52=41, T__51=42, T__50=43, T__49=44, 
		T__48=45, T__47=46, T__46=47, T__45=48, T__44=49, T__43=50, T__42=51, 
		T__41=52, T__40=53, T__39=54, T__38=55, T__37=56, T__36=57, T__35=58, 
		T__34=59, T__33=60, T__32=61, T__31=62, T__30=63, T__29=64, T__28=65, 
		T__27=66, T__26=67, T__25=68, T__24=69, T__23=70, T__22=71, T__21=72, 
		T__20=73, T__19=74, T__18=75, T__17=76, T__16=77, T__15=78, T__14=79, 
		T__13=80, T__12=81, T__11=82, T__10=83, T__9=84, T__8=85, T__7=86, T__6=87, 
		T__5=88, T__4=89, T__3=90, T__2=91, T__1=92, T__0=93, Keyword=94, SUCHTHAT=95, 
		IntegerLiteral=96, RealLiteral=97, BooleanLiteral=98, NullLiteral=99, 
		ThisLiteral=100, CharacterLiteral=101, StringLiteral=102, Identifier=103, 
		CommentBorder=104, COMMENT=105, LINE_COMMENT=106, WS=107, SEP=108;
	public static final String[] tokenNames = {
		"<INVALID>", "'*'", "'['", "'<'", "'!isin'", "'continue'", "'!='", "'<='", 
		"'Bool'", "'}'", "'subset'", "'case'", "'target'", "'do'", "'->'", "'%'", 
		"'Unit'", "'union'", "')'", "'_'", "'Bag'", "'source'", "'::'", "'@'", 
		"'='", "'<=>'", "'String'", "'psubset'", "'Tuple'", "'fun'", "'Int'", 
		"'\\'", "'Char'", "'val'", "'req'", "'class'", "'|'", "'assert'", "'!'", 
		"'ordered'", "'..'", "']'", "'annotation'", "'in'", "','", "'while'", 
		"'-'", "'Seq'", "'('", "':'", "'if'", "'part'", "'match'", "'var'", "'package'", 
		"'as'", "'{|'", "'{'", "'unique'", "'break'", "'extends'", "'isin'", "'else'", 
		"'Class'", "'++'", "'Set'", "'import'", "'^'", "'is'", "'inter'", "'pre'", 
		"'assoc'", "'.'", "'=>'", "'+'", "'for'", "'$result'", "'forall'", "'return'", 
		"'|}'", "'&&'", "'with'", "'||'", "'>'", "'exists'", "'Real'", "'type'", 
		"':='", "'then'", "'post'", "'/'", "'~'", "'#'", "'>='", "Keyword", "':-'", 
		"IntegerLiteral", "RealLiteral", "BooleanLiteral", "'null'", "'this'", 
		"CharacterLiteral", "StringLiteral", "Identifier", "CommentBorder", "COMMENT", 
		"LINE_COMMENT", "WS", "';'"
	};
	public static final int
		RULE_model = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_annotationDeclaration = 3, RULE_annotation = 4, RULE_topDeclaration = 5, 
		RULE_entityDeclaration = 6, RULE_typeParameters = 7, RULE_typeParameter = 8, 
		RULE_typeBound = 9, RULE_extending = 10, RULE_block = 11, RULE_blockDeclaration = 12, 
		RULE_memberDeclaration = 13, RULE_typeDeclaration = 14, RULE_propertyDeclaration = 15, 
		RULE_propertyModifier = 16, RULE_functionDeclaration = 17, RULE_paramList = 18, 
		RULE_param = 19, RULE_functionSpecification = 20, RULE_constraint = 21, 
		RULE_multiplicity = 22, RULE_expressionOrStar = 23, RULE_type = 24, RULE_primitiveType = 25, 
		RULE_classIdentifier = 26, RULE_collectionKind = 27, RULE_typeArguments = 28, 
		RULE_expression = 29, RULE_match = 30, RULE_argumentList = 31, RULE_positionalArgumentList = 32, 
		RULE_namedArgumentList = 33, RULE_namedArgument = 34, RULE_collectionOrType = 35, 
		RULE_rngBindingList = 36, RULE_rngBinding = 37, RULE_patternList = 38, 
		RULE_pattern = 39, RULE_identifierList = 40, RULE_expressionList = 41, 
		RULE_qualifiedName = 42, RULE_literal = 43;
	public static final String[] ruleNames = {
		"model", "packageDeclaration", "importDeclaration", "annotationDeclaration", 
		"annotation", "topDeclaration", "entityDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "extending", "block", "blockDeclaration", 
		"memberDeclaration", "typeDeclaration", "propertyDeclaration", "propertyModifier", 
		"functionDeclaration", "paramList", "param", "functionSpecification", 
		"constraint", "multiplicity", "expressionOrStar", "type", "primitiveType", 
		"classIdentifier", "collectionKind", "typeArguments", "expression", "match", 
		"argumentList", "positionalArgumentList", "namedArgumentList", "namedArgument", 
		"collectionOrType", "rngBindingList", "rngBinding", "patternList", "pattern", 
		"identifierList", "expressionList", "qualifiedName", "literal"
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
		public AnnotationDeclarationContext annotationDeclaration(int i) {
			return getRuleContext(AnnotationDeclarationContext.class,i);
		}
		public TopDeclarationContext topDeclaration(int i) {
			return getRuleContext(TopDeclarationContext.class,i);
		}
		public List<AnnotationDeclarationContext> annotationDeclaration() {
			return getRuleContexts(AnnotationDeclarationContext.class);
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
			setState(89);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(88); packageDeclaration();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(91); importDeclaration();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(97); annotationDeclaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__81) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__70) | (1L << T__65) | (1L << T__64) | (1L << T__60) | (1L << T__59) | (1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__54) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__36) | (1L << T__35) | (1L << T__34))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__28 - 65)) | (1L << (T__22 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__9 - 65)) | (1L << (T__7 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (RealLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(103); topDeclaration();
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
			setState(111); match(T__39);
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
			setState(114); match(T__27);
			setState(115); qualifiedName();
			setState(118);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(116); match(T__21);
				setState(117); match(T__92);
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

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__51);
			setState(121); match(Identifier);
			setState(122); match(T__44);
			setState(123); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(T__70);
			setState(126); match(Identifier);
			setState(127); match(T__45);
			setState(128); expression(0);
			setState(129); match(T__75);
			}
		}
		catch (RecognitionException re) {
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
		public EntityDeclarationContext entityDeclaration() {
			return getRuleContext(EntityDeclarationContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
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
		enterRule(_localctx, 10, RULE_topDeclaration);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__70) {
					{
					{
					setState(131); annotation();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137); entityDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__70) {
					{
					{
					setState(138); annotation();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144); memberDeclaration();
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

	public static class EntityDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendingContext extending() {
			return getRuleContext(ExtendingContext.class,0);
		}
		public TerminalNode Keyword() { return getToken(ModelParser.Keyword, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(ModelParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ModelParser.Identifier); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EntityDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitEntityDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDeclarationContext entityDeclaration() throws RecognitionException {
		EntityDeclarationContext _localctx = new EntityDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entityDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==T__58 || _la==T__22 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(149);
			_la = _input.LA(1);
			if (_la==Keyword) {
				{
				setState(148); match(Keyword);
				}
			}

			setState(151); match(Identifier);
			setState(153);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(152); typeParameters();
				}
			}

			setState(156);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(155); extending();
				}
			}

			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(158); match(T__36);
				setState(159); block();
				setState(160); match(T__84);
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
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(T__91);
			setState(165); typeParameter();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(166); match(T__49);
				setState(167); typeParameter();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(Identifier);
			setState(178);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(176); match(T__44);
				setState(177); typeBound();
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
		enterRule(_localctx, 18, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); type(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(181); match(T__19);
				setState(182); type(0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitExtending(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendingContext extending() throws RecognitionException {
		ExtendingContext _localctx = new ExtendingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_extending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(T__33);
			setState(189); type(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(190); match(T__49);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration(int i) {
			return getRuleContext(BlockDeclarationContext.class,i);
		}
		public List<BlockDeclarationContext> blockDeclaration() {
			return getRuleContexts(BlockDeclarationContext.class);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__81) | (1L << T__74) | (1L << T__73) | (1L << T__72) | (1L << T__70) | (1L << T__65) | (1L << T__64) | (1L << T__60) | (1L << T__59) | (1L << T__56) | (1L << T__55) | (1L << T__54) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__36) | (1L << T__35) | (1L << T__34))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__28 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__9 - 65)) | (1L << (T__7 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (RealLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(197); blockDeclaration();
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

	public static class BlockDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__70) {
				{
				{
				setState(203); annotation();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); memberDeclaration();
			}
		}
		catch (RecognitionException re) {
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
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
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
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); typeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); propertyDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214); constraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215); expression(0);
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
		enterRule(_localctx, 28, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(T__7);
			setState(219); match(Identifier);
			setState(225);
			_la = _input.LA(1);
			if (_la==T__91 || _la==T__69) {
				{
				setState(221);
				_la = _input.LA(1);
				if (_la==T__91) {
					{
					setState(220); typeParameters();
					}
				}

				setState(223); match(T__69);
				setState(224); type(0);
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
		public PropertyModifierContext propertyModifier(int i) {
			return getRuleContext(PropertyModifierContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public List<PropertyModifierContext> propertyModifier() {
			return getRuleContexts(PropertyModifierContext.class);
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
		enterRule(_localctx, 30, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__72) | (1L << T__60) | (1L << T__54) | (1L << T__42) | (1L << T__40) | (1L << T__35))) != 0)) {
				{
				{
				setState(227); propertyModifier();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(Identifier);
			setState(234); match(T__44);
			setState(235); type(0);
			setState(237);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(236); multiplicity();
				}
			}

			setState(241);
			_la = _input.LA(1);
			if (_la==T__69 || _la==T__6) {
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==T__69 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(240); expression(0);
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

	public static class PropertyModifierContext extends ParserRuleContext {
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPropertyModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__81) | (1L << T__72) | (1L << T__60) | (1L << T__54) | (1L << T__42) | (1L << T__40) | (1L << T__35))) != 0)) ) {
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<FunctionSpecificationContext> functionSpecification() {
			return getRuleContexts(FunctionSpecificationContext.class);
		}
		public FunctionSpecificationContext functionSpecification(int i) {
			return getRuleContext(FunctionSpecificationContext.class,i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(T__64);
			setState(246); match(Identifier);
			setState(248);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(247); typeParameters();
				}
			}

			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(250); match(T__45);
				setState(251); paramList();
				setState(252); match(T__75);
				}
				break;
			}
			setState(258);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(256); match(T__44);
				setState(257); type(0);
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__4) {
				{
				{
				setState(260); functionSpecification();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(266); match(T__36);
				setState(267); block();
				setState(268); match(T__84);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); param();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(273); match(T__49);
				setState(274); param();
				}
				}
				setState(279);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModelParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(Identifier);
			setState(281); match(T__44);
			setState(282); type(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_functionSpecification);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); match(T__23);
				setState(285); expression(0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(T__4);
				setState(287); expression(0);
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
		enterRule(_localctx, 42, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(T__59);
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(291); match(Identifier);
				setState(292); match(T__44);
				}
				break;
			}
			setState(295); expression(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(297); match(T__91);
			setState(298); expressionOrStar();
			setState(301);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(299); match(T__49);
				setState(300); expressionOrStar();
				}
			}

			setState(303); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
			setState(307);
			switch (_input.LA(1)) {
			case T__88:
			case T__74:
			case T__73:
			case T__65:
			case T__56:
			case T__55:
			case T__48:
			case T__47:
			case T__46:
			case T__45:
			case T__43:
			case T__41:
			case T__36:
			case T__34:
			case T__28:
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__9:
			case IntegerLiteral:
			case RealLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); expression(0);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(T__92);
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
	public static class IdentTypeContext extends TypeContext {
		public ClassIdentifierContext classIdentifier() {
			return getRuleContext(ClassIdentifierContext.class,0);
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
			setState(327);
			switch (_input.LA(1)) {
			case T__85:
			case T__77:
			case T__67:
			case T__63:
			case T__61:
			case T__8:
				{
				_localctx = new PrimTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(310); primitiveType();
				}
				break;
			case T__73:
			case T__46:
			case T__30:
			case T__28:
			case Identifier:
				{
				_localctx = new IdentTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311); classIdentifier();
				setState(313);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(312); typeArguments();
					}
					break;
				}
				}
				break;
			case T__45:
				{
				_localctx = new ParenTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315); match(T__45);
				setState(316); type(0);
				setState(317); match(T__75);
				}
				break;
			case T__37:
				{
				_localctx = new SubTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319); match(T__37);
				setState(320); match(Identifier);
				setState(321); match(T__44);
				setState(322); type(0);
				setState(323); match(SUCHTHAT);
				setState(324); expression(0);
				setState(325); match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new FuncTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(329);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(330); match(T__79);
						setState(331); type(4);
						}
						break;
					case 2:
						{
						_localctx = new CartesianTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(332);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(335); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(333); match(T__92);
								setState(334); type(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(337); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(343);
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
		enterRule(_localctx, 50, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__85) | (1L << T__77) | (1L << T__67) | (1L << T__63) | (1L << T__61))) != 0) || _la==T__8) ) {
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

	public static class ClassIdentifierContext extends ParserRuleContext {
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitClassIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassIdentifierContext classIdentifier() throws RecognitionException {
		ClassIdentifierContext _localctx = new ClassIdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classIdentifier);
		try {
			setState(349);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(346); qualifiedName();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); match(T__30);
				}
				break;
			case T__73:
			case T__46:
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(348); collectionKind();
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

	public static class CollectionKindContext extends ParserRuleContext {
		public CollectionKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionKind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitCollectionKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionKindContext collectionKind() throws RecognitionException {
		CollectionKindContext _localctx = new CollectionKindContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_collectionKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__73 - 20)) | (1L << (T__46 - 20)) | (1L << (T__28 - 20)))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(T__91);
			setState(354); type(0);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(355); match(T__49);
				setState(356); type(0);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(T__52);
			}
		}
		catch (RecognitionException re) {
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
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
		}
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
	public static class PrevExpContext extends ExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrevExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelVisitor ) return ((ModelVisitor<? extends T>)visitor).visitPrevExp(this);
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
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
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
		public CollectionKindContext collectionKind() {
			return getRuleContext(CollectionKindContext.class,0);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(365); match(T__55);
				setState(366); expression(28);
				}
				break;
			case 2:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367); match(T__47);
				setState(368); expression(9);
				}
				break;
			case 3:
				{
				_localctx = new ForallExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369); match(T__16);
				setState(370); rngBindingList();
				setState(371); match(SUCHTHAT);
				setState(372); expression(7);
				}
				break;
			case 4:
				{
				_localctx = new ExistsExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374); match(T__9);
				setState(375); rngBindingList();
				setState(376); match(SUCHTHAT);
				setState(377); expression(6);
				}
				break;
			case 5:
				{
				_localctx = new LambdaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379); pattern(0);
				setState(380); match(T__79);
				setState(381); expression(5);
				}
				break;
			case 6:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383); match(T__45);
				setState(384); expression(0);
				setState(385); match(T__75);
				}
				break;
			case 7:
				{
				_localctx = new TupleExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387); match(T__65);
				setState(388); match(T__45);
				setState(389); expression(0);
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390); match(T__49);
					setState(391); expression(0);
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__49 );
				setState(396); match(T__75);
				}
				break;
			case 8:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398); literal();
				}
				break;
			case 9:
				{
				_localctx = new IdentExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399); match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new BlockExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400); match(T__36);
				setState(401); block();
				setState(402); match(T__84);
				}
				break;
			case 11:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404); match(T__43);
				setState(405); expression(0);
				setState(406); match(T__5);
				setState(407); expression(0);
				setState(410);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(408); match(T__31);
					setState(409); expression(0);
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
				setState(412); match(T__41);
				setState(413); expression(0);
				setState(414); match(T__12);
				setState(416); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(415); match();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(418); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 13:
				{
				_localctx = new WhileExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420); match(T__48);
				setState(421); expression(0);
				setState(422); match(T__80);
				setState(423); expression(0);
				}
				break;
			case 14:
				{
				_localctx = new ForExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425); match(T__18);
				setState(426); pattern(0);
				setState(427); match(T__50);
				setState(428); expression(0);
				setState(429); match(T__80);
				setState(430); expression(0);
				}
				break;
			case 15:
				{
				_localctx = new SetEnumExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432); collectionKind();
				setState(433); match(T__36);
				setState(435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__74) | (1L << T__73) | (1L << T__65) | (1L << T__56) | (1L << T__55) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__36) | (1L << T__34))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__28 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__9 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (RealLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(434); expressionList();
					}
				}

				setState(437); match(T__84);
				}
				break;
			case 16:
				{
				_localctx = new SetRngExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439); collectionKind();
				setState(440); match(T__36);
				setState(441); expression(0);
				setState(442); match(T__53);
				setState(443); expression(0);
				setState(444); match(T__84);
				}
				break;
			case 17:
				{
				_localctx = new SetCompExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(446); collectionKind();
				setState(447); match(T__36);
				setState(448); expression(0);
				setState(449); match(T__57);
				setState(450); rngBindingList();
				setState(451); match(SUCHTHAT);
				setState(452); expression(0);
				setState(453); match(T__84);
				}
				break;
			case 18:
				{
				_localctx = new AssertExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455); match(T__56);
				setState(456); match(T__45);
				setState(457); expression(0);
				setState(458); match(T__75);
				}
				break;
			case 19:
				{
				_localctx = new PrevExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460); qualifiedName();
				setState(461); match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new ContinueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463); match(T__88);
				}
				break;
			case 21:
				{
				_localctx = new BreakExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(464); match(T__34);
				}
				break;
			case 22:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465); match(T__15);
				setState(467);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(466); expression(0);
					}
					break;
				}
				}
				break;
			case 23:
				{
				_localctx = new ResultExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469); match(T__17);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(508);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(473);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__92) | (1L << T__78) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__29 - 64)) | (1L << (T__26 - 64)) | (1L << (T__24 - 64)) | (1L << (T__3 - 64)) | (1L << (T__1 - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(474); expression(20);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(476);
						_la = _input.LA(1);
						if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__76 - 17)) | (1L << (T__47 - 17)) | (1L << (T__19 - 17)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(477); expression(19);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(479);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__90) | (1L << T__89) | (1L << T__87) | (1L << T__86) | (1L << T__83) | (1L << T__69) | (1L << T__66) | (1L << T__32))) != 0) || _la==T__10 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(480); expression(18);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(482); match(T__13);
						setState(483); expression(17);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(485); match(T__11);
						setState(486); expression(16);
						}
						break;
					case 6:
						{
						_localctx = new IFFExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(488);
						_la = _input.LA(1);
						if ( !(_la==T__68 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(489); expression(15);
						}
						break;
					case 7:
						{
						_localctx = new AssignExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(491); match(T__6);
						setState(492); expression(14);
						}
						break;
					case 8:
						{
						_localctx = new DotExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(494); match(T__21);
						setState(495); match(Identifier);
						}
						break;
					case 9:
						{
						_localctx = new AppExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(497); match(T__45);
						setState(499);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__74) | (1L << T__73) | (1L << T__65) | (1L << T__56) | (1L << T__55) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__41) | (1L << T__36) | (1L << T__34))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__28 - 65)) | (1L << (T__18 - 65)) | (1L << (T__17 - 65)) | (1L << (T__16 - 65)) | (1L << (T__15 - 65)) | (1L << (T__9 - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (RealLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (ThisLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(498); argumentList();
							}
						}

						setState(501); match(T__75);
						}
						break;
					case 10:
						{
						_localctx = new TypeCheckExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(503); match(T__25);
						setState(504); type(0);
						}
						break;
					case 11:
						{
						_localctx = new TypeCastExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(505);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(506); match(T__38);
						setState(507); type(0);
						}
						break;
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 60, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); match(T__82);
			setState(514); pattern(0);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__57) {
				{
				{
				setState(515); match(T__57);
				setState(516); pattern(0);
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522); match(T__20);
			setState(523); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_argumentList);
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new PosArgListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525); positionalArgumentList();
				}
				break;
			case 2:
				_localctx = new NamedArgListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526); namedArgumentList();
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
		enterRule(_localctx, 64, RULE_positionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); expression(0);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(530); match(T__49);
				setState(531); expression(0);
				}
				}
				setState(536);
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
		enterRule(_localctx, 66, RULE_namedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); namedArgument();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(538); match(T__49);
				setState(539); namedArgument();
				}
				}
				setState(544);
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
		enterRule(_localctx, 68, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(Identifier);
			setState(546); match(T__71);
			setState(547); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_collectionOrType);
		try {
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550); type(0);
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
		enterRule(_localctx, 72, RULE_rngBindingList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); rngBinding();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(554); match(T__49);
				setState(555); rngBinding();
				}
				}
				setState(560);
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
		enterRule(_localctx, 74, RULE_rngBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); patternList();
			setState(562); match(T__44);
			setState(563); collectionOrType();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); pattern(0);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(566); match(T__49);
				setState(567); pattern(0);
				}
				}
				setState(572);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case RealLiteral:
			case BooleanLiteral:
			case NullLiteral:
			case ThisLiteral:
			case CharacterLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(574); literal();
				}
				break;
			case T__74:
				{
				_localctx = new DontCarePatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(575); match(T__74);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576); match(Identifier);
				}
				break;
			case T__45:
				{
				_localctx = new CartesianPatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(577); match(T__45);
				setState(578); pattern(0);
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(579); match(T__49);
					setState(580); pattern(0);
					}
					}
					setState(583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__49 );
				setState(585); match(T__75);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypedPatternContext(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(589);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(590); match(T__44);
					setState(591); type(0);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 80, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(Identifier);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(598); match(T__49);
				setState(599); match(Identifier);
				}
				}
				setState(604);
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
			setState(605); expression(0);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(606); match(T__49);
				setState(607); expression(0);
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
		enterRule(_localctx, 84, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613); match(Identifier);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(614); match(T__21);
					setState(615); match(Identifier);
					}
					} 
				}
				setState(620);
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
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ModelParser.NullLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(ModelParser.RealLiteral, 0); }
		public TerminalNode ThisLiteral() { return getToken(ModelParser.ThisLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ModelParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ModelParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ModelParser.StringLiteral, 0); }
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
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (IntegerLiteral - 96)) | (1L << (RealLiteral - 96)) | (1L << (BooleanLiteral - 96)) | (1L << (NullLiteral - 96)) | (1L << (ThisLiteral - 96)) | (1L << (CharacterLiteral - 96)) | (1L << (StringLiteral - 96)))) != 0)) ) {
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
		case 29: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39: return pattern_sempred((PatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 19);
		case 3: return precpred(_ctx, 18);
		case 4: return precpred(_ctx, 17);
		case 5: return precpred(_ctx, 16);
		case 6: return precpred(_ctx, 15);
		case 7: return precpred(_ctx, 14);
		case 8: return precpred(_ctx, 13);
		case 9: return precpred(_ctx, 30);
		case 10: return precpred(_ctx, 29);
		case 11: return precpred(_ctx, 12);
		case 12: return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3n\u0272\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\5\2\\\n\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\7\2e\n\2\f\2"+
		"\16\2h\13\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0087"+
		"\n\7\f\7\16\7\u008a\13\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7"+
		"\5\7\u0094\n\7\3\b\3\b\5\b\u0098\n\b\3\b\3\b\5\b\u009c\n\b\3\b\5\b\u009f"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16"+
		"\t\u00ae\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b5\n\n\3\13\3\13\3\13\7\13\u00ba"+
		"\n\13\f\13\16\13\u00bd\13\13\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6"+
		"\13\f\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\16\7\16\u00cf\n\16\f\16"+
		"\16\16\u00d2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00db\n\17"+
		"\3\20\3\20\3\20\5\20\u00e0\n\20\3\20\3\20\5\20\u00e4\n\20\3\21\7\21\u00e7"+
		"\n\21\f\21\16\21\u00ea\13\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\21"+
		"\3\21\5\21\u00f4\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u00fb\n\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0101\n\23\3\23\3\23\5\23\u0105\n\23\3\23\7\23\u0108"+
		"\n\23\f\23\16\23\u010b\13\23\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3\24"+
		"\3\24\3\24\7\24\u0116\n\24\f\24\16\24\u0119\13\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3\27\3\27\3\27\5\27\u0128\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\30\3\30\3\31\3\31\5\31"+
		"\u0136\n\31\3\32\3\32\3\32\3\32\5\32\u013c\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014a\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u0152\n\32\r\32\16\32\u0153\7\32\u0156\n\32\f\32"+
		"\16\32\u0159\13\32\3\33\3\33\3\34\3\34\3\34\5\34\u0160\n\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\7\36\u0168\n\36\f\36\16\36\u016b\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\6\37\u018b\n\37\r\37\16\37\u018c\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u019d\n\37\3\37\3\37\3\37\3\37"+
		"\6\37\u01a3\n\37\r\37\16\37\u01a4\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b6\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01d6\n\37\3\37\5\37\u01d9\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u01f6\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u01ff\n\37\f\37\16\37\u0202\13\37\3 \3 \3 \3 \7 \u0208"+
		"\n \f \16 \u020b\13 \3 \3 \3 \3!\3!\5!\u0212\n!\3\"\3\"\3\"\7\"\u0217"+
		"\n\"\f\"\16\"\u021a\13\"\3#\3#\3#\7#\u021f\n#\f#\16#\u0222\13#\3$\3$\3"+
		"$\3$\3%\3%\5%\u022a\n%\3&\3&\3&\7&\u022f\n&\f&\16&\u0232\13&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\7(\u023b\n(\f(\16(\u023e\13(\3)\3)\3)\3)\3)\3)\3)\3)\6"+
		")\u0248\n)\r)\16)\u0249\3)\3)\5)\u024e\n)\3)\3)\3)\7)\u0253\n)\f)\16)"+
		"\u0256\13)\3*\3*\3*\7*\u025b\n*\f*\16*\u025e\13*\3+\3+\3+\7+\u0263\n+"+
		"\f+\16+\u0266\13+\3,\3,\3,\7,\u026b\n,\f,\16,\u026e\13,\3-\3-\3-\2\5\62"+
		"<P.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVX\2\f\5\2%%IIii\4\2\32\32YY\t\2\16\16\27\27##))\65\65\67\67"+
		"<<\b\2\n\n\22\22\34\34  \"\"WW\5\2\26\26\61\61CC\n\2\3\3\21\21!!BBEEG"+
		"G\\\\^^\5\2\23\23\60\60LL\n\2\5\6\b\t\f\f\32\32\35\35??UU__\4\2\33\33"+
		"KK\3\2bh\u02aa\2[\3\2\2\2\4q\3\2\2\2\6t\3\2\2\2\bz\3\2\2\2\n\177\3\2\2"+
		"\2\f\u0093\3\2\2\2\16\u0095\3\2\2\2\20\u00a6\3\2\2\2\22\u00b1\3\2\2\2"+
		"\24\u00b6\3\2\2\2\26\u00be\3\2\2\2\30\u00ca\3\2\2\2\32\u00d0\3\2\2\2\34"+
		"\u00da\3\2\2\2\36\u00dc\3\2\2\2 \u00e8\3\2\2\2\"\u00f5\3\2\2\2$\u00f7"+
		"\3\2\2\2&\u0112\3\2\2\2(\u011a\3\2\2\2*\u0122\3\2\2\2,\u0124\3\2\2\2."+
		"\u012b\3\2\2\2\60\u0135\3\2\2\2\62\u0149\3\2\2\2\64\u015a\3\2\2\2\66\u015f"+
		"\3\2\2\28\u0161\3\2\2\2:\u0163\3\2\2\2<\u01d8\3\2\2\2>\u0203\3\2\2\2@"+
		"\u0211\3\2\2\2B\u0213\3\2\2\2D\u021b\3\2\2\2F\u0223\3\2\2\2H\u0229\3\2"+
		"\2\2J\u022b\3\2\2\2L\u0233\3\2\2\2N\u0237\3\2\2\2P\u024d\3\2\2\2R\u0257"+
		"\3\2\2\2T\u025f\3\2\2\2V\u0267\3\2\2\2X\u026f\3\2\2\2Z\\\5\4\3\2[Z\3\2"+
		"\2\2[\\\3\2\2\2\\`\3\2\2\2]_\5\6\4\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gl\3\2\2\2hf\3\2\2\2ik\5\f\7\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\2\2\3p\3\3\2\2\2qr\78\2\2rs\5V,\2s\5\3"+
		"\2\2\2tu\7D\2\2ux\5V,\2vw\7J\2\2wy\7\3\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2"+
		"\2\2z{\7,\2\2{|\7i\2\2|}\7\63\2\2}~\5\62\32\2~\t\3\2\2\2\177\u0080\7\31"+
		"\2\2\u0080\u0081\7i\2\2\u0081\u0082\7\62\2\2\u0082\u0083\5<\37\2\u0083"+
		"\u0084\7\24\2\2\u0084\13\3\2\2\2\u0085\u0087\5\n\6\2\u0086\u0085\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0094\5\16\b\2\u008c\u008e\5\n\6\2"+
		"\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\5\34\17\2"+
		"\u0093\u0088\3\2\2\2\u0093\u008f\3\2\2\2\u0094\r\3\2\2\2\u0095\u0097\t"+
		"\2\2\2\u0096\u0098\7`\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\7i\2\2\u009a\u009c\5\20\t\2\u009b\u009a\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5\26\f\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\7;"+
		"\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\7\13\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\4\2"+
		"\2\u00a7\u00ac\5\22\n\2\u00a8\u00a9\7.\2\2\u00a9\u00ab\5\22\n\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7+\2\2\u00b0"+
		"\21\3\2\2\2\u00b1\u00b4\7i\2\2\u00b2\u00b3\7\63\2\2\u00b3\u00b5\5\24\13"+
		"\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00bb"+
		"\5\62\32\2\u00b7\u00b8\7L\2\2\u00b8\u00ba\5\62\32\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\25"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c4\5\62\32\2"+
		"\u00c0\u00c1\7.\2\2\u00c1\u00c3\5\62\32\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c9\5\32\16\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\31\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00cf\5\n\6\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\5\34\17\2\u00d4\33\3\2\2\2\u00d5\u00db\5\36"+
		"\20\2\u00d6\u00db\5 \21\2\u00d7\u00db\5$\23\2\u00d8\u00db\5,\27\2\u00d9"+
		"\u00db\5<\37\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00dd"+
		"\7X\2\2\u00dd\u00e3\7i\2\2\u00de\u00e0\5\20\t\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e4\5"+
		"\62\32\2\u00e3\u00df\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\37\3\2\2\2\u00e5"+
		"\u00e7\5\"\22\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7i\2\2\u00ec\u00ed\7\63\2\2\u00ed\u00ef\5\62\32\2\u00ee\u00f0\5"+
		".\30\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00f2\t\3\2\2\u00f2\u00f4\5<\37\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4!\3\2\2\2\u00f5\u00f6\t\4\2\2\u00f6#\3\2\2\2\u00f7\u00f8\7\37"+
		"\2\2\u00f8\u00fa\7i\2\2\u00f9\u00fb\5\20\t\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u0100\3\2\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\5"+
		"&\24\2\u00fe\u00ff\7\24\2\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\7\63\2\2\u0103\u0105\5"+
		"\62\32\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106"+
		"\u0108\5*\26\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u0110\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\7;\2\2\u010d\u010e\5\30\r\2\u010e\u010f\7\13\2\2\u010f\u0111\3"+
		"\2\2\2\u0110\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111%\3\2\2\2\u0112\u0117"+
		"\5(\25\2\u0113\u0114\7.\2\2\u0114\u0116\5(\25\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\'\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u011a\u011b\7i\2\2\u011b\u011c\7\63\2\2\u011c\u011d"+
		"\5\62\32\2\u011d)\3\2\2\2\u011e\u011f\7H\2\2\u011f\u0123\5<\37\2\u0120"+
		"\u0121\7[\2\2\u0121\u0123\5<\37\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123+\3\2\2\2\u0124\u0127\7$\2\2\u0125\u0126\7i\2\2\u0126\u0128"+
		"\7\63\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u012a\5<\37\2\u012a-\3\2\2\2\u012b\u012c\7\4\2\2\u012c\u012f\5"+
		"\60\31\2\u012d\u012e\7.\2\2\u012e\u0130\5\60\31\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7+\2\2\u0132/\3\2"+
		"\2\2\u0133\u0136\5<\37\2\u0134\u0136\7\3\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\61\3\2\2\2\u0137\u0138\b\32\1\2\u0138\u014a\5\64"+
		"\33\2\u0139\u013b\5\66\34\2\u013a\u013c\5:\36\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u014a\3\2\2\2\u013d\u013e\7\62\2\2\u013e\u013f\5"+
		"\62\32\2\u013f\u0140\7\24\2\2\u0140\u014a\3\2\2\2\u0141\u0142\7:\2\2\u0142"+
		"\u0143\7i\2\2\u0143\u0144\7\63\2\2\u0144\u0145\5\62\32\2\u0145\u0146\7"+
		"a\2\2\u0146\u0147\5<\37\2\u0147\u0148\7Q\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0137\3\2\2\2\u0149\u0139\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0141\3\2"+
		"\2\2\u014a\u0157\3\2\2\2\u014b\u014c\f\5\2\2\u014c\u014d\7\20\2\2\u014d"+
		"\u0156\5\62\32\6\u014e\u0151\f\6\2\2\u014f\u0150\7\3\2\2\u0150\u0152\5"+
		"\62\32\2\u0151\u014f\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u014b\3\2\2\2\u0155\u014e\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\63\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\t\5\2\2\u015b\65\3\2\2\2\u015c"+
		"\u0160\5V,\2\u015d\u0160\7A\2\2\u015e\u0160\58\35\2\u015f\u015c\3\2\2"+
		"\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\67\3\2\2\2\u0161\u0162"+
		"\t\6\2\2\u01629\3\2\2\2\u0163\u0164\7\4\2\2\u0164\u0169\5\62\32\2\u0165"+
		"\u0166\7.\2\2\u0166\u0168\5\62\32\2\u0167\u0165\3\2\2\2\u0168\u016b\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7+\2\2\u016d;\3\2\2\2\u016e\u016f\b\37\1\2"+
		"\u016f\u0170\7(\2\2\u0170\u01d9\5<\37\36\u0171\u0172\7\60\2\2\u0172\u01d9"+
		"\5<\37\13\u0173\u0174\7O\2\2\u0174\u0175\5J&\2\u0175\u0176\7a\2\2\u0176"+
		"\u0177\5<\37\t\u0177\u01d9\3\2\2\2\u0178\u0179\7V\2\2\u0179\u017a\5J&"+
		"\2\u017a\u017b\7a\2\2\u017b\u017c\5<\37\b\u017c\u01d9\3\2\2\2\u017d\u017e"+
		"\5P)\2\u017e\u017f\7\20\2\2\u017f\u0180\5<\37\7\u0180\u01d9\3\2\2\2\u0181"+
		"\u0182\7\62\2\2\u0182\u0183\5<\37\2\u0183\u0184\7\24\2\2\u0184\u01d9\3"+
		"\2\2\2\u0185\u0186\7\36\2\2\u0186\u0187\7\62\2\2\u0187\u018a\5<\37\2\u0188"+
		"\u0189\7.\2\2\u0189\u018b\5<\37\2\u018a\u0188\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\7\24\2\2\u018f\u01d9\3\2\2\2\u0190\u01d9\5X-\2\u0191\u01d9\7i\2"+
		"\2\u0192\u0193\7;\2\2\u0193\u0194\5\30\r\2\u0194\u0195\7\13\2\2\u0195"+
		"\u01d9\3\2\2\2\u0196\u0197\7\64\2\2\u0197\u0198\5<\37\2\u0198\u0199\7"+
		"Z\2\2\u0199\u019c\5<\37\2\u019a\u019b\7@\2\2\u019b\u019d\5<\37\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01d9\3\2\2\2\u019e\u019f\7\66"+
		"\2\2\u019f\u01a0\5<\37\2\u01a0\u01a2\7S\2\2\u01a1\u01a3\5> \2\u01a2\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01d9\3\2\2\2\u01a6\u01a7\7/\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9\7\17"+
		"\2\2\u01a9\u01aa\5<\37\2\u01aa\u01d9\3\2\2\2\u01ab\u01ac\7M\2\2\u01ac"+
		"\u01ad\5P)\2\u01ad\u01ae\7-\2\2\u01ae\u01af\5<\37\2\u01af\u01b0\7\17\2"+
		"\2\u01b0\u01b1\5<\37\2\u01b1\u01d9\3\2\2\2\u01b2\u01b3\58\35\2\u01b3\u01b5"+
		"\7;\2\2\u01b4\u01b6\5T+\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\7\13\2\2\u01b8\u01d9\3\2\2\2\u01b9\u01ba\5"+
		"8\35\2\u01ba\u01bb\7;\2\2\u01bb\u01bc\5<\37\2\u01bc\u01bd\7*\2\2\u01bd"+
		"\u01be\5<\37\2\u01be\u01bf\7\13\2\2\u01bf\u01d9\3\2\2\2\u01c0\u01c1\5"+
		"8\35\2\u01c1\u01c2\7;\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7&\2\2\u01c4"+
		"\u01c5\5J&\2\u01c5\u01c6\7a\2\2\u01c6\u01c7\5<\37\2\u01c7\u01c8\7\13\2"+
		"\2\u01c8\u01d9\3\2\2\2\u01c9\u01ca\7\'\2\2\u01ca\u01cb\7\62\2\2\u01cb"+
		"\u01cc\5<\37\2\u01cc\u01cd\7\24\2\2\u01cd\u01d9\3\2\2\2\u01ce\u01cf\5"+
		"V,\2\u01cf\u01d0\7]\2\2\u01d0\u01d9\3\2\2\2\u01d1\u01d9\7\7\2\2\u01d2"+
		"\u01d9\7=\2\2\u01d3\u01d5\7P\2\2\u01d4\u01d6\5<\37\2\u01d5\u01d4\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d9\7N\2\2\u01d8\u016e"+
		"\3\2\2\2\u01d8\u0171\3\2\2\2\u01d8\u0173\3\2\2\2\u01d8\u0178\3\2\2\2\u01d8"+
		"\u017d\3\2\2\2\u01d8\u0181\3\2\2\2\u01d8\u0185\3\2\2\2\u01d8\u0190\3\2"+
		"\2\2\u01d8\u0191\3\2\2\2\u01d8\u0192\3\2\2\2\u01d8\u0196\3\2\2\2\u01d8"+
		"\u019e\3\2\2\2\u01d8\u01a6\3\2\2\2\u01d8\u01ab\3\2\2\2\u01d8\u01b2\3\2"+
		"\2\2\u01d8\u01b9\3\2\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c9\3\2\2\2\u01d8"+
		"\u01ce\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8\u01d3\3\2"+
		"\2\2\u01d8\u01d7\3\2\2\2\u01d9\u0200\3\2\2\2\u01da\u01db\f\25\2\2\u01db"+
		"\u01dc\t\7\2\2\u01dc\u01ff\5<\37\26\u01dd\u01de\f\24\2\2\u01de\u01df\t"+
		"\b\2\2\u01df\u01ff\5<\37\25\u01e0\u01e1\f\23\2\2\u01e1\u01e2\t\t\2\2\u01e2"+
		"\u01ff\5<\37\24\u01e3\u01e4\f\22\2\2\u01e4\u01e5\7R\2\2\u01e5\u01ff\5"+
		"<\37\23\u01e6\u01e7\f\21\2\2\u01e7\u01e8\7T\2\2\u01e8\u01ff\5<\37\22\u01e9"+
		"\u01ea\f\20\2\2\u01ea\u01eb\t\n\2\2\u01eb\u01ff\5<\37\21\u01ec\u01ed\f"+
		"\17\2\2\u01ed\u01ee\7Y\2\2\u01ee\u01ff\5<\37\20\u01ef\u01f0\f \2\2\u01f0"+
		"\u01f1\7J\2\2\u01f1\u01ff\7i\2\2\u01f2\u01f3\f\37\2\2\u01f3\u01f5\7\62"+
		"\2\2\u01f4\u01f6\5@!\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01ff\7\24\2\2\u01f8\u01f9\f\16\2\2\u01f9\u01fa\7F\2\2"+
		"\u01fa\u01ff\5\62\32\2\u01fb\u01fc\f\r\2\2\u01fc\u01fd\79\2\2\u01fd\u01ff"+
		"\5\62\32\2\u01fe\u01da\3\2\2\2\u01fe\u01dd\3\2\2\2\u01fe\u01e0\3\2\2\2"+
		"\u01fe\u01e3\3\2\2\2\u01fe\u01e6\3\2\2\2\u01fe\u01e9\3\2\2\2\u01fe\u01ec"+
		"\3\2\2\2\u01fe\u01ef\3\2\2\2\u01fe\u01f2\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe"+
		"\u01fb\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201=\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\r\2\2\u0204\u0209"+
		"\5P)\2\u0205\u0206\7&\2\2\u0206\u0208\5P)\2\u0207\u0205\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7K\2\2\u020d\u020e\5<\37\2\u020e"+
		"?\3\2\2\2\u020f\u0212\5B\"\2\u0210\u0212\5D#\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212A\3\2\2\2\u0213\u0218\5<\37\2\u0214\u0215\7.\2\2\u0215"+
		"\u0217\5<\37\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219C\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u0220"+
		"\5F$\2\u021c\u021d\7.\2\2\u021d\u021f\5F$\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221E\3\2\2\2"+
		"\u0222\u0220\3\2\2\2\u0223\u0224\7i\2\2\u0224\u0225\7\30\2\2\u0225\u0226"+
		"\5<\37\2\u0226G\3\2\2\2\u0227\u022a\5<\37\2\u0228\u022a\5\62\32\2\u0229"+
		"\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022aI\3\2\2\2\u022b\u0230\5L\'\2\u022c"+
		"\u022d\7.\2\2\u022d\u022f\5L\'\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2"+
		"\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231K\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0234\5N(\2\u0234\u0235\7\63\2\2\u0235\u0236\5H%\2\u0236"+
		"M\3\2\2\2\u0237\u023c\5P)\2\u0238\u0239\7.\2\2\u0239\u023b\5P)\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023dO\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\b)\1\2\u0240\u024e"+
		"\5X-\2\u0241\u024e\7\25\2\2\u0242\u024e\7i\2\2\u0243\u0244\7\62\2\2\u0244"+
		"\u0247\5P)\2\u0245\u0246\7.\2\2\u0246\u0248\5P)\2\u0247\u0245\3\2\2\2"+
		"\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024c\7\24\2\2\u024c\u024e\3\2\2\2\u024d\u023f\3\2\2\2"+
		"\u024d\u0241\3\2\2\2\u024d\u0242\3\2\2\2\u024d\u0243\3\2\2\2\u024e\u0254"+
		"\3\2\2\2\u024f\u0250\f\3\2\2\u0250\u0251\7\63\2\2\u0251\u0253\5\62\32"+
		"\2\u0252\u024f\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255Q\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025c\7i\2\2\u0258\u0259"+
		"\7.\2\2\u0259\u025b\7i\2\2\u025a\u0258\3\2\2\2\u025b\u025e\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025dS\3\2\2\2\u025e\u025c\3\2\2\2"+
		"\u025f\u0264\5<\37\2\u0260\u0261\7.\2\2\u0261\u0263\5<\37\2\u0262\u0260"+
		"\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"U\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u026c\7i\2\2\u0268\u0269\7J\2\2\u0269"+
		"\u026b\7i\2\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026dW\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270"+
		"\t\13\2\2\u0270Y\3\2\2\2A[`flx\u0088\u008f\u0093\u0097\u009b\u009e\u00a4"+
		"\u00ac\u00b4\u00bb\u00c4\u00ca\u00d0\u00da\u00df\u00e3\u00e8\u00ef\u00f3"+
		"\u00fa\u0100\u0104\u0109\u0110\u0117\u0122\u0127\u012f\u0135\u013b\u0149"+
		"\u0153\u0155\u0157\u015f\u0169\u018c\u019c\u01a4\u01b5\u01d5\u01d8\u01f5"+
		"\u01fe\u0200\u0209\u0211\u0218\u0220\u0229\u0230\u023c\u0249\u024d\u0254"+
		"\u025c\u0264\u026c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}