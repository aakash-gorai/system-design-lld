package StructuralDesignPatterns.FacadePattern;

public class PaymentService {
    public String processPayment(String paymentId) {
        return "Processing payment  for the payment id:" + paymentId;
    }
}
