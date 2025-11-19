package SOLIDPrinciples.OpenClosePrincipleOCP;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor();
        PaymentMethod cc = new CreditCard();
        PaymentMethod dc = new DebitCard();
        PaymentMethod upi = new UPI();

        pp.processPayment(cc,234);
        pp.processPayment(dc, 232);
        pp.processPayment(upi, 343);
    }
}
