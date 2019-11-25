// Generated from /Users/cagy/Documents/Škola/FJP/simplejava/src/SimpleJava.g4 by ANTLR 4.7.2
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
		TRUE=18, FALSE=19, MULT=20, DIV=21, MOD=22, PLUS=23, MINUS=24, GT=25, 
		GE=26, LT=27, LE=28, SAME=29, EQ=30, AND=31, OR=32, QUESTION=33, COLON=34, 
		NOT_EQ=35, LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, LBRACK=40, RBRACK=41, 
		SEMI=42, COMMA=43, WORD=44, DECIMAL=45, WHITESPACE=46;
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
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DIGIT", 
			"LOWECASE", "UPPERCASE", "WORD", "DECIMAL", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'boolean'", "'int'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'for'", "'while'", "'do'", "'repeat'", "'until'", "'void'", 
			"'return'", "'const'", "'function'", "'true'", "'false'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'&&'", 
			"'||'", "'?'", "':'", "'!='", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "WORD", 
			"DECIMAL", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\6-\u0109\n-"+
		"\r-\16-\u010a\3.\3.\3/\3/\3\60\3\60\3\60\6\60\u0114\n\60\r\60\16\60\u0115"+
		"\3\61\3\61\3\62\6\62\u011b\n\62\r\62\16\62\u011c\3\62\3\62\2\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_.a/c\60\3\2\6\3\2\62;\3\2c|\3\2C\\"+
		"\5\2\13\f\17\17\"\"\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3e\3\2\2\2\5i\3\2\2\2\7q\3\2\2\2\tu\3\2\2\2\13x\3\2\2\2\r"+
		"}\3\2\2\2\17\u0084\3\2\2\2\21\u0089\3\2\2\2\23\u0091\3\2\2\2\25\u0095"+
		"\3\2\2\2\27\u009b\3\2\2\2\31\u009e\3\2\2\2\33\u00a5\3\2\2\2\35\u00ab\3"+
		"\2\2\2\37\u00b0\3\2\2\2!\u00b7\3\2\2\2#\u00bd\3\2\2\2%\u00c6\3\2\2\2\'"+
		"\u00cb\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2"+
		"\2\2\61\u00d9\3\2\2\2\63\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00e0\3\2\2"+
		"\29\u00e2\3\2\2\2;\u00e5\3\2\2\2=\u00e8\3\2\2\2?\u00ea\3\2\2\2A\u00ed"+
		"\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f7\3\2\2\2K"+
		"\u00f9\3\2\2\2M\u00fb\3\2\2\2O\u00fd\3\2\2\2Q\u00ff\3\2\2\2S\u0101\3\2"+
		"\2\2U\u0103\3\2\2\2W\u0105\3\2\2\2Y\u0108\3\2\2\2[\u010c\3\2\2\2]\u010e"+
		"\3\2\2\2_\u0113\3\2\2\2a\u0117\3\2\2\2c\u011a\3\2\2\2ef\7\60\2\2fg\7\60"+
		"\2\2gh\7\60\2\2h\4\3\2\2\2ij\7d\2\2jk\7q\2\2kl\7q\2\2lm\7n\2\2mn\7g\2"+
		"\2no\7c\2\2op\7p\2\2p\6\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\b\3\2\2\2"+
		"uv\7k\2\2vw\7h\2\2w\n\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\f\3"+
		"\2\2\2}~\7u\2\2~\177\7y\2\2\177\u0080\7k\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7e\2\2\u0082\u0083\7j\2\2\u0083\16\3\2\2\2\u0084\u0085\7e\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\20\3\2\2\2\u0089"+
		"\u008a\7f\2\2\u008a\u008b\7g\2\2\u008b\u008c\7h\2\2\u008c\u008d\7c\2\2"+
		"\u008d\u008e\7w\2\2\u008e\u008f\7n\2\2\u008f\u0090\7v\2\2\u0090\22\3\2"+
		"\2\2\u0091\u0092\7h\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\24"+
		"\3\2\2\2\u0095\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\26\3\2\2\2\u009b\u009c\7f\2\2\u009c"+
		"\u009d\7q\2\2\u009d\30\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\32\3\2\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7"+
		"v\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\34\3\2\2\2\u00ab\u00ac"+
		"\7x\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7f\2\2\u00af"+
		"\36\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7p\2\2\u00b6 \3\2\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7w"+
		"\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7p\2\2\u00c5$\3\2\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"&\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2"+
		"*\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6"+
		".\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7/\2\2\u00da"+
		"\62\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7@\2\2\u00de"+
		"\u00df\7?\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7>\2\2\u00e18\3\2\2\2\u00e2"+
		"\u00e3\7>\2\2\u00e3\u00e4\7?\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9>\3\2\2\2\u00ea\u00eb"+
		"\7(\2\2\u00eb\u00ec\7(\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7~\2\2\u00ee\u00ef"+
		"\7~\2\2\u00efB\3\2\2\2\u00f0\u00f1\7A\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7"+
		"<\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6H\3\2"+
		"\2\2\u00f7\u00f8\7*\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7+\2\2\u00faL\3\2\2"+
		"\2\u00fb\u00fc\7}\2\2\u00fcN\3\2\2\2\u00fd\u00fe\7\177\2\2\u00feP\3\2"+
		"\2\2\u00ff\u0100\7]\2\2\u0100R\3\2\2\2\u0101\u0102\7_\2\2\u0102T\3\2\2"+
		"\2\u0103\u0104\7=\2\2\u0104V\3\2\2\2\u0105\u0106\7.\2\2\u0106X\3\2\2\2"+
		"\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010bZ\3\2\2\2\u010c\u010d\t\3\2\2\u010d"+
		"\\\3\2\2\2\u010e\u010f\t\4\2\2\u010f^\3\2\2\2\u0110\u0114\5[.\2\u0111"+
		"\u0114\5]/\2\u0112\u0114\7a\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116`\3\2\2\2\u0117\u0118\5Y-\2\u0118b\3\2\2\2\u0119\u011b\t"+
		"\5\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\62\2\2\u011fd\3\2\2\2"+
		"\7\2\u010a\u0113\u0115\u011c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}