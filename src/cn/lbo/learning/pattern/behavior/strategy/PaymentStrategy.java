package cn.lbo.learning.pattern.behavior.strategy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:43
 * @PackageName:cn.lbo.learning.pattern.behavior.strategy
 * @ClassName: PaymentStrategy
 * @Description: TODO
 * @Version 1.0
 */
public interface PaymentStrategy {

    void pay(int amount);
}
