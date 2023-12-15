package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:18
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: ConcreteColleague2
 * @Description: TODO
 * @Version 1.0
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague2 receive message: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("ConcreteColleague2 send message: " + message);
        mediator.send(message, this);
    }
}
