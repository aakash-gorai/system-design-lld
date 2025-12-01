package BehaviouralDesignPatterns.StrategyPattern;

public class UPI implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Paying through UPI payment");
    }
}
