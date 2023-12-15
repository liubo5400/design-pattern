package cn.lbo.learning.pattern.behavior.interpreter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:35
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: AddExpression
 * @Description: 非终结符表达式
 * @Version 1.0
 */
public class AddExpression implements Expression {

    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
