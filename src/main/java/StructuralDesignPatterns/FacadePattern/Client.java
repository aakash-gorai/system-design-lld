package StructuralDesignPatterns.FacadePattern;

public class Client {

    public static void main(String[] args) {
        APIGateway apiGateway = new APIGateway();
        apiGateway.getFullOrderDetails("123", "234", "345");
    }
}
