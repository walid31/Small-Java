// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sjFile}.
	 * @param ctx the parse tree
	 */
	void enterSjFile(GrammarParser.SjFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sjFile}.
	 * @param ctx the parse tree
	 */
	void exitSjFile(GrammarParser.SjFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#libraries}.
	 * @param ctx the parse tree
	 */
	void enterLibraries(GrammarParser.LibrariesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#libraries}.
	 * @param ctx the parse tree
	 */
	void exitLibraries(GrammarParser.LibrariesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(GrammarParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(GrammarParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(GrammarParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(GrammarParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(GrammarParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(GrammarParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#si_sinon}.
	 * @param ctx the parse tree
	 */
	void enterSi_sinon(GrammarParser.Si_sinonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#si_sinon}.
	 * @param ctx the parse tree
	 */
	void exitSi_sinon(GrammarParser.Si_sinonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(GrammarParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(GrammarParser.Logic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void enterComparaison(GrammarParser.ComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void exitComparaison(GrammarParser.ComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(GrammarParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(GrammarParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(GrammarParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(GrammarParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(GrammarParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(GrammarParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
}