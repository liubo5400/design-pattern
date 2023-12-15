package cn.lbo.learning.pattern.behavior.interpreter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:34
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: NumberExpression
 * @Description: 终结符表达式
 * @Version 1.0
 */
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
