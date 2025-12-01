package BehaviouralDesignPatterns.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCard();
        PaymentStrategy upi = new UPI();

        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(creditCard);
        paymentService.pay();

        paymentService.setPaymentStrategy(upi);
        paymentService.pay();
    }
}
