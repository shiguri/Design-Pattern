package observer;

import subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        // 设置自己的观察主题
        this.subject = subject;
        // 被观察的主题要增加 观测者
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("-------------");
        System.out.println("CurrentCondition : ");
        System.out.println("  temperature : " + temperature);
        System.out.println("  humidity : " + humidity);
        System.out.println("  pressure : " + pressure);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
