package BehaviourableDesignPatterns.StatePattern;

public class Walking implements TransportMode{
    @Override
    public int calcETA() {
        return 10;
    }

    @Override
    public void getDirections() {
        System.out.println("Turn Right");
    }
}
