package cn.lbo.learning.pattern.behavior.observer;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:44
 * @PackageName:cn.lbo.learning.pattern.behavior.observer
 * @ClassName: Observer_test
 * @Description: 观察者模式
 * Java观察者模式是一种行为设计模式，它定义了一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖它的对象都会得到通知并自动更新。
 * 该模式适用于需要在对象间建立动态的、松散耦合的关系的场景，例如事件处理等。
 *
 * 观察者模式适用于以下场景：
 * 1.当一个对象的状态发生改变时，需要通知其他对象并更新它们的状态。
 * 2.当一个对象需要将自己的状态变化通知给其他对象，但是又不希望与这些对象之间产生紧密的耦合关系。
 * 3.当一个对象的改变需要同时改变其他对象的状态，而且不知道具体有多少对象需要改变。
 * 4.当一个对象的改变需要其他对象的协助，但是不希望这些对象与自己产生紧密的耦合关系。
 * 5.当一个对象的改变会引起一系列的连锁反应，而且这些连锁反应的具体实现不希望被该对象所知道。
 * 6.当一个对象需要向其他对象提供一种数据更新的方式，而且这种更新方式需要在不同的时间点通知不同的对象。
 *
 * @Version 1.0
 */
public class Observer_test {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display("display1");
        Display display2 = new Display("display2");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setMsg("今天天气晴朗");

        weatherStation.removeObserver(display1);

        weatherStation.setMsg("明天有雨");

    }
}
