package observer;

import subject.Subject;

public class WeatherChangeDisplay implements Observer, DisplayElement{
    double oldTemperature;
    double oldHumidity;
    double oldPressure;
    double currentTemperature;
    double currentHumidity;
    double currentPressure;
    Subject subject;

    public WeatherChangeDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("================");
        System.out.println("Weather Change : ");
        if (this.oldTemperature <= this.currentTemperature) {
            System.out.println("  temperature : + " + (currentTemperature - oldTemperature));
        } else {
            System.out.println("  temperature : - " + (oldTemperature - currentTemperature));
        }

        if (this.oldHumidity <= this.currentHumidity) {
            System.out.println("  humidity : + " + (currentHumidity - oldHumidity));
        } else {
            System.out.println("  humidity : - " + (oldHumidity - currentHumidity));
        }

        if (this.oldPressure <= this.currentPressure) {
            System.out.println("  pressure : + " + (currentPressure - oldPressure));
        } else {
            System.out.println("  pressure : - " + (oldPressure - currentPressure));
        }

        System.out.println("================");
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        // 更新旧值
        this.oldTemperature = this.currentTemperature;
        this.oldHumidity = this.currentHumidity;
        this.oldPressure = this.currentPressure;
        // 更新新值
        this.currentTemperature = temp;
        this.currentHumidity = humidity;
        this.currentPressure = pressure;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
