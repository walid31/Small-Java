// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_sjFile = 0, RULE_line = 1, RULE_program = 2, RULE_libraries = 3, 
		RULE_signature = 4, RULE_varDeclaration = 5, RULE_type = 6, RULE_assignment = 7, 
		RULE_expression = 8, RULE_value = 9, RULE_instruction = 10, RULE_inst = 11, 
		RULE_condition = 12, RULE_si = 13, RULE_si_sinon = 14, RULE_cond = 15, 
		RULE_logic_operator = 16, RULE_comparaison = 17, RULE_comp_operator = 18, 
		RULE_read = 19, RULE_format = 20, RULE_write = 21, RULE_string = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"sjFile", "line", "program", "libraries", "signature", "varDeclaration", 
			"type", "assignment", "expression", "value", "instruction", "inst", "condition", 
			"si", "si_sinon", "cond", "logic_operator", "comparaison", "comp_operator", 
			"read", "format", "write", "string"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SjFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public SjFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sjFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSjFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSjFile(this);
		}
	}

	public final SjFileContext sjFile() throws RecognitionException {
		SjFileContext _localctx = new SjFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sjFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				((SjFileContext)_localctx).lines = line();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
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

	public static class LineContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GrammarParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			program();
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	public static class ProgramContext extends ParserRuleContext {
		public LibrariesContext libraries() {
			return getRuleContext(LibrariesContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public List<TerminalNode> LEFTBRACE() { return getTokens(GrammarParser.LEFTBRACE); }
		public TerminalNode LEFTBRACE(int i) {
			return getToken(GrammarParser.LEFTBRACE, i);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(GrammarParser.MAIN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<TerminalNode> RIGHTBRACE() { return getTokens(GrammarParser.RIGHTBRACE); }
		public TerminalNode RIGHTBRACE(int i) {
			return getToken(GrammarParser.RIGHTBRACE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			libraries();
			setState(55);
			signature();
			setState(56);
			match(LEFTBRACE);
			setState(57);
			varDeclaration();
			setState(58);
			match(MAIN);
			setState(59);
			match(LEFTBRACE);
			setState(60);
			instruction();
			setState(61);
			match(RIGHTBRACE);
			setState(62);
			match(RIGHTBRACE);
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

	public static class LibrariesContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GrammarParser.IMPORT, 0); }
		public TerminalNode LIB() { return getToken(GrammarParser.LIB, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public LibrariesContext libraries() {
			return getRuleContext(LibrariesContext.class,0);
		}
		public LibrariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLibraries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLibraries(this);
		}
	}

	public final LibrariesContext libraries() throws RecognitionException {
		LibrariesContext _localctx = new LibrariesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_libraries);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IMPORT);
				setState(65);
				match(LIB);
				setState(66);
				match(SEMICOLON);
				setState(67);
				libraries();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IMPORT);
				setState(69);
				match(LIB);
				setState(70);
				match(SEMICOLON);
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode MODIFICATOR() { return getToken(GrammarParser.MODIFICATOR, 0); }
		public TerminalNode CLASS() { return getToken(GrammarParser.CLASS, 0); }
		public TerminalNode NAMECLASS() { return getToken(GrammarParser.NAMECLASS, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MODIFICATOR);
			setState(74);
			match(CLASS);
			setState(75);
			match(NAMECLASS);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				type();
				setState(78);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				type();
				setState(81);
				assignment();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_SJ() { return getToken(GrammarParser.INT_SJ, 0); }
		public TerminalNode FLOAT_SJ() { return getToken(GrammarParser.FLOAT_SJ, 0); }
		public TerminalNode STRING_SJ() { return getToken(GrammarParser.STRING_SJ, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_SJ) | (1L << FLOAT_SJ) | (1L << STRING_SJ))) != 0)) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(88);
			match(ASSIGN);
			setState(89);
			expression();
			setState(90);
			match(SEMICOLON);
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
		public Token operator;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(GrammarParser.DIVISION, 0); }
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				value();
				setState(94);
				((ExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIVISION) ) {
					((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				value();
				setState(98);
				((ExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(GrammarParser.INTLIT, 0); }
		public TerminalNode FLOATLIT() { return getToken(GrammarParser.FLOATLIT, 0); }
		public TerminalNode STRINGLIT() { return getToken(GrammarParser.STRINGLIT, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLIT) | (1L << FLOATLIT) | (1L << STRINGLIT) | (1L << ID))) != 0)) ) {
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

	public static class InstructionContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruction);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				inst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				inst();
				setState(107);
				instruction();
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

	public static class InstContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inst);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				assignment();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				condition();
				}
				break;
			case IN_SJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				read();
				}
				break;
			case OUT_SJ:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				write();
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

	public static class ConditionContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public Si_sinonContext si_sinon() {
			return getRuleContext(Si_sinonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				si();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				si_sinon();
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(GrammarParser.SI, 0); }
		public TerminalNode LEFTPAR() { return getToken(GrammarParser.LEFTPAR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(GrammarParser.RIGHTPAR, 0); }
		public TerminalNode LEFTBRACE() { return getToken(GrammarParser.LEFTBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(GrammarParser.RIGHTBRACE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SI);
			setState(122);
			match(LEFTPAR);
			setState(123);
			cond();
			setState(124);
			match(RIGHTPAR);
			setState(125);
			match(LEFTBRACE);
			setState(126);
			expression();
			setState(127);
			match(SEMICOLON);
			setState(128);
			match(RIGHTBRACE);
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

	public static class Si_sinonContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(GrammarParser.SI, 0); }
		public TerminalNode LEFTPAR() { return getToken(GrammarParser.LEFTPAR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(GrammarParser.RIGHTPAR, 0); }
		public List<TerminalNode> LEFTBRACE() { return getTokens(GrammarParser.LEFTBRACE); }
		public TerminalNode LEFTBRACE(int i) {
			return getToken(GrammarParser.LEFTBRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTBRACE() { return getTokens(GrammarParser.RIGHTBRACE); }
		public TerminalNode RIGHTBRACE(int i) {
			return getToken(GrammarParser.RIGHTBRACE, i);
		}
		public TerminalNode SINON() { return getToken(GrammarParser.SINON, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public Si_sinonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_sinon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSi_sinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSi_sinon(this);
		}
	}

	public final Si_sinonContext si_sinon() throws RecognitionException {
		Si_sinonContext _localctx = new Si_sinonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_si_sinon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SI);
			setState(131);
			match(LEFTPAR);
			setState(132);
			cond();
			setState(133);
			match(RIGHTPAR);
			setState(134);
			match(LEFTBRACE);
			setState(135);
			expression();
			setState(136);
			match(RIGHTBRACE);
			setState(137);
			match(SINON);
			setState(138);
			match(LEFTBRACE);
			setState(139);
			expression();
			setState(140);
			match(SEMICOLON);
			setState(141);
			match(RIGHTBRACE);
			setState(142);
			match(SEMICOLON);
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

	public static class CondContext extends ParserRuleContext {
		public List<ComparaisonContext> comparaison() {
			return getRuleContexts(ComparaisonContext.class);
		}
		public ComparaisonContext comparaison(int i) {
			return getRuleContext(ComparaisonContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cond);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				comparaison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				value();
				setState(146);
				logic_operator();
				setState(147);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				comparaison();
				setState(150);
				logic_operator();
				setState(151);
				comparaison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(NEGATION);
				setState(154);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(NEGATION);
				setState(156);
				comparaison();
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLogic_operator(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class ComparaisonContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public ComparaisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComparaison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComparaison(this);
		}
	}

	public final ComparaisonContext comparaison() throws RecognitionException {
		ComparaisonContext _localctx = new ComparaisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparaison);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				value();
				setState(162);
				comp_operator();
				setState(163);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				value();
				setState(166);
				comp_operator();
				setState(167);
				comparaison();
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

	public static class Comp_operatorContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(GrammarParser.SUP, 0); }
		public TerminalNode INF() { return getToken(GrammarParser.INF, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(GrammarParser.DIFF, 0); }
		public TerminalNode SUPEQ() { return getToken(GrammarParser.SUPEQ, 0); }
		public TerminalNode INFEQ() { return getToken(GrammarParser.INFEQ, 0); }
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComp_operator(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUP) | (1L << INF) | (1L << EQUAL) | (1L << DIFF) | (1L << SUPEQ) | (1L << INFEQ))) != 0)) ) {
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode IN_SJ() { return getToken(GrammarParser.IN_SJ, 0); }
		public TerminalNode LEFTPAR() { return getToken(GrammarParser.LEFTPAR, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(GrammarParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(GrammarParser.QUOTE, i);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode RIGHTPAR() { return getToken(GrammarParser.RIGHTPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IN_SJ);
			setState(174);
			match(LEFTPAR);
			setState(175);
			match(QUOTE);
			setState(176);
			format();
			setState(177);
			match(QUOTE);
			setState(178);
			match(COMMA);
			setState(179);
			match(ID);
			setState(180);
			match(RIGHTPAR);
			setState(181);
			match(SEMICOLON);
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode INTFORM() { return getToken(GrammarParser.INTFORM, 0); }
		public TerminalNode FLOATFORM() { return getToken(GrammarParser.FLOATFORM, 0); }
		public TerminalNode STRINGFORM() { return getToken(GrammarParser.STRINGFORM, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTFORM) | (1L << FLOATFORM) | (1L << STRINGFORM))) != 0)) ) {
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode OUT_SJ() { return getToken(GrammarParser.OUT_SJ, 0); }
		public TerminalNode LEFTPAR() { return getToken(GrammarParser.LEFTPAR, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(GrammarParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(GrammarParser.QUOTE, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode RIGHTPAR() { return getToken(GrammarParser.RIGHTPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(OUT_SJ);
			setState(186);
			match(LEFTPAR);
			setState(187);
			match(QUOTE);
			setState(188);
			string();
			setState(189);
			match(QUOTE);
			setState(190);
			match(COMMA);
			setState(191);
			match(ID);
			setState(192);
			match(RIGHTPAR);
			setState(193);
			match(SEMICOLON);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> STRINGLIT() { return getTokens(GrammarParser.STRINGLIT); }
		public TerminalNode STRINGLIT(int i) {
			return getToken(GrammarParser.STRINGLIT, i);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(STRINGLIT);
				setState(196);
				format();
				setState(197);
				match(STRINGLIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				format();
				setState(200);
				match(STRINGLIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(STRINGLIT);
				setState(203);
				format();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7V\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\fp\n\f\3\r\3\r\3\r\3\r"+
		"\5\rv\n\r\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a0\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00ac\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00cf\n\30\3\30\2\2\31\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\n\3\3\3\3\3\2\6\b\3\2\24"+
		"\25\3\2\22\23\3\2\'*\3\2\35\36\4\2\26\30\32\34\3\2,.\2\u00ca\2\61\3\2"+
		"\2\2\4\65\3\2\2\2\68\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fU\3\2\2\2\16W\3\2"+
		"\2\2\20Y\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26o\3\2\2\2\30u\3\2\2\2\32y\3"+
		"\2\2\2\34{\3\2\2\2\36\u0084\3\2\2\2 \u009f\3\2\2\2\"\u00a1\3\2\2\2$\u00ab"+
		"\3\2\2\2&\u00ad\3\2\2\2(\u00af\3\2\2\2*\u00b9\3\2\2\2,\u00bb\3\2\2\2."+
		"\u00ce\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\3\3\2\2\2\65\66\5\6\4\2\66\67\t\2\2\2\67\5\3\2\2\28"+
		"9\5\b\5\29:\5\n\6\2:;\7\"\2\2;<\5\f\7\2<=\7\17\2\2=>\7\"\2\2>?\5\26\f"+
		"\2?@\7#\2\2@A\7#\2\2A\7\3\2\2\2BC\7\5\2\2CD\7\20\2\2DE\7&\2\2EJ\5\b\5"+
		"\2FG\7\5\2\2GH\7\20\2\2HJ\7&\2\2IB\3\2\2\2IF\3\2\2\2J\t\3\2\2\2KL\7\21"+
		"\2\2LM\7\16\2\2MN\7+\2\2N\13\3\2\2\2OP\5\16\b\2PQ\7&\2\2QV\3\2\2\2RS\5"+
		"\16\b\2ST\5\20\t\2TV\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\r\3\2\2\2WX\t\3\2\2"+
		"X\17\3\2\2\2YZ\7*\2\2Z[\7\31\2\2[\\\5\22\n\2\\]\7&\2\2]\21\3\2\2\2^h\5"+
		"\24\13\2_`\5\24\13\2`a\t\4\2\2ab\5\24\13\2bh\3\2\2\2cd\5\24\13\2de\t\5"+
		"\2\2ef\5\24\13\2fh\3\2\2\2g^\3\2\2\2g_\3\2\2\2gc\3\2\2\2h\23\3\2\2\2i"+
		"j\t\6\2\2j\25\3\2\2\2kp\5\30\r\2lm\5\30\r\2mn\5\26\f\2np\3\2\2\2ok\3\2"+
		"\2\2ol\3\2\2\2p\27\3\2\2\2qv\5\20\t\2rv\5\32\16\2sv\5(\25\2tv\5,\27\2"+
		"uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\31\3\2\2\2wz\5\34\17\2xz\5\36"+
		"\20\2yw\3\2\2\2yx\3\2\2\2z\33\3\2\2\2{|\7\t\2\2|}\7 \2\2}~\5 \21\2~\177"+
		"\7!\2\2\177\u0080\7\"\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7&\2\2\u0082"+
		"\u0083\7#\2\2\u0083\35\3\2\2\2\u0084\u0085\7\t\2\2\u0085\u0086\7 \2\2"+
		"\u0086\u0087\5 \21\2\u0087\u0088\7!\2\2\u0088\u0089\7\"\2\2\u0089\u008a"+
		"\5\22\n\2\u008a\u008b\7#\2\2\u008b\u008c\7\13\2\2\u008c\u008d\7\"\2\2"+
		"\u008d\u008e\5\22\n\2\u008e\u008f\7&\2\2\u008f\u0090\7#\2\2\u0090\u0091"+
		"\7&\2\2\u0091\37\3\2\2\2\u0092\u00a0\5$\23\2\u0093\u0094\5\24\13\2\u0094"+
		"\u0095\5\"\22\2\u0095\u0096\5\24\13\2\u0096\u00a0\3\2\2\2\u0097\u0098"+
		"\5$\23\2\u0098\u0099\5\"\22\2\u0099\u009a\5$\23\2\u009a\u00a0\3\2\2\2"+
		"\u009b\u009c\7\37\2\2\u009c\u00a0\5\24\13\2\u009d\u009e\7\37\2\2\u009e"+
		"\u00a0\5$\23\2\u009f\u0092\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0097\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a2"+
		"\t\7\2\2\u00a2#\3\2\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\5&\24\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9"+
		"\5&\24\2\u00a9\u00aa\5$\23\2\u00aa\u00ac\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ac%\3\2\2\2\u00ad\u00ae\t\b\2\2\u00ae\'\3\2\2\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\u00b1\7 \2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3\5*\26"+
		"\2\u00b3\u00b4\7$\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\7*\2\2\u00b6\u00b7"+
		"\7!\2\2\u00b7\u00b8\7&\2\2\u00b8)\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba+\3"+
		"\2\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd\7 \2\2\u00bd\u00be\7$\2\2\u00be"+
		"\u00bf\5.\30\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\7%\2\2\u00c1\u00c2\7*\2"+
		"\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\7&\2\2\u00c4-\3\2\2\2\u00c5\u00c6\7"+
		")\2\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7)\2\2\u00c8\u00cf\3\2\2\2\u00c9"+
		"\u00ca\5*\26\2\u00ca\u00cb\7)\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00cd\7)\2"+
		"\2\u00cd\u00cf\5*\26\2\u00ce\u00c5\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf/\3\2\2\2\f\63IUgouy\u009f\u00ab\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}