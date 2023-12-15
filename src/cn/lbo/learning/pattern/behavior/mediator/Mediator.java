package cn.lbo.learning.pattern.behavior.mediator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:16
 * @PackageName:cn.lbo.learning.pattern.behavior.mediator
 * @ClassName: Mediator
 * @Description: Mediator接口定义了send()方法，用于处理对象之间的交互。
 * @Version 1.0
 */
public interface Mediator {

    void send(String message, Colleague colleague);
}
