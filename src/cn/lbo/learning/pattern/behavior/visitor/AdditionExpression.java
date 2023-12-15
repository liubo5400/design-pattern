package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:36
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: AdditionExpression
 * @Description: TODO
 * @Version 1.0
 */
public class AdditionExpression implements Expression {

    private Expression elementA;
    private Expression elementB;

    public AdditionExpression(Expression elementA, Expression elementB) {
        this.elementA = elementA;
        this.elementB = elementB;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Expression getElementA() {
        return elementA;
    }

    public Expression getElementB() {
        return elementB;
    }
}
