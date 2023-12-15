package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:39
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: CalculatorVisitor
 * @Description: TODO
 * @Version 1.0
 */
public class CalculatorVisitor implements Visitor {

    private int result;

    @Override
    public void visit(NumberExpression elementA) {
        result = elementA.getNumber();
    }

    @Override
    public void visit(AdditionExpression elementB) {
        elementB.getElementA().accept(this);
        int a = result;
        elementB.getElementB().accept(this);
        int b = result;
        result = a + b;
    }

    public int getResult() {
        return result;
    }
}
