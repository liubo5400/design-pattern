package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:18
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: ConcreteColleague1
 * @Description: TODO
 * @Version 1.0
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1 receive message: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague1 send message: " + message);
        mediator.send(message, this);
    }
}
