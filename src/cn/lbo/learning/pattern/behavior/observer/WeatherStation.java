package cn.lbo.learning.pattern.behavior.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:49
 * @PackageName:cn.lbo.learning.pattern.behavior.observer
 * @ClassName: WeatherStation
 * @Description: TODO
 * @Version 1.0
 */
public class WeatherStation implements Subject{
    private List<Observer> observers;

    private String msg;

    public WeatherStation() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(msg));
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
