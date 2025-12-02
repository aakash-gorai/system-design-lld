package CreationalDesignPatterns.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Transport transport = TransportFactory.createTransport("car");
        transport.deliver();
    }
}
