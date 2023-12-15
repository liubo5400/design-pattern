package cn.lbo.learning.pattern.behavior.memento;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:23
 * @PackageName:cn.lbo.learning.pattern.behavior.memento
 * @ClassName: Memento_test
 * @Description: 备忘录模式
 * Java备忘录模式是一种行为设计模式，它允许在不破坏封装性的情况下捕获和恢复对象的内部状态。
 * 备忘录模式通常用于需要撤销操作或恢复先前状态的情况下。
 * 该模式包括三个主要组件：原始对象、备忘录对象和负责管理备忘录对象的对象。
 * @Version 1.0
 */
public class Memento_test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 保存原始对象的状态到备忘录对象中
        originator.setState("State 1");
        caretaker.setMemento(originator.createMemento());
        // 修改原始对象的状态
        originator.setState("State 2");
        // 从备忘录对象中恢复先前的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Current state: " + originator.getState());

    }
}
