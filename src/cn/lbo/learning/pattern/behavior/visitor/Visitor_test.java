package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:30
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: Visitor_test
 * @Description: 访问者模式
 * Java访问者模式是一种行为型设计模式，它允许你在不修改对象结构的前提下定义新的操作。
 * 访问者模式将对象结构和操作分离开来，使得操作可以独立地应用于对象结构中的元素。
 * 在访问者模式中，有两个主要角色：访问者和元素。访问者定义了对元素进行操作的方法，而元素则提供了接受访问者的方法。
 *
 * 访问者模式适用于以下场景：
 * 1.对象结构比较稳定，但经常需要在此对象结构上定义新的操作。
 * 2.需要对一个对象结构中的对象进行很多不同的且不相关的操作，而不希望这些操作“污染”这些对象的类。
 * 3.对象结构中对象的类很少改变，但经常需要在这些对象上定义新的操作。
 * 4.需要在运行时根据对象的类型执行不同的操作。
 * 5.需要对对象结构中的所有对象进行某种类型的处理，但是对象所采取的处理方式根据对象类型不同而异。
 * @Version 1.0
 */
public class Visitor_test {

    public static void main(String[] args) {
        Expression expression = new AdditionExpression(new NumberExpression(1), new NumberExpression(2));
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        expression.accept(calculatorVisitor);
        System.out.println(calculatorVisitor.getResult());

        PrinterVisitor printerVisitor = new PrinterVisitor();
        expression.accept(printerVisitor);
    }
}
