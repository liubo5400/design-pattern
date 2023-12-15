package cn.lbo.learning.pattern.behavior.state;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:09
 * @PackageName:cn.lbo.learning.pattern.behavior.state
 * @ClassName: Context
 * @Description: TODO
 * @Version 1.0
 */
public class Context {

    private State state;

    public void request(){
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }
}
