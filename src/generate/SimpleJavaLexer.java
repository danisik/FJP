// Generated from C:/Users/danisik/Documents/GitHub/FJPP/src\SimpleJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleJavaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "NEGATION", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DIGIT", "LOWECASE", "UPPERCASE", "WORD", "DECIMAL", "WHITESPACE"
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


	public SimpleJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\6.\u010d\n.\r.\16.\u010e\3/\3/\3\60\3\60\3\61\3\61\3\61\6\61\u0118"+
		"\n\61\r\61\16\61\u0119\3\62\3\62\3\63\6\63\u011f\n\63\r\63\16\63\u0120"+
		"\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a/c\60e\61\3"+
		"\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\2\u0125\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5k\3\2\2\2\7"+
		"s\3\2\2\2\tw\3\2\2\2\13z\3\2\2\2\r\177\3\2\2\2\17\u0086\3\2\2\2\21\u008b"+
		"\3\2\2\2\23\u0093\3\2\2\2\25\u0097\3\2\2\2\27\u009d\3\2\2\2\31\u00a0\3"+
		"\2\2\2\33\u00a7\3\2\2\2\35\u00ad\3\2\2\2\37\u00b2\3\2\2\2!\u00b9\3\2\2"+
		"\2#\u00bf\3\2\2\2%\u00c8\3\2\2\2\'\u00cd\3\2\2\2)\u00d3\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e7\3\2\2\2=\u00ea"+
		"\3\2\2\2?\u00ec\3\2\2\2A\u00ef\3\2\2\2C\u00f2\3\2\2\2E\u00f4\3\2\2\2G"+
		"\u00f6\3\2\2\2I\u00f9\3\2\2\2K\u00fb\3\2\2\2M\u00fd\3\2\2\2O\u00ff\3\2"+
		"\2\2Q\u0101\3\2\2\2S\u0103\3\2\2\2U\u0105\3\2\2\2W\u0107\3\2\2\2Y\u0109"+
		"\3\2\2\2[\u010c\3\2\2\2]\u0110\3\2\2\2_\u0112\3\2\2\2a\u0117\3\2\2\2c"+
		"\u011b\3\2\2\2e\u011e\3\2\2\2gh\7\60\2\2hi\7\60\2\2ij\7\60\2\2j\4\3\2"+
		"\2\2kl\7d\2\2lm\7q\2\2mn\7q\2\2no\7n\2\2op\7g\2\2pq\7c\2\2qr\7p\2\2r\6"+
		"\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v\b\3\2\2\2wx\7k\2\2xy\7h\2\2y\n\3"+
		"\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~\f\3\2\2\2\177\u0080\7u\2\2"+
		"\u0080\u0081\7y\2\2\u0081\u0082\7k\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7j\2\2\u0085\16\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a\20\3\2\2\2\u008b\u008c"+
		"\7f\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7n\2\2\u0091\u0092\7v\2\2\u0092\22\3\2\2\2\u0093"+
		"\u0094\7h\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\24\3\2\2\2\u0097"+
		"\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7g\2\2\u009c\26\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7"+
		"q\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7r\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1\36\3\2\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7p\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7e\2"+
		"\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc&\3\2\2\2\u00cd"+
		"\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00d6\7\61\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8.\3\2\2\2\u00d9"+
		"\u00da\7-\2\2\u00da\60\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\62\3\2\2\2\u00dd"+
		"\u00de\7@\2\2\u00de\64\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1\7?\2\2\u00e1"+
		"\66\3\2\2\2\u00e2\u00e3\7>\2\2\u00e38\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e9"+
		"<\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee"+
		"\7(\2\2\u00ee@\3\2\2\2\u00ef\u00f0\7~\2\2\u00f0\u00f1\7~\2\2\u00f1B\3"+
		"\2\2\2\u00f2\u00f3\7A\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7<\2\2\u00f5F\3\2"+
		"\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8\7?\2\2\u00f8H\3\2\2\2\u00f9\u00fa"+
		"\7#\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7*\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7"+
		"+\2\2\u00feN\3\2\2\2\u00ff\u0100\7}\2\2\u0100P\3\2\2\2\u0101\u0102\7\177"+
		"\2\2\u0102R\3\2\2\2\u0103\u0104\7]\2\2\u0104T\3\2\2\2\u0105\u0106\7_\2"+
		"\2\u0106V\3\2\2\2\u0107\u0108\7=\2\2\u0108X\3\2\2\2\u0109\u010a\7.\2\2"+
		"\u010aZ\3\2\2\2\u010b\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\\\3\2\2\2\u0110\u0111"+
		"\t\3\2\2\u0111^\3\2\2\2\u0112\u0113\t\4\2\2\u0113`\3\2\2\2\u0114\u0118"+
		"\5]/\2\u0115\u0118\5_\60\2\u0116\u0118\7a\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011ab\3\2\2\2\u011b\u011c\5[.\2\u011cd\3\2\2"+
		"\2\u011d\u011f\t\5\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\63\2\2"+
		"\u0123f\3\2\2\2\7\2\u010e\u0117\u0119\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}