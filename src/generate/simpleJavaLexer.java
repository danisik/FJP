// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
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
		TRUE=18, FALSE=19, MULT=20, DIV=21, PLUS=22, MINUS=23, GT=24, GE=25, LT=26, 
		LE=27, SAME=28, EQ=29, AND=30, OR=31, QUESTION=32, COLON=33, NOT_EQ=34, 
		LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, RBRACK=40, SEMI=41, 
		COMMA=42, WORD=43, DECIMAL=44, BOOL_LITERAL=45, WHITESPACE=46;
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
			"TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", 
			"SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DIGIT", "LOWECASE", 
			"UPPERCASE", "WORD", "DECIMAL", "BOOL_LITERAL", "WHITESPACE", "DATA_TYPES", 
			"METHOD_RETURN_TYPE", "POSSIBLE_VALUES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'boolean'", "'int'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'for'", "'while'", "'do'", "'repeat'", "'until'", "'void'", 
			"'return'", "'const'", "'function'", "'true'", "'false'", "'*'", "'/'", 
			"'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'&&'", "'||'", 
			"'?'", "':'", "'!='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", 
			"SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "WORD", "DECIMAL", 
			"BOOL_LITERAL", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0134\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\6,\u010d\n,\r,\16,\u010e\3-\3-\3.\3.\3/\3/\3/\6/\u0118\n"+
		"/\r/\16/\u0119\3\60\3\60\3\61\3\61\5\61\u0120\n\61\3\62\6\62\u0123\n\62"+
		"\r\62\16\62\u0124\3\62\3\62\3\63\3\63\5\63\u012b\n\63\3\64\3\64\5\64\u012f"+
		"\n\64\3\65\3\65\5\65\u0133\n\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2"+
		"[\2]-_.a/c\60e\2g\2i\2\3\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\2"+
		"\u0136\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3k\3\2\2"+
		"\2\5o\3\2\2\2\7w\3\2\2\2\t{\3\2\2\2\13~\3\2\2\2\r\u0083\3\2\2\2\17\u008a"+
		"\3\2\2\2\21\u008f\3\2\2\2\23\u0097\3\2\2\2\25\u009b\3\2\2\2\27\u00a1\3"+
		"\2\2\2\31\u00a4\3\2\2\2\33\u00ab\3\2\2\2\35\u00b1\3\2\2\2\37\u00b6\3\2"+
		"\2\2!\u00bd\3\2\2\2#\u00c3\3\2\2\2%\u00cc\3\2\2\2\'\u00d1\3\2\2\2)\u00d7"+
		"\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e1\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e9\3\2\2\2;\u00ec"+
		"\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f4\3\2\2\2C\u00f6\3\2\2\2E"+
		"\u00f8\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2"+
		"\2\2O\u0103\3\2\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010c"+
		"\3\2\2\2Y\u0110\3\2\2\2[\u0112\3\2\2\2]\u0117\3\2\2\2_\u011b\3\2\2\2a"+
		"\u011f\3\2\2\2c\u0122\3\2\2\2e\u012a\3\2\2\2g\u012e\3\2\2\2i\u0132\3\2"+
		"\2\2kl\7\60\2\2lm\7\60\2\2mn\7\60\2\2n\4\3\2\2\2op\7d\2\2pq\7q\2\2qr\7"+
		"q\2\2rs\7n\2\2st\7g\2\2tu\7c\2\2uv\7p\2\2v\6\3\2\2\2wx\7k\2\2xy\7p\2\2"+
		"yz\7v\2\2z\b\3\2\2\2{|\7k\2\2|}\7h\2\2}\n\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\f\3\2\2\2\u0083\u0084"+
		"\7u\2\2\u0084\u0085\7y\2\2\u0085\u0086\7k\2\2\u0086\u0087\7v\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089\16\3\2\2\2\u008a\u008b\7e\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\20\3\2\2\2\u008f"+
		"\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2"+
		"\u0093\u0094\7w\2\2\u0094\u0095\7n\2\2\u0095\u0096\7v\2\2\u0096\22\3\2"+
		"\2\2\u0097\u0098\7h\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\24"+
		"\3\2\2\2\u009b\u009c\7y\2\2\u009c\u009d\7j\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\u00a3\7q\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\32\3\2\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7"+
		"v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\34\3\2\2\2\u00b1\u00b2"+
		"\7x\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\36\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc \3\2\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7u\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7w"+
		"\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb$\3\2\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"&\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8"+
		"*\3\2\2\2\u00d9\u00da\7\61\2\2\u00da,\3\2\2\2\u00db\u00dc\7-\2\2\u00dc"+
		".\3\2\2\2\u00dd\u00de\7/\2\2\u00de\60\3\2\2\2\u00df\u00e0\7@\2\2\u00e0"+
		"\62\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\7?\2\2\u00e3\64\3\2\2\2\u00e4"+
		"\u00e5\7>\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8\7?\2\2\u00e8"+
		"8\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\7?\2\2\u00eb:\3\2\2\2\u00ec\u00ed"+
		"\7?\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7(\2\2\u00f0>\3"+
		"\2\2\2\u00f1\u00f2\7~\2\2\u00f2\u00f3\7~\2\2\u00f3@\3\2\2\2\u00f4\u00f5"+
		"\7A\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7<\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7"+
		"#\2\2\u00f9\u00fa\7?\2\2\u00faF\3\2\2\2\u00fb\u00fc\7*\2\2\u00fcH\3\2"+
		"\2\2\u00fd\u00fe\7+\2\2\u00feJ\3\2\2\2\u00ff\u0100\7}\2\2\u0100L\3\2\2"+
		"\2\u0101\u0102\7\177\2\2\u0102N\3\2\2\2\u0103\u0104\7]\2\2\u0104P\3\2"+
		"\2\2\u0105\u0106\7_\2\2\u0106R\3\2\2\2\u0107\u0108\7=\2\2\u0108T\3\2\2"+
		"\2\u0109\u010a\7.\2\2\u010aV\3\2\2\2\u010b\u010d\t\2\2\2\u010c\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"X\3\2\2\2\u0110\u0111\t\3\2\2\u0111Z\3\2\2\2\u0112\u0113\t\4\2\2\u0113"+
		"\\\3\2\2\2\u0114\u0118\5Y-\2\u0115\u0118\5[.\2\u0116\u0118\7a\2\2\u0117"+
		"\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a^\3\2\2\2\u011b\u011c"+
		"\5W,\2\u011c`\3\2\2\2\u011d\u0120\5%\23\2\u011e\u0120\5\'\24\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120b\3\2\2\2\u0121\u0123\t\5\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\62\2\2\u0127d\3\2\2\2\u0128\u012b"+
		"\5\5\3\2\u0129\u012b\5\7\4\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"f\3\2\2\2\u012c\u012f\5e\63\2\u012d\u012f\5\35\17\2\u012e\u012c\3\2\2"+
		"\2\u012e\u012d\3\2\2\2\u012fh\3\2\2\2\u0130\u0133\5_\60\2\u0131\u0133"+
		"\5a\61\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133j\3\2\2\2\13\2\u010e"+
		"\u0117\u0119\u011f\u0124\u012a\u012e\u0132\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}