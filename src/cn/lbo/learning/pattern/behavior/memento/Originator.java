package cn.lbo.learning.pattern.behavior.memento;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:23
 * @PackageName:cn.lbo.learning.pattern.behavior.memento
 * @ClassName: Originator
 * @Description: Originator类表示原始对象，它包含需要保存的状态。
 * @Version 1.0
 */
public class Originator {

    private String state;

    // createMemento()方法创建备忘录对象，并将当前状态保存到备忘录对象中。
    public Memento createMemento(){
        return new Memento(this.state);
    }

    // restore()方法用于从备忘录对象中恢复先前的状态。
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
