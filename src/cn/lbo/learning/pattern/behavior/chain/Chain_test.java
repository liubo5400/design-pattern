package cn.lbo.learning.pattern.behavior.chain;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:02
 * @PackageName:cn.lbo.learning.pattern.behavior.chain
 * @ClassName: Chain_test
 * @Description: 责任链模式
 * 责任链模式是一种行为设计模式，它允许将请求沿着处理链进行传递，直到有一个处理程序处理它为止。
 *
 * 在Java中实现责任链模式通常需要以下几个步骤：
 * 1.定义一个处理器接口，该接口包含一个处理请求的方法。
 * 2.创建一个抽象处理器类，它实现处理器接口，并包含一个指向下一个处理器的引用。
 * 3.创建具体的处理器类，它们继承自抽象处理器类，并实现处理请求的方法。
 * 4.在客户端代码中，创建处理器链，并将请求发送到链的第一个处理器。
 *
 * @Version 1.0
 */
public class Chain_test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        Handler handler3 = new ConcreteHandlerThree();

        handler1.setNextHandler(handler2).setNextHandler(handler3);
        handler1.handle("one");
        handler1.handle("two");
        handler1.handle("three");
    }
}
