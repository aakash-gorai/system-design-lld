package BehaviouralDesignPatterns.ObserverPattern;

public class DisplayDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Temp in Display Device = " + temp);
    }
}
