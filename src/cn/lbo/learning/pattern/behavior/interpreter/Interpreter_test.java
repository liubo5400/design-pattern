package cn.lbo.learning.pattern.behavior.interpreter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:23
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: Interpreter_test
 * @Description: 解释器模式
 * Java解释器模式是一种行为设计模式，它定义了一种语言和该语言的解释器，使得可以使用该语言来表达一些特定的操作。
 * 该模式适用于需要解释一些特定语言的场景，例如编译器、表达式计算器等。
 * <p>
 * 解释器模式通常包括以下几个组件：
 * 1.抽象表达式（Abstract Expression）：定义了一个抽象的解释器接口，该接口包含了解释器需要实现的方法。
 * 2.终结符表达式（Terminal Expression）：实现了抽象表达式接口的终结符，用于表示语言中的基本操作或值。
 * 3.非终结符表达式（Non-Terminal Expression）：实现了抽象表达式接口的非终结符，用于表示语言中的复杂操作。
 * 4.上下文（Context）：包含了解释器需要的一些全局信息，例如变量、函数等。
 * 5.解释器（Interpreter）：使用上述组件来解释语言表达式，并执行相应的操作。
 * @Version 1.0
 */
public class Interpreter_test {

    public static void main(String[] args) {
        // 创建上下文
        Context context = new Context();
        context.setVariable("a", 10);
        context.setVariable("b", 20);
        // 创建表达式
        Expression expression = new AddExpression(
                new NumberExpression(context.getVariable("a")),
                new NumberExpression(context.getVariable("b"))
        );
        // 创建解释器并执行表达式
        Interpreter interpreter = new Interpreter(expression);
        int result = interpreter.interpret(context);
        System.out.println("Result: " + result);
    }
}
