package BehaviourableDesignPatterns.StatePattern;

public class Car implements TransportMode {

    @Override
    public int calcETA() {
        return 5;
    }

    @Override
    public void getDirections() {
        System.out.println("Turn left");
    }
}
