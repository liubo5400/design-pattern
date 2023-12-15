package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:17
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: Colleague
 * @Description: Colleague抽象类表示对象，它包含一个Mediator对象，用于处理对象之间的通信。
 * @Version 1.0
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);

    public abstract void send(String message);
}
