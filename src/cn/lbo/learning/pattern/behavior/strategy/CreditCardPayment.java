package cn.lbo.learning.pattern.behavior.strategy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:44
 * @PackageName:cn.lbo.learning.pattern.behavior.strategy
 * @ClassName: CreditCardPayment
 * @Description: TODO
 * @Version 1.0
 */
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String cardNumber, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
