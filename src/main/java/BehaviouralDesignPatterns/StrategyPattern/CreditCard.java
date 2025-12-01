package BehaviouralDesignPatterns.StrategyPattern;

public class CreditCard implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Paying through credit card");
    }
}
