package BehaviouralDesignPatterns.StatePattern;

public class Train implements TransportMode {
    @Override
    public int calcETA() {
        return 1;
    }

    @Override
    public void getDirections() {
        System.out.println("Turn right");
    }
}
