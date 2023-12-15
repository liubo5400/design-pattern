package cn.lbo.learning.pattern.behavior.strategy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:44
 * @PackageName:cn.lbo.learning.pattern.behavior.strategy
 * @ClassName: PayPalPayment
 * @Description: TODO
 * @Version 1.0
 */
public class PayPalPayment implements PaymentStrategy {

    private String email;

    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal支付了" + amount + "元");
    }
}
