package subject;

import observer.Observer;
import java.util.ArrayList;

/**
 * 该观察者模式 采取 push 推送模式。
 */

public class Weather implements Subject{
    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public Weather() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        observers.forEach(o -> o.update(this.temperature, this.humidity, this.pressure));
    }

    public void measurementChange() {
        notifyObservers();
    }

    public void setMessage(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementChange();
    }
}
