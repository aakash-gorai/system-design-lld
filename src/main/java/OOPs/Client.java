package OOPs;

public class Client {

    public static void main(String[] args) {

        PaymentService ps = new PaymentService();
        ps.addPayment("credit card", new CreditCard("123", "abc"));
        ps.makePayment("credit card");
        ps.addPayment("wallet", new Wallet());
        ps.makePayment("wallet");
    }
}
