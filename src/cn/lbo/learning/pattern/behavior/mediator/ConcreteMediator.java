package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:19
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: ConcreteMediator
 * @Description: ConcreteMediator是具体的中介者实现类，它负责协调对象之间的通信。
 * @Version 1.0
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1) {
            concreteColleague2.receive(message);
        } else {
            concreteColleague1.receive(message);
        }
    }
}
