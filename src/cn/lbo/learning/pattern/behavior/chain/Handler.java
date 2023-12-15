package cn.lbo.learning.pattern.behavior.chain;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:04
 * @PackageName:cn.lbo.learning.pattern.behavior.chain
 * @ClassName: Handler
 * @Description: TODO
 * @Version 1.0
 */
public interface Handler {

    Handler setNextHandler(Handler nextHandler);

    void handle(String request);
}
