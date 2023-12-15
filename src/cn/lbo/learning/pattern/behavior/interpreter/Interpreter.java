package cn.lbo.learning.pattern.behavior.interpreter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:36
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: Interpreter
 * @Description: 解释器
 * @Version 1.0
 */
public class Interpreter {

    private Expression expression;

    public Interpreter(Expression expression) {
        this.expression = expression;
    }

    public int interpret(Context context) {
        return expression.interpret(context);
    }
}
