package BehaviourableDesignPatterns.StrategyPattern;

public class PaymentService {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        paymentStrategy.processPayment();
    }
}
