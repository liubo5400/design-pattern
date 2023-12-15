package cn.lbo.learning.pattern.behavior.memento;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:24
 * @PackageName:cn.lbo.learning.pattern.behavior.memento
 * @ClassName: Memento
 * @Description: Memento类表示备忘录对象，它包含需要保存的状态。
 * @Version 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
