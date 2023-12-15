package cn.lbo.learning.pattern.behavior.memento;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:25
 * @PackageName:cn.lbo.learning.pattern.behavior.memento
 * @ClassName: Caretaker
 * @Description: Caretaker类负责管理备忘录对象，它包含一个Memento对象。
 * @Version 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
