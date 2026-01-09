package StructuralDesignPatterns.FacadePattern;

public class OrderService {
    public String getOrderDetails(String orderId) {
        return "Order details for the order id:" + orderId;
    }
}
