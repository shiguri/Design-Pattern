import observer.CurrentConditionDisplay;
import observer.DisplayElement;
import observer.Observer;
import observer.WeatherChangeDisplay;
import subject.Subject;
import subject.Weather;

import java.util.Random;

public class Main {
    /*
    public static void main(String[] args) {
        Subject weatherSubject = new Weather();
        Observer currentInfo = new CurrentConditionDisplay(weatherSubject);
        Observer changeInfo = new WeatherChangeDisplay(weatherSubject);

        // 显示类型转换 父类 -> 子类
        Weather weatherData = (Weather) weatherSubject;
        DisplayElement currentDisplay = (DisplayElement) currentInfo;
        DisplayElement changeDisplay = (DisplayElement) changeInfo;


        int times = 5;
        for (int i = 0; i < times; i++) {
            Random random = new Random();
            double temperature = random.nextDouble();
            double humidity = random.nextDouble();
            double pressure = random.nextDouble();

            weatherData.setMessage(temperature, humidity, pressure);
            System.out.printf("第%s次 : ", i + 1);
            currentDisplay.display();
            changeDisplay.display();
        }
    }

     */
    public static void main(String[] args) {
        Weather weather = new Weather();
        CurrentConditionDisplay currentInfo = new CurrentConditionDisplay(weather);
        WeatherChangeDisplay changeInfo = new WeatherChangeDisplay(weather);

        int times = 5;
        for (int i = 0; i < times; i++) {
            Random random = new Random();
            double temperature = random.nextDouble();
            double humidity = random.nextDouble();
            double pressure = random.nextDouble();

            weather.setMessage(temperature, humidity, pressure);
            System.out.printf("第%s次 : ", i + 1);
            currentInfo.display();
            changeInfo.display();
        }
    }
}
