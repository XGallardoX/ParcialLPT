import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Math;

public class CalculadoraTrig {
    public static void main(String[] args) throws Exception {
        String inputFile = "expr.in";
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);

        // input
        CharStream input = CharStreams.fromStream(is);
        
        // lexer y el parser
        TrigonometricasLexer lexer = new TrigonometricasLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigonometricasParser parser = new TrigonometricasParser(tokens);

        // parse tree
        ParseTree tree = parser.prog();
        TrigonometricasVisitorImpl visitor = new TrigonometricasVisitorImpl();
        visitor.visit(tree);
    }
}

class TrigonometricasVisitorImpl extends TrigonometricasBaseVisitor<Double> {
    @Override
    public Double visitExpr(TrigonometricasParser.ExprContext ctx) {
        String function = ctx.FUNCION().getText();
        double number = Double.parseDouble(ctx.NUMERO().getText());
        double result = 0;

        
        switch (function) {
            case "Sin":
                result = Math.sin(Math.toRadians(number));
                break;
            case "Cos":
                result = Math.cos(Math.toRadians(number));
                break;
            case "Tan":
                result = Math.tan(Math.toRadians(number));
                break;
        }
        
        System.out.println(result);
        return result;
    }
}
