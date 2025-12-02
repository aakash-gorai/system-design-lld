package CreationalDesignPatterns.FactoryDesignPattern;

public class TransportFactory {
    public static Transport createTransport(String transportType) {
        switch(transportType.toLowerCase()) {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unsupported transport type");
        }
    }
}
