package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:15
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: Mediator_test
 * @Description: 中介者模式
 * Java中介者模式是一种行为设计模式，它允许对象之间通过中介者对象进行通信，从而避免对象之间的直接耦合。
 * 中介者模式将对象之间的复杂关系转化为中介者和对象之间的简单关系，从而提高了系统的灵活性和可维护性。
 * @Version 1.0
 */
public class Mediator_test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);
        colleague1.send("Hello World!");
        colleague2.send("Hello!");
    }
}
