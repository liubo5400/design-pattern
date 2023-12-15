package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:37
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: PrinterVisitor
 * @Description: TODO
 * @Version 1.0
 */
public class PrinterVisitor implements Visitor{

    @Override
    public void visit(NumberExpression elementA) {
        System.out.println(elementA.getNumber());
    }

    @Override
    public void visit(AdditionExpression elementB) {
        System.out.print("(");
        elementB.getElementA().accept(this);
        System.out.print("+");
        elementB.getElementB().accept(this);
        System.out.print(")");
    }

}
