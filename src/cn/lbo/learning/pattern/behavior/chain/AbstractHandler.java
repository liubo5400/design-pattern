package cn.lbo.learning.pattern.behavior.chain;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:05
 * @PackageName:cn.lbo.learning.pattern.behavior.chain
 * @ClassName: AbstractHandler
 * @Description: 创建抽象处理器类
 * @Version 1.0
 */
public abstract class AbstractHandler implements Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    @Override
    public abstract void handle(String request);


}
