package BehaviourableDesignPatterns.StatePattern;

public class Client {
    public static void main(String[] args) {
        TransportService transportService = new TransportService(new Walking());
        System.out.println(transportService.getETA());
        transportService.getDirections();

        transportService.setTransportMode(new Car());
        System.out.println(transportService.getETA());
        transportService.getDirections();
    }
}
