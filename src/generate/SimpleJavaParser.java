// Generated from /Users/cagy/Documents/Škola/FJP/simplejava/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOLEAN=2, INT=3, IF=4, ELSE=5, SWITCH=6, CASE=7, DEFAULT=8, FOR=9, 
		WHILE=10, DO=11, REPEAT=12, UNTIL=13, VOID=14, RETURN=15, CONST=16, FUNCTION_KEYWORD=17, 
		TRUE=18, FALSE=19, MULT=20, DIV=21, MOD=22, PLUS=23, MINUS=24, GT=25, 
		GE=26, LT=27, LE=28, SAME=29, EQ=30, AND=31, OR=32, QUESTION=33, COLON=34, 
		NOT_EQ=35, NEGATION=36, LPAREN=37, RPAREN=38, LBRACE=39, RBRACE=40, LBRACK=41, 
		RBRACK=42, SEMI=43, COMMA=44, WORD=45, DECIMAL=46, WHITESPACE=47;
	public static final int
		RULE_methodReturnType = 0, RULE_possibleValues = 1, RULE_identifier = 2, 
		RULE_decimalVariable = 3, RULE_operator = 4, RULE_decimalValue = 5, RULE_boolVariable = 6, 
		RULE_boolValue = 7, RULE_localVariableDeclaration = 8, RULE_constVariableDeclaration = 9, 
		RULE_variableDeclaration = 10, RULE_paralelDeclaration = 11, RULE_variableAssigment = 12, 
		RULE_program = 13, RULE_block = 14, RULE_body = 15, RULE_blockStatement = 16, 
		RULE_blockBody = 17, RULE_statement = 18, RULE_expression = 19, RULE_expressionBody = 20, 
		RULE_forControl = 21, RULE_switchBlockStatement = 22, RULE_methodDeclaration = 23, 
		RULE_methodParameter = 24, RULE_methodBody = 25, RULE_methodCall = 26, 
		RULE_methodCallParameter = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodReturnType", "possibleValues", "identifier", "decimalVariable", 
			"operator", "decimalValue", "boolVariable", "boolValue", "localVariableDeclaration", 
			"constVariableDeclaration", "variableDeclaration", "paralelDeclaration", 
			"variableAssigment", "program", "block", "body", "blockStatement", "blockBody", 
			"statement", "expression", "expressionBody", "forControl", "switchBlockStatement", 
			"methodDeclaration", "methodParameter", "methodBody", "methodCall", "methodCallParameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'boolean'", "'int'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'for'", "'while'", "'do'", "'repeat'", "'until'", "'void'", 
			"'return'", "'const'", "'function'", "'true'", "'false'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'&&'", 
			"'||'", "'?'", "':'", "'!='", "'!'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "NEGATION", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"WORD", "DECIMAL", "WHITESPACE"
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
	public String getGrammarFileName() { return "SimpleJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MethodReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleJavaParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(SimpleJavaParser.VOID, 0); }
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_methodReturnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) ) {
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

	public static class PossibleValuesContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(SimpleJavaParser.DECIMAL, 0); }
		public TerminalNode TRUE() { return getToken(SimpleJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleJavaParser.FALSE, 0); }
		public PossibleValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPossibleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPossibleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitPossibleValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleValuesContext possibleValues() throws RecognitionException {
		PossibleValuesContext _localctx = new PossibleValuesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_possibleValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << DECIMAL))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(SimpleJavaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SimpleJavaParser.WORD, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(SimpleJavaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(SimpleJavaParser.DECIMAL, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(WORD);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DecimalVariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleJavaParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SimpleJavaParser.EQ, 0); }
		public DecimalValueContext decimalValue() {
			return getRuleContext(DecimalValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public DecimalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDecimalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDecimalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitDecimalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalVariableContext decimalVariable() throws RecognitionException {
		DecimalVariableContext _localctx = new DecimalVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decimalVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(INT);
			setState(68);
			identifier();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					paralelDeclaration();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			match(EQ);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(76);
				operator();
				}
			}

			setState(79);
			decimalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimpleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleJavaParser.MINUS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class DecimalValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(SimpleJavaParser.DECIMAL, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DecimalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalValueContext decimalValue() throws RecognitionException {
		DecimalValueContext _localctx = new DecimalValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimalValue);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				identifier();
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

	public static class BoolVariableContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(SimpleJavaParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SimpleJavaParser.EQ, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public BoolVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVariableContext boolVariable() throws RecognitionException {
		BoolVariableContext _localctx = new BoolVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(BOOLEAN);
			setState(89);
			identifier();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					paralelDeclaration();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(96);
			match(EQ);
			setState(97);
			boolValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SimpleJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleJavaParser.FALSE, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolValue);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				expressionBody(0);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SimpleJavaParser.SEMI, 0); }
		public DecimalVariableContext decimalVariable() {
			return getRuleContext(DecimalVariableContext.class,0);
		}
		public BoolVariableContext boolVariable() {
			return getRuleContext(BoolVariableContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(106);
				decimalVariable();
				}
				break;
			case BOOLEAN:
				{
				setState(107);
				boolVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimpleJavaParser.CONST, 0); }
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterConstVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitConstVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitConstVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVariableDeclarationContext constVariableDeclaration() throws RecognitionException {
		ConstVariableDeclarationContext _localctx = new ConstVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CONST);
			setState(113);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext constVariableDeclaration() {
			return getRuleContext(ConstVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(115);
				localVariableDeclaration();
				}
				break;
			case CONST:
				{
				setState(116);
				constVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParalelDeclarationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SimpleJavaParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParalelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterParalelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitParalelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitParalelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalelDeclarationContext paralelDeclaration() throws RecognitionException {
		ParalelDeclarationContext _localctx = new ParalelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paralelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(EQ);
			setState(120);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SimpleJavaParser.EQ, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleJavaParser.SEMI, 0); }
		public VariableAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterVariableAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitVariableAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitVariableAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigmentContext variableAssigment() throws RecognitionException {
		VariableAssigmentContext _localctx = new VariableAssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			identifier();
			setState(123);
			match(EQ);
			setState(124);
			expressionBody(0);
			setState(125);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			block();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LBRACE() { return getToken(SimpleJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleJavaParser.RBRACE, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LBRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(130);
				blockStatement();
				}
			}

			setState(133);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimpleJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleJavaParser.RBRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LBRACE);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(136);
				blockBody();
				}
			}

			setState(139);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(141);
					statement();
					}
					break;
				case 2:
					{
					setState(142);
					methodDeclaration();
					}
					break;
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << WORD))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementAssigmentContext extends StatementContext {
		public VariableAssigmentContext variableAssigment() {
			return getRuleContext(VariableAssigmentContext.class,0);
		}
		public StatementAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementAssigment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementVariableDeclarationContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementRepeatContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(SimpleJavaParser.REPEAT, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(SimpleJavaParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementRepeatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(SimpleJavaParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDoContext extends StatementContext {
		public TerminalNode DO() { return getToken(SimpleJavaParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SimpleJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementSwitchContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(SimpleJavaParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SimpleJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleJavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementContext> switchBlockStatement() {
			return getRuleContexts(SwitchBlockStatementContext.class);
		}
		public SwitchBlockStatementContext switchBlockStatement(int i) {
			return getRuleContext(SwitchBlockStatementContext.class,i);
		}
		public StatementSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(SimpleJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementMethodCallContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleJavaParser.SEMI, 0); }
		public StatementMethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public TerminalNode IF() { return getToken(SimpleJavaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleJavaParser.ELSE, 0); }
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IF);
				setState(153);
				expression();
				setState(154);
				body();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155);
					match(ELSE);
					setState(156);
					body();
					}
				}

				}
				break;
			case 2:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(FOR);
				setState(160);
				forControl();
				setState(161);
				body();
				}
				break;
			case 3:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(WHILE);
				setState(164);
				expression();
				setState(165);
				body();
				}
				break;
			case 4:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(DO);
				setState(168);
				body();
				setState(169);
				match(WHILE);
				setState(170);
				expression();
				}
				break;
			case 5:
				_localctx = new StatementSwitchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(SWITCH);
				setState(173);
				expression();
				setState(174);
				match(LBRACE);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(175);
					switchBlockStatement();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(RBRACE);
				}
				break;
			case 6:
				_localctx = new StatementRepeatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(REPEAT);
				setState(184);
				body();
				setState(185);
				match(UNTIL);
				setState(186);
				expression();
				}
				break;
			case 7:
				_localctx = new StatementMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				methodCall();
				setState(189);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new StatementAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				variableAssigment();
				}
				break;
			case 9:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				variableDeclaration();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimpleJavaParser.LPAREN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleJavaParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LPAREN);
			setState(196);
			expressionBody(0);
			setState(197);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionBodyContext extends ParserRuleContext {
		public ExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBody; }
	 
		public ExpressionBodyContext() { }
		public void copyFrom(ExpressionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNegContext extends ExpressionBodyContext {
		public TerminalNode NEGATION() { return getToken(SimpleJavaParser.NEGATION, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprNegContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAdditiveContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimpleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleJavaParser.MINUS, 0); }
		public ExprAdditiveContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParContext extends ExpressionBodyContext {
		public TerminalNode LPAREN() { return getToken(SimpleJavaParser.LPAREN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleJavaParser.RPAREN, 0); }
		public ExprParContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprRelationalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode GT() { return getToken(SimpleJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(SimpleJavaParser.GE, 0); }
		public TerminalNode LT() { return getToken(SimpleJavaParser.LT, 0); }
		public TerminalNode LE() { return getToken(SimpleJavaParser.LE, 0); }
		public TerminalNode SAME() { return getToken(SimpleJavaParser.SAME, 0); }
		public TerminalNode NOT_EQ() { return getToken(SimpleJavaParser.NOT_EQ, 0); }
		public ExprRelationalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdentifierContext extends ExpressionBodyContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprIdentifierContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPossibleValueContext extends ExpressionBodyContext {
		public PossibleValuesContext possibleValues() {
			return getRuleContext(PossibleValuesContext.class,0);
		}
		public ExprPossibleValueContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprPossibleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprPossibleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprPossibleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLogicalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode AND() { return getToken(SimpleJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(SimpleJavaParser.OR, 0); }
		public ExprLogicalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultipliContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode MULT() { return getToken(SimpleJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SimpleJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimpleJavaParser.MOD, 0); }
		public ExprMultipliContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExprMultipli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExprMultipli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitExprMultipli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBodyContext expressionBody() throws RecognitionException {
		return expressionBody(0);
	}

	private ExpressionBodyContext expressionBody(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionBodyContext _localctx = new ExpressionBodyContext(_ctx, _parentState);
		ExpressionBodyContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressionBody, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case DECIMAL:
				{
				_localctx = new ExprPossibleValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200);
				possibleValues();
				}
				break;
			case WORD:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				identifier();
				}
				break;
			case LPAREN:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(LPAREN);
				setState(203);
				expressionBody(0);
				setState(204);
				match(RPAREN);
				}
				break;
			case NEGATION:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(NEGATION);
				setState(207);
				expressionBody(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultipliContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211);
						((ExprMultipliContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprMultipliContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expressionBody(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditiveContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						((ExprAdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprAdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expressionBody(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(217);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << SAME) | (1L << NOT_EQ))) != 0)) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expressionBody(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						((ExprLogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expressionBody(4);
						}
						break;
					}
					} 
				}
				setState(226);
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

	public static class ForControlContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimpleJavaParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SimpleJavaParser.EQ, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(SimpleJavaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(SimpleJavaParser.DECIMAL, i);
		}
		public TerminalNode RPAREN() { return getToken(SimpleJavaParser.RPAREN, 0); }
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LPAREN);
			setState(228);
			identifier();
			setState(229);
			match(EQ);
			setState(230);
			match(DECIMAL);
			setState(231);
			match(T__0);
			setState(232);
			match(DECIMAL);
			setState(233);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SimpleJavaParser.CASE, 0); }
		public TerminalNode DECIMAL() { return getToken(SimpleJavaParser.DECIMAL, 0); }
		public TerminalNode COLON() { return getToken(SimpleJavaParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SimpleJavaParser.DEFAULT, 0); }
		public SwitchBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterSwitchBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitSwitchBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitSwitchBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementContext switchBlockStatement() throws RecognitionException {
		SwitchBlockStatementContext _localctx = new SwitchBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchBlockStatement);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(CASE);
				setState(236);
				match(DECIMAL);
				setState(237);
				match(COLON);
				setState(238);
				body();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(DEFAULT);
				setState(240);
				match(COLON);
				setState(241);
				body();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(SimpleJavaParser.FUNCTION_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleJavaParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodParameterContext methodParameter() {
			return getRuleContext(MethodParameterContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			methodReturnType();
			setState(245);
			match(FUNCTION_KEYWORD);
			setState(246);
			identifier();
			setState(247);
			match(LPAREN);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(248);
				methodParameter();
				}
			}

			setState(251);
			match(RPAREN);
			setState(252);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(SimpleJavaParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(SimpleJavaParser.INT, 0); }
		public TerminalNode COMMA() { return getToken(SimpleJavaParser.COMMA, 0); }
		public MethodParameterContext methodParameter() {
			return getRuleContext(MethodParameterContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodParameter);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				identifier();
				setState(258);
				match(COMMA);
				setState(259);
				methodParameter();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimpleJavaParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(SimpleJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(SimpleJavaParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleJavaParser.RBRACE, 0); }
		public List<BlockBodyContext> blockBody() {
			return getRuleContexts(BlockBodyContext.class);
		}
		public BlockBodyContext blockBody(int i) {
			return getRuleContext(BlockBodyContext.class,i);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LBRACE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				{
				setState(264);
				blockBody();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(RETURN);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NEGATION) | (1L << LPAREN) | (1L << WORD) | (1L << DECIMAL))) != 0)) {
				{
				setState(271);
				expressionBody(0);
				}
			}

			setState(274);
			match(SEMI);
			setState(275);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SimpleJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleJavaParser.RPAREN, 0); }
		public MethodCallParameterContext methodCallParameter() {
			return getRuleContext(MethodCallParameterContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			identifier();
			setState(278);
			match(LPAREN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==WORD) {
				{
				setState(279);
				methodCallParameter();
				}
			}

			setState(282);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimpleJavaParser.COMMA, 0); }
		public MethodCallParameterContext methodCallParameter() {
			return getRuleContext(MethodCallParameterContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaVisitor ) return ((SimpleJavaVisitor<? extends T>)visitor).visitMethodCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParameterContext methodCallParameter() throws RecognitionException {
		MethodCallParameterContext _localctx = new MethodCallParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodCallParameter);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				expression();
				setState(286);
				match(COMMA);
				setState(287);
				methodCallParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				methodCall();
				setState(291);
				match(COMMA);
				setState(292);
				methodCallParameter();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expressionBody_sempred((ExpressionBodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionBody_sempred(ExpressionBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4\7\4A"+
		"\n\4\f\4\16\4D\13\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\5\5P\n"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\7\b^\n\b\f\b\16\b"+
		"a\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\5\no\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u0086\n\20\3\20\3\20\3\21\3\21\5\21\u008c\n"+
		"\21\3\21\3\21\3\22\3\22\6\22\u0092\n\22\r\22\16\22\u0093\3\23\6\23\u0097"+
		"\n\23\r\23\16\23\u0098\3\24\3\24\3\24\3\24\3\24\5\24\u00a0\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c4\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e1\n\26"+
		"\f\26\16\26\u00e4\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f5\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00fc\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0108\n\32\3\33\3\33\7\33\u010c\n\33\f\33\16\33\u010f\13\33\3\33\3\33"+
		"\5\33\u0113\n\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u011b\n\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0129\n\35"+
		"\3\35\2\3*\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\n\4\2\4\5\20\20\4\2\24\25\60\60\3\2/\60\3\2\31\32\3\2\26\30\4\2"+
		"\33\37%%\3\2!\"\3\2\4\5\2\u0139\2:\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bE\3"+
		"\2\2\2\nS\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20j\3\2\2\2\22n\3\2\2\2\24r\3"+
		"\2\2\2\26w\3\2\2\2\30y\3\2\2\2\32|\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3"+
		"\2\2\2 \u0089\3\2\2\2\"\u0091\3\2\2\2$\u0096\3\2\2\2&\u00c3\3\2\2\2(\u00c5"+
		"\3\2\2\2*\u00d2\3\2\2\2,\u00e5\3\2\2\2.\u00f4\3\2\2\2\60\u00f6\3\2\2\2"+
		"\62\u0107\3\2\2\2\64\u0109\3\2\2\2\66\u0117\3\2\2\28\u0128\3\2\2\2:;\t"+
		"\2\2\2;\3\3\2\2\2<=\t\3\2\2=\5\3\2\2\2>B\7/\2\2?A\t\4\2\2@?\3\2\2\2AD"+
		"\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\7\5\2\2FJ\5\6\4\2"+
		"GI\5\30\r\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2"+
		"\2MO\7 \2\2NP\5\n\6\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\f\7\2R\t\3\2\2"+
		"\2ST\t\5\2\2T\13\3\2\2\2UY\7\60\2\2VY\5\66\34\2WY\5\6\4\2XU\3\2\2\2XV"+
		"\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\4\2\2[_\5\6\4\2\\^\5\30\r\2]\\\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7 \2\2cd\5\20\t"+
		"\2d\17\3\2\2\2ek\7\24\2\2fk\7\25\2\2gk\5\66\34\2hk\5\6\4\2ik\5*\26\2j"+
		"e\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lo\5\b\5"+
		"\2mo\5\16\b\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pq\7-\2\2q\23\3\2\2\2rs\7\22"+
		"\2\2st\5\22\n\2t\25\3\2\2\2ux\5\22\n\2vx\5\24\13\2wu\3\2\2\2wv\3\2\2\2"+
		"x\27\3\2\2\2yz\7 \2\2z{\5\6\4\2{\31\3\2\2\2|}\5\6\4\2}~\7 \2\2~\177\5"+
		"*\26\2\177\u0080\7-\2\2\u0080\33\3\2\2\2\u0081\u0082\5\36\20\2\u0082\35"+
		"\3\2\2\2\u0083\u0085\7)\2\2\u0084\u0086\5\"\22\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7*\2\2\u0088\37\3\2\2\2"+
		"\u0089\u008b\7)\2\2\u008a\u008c\5$\23\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7*\2\2\u008e!\3\2\2\2\u008f\u0092"+
		"\5&\24\2\u0090\u0092\5\60\31\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094#\3"+
		"\2\2\2\u0095\u0097\5&\24\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099%\3\2\2\2\u009a\u009b\7\6\2\2"+
		"\u009b\u009c\5(\25\2\u009c\u009f\5 \21\2\u009d\u009e\7\7\2\2\u009e\u00a0"+
		"\5 \21\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00c4\3\2\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\u00a3\5,\27\2\u00a3\u00a4\5 \21\2\u00a4\u00c4\3"+
		"\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\5 \21\2\u00a8"+
		"\u00c4\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\f"+
		"\2\2\u00ac\u00ad\5(\25\2\u00ad\u00c4\3\2\2\2\u00ae\u00af\7\b\2\2\u00af"+
		"\u00b0\5(\25\2\u00b0\u00b4\7)\2\2\u00b1\u00b3\5.\30\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00c4\3\2"+
		"\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\17\2\2\u00bc"+
		"\u00bd\5(\25\2\u00bd\u00c4\3\2\2\2\u00be\u00bf\5\66\34\2\u00bf\u00c0\7"+
		"-\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c4\5\32\16\2\u00c2\u00c4\5\26\f\2\u00c3"+
		"\u009a\3\2\2\2\u00c3\u00a1\3\2\2\2\u00c3\u00a5\3\2\2\2\u00c3\u00a9\3\2"+
		"\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7\'\2\2"+
		"\u00c6\u00c7\5*\26\2\u00c7\u00c8\7(\2\2\u00c8)\3\2\2\2\u00c9\u00ca\b\26"+
		"\1\2\u00ca\u00d3\5\4\3\2\u00cb\u00d3\5\6\4\2\u00cc\u00cd\7\'\2\2\u00cd"+
		"\u00ce\5*\26\2\u00ce\u00cf\7(\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\7&\2"+
		"\2\u00d1\u00d3\5*\26\3\u00d2\u00c9\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00e2\3\2\2\2\u00d4\u00d5\f\b\2\2\u00d5"+
		"\u00d6\t\6\2\2\u00d6\u00e1\5*\26\t\u00d7\u00d8\f\7\2\2\u00d8\u00d9\t\5"+
		"\2\2\u00d9\u00e1\5*\26\b\u00da\u00db\f\6\2\2\u00db\u00dc\t\7\2\2\u00dc"+
		"\u00e1\5*\26\7\u00dd\u00de\f\5\2\2\u00de\u00df\t\b\2\2\u00df\u00e1\5*"+
		"\26\6\u00e0\u00d4\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3+\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7"+
		"\5\6\4\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\7\3\2\2\u00ea"+
		"\u00eb\7\60\2\2\u00eb\u00ec\7(\2\2\u00ec-\3\2\2\2\u00ed\u00ee\7\t\2\2"+
		"\u00ee\u00ef\7\60\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f5\5 \21\2\u00f1\u00f2"+
		"\7\n\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f5\5 \21\2\u00f4\u00ed\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5/\3\2\2\2\u00f6\u00f7\5\2\2\2\u00f7\u00f8\7\23\2\2"+
		"\u00f8\u00f9\5\6\4\2\u00f9\u00fb\7\'\2\2\u00fa\u00fc\5\62\32\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe"+
		"\u00ff\5\64\33\2\u00ff\61\3\2\2\2\u0100\u0101\t\t\2\2\u0101\u0108\5\6"+
		"\4\2\u0102\u0103\t\t\2\2\u0103\u0104\5\6\4\2\u0104\u0105\7.\2\2\u0105"+
		"\u0106\5\62\32\2\u0106\u0108\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0102\3"+
		"\2\2\2\u0108\63\3\2\2\2\u0109\u010d\7)\2\2\u010a\u010c\5$\23\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\21\2\2\u0111\u0113\5"+
		"*\26\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7-\2\2\u0115\u0116\7*\2\2\u0116\65\3\2\2\2\u0117\u0118\5\6\4\2"+
		"\u0118\u011a\7\'\2\2\u0119\u011b\58\35\2\u011a\u0119\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7(\2\2\u011d\67\3\2\2\2\u011e"+
		"\u0129\5(\25\2\u011f\u0120\5(\25\2\u0120\u0121\7.\2\2\u0121\u0122\58\35"+
		"\2\u0122\u0129\3\2\2\2\u0123\u0129\5\66\34\2\u0124\u0125\5\66\34\2\u0125"+
		"\u0126\7.\2\2\u0126\u0127\58\35\2\u0127\u0129\3\2\2\2\u0128\u011e\3\2"+
		"\2\2\u0128\u011f\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0129"+
		"9\3\2\2\2\34BJOX_jnw\u0085\u008b\u0091\u0093\u0098\u009f\u00b4\u00c3\u00d2"+
		"\u00e0\u00e2\u00f4\u00fb\u0107\u010d\u0112\u011a\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}