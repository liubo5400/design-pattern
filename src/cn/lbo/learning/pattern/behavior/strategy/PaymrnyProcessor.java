package cn.lbo.learning.pattern.behavior.strategy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:45
 * @PackageName:cn.lbo.learning.pattern.behavior.strategy
 * @ClassName: PaymrnyProcessor
 * @Description: TODO
 * @Version 1.0
 */
public class PaymrnyProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymrnyProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
