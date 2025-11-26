package BehaviourableDesignPatterns.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer mobileDevice = new MobileDevice();
        Observer displayDevice = new DisplayDevice();

        weatherStation.attach(mobileDevice);
        weatherStation.attach(displayDevice);

        weatherStation.setTemperature(3.4F);

        weatherStation.detach(mobileDevice);

        weatherStation.setTemperature(5.4F);
    }
}
