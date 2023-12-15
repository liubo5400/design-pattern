package cn.lbo.learning.pattern.behavior.strategy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:43
 * @PackageName:cn.lbo.learning.pattern.behavior.strategy
 * @ClassName: Strategy_test
 * @Description: 策略模式
 * 策略模式是一种行为型设计模式，它允许您定义一系列算法，将每个算法封装起来，并使它们可以互换使用。
 * 这种模式使得算法可以独立于使用它们的客户端而变化。
 * @Version 1.0
 */
public class Strategy_test {

    public static void main(String[] args) {
        PaymrnyProcessor paymrnyProcessor = new PaymrnyProcessor(new CreditCardPayment("123456789", "123", "123"));
        paymrnyProcessor.pay(100);

        paymrnyProcessor.setPaymentStrategy(new PayPalPayment("xxxxx", "916eg5f"));
        paymrnyProcessor.pay(20);
    }
}
