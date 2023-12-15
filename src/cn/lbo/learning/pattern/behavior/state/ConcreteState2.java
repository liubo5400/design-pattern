package cn.lbo.learning.pattern.behavior.state;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:09
 * @PackageName:cn.lbo.learning.pattern.behavior.state
 * @ClassName: ConcreteState2
 * @Description: 具体状态类2
 * @Version 1.0
 */
public class ConcreteState2 implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteState2 is handling");
    }
}
