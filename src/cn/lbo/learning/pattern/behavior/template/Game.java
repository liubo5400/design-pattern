package cn.lbo.learning.pattern.behavior.template;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:13
 * @PackageName:cn.lbo.learning.pattern.behavior.template
 * @ClassName: Game
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
