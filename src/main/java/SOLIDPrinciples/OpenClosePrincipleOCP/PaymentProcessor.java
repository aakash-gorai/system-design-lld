package SOLIDPrinciples.OpenClosePrincipleOCP;

public class PaymentProcessor {
    public void processPayment(PaymentMethod pm, double amount) {
        pm.pay(amount);
    }
}
