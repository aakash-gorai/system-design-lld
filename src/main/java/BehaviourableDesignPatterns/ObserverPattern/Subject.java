package BehaviourableDesignPatterns.ObserverPattern;

public interface Subject {
    public void detach(Observer obs);
    public void attach(Observer obs);
    public void notifyObserver();
}
