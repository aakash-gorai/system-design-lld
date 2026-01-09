package StructuralDesignPatterns.FacadePattern;

public class APIGateway {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public APIGateway() {
        userService = new UserService();
        orderService = new OrderService();
        paymentService = new PaymentService();
    }

    public void getFullOrderDetails(String userId, String orderId, String paymentId) {
        System.out.println(userService.getUserDetails(userId));
        System.out.println(orderService.getOrderDetails(orderId));
        System.out.println(paymentService.processPayment(paymentId));
    }
}
