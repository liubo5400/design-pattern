package cn.lbo.learning.pattern.behavior.observer;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:45
 * @PackageName:cn.lbo.learning.pattern.behavior.observer
 * @ClassName: Subject
 * @Description: TODO
 * @Version 1.0
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
