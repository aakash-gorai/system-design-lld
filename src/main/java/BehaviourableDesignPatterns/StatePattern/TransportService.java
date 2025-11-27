package BehaviourableDesignPatterns.StatePattern;

public class TransportService {
    TransportMode transportMode;

    TransportService(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public int getETA() {
        return transportMode.calcETA();
    }

    public void getDirections() {
        transportMode.getDirections();
    }
}
