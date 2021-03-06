// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, IMPORT=3, INT_SJ=4, FLOAT_SJ=5, STRING_SJ=6, SI=7, ALORS=8, 
		SINON=9, IN_SJ=10, OUT_SJ=11, CLASS=12, MAIN=13, LIB=14, MODIFICATOR=15, 
		PLUS=16, MINUS=17, MULT=18, DIVISION=19, SUP=20, INF=21, EQUAL=22, ASSIGN=23, 
		DIFF=24, SUPEQ=25, INFEQ=26, AND=27, OR=28, NEGATION=29, LEFTPAR=30, RIGHTPAR=31, 
		LEFTBRACE=32, RIGHTBRACE=33, QUOTE=34, COMMA=35, SEMICOLON=36, INTLIT=37, 
		FLOATLIT=38, STRINGLIT=39, ID=40, NAMECLASS=41, INTFORM=42, FLOATFORM=43, 
		STRINGFORM=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "IMPORT", "INT_SJ", "FLOAT_SJ", "STRING_SJ", "SI", "ALORS", 
			"SINON", "IN_SJ", "OUT_SJ", "CLASS", "MAIN", "LIB", "MODIFICATOR", "PLUS", 
			"MINUS", "MULT", "DIVISION", "SUP", "INF", "EQUAL", "ASSIGN", "DIFF", 
			"SUPEQ", "INFEQ", "AND", "OR", "NEGATION", "LEFTPAR", "RIGHTPAR", "LEFTBRACE", 
			"RIGHTBRACE", "QUOTE", "COMMA", "SEMICOLON", "INTLIT", "FLOATLIT", "STRINGLIT", 
			"ID", "NAMECLASS", "INTFORM", "FLOATFORM", "STRINGFORM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, "'import'", "'int_SJ'", "'float_SJ'", "'string_SJ'", 
			"'Si'", "'Alors'", "'Sinon'", "'In_SJ'", "'Out_SJ'", "'class_SJ'", "'main_SJ'", 
			null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "':='", 
			"'!='", "'>='", "'<='", "'&'", "'|'", "'!'", "'('", "')'", "'{'", "'}'", 
			"'\"'", "','", "';'", null, null, null, null, null, "'%d'", "'%f'", "'%s'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "IMPORT", "INT_SJ", "FLOAT_SJ", "STRING_SJ", "SI", 
			"ALORS", "SINON", "IN_SJ", "OUT_SJ", "CLASS", "MAIN", "LIB", "MODIFICATOR", 
			"PLUS", "MINUS", "MULT", "DIVISION", "SUP", "INF", "EQUAL", "ASSIGN", 
			"DIFF", "SUPEQ", "INFEQ", "AND", "OR", "NEGATION", "LEFTPAR", "RIGHTPAR", 
			"LEFTBRACE", "RIGHTBRACE", "QUOTE", "COMMA", "SEMICOLON", "INTLIT", "FLOATLIT", 
			"STRINGLIT", "ID", "NAMECLASS", "INTFORM", "FLOATFORM", "STRINGFORM"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\6\3_\n\3\r\3\16\3`\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\7"+
		"&\u0113\n&\f&\16&\u0116\13&\5&\u0118\n&\3\'\3\'\3\'\7\'\u011d\n\'\f\'"+
		"\16\'\u0120\13\'\3\'\3\'\6\'\u0124\n\'\r\'\16\'\u0125\5\'\u0128\n\'\3"+
		"(\3(\7(\u012c\n(\f(\16(\u012f\13(\3(\3(\3)\3)\7)\u0135\n)\f)\16)\u0138"+
		"\13)\3*\3*\7*\u013c\n*\f*\16*\u013f\13*\3+\3+\3+\3,\3,\3,\3-\3-\3-\2\2"+
		".\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\n\3\2\13\13\3\2\62\62\3\2\63;\3\2"+
		"\62;\5\2\62;C\\c|\3\2c|\6\2\62;C\\aac|\3\2C\\\2\u0153\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7d\3\2\2\2\tk\3\2\2\2\13r\3\2\2"+
		"\2\r{\3\2\2\2\17\u0085\3\2\2\2\21\u0088\3\2\2\2\23\u008e\3\2\2\2\25\u0094"+
		"\3\2\2\2\27\u009a\3\2\2\2\31\u00a1\3\2\2\2\33\u00aa\3\2\2\2\35\u00ce\3"+
		"\2\2\2\37\u00df\3\2\2\2!\u00e1\3\2\2\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'"+
		"\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2"+
		"\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00f8\3\2\2\2\67\u00fb\3\2\2"+
		"\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0101\3\2\2\2?\u0103\3\2\2\2A\u0105"+
		"\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K"+
		"\u0117\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u0132\3\2\2\2S\u0139\3\2"+
		"\2\2U\u0140\3\2\2\2W\u0143\3\2\2\2Y\u0146\3\2\2\2[\\\7\f\2\2\\\4\3\2\2"+
		"\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\3\2"+
		"\2c\6\3\2\2\2de\7k\2\2ef\7o\2\2fg\7r\2\2gh\7q\2\2hi\7t\2\2ij\7v\2\2j\b"+
		"\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2no\7a\2\2op\7U\2\2pq\7L\2\2q\n\3\2"+
		"\2\2rs\7h\2\2st\7n\2\2tu\7q\2\2uv\7c\2\2vw\7v\2\2wx\7a\2\2xy\7U\2\2yz"+
		"\7L\2\2z\f\3\2\2\2{|\7u\2\2|}\7v\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7i\2\2\u0081\u0082\7a\2\2\u0082\u0083\7U\2\2\u0083\u0084"+
		"\7L\2\2\u0084\16\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7k\2\2\u0087\20"+
		"\3\2\2\2\u0088\u0089\7C\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7u\2\2\u008d\22\3\2\2\2\u008e\u008f\7U\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7q\2\2\u0092\u0093\7p\2\2"+
		"\u0093\24\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096\7p\2\2\u0096\u0097\7"+
		"a\2\2\u0097\u0098\7U\2\2\u0098\u0099\7L\2\2\u0099\26\3\2\2\2\u009a\u009b"+
		"\7Q\2\2\u009b\u009c\7w\2\2\u009c\u009d\7v\2\2\u009d\u009e\7a\2\2\u009e"+
		"\u009f\7U\2\2\u009f\u00a0\7L\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7u\2\2"+
		"\u00a6\u00a7\7a\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7L\2\2\u00a9\32\3\2"+
		"\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\u00af\7a\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7L\2\2\u00b1"+
		"\34\3\2\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7a\2\2\u00b8\u00b9\7L\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00cf\7i\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7n\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7a\2\2\u00c7\u00c8"+
		"\7L\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb\7c\2\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\u00cd\7k\2\2\u00cd\u00cf\7q\2\2\u00ce\u00b2\3\2"+
		"\2\2\u00ce\u00c1\3\2\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00e0\7e\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7q\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7g\2\2\u00de\u00e0\7f\2\2\u00df\u00d0\3\2\2\2\u00df"+
		"\u00d6\3\2\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\"\3\2\2\2\u00e3"+
		"\u00e4\7/\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6&\3\2\2\2\u00e7\u00e8"+
		"\7\61\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea*\3\2\2\2\u00eb\u00ec"+
		"\7>\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7"+
		"<\2\2\u00f0\u00f1\7?\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\7?\2\2\u00f7\64"+
		"\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00fa\66\3\2\2\2\u00fb"+
		"\u00fc\7(\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe:\3\2\2\2\u00ff\u0100"+
		"\7#\2\2\u0100<\3\2\2\2\u0101\u0102\7*\2\2\u0102>\3\2\2\2\u0103\u0104\7"+
		"+\2\2\u0104@\3\2\2\2\u0105\u0106\7}\2\2\u0106B\3\2\2\2\u0107\u0108\7\177"+
		"\2\2\u0108D\3\2\2\2\u0109\u010a\7$\2\2\u010aF\3\2\2\2\u010b\u010c\7.\2"+
		"\2\u010cH\3\2\2\2\u010d\u010e\7=\2\2\u010eJ\3\2\2\2\u010f\u0118\t\3\2"+
		"\2\u0110\u0114\t\4\2\2\u0111\u0113\t\5\2\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2\2\2\u0118L\3\2\2\2"+
		"\u0119\u0128\t\3\2\2\u011a\u011e\t\4\2\2\u011b\u011d\t\5\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\60\2\2\u0122\u0124\t"+
		"\5\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011a\3\2"+
		"\2\2\u0128N\3\2\2\2\u0129\u012d\7$\2\2\u012a\u012c\t\6\2\2\u012b\u012a"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7$\2\2\u0131P\3\2\2\2\u0132"+
		"\u0136\t\7\2\2\u0133\u0135\t\b\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137R\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013d\t\t\2\2\u013a\u013c\t\b\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013eT\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0141\7\'\2\2\u0141\u0142\7f\2\2\u0142V\3\2"+
		"\2\2\u0143\u0144\7\'\2\2\u0144\u0145\7h\2\2\u0145X\3\2\2\2\u0146\u0147"+
		"\7\'\2\2\u0147\u0148\7u\2\2\u0148Z\3\2\2\2\16\2`\u00ce\u00df\u0114\u0117"+
		"\u011e\u0125\u0127\u012d\u0136\u013d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}