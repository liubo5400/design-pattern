package cn.lbo.learning.pattern.behavior.template;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:14
 * @PackageName:cn.lbo.learning.pattern.behavior.template
 * @ClassName: Football
 * @Description: TODO
 * @Version 1.0
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
