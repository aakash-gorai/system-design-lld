package BehaviourableDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private List<Observer> observerList;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observerList) {
            observer.update(temperature); //run time polymorphism
        }
    }
}
