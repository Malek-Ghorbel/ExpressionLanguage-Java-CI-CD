// Generated from /home/malik/Downloads/az/ExpressionLanguage-Java-CI-CD/src/main/java/com/example/parser/interpreter/AmlDsl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AmlDslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, FLOAT=23, INT=24, TRUE=25, 
		FALSE=26, WHITESPACE=27, IDENTIFIER=28, LPAREN=29, RPAREN=30, LBRACKET=31, 
		RBRACKET=32, LBRACE=33, RBRACE=34, DOT=35, PLUS=36, MINUS=37, MULTIPLY=38, 
		SLASH=39, MOD=40, NOT=41, EQUALS=42, NOT_EQUALS=43, LESS=44, LESS_EQUALS=45, 
		GREATER_EQUALS=46, GREATER=47, AND=48, OR=49, STRING=50, HASHTAG=51;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_selection = 2, RULE_list = 3, RULE_method = 4, 
		RULE_object = 5, RULE_this = 6, RULE_property = 7, RULE_arguments = 8, 
		RULE_logical = 9, RULE_unaryLog = 10, RULE_memberLog = 11, RULE_relation = 12, 
		RULE_calc = 13, RULE_unary = 14, RULE_member = 15, RULE_literal = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "selection", "list", "method", "object", "this", "property", 
			"arguments", "logical", "unaryLog", "memberLog", "relation", "calc", 
			"unary", "member", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "','", "'this'", "'=='", "'eq'", "'!='", "'ne'", "'and'", 
			"'AND'", "'or'", "'OR'", "'not'", "'<'", "'lt'", "'<='", "'le'", "'>='", 
			"'ge'", "'>'", "'gt'", "'mod'", "'div'", null, null, "'true'", "'false'", 
			null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'!'", null, null, null, null, null, null, "'&&'", 
			"'||'", null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "FLOAT", 
			"INT", "TRUE", "FALSE", "WHITESPACE", "IDENTIFIER", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DOT", "PLUS", "MINUS", "MULTIPLY", 
			"SLASH", "MOD", "NOT", "EQUALS", "NOT_EQUALS", "LESS", "LESS_EQUALS", 
			"GREATER_EQUALS", "GREATER", "AND", "OR", "STRING", "HASHTAG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AmlDsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmlDslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AmlDslParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			expr();
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends ExprContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitObjectExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ExprContext {
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public ArithmeticExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitArithmeticExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectionExprContext extends ExprContext {
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public SelectionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterSelectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitSelectionExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ExprContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitMethodCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ExprContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public LogicalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitLogicalExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListInitExprContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListInitExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterListInitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitListInitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				method();
				}
				break;
			case 2:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				object();
				}
				break;
			case 3:
				_localctx = new LogicalExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				logical(0);
				}
				break;
			case 4:
				_localctx = new ArithmeticExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				calc(0);
				}
				break;
			case 5:
				_localctx = new ListInitExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				list();
				}
				break;
			case 6:
				_localctx = new SelectionExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					list();
					}
					break;
				case 2:
					{
					setState(43);
					object();
					}
					break;
				case 3:
					{
					setState(44);
					method();
					}
					break;
				}
				setState(47);
				selection();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AmlDslParser.DOT, 0); }
		public TerminalNode LBRACKET() { return getToken(AmlDslParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(AmlDslParser.RBRACKET, 0); }
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(DOT);
			setState(52);
			match(T__0);
			setState(53);
			match(LBRACKET);
			setState(54);
			expr();
			setState(55);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AmlDslParser.LBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AmlDslParser.RBRACE, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBRACE);
			setState(58);
			expr();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(59);
				match(T__1);
				setState(60);
				expr();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegistredMethodContext extends MethodContext {
		public TerminalNode HASHTAG() { return getToken(AmlDslParser.HASHTAG, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AmlDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AmlDslParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AmlDslParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AmlDslParser.LPAREN, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AmlDslParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AmlDslParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AmlDslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AmlDslParser.DOT, i);
		}
		public RegistredMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterRegistredMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitRegistredMethod(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectMethodContext extends MethodContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AmlDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AmlDslParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AmlDslParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AmlDslParser.LPAREN, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AmlDslParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AmlDslParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AmlDslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AmlDslParser.DOT, i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ObjectMethodContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterObjectMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitObjectMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			int _alt;
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ObjectMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(68);
						object();
						}
						break;
					case 2:
						{
						setState(69);
						list();
						}
						break;
					}
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(72);
						selection();
						}
						break;
					}
					setState(75);
					match(DOT);
					}
					break;
				}
				setState(79);
				match(IDENTIFIER);
				setState(80);
				match(LPAREN);
				setState(81);
				arguments();
				setState(82);
				match(RPAREN);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						match(DOT);
						setState(84);
						match(IDENTIFIER);
						setState(85);
						match(LPAREN);
						setState(86);
						arguments();
						setState(87);
						match(RPAREN);
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new RegistredMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(HASHTAG);
				setState(95);
				match(IDENTIFIER);
				setState(96);
				match(LPAREN);
				setState(97);
				arguments();
				setState(98);
				match(RPAREN);
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						match(DOT);
						setState(100);
						match(IDENTIFIER);
						setState(101);
						match(LPAREN);
						setState(102);
						arguments();
						setState(103);
						match(RPAREN);
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends ObjectContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(AmlDslParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(AmlDslParser.LBRACKET, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(AmlDslParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(AmlDslParser.RBRACKET, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AmlDslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AmlDslParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AmlDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AmlDslParser.IDENTIFIER, i);
		}
		public ListAccessContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitListAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisObjectContext extends ObjectContext {
		public ThisContext this_() {
			return getRuleContext(ThisContext.class,0);
		}
		public ThisObjectContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterThisObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitThisObject(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ObjectContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PropertyAccessContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitPropertyAccess(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object);
		int _la;
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PropertyAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				property();
				}
				break;
			case 2:
				_localctx = new ListAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case STRING:
					{
					setState(113);
					property();
					}
					break;
				case LBRACE:
					{
					setState(114);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(117);
					selection();
					}
				}

				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						match(LBRACKET);
						setState(121);
						expr();
						setState(122);
						match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(DOT);
						setState(129);
						match(IDENTIFIER);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ThisObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				this_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisContext extends ParserRuleContext {
		public TerminalNode HASHTAG() { return getToken(AmlDslParser.HASHTAG, 0); }
		public ThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitThis(this);
		}
	}

	public final ThisContext this_() throws RecognitionException {
		ThisContext _localctx = new ThisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(HASHTAG);
			setState(139);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AmlDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AmlDslParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(AmlDslParser.STRING, 0); }
		public List<TerminalNode> DOT() { return getTokens(AmlDslParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AmlDslParser.DOT, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_property);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					match(DOT);
					setState(143);
					match(IDENTIFIER);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoArgumentsContext extends ArgumentsContext {
		public NoArgumentsContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterNoArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitNoArguments(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsExprContext extends ArgumentsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsExprContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterArgumentsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitArgumentsExpr(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case FLOAT:
			case INT:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case LPAREN:
			case LBRACE:
			case MINUS:
			case NOT:
			case STRING:
			case HASHTAG:
				_localctx = new ArgumentsExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expr();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(150);
					match(T__1);
					setState(151);
					expr();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				_localctx = new NoArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
	 
		public LogicalContext() { }
		public void copyFrom(LogicalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends LogicalContext {
		public Token op;
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(AmlDslParser.AND, 0); }
		public AndExprContext(LogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitAndExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryLogExprContext extends LogicalContext {
		public UnaryLogContext unaryLog() {
			return getRuleContext(UnaryLogContext.class,0);
		}
		public UnaryLogExprContext(LogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterUnaryLogExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitUnaryLogExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends LogicalContext {
		public Token op;
		public List<LogicalContext> logical() {
			return getRuleContexts(LogicalContext.class);
		}
		public LogicalContext logical(int i) {
			return getRuleContext(LogicalContext.class,i);
		}
		public CompExprContext(LogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCompExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends LogicalContext {
		public Token op;
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(AmlDslParser.OR, 0); }
		public OrExprContext(LogicalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitOrExpr(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		return logical(0);
	}

	private LogicalContext logical(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalContext _localctx = new LogicalContext(_ctx, _parentState);
		LogicalContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryLogExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(161);
			unaryLog();
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CompExprContext(new LogicalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						logical(5);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new LogicalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						((AndExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976711424L) != 0)) ) {
							((AndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						expr();
						}
						break;
					case 3:
						{
						_localctx = new OrExprContext(new LogicalContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical);
						setState(169);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(170);
						((OrExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953424384L) != 0)) ) {
							((OrExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						expr();
						}
						break;
					}
					} 
				}
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryLogContext extends ParserRuleContext {
		public UnaryLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryLog; }
	 
		public UnaryLogContext() { }
		public void copyFrom(UnaryLogContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNotContext extends UnaryLogContext {
		public MemberLogContext memberLog() {
			return getRuleContext(MemberLogContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AmlDslParser.NOT, 0); }
		public LogicalNotContext(UnaryLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitLogicalNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogMemberContext extends UnaryLogContext {
		public MemberLogContext memberLog() {
			return getRuleContext(MemberLogContext.class,0);
		}
		public LogMemberContext(UnaryLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterLogMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitLogMember(this);
		}
	}

	public final UnaryLogContext unaryLog() throws RecognitionException {
		UnaryLogContext _localctx = new UnaryLogContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryLog);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case LPAREN:
			case LBRACE:
			case MINUS:
			case STRING:
			case HASHTAG:
				_localctx = new LogMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				memberLog();
				}
				break;
			case T__11:
			case NOT:
				_localctx = new LogicalNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				memberLog();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberLogContext extends ParserRuleContext {
		public MemberLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberLog; }
	 
		public MemberLogContext() { }
		public void copyFrom(MemberLogContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedLogContext extends MemberLogContext {
		public TerminalNode LPAREN() { return getToken(AmlDslParser.LPAREN, 0); }
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AmlDslParser.RPAREN, 0); }
		public NestedLogContext(MemberLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterNestedLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitNestedLog(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogConstantContext extends MemberLogContext {
		public TerminalNode TRUE() { return getToken(AmlDslParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AmlDslParser.FALSE, 0); }
		public LogConstantContext(MemberLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterLogConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitLogConstant(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationExprContext extends MemberLogContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public RelationExprContext(MemberLogContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitRelationExpr(this);
		}
	}

	public final MemberLogContext memberLog() throws RecognitionException {
		MemberLogContext _localctx = new MemberLogContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberLog);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NestedLogContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(LPAREN);
				setState(183);
				logical(0);
				setState(184);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new RelationExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				relation();
				}
				break;
			case 3:
				_localctx = new LogConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public Token op;
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			calc(0);
			setState(191);
			((RelationContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2089200L) != 0)) ) {
				((RelationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
			calc(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcContext extends ParserRuleContext {
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
	 
		public CalcContext() { }
		public void copyFrom(CalcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcPlusContext extends CalcContext {
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AmlDslParser.PLUS, 0); }
		public CalcPlusContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCalcPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCalcPlus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcMinusContext extends CalcContext {
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AmlDslParser.MINUS, 0); }
		public CalcMinusContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCalcMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCalcMinus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcDivisionContext extends CalcContext {
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(AmlDslParser.SLASH, 0); }
		public CalcDivisionContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCalcDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCalcDivision(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcModuloContext extends CalcContext {
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public TerminalNode MOD() { return getToken(AmlDslParser.MOD, 0); }
		public CalcModuloContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCalcModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCalcModulo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcMultiplicationContext extends CalcContext {
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(AmlDslParser.MULTIPLY, 0); }
		public CalcMultiplicationContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterCalcMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitCalcMultiplication(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends CalcContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryExprContext(CalcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitUnaryExpr(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		return calc(0);
	}

	private CalcContext calc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcContext _localctx = new CalcContext(_ctx, _parentState);
		CalcContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_calc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new CalcModuloContext(new CalcContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==MOD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						calc(6);
						}
						break;
					case 2:
						{
						_localctx = new CalcMultiplicationContext(new CalcContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(MULTIPLY);
						setState(202);
						calc(5);
						}
						break;
					case 3:
						{
						_localctx = new CalcDivisionContext(new CalcContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						calc(4);
						}
						break;
					case 4:
						{
						_localctx = new CalcPlusContext(new CalcContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(PLUS);
						setState(208);
						calc(3);
						}
						break;
					case 5:
						{
						_localctx = new CalcMinusContext(new CalcContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(210);
						match(MINUS);
						setState(211);
						calc(2);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExprContext extends UnaryContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public MemberExprContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitMemberExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends UnaryContext {
		public TerminalNode MINUS() { return getToken(AmlDslParser.MINUS, 0); }
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public NegateContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitNegate(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case IDENTIFIER:
			case LPAREN:
			case LBRACE:
			case STRING:
			case HASHTAG:
				_localctx = new MemberExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				member();
				}
				break;
			case MINUS:
				_localctx = new NegateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(MINUS);
				setState(219);
				member();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberContext extends ParserRuleContext {
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	 
		public MemberContext() { }
		public void copyFrom(MemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends MemberContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public IdentifierContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitIdentifier(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantLiteralContext extends MemberContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantLiteralContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterConstantLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitConstantLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedContext extends MemberContext {
		public TerminalNode LPAREN() { return getToken(AmlDslParser.LPAREN, 0); }
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AmlDslParser.RPAREN, 0); }
		public NestedContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitNested(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_member);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new NestedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(LPAREN);
				setState(223);
				calc(0);
				setState(224);
				match(RPAREN);
				}
				break;
			case FLOAT:
			case INT:
				_localctx = new ConstantLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				literal();
				}
				break;
			case IDENTIFIER:
			case LBRACE:
			case STRING:
			case HASHTAG:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				object();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AmlDslParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(AmlDslParser.FLOAT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmlDslListener ) ((AmlDslListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return logical_sempred((LogicalContext)_localctx, predIndex);
		case 13:
			return calc_sempred((CalcContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_sempred(LogicalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean calc_sempred(CalcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		">\b\u0003\n\u0003\f\u0003A\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b"+
		"\u0004\n\u0004\f\u0004m\t\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0003\u0005w\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005}\b\u0005"+
		"\u000b\u0005\f\u0005~\u0001\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005"+
		"\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0091\b\u0007\n\u0007\f\u0007\u0094\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0099\b\b\n\b\f\b\u009c\t\b\u0001\b\u0003\b\u009f\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00ad\b\t\n\t\f\t\u00b0\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00b5\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00bd\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00d5\b\r\n\r\f\r\u00d8\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00dd\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e5\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0000\u0002\u0012\u001a\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\n\u0002\u0000\u001c\u001c22\u0001\u0000\u0004\u0007\u0002\u0000\b\t0"+
		"0\u0002\u0000\n\u000b11\u0002\u0000\f\f))\u0001\u0000\u0019\u001a\u0002"+
		"\u0000\u0004\u0007\r\u0014\u0002\u0000\u0015\u0015((\u0002\u0000\u0016"+
		"\u0016\'\'\u0001\u0000\u0017\u0018\u00fc\u0000\"\u0001\u0000\u0000\u0000"+
		"\u00021\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00069"+
		"\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000\u0000\n\u0088\u0001\u0000"+
		"\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000"+
		"\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000"+
		"\u0000\u0014\u00b4\u0001\u0000\u0000\u0000\u0016\u00bc\u0001\u0000\u0000"+
		"\u0000\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000"+
		"\u0000\u001c\u00dc\u0001\u0000\u0000\u0000\u001e\u00e4\u0001\u0000\u0000"+
		"\u0000 \u00e6\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005"+
		"\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%2\u0003\b\u0004\u0000"+
		"&2\u0003\n\u0005\u0000\'2\u0003\u0012\t\u0000(2\u0003\u001a\r\u0000)2"+
		"\u0003\u0006\u0003\u0000*.\u0003\u0006\u0003\u0000+.\u0003\n\u0005\u0000"+
		",.\u0003\b\u0004\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002"+
		"\u000002\u0001\u0000\u0000\u00001%\u0001\u0000\u0000\u00001&\u0001\u0000"+
		"\u0000\u00001\'\u0001\u0000\u0000\u00001(\u0001\u0000\u0000\u00001)\u0001"+
		"\u0000\u0000\u00001-\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000034\u0005#\u0000\u000045\u0005\u0001\u0000\u000056\u0005\u001f\u0000"+
		"\u000067\u0003\u0002\u0001\u000078\u0005 \u0000\u00008\u0005\u0001\u0000"+
		"\u0000\u00009:\u0005!\u0000\u0000:?\u0003\u0002\u0001\u0000;<\u0005\u0002"+
		"\u0000\u0000<>\u0003\u0002\u0001\u0000=;\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\"\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000DG\u0003\n\u0005\u0000EG\u0003\u0006\u0003"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HJ\u0003\u0004\u0002\u0000IH\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005#\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MF\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0005\u001c\u0000\u0000PQ\u0005\u001d\u0000"+
		"\u0000QR\u0003\u0010\b\u0000R[\u0005\u001e\u0000\u0000ST\u0005#\u0000"+
		"\u0000TU\u0005\u001c\u0000\u0000UV\u0005\u001d\u0000\u0000VW\u0003\u0010"+
		"\b\u0000WX\u0005\u001e\u0000\u0000XZ\u0001\u0000\u0000\u0000YS\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\o\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^_\u00053\u0000\u0000_`\u0005\u001c\u0000\u0000`a\u0005\u001d\u0000\u0000"+
		"ab\u0003\u0010\b\u0000bk\u0005\u001e\u0000\u0000cd\u0005#\u0000\u0000"+
		"de\u0005\u001c\u0000\u0000ef\u0005\u001d\u0000\u0000fg\u0003\u0010\b\u0000"+
		"gh\u0005\u001e\u0000\u0000hj\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nM\u0001"+
		"\u0000\u0000\u0000n^\u0001\u0000\u0000\u0000o\t\u0001\u0000\u0000\u0000"+
		"p\u0089\u0003\u000e\u0007\u0000qt\u0003\u000e\u0007\u0000rt\u0003\u0006"+
		"\u0003\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tv\u0001"+
		"\u0000\u0000\u0000uw\u0003\u0004\u0002\u0000vu\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w|\u0001\u0000\u0000\u0000xy\u0005\u001f\u0000"+
		"\u0000yz\u0003\u0002\u0001\u0000z{\u0005 \u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|x\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0084\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005#\u0000\u0000\u0081\u0083\u0005\u001c\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0003\f\u0006\u0000\u0088p\u0001\u0000\u0000\u0000\u0088"+
		"s\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u000b"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u00053\u0000\u0000\u008b\u008c\u0005"+
		"\u0003\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u0092\u0007\u0000"+
		"\u0000\u0000\u008e\u008f\u0005#\u0000\u0000\u008f\u0091\u0005\u001c\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u009a\u0003\u0002\u0001\u0000\u0096\u0097\u0005\u0002\u0000"+
		"\u0000\u0097\u0099\u0003\u0002\u0001\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009f\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\t\uffff\uffff"+
		"\u0000\u00a1\u00a2\u0003\u0014\n\u0000\u00a2\u00ae\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\n\u0004\u0000\u0000\u00a4\u00a5\u0007\u0001\u0000\u0000\u00a5"+
		"\u00ad\u0003\u0012\t\u0005\u00a6\u00a7\n\u0002\u0000\u0000\u00a7\u00a8"+
		"\u0007\u0002\u0000\u0000\u00a8\u00ad\u0003\u0002\u0001\u0000\u00a9\u00aa"+
		"\n\u0001\u0000\u0000\u00aa\u00ab\u0007\u0003\u0000\u0000\u00ab\u00ad\u0003"+
		"\u0002\u0001\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b5\u0003\u0016\u000b\u0000\u00b2\u00b3\u0007"+
		"\u0004\u0000\u0000\u00b3\u00b5\u0003\u0016\u000b\u0000\u00b4\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u0015\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0012\t\u0000\u00b8\u00b9\u0005\u001e\u0000\u0000\u00b9\u00bd\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0003\u0018\f\u0000\u00bb\u00bd\u0007\u0005\u0000"+
		"\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u0017\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0003\u001a\r\u0000\u00bf\u00c0\u0007\u0006\u0000\u0000"+
		"\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0006\r\uffff\uffff\u0000\u00c3\u00c4\u0003\u001c\u000e\u0000\u00c4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00c5\u00c6\n\u0005\u0000\u0000\u00c6\u00c7"+
		"\u0007\u0007\u0000\u0000\u00c7\u00d5\u0003\u001a\r\u0006\u00c8\u00c9\n"+
		"\u0004\u0000\u0000\u00c9\u00ca\u0005&\u0000\u0000\u00ca\u00d5\u0003\u001a"+
		"\r\u0005\u00cb\u00cc\n\u0003\u0000\u0000\u00cc\u00cd\u0007\b\u0000\u0000"+
		"\u00cd\u00d5\u0003\u001a\r\u0004\u00ce\u00cf\n\u0002\u0000\u0000\u00cf"+
		"\u00d0\u0005$\u0000\u0000\u00d0\u00d5\u0003\u001a\r\u0003\u00d1\u00d2"+
		"\n\u0001\u0000\u0000\u00d2\u00d3\u0005%\u0000\u0000\u00d3\u00d5\u0003"+
		"\u001a\r\u0002\u00d4\u00c5\u0001\u0000\u0000\u0000\u00d4\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dd\u0003\u001e\u000f\u0000\u00da\u00db\u0005%\u0000"+
		"\u0000\u00db\u00dd\u0003\u001e\u000f\u0000\u00dc\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u001d\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u001d\u0000\u0000\u00df\u00e0\u0003\u001a\r\u0000"+
		"\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u0003 \u0010\u0000\u00e3\u00e5\u0003\n\u0005\u0000\u00e4"+
		"\u00de\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u001f\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0007\t\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u0019-1?FIM"+
		"[knsv~\u0084\u0088\u0092\u009a\u009e\u00ac\u00ae\u00b4\u00bc\u00d4\u00d6"+
		"\u00dc\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}