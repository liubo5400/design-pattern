package cn.lbo.learning.pattern.behavior.observer;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:46
 * @PackageName:cn.lbo.learning.pattern.behavior.observer
 * @ClassName: Observer
 * @Description: TODO
 * @Version 1.0
 */
public interface Observer {

    void update(String message);

    String name();
}
