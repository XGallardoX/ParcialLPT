// Generated from Trigonometricas.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigonometricasParser}.
 */
public interface TrigonometricasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigonometricasParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TrigonometricasParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigonometricasParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TrigonometricasParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigonometricasParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TrigonometricasParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigonometricasParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TrigonometricasParser.ExprContext ctx);
}