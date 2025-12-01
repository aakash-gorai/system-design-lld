package BehaviouralDesignPatterns.ObserverPattern;

public class MobileDevice implements Observer {

    @Override
    public void update(float temp) {
        System.out.println("Temp in Mobile Device is = " + temp);
    }
}
