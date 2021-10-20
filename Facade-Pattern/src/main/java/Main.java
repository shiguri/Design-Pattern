import Theater.*;

public class Main {
    public static void main(String[] args) {
        Light light= new Light();
        Dvd dvd = new Dvd();
        Screen screen = new Screen();

        light.on();
        TheaterFacade theater = new HomeTheater(dvd, light, screen);

        System.out.println("============");
        System.out.println(light.lightIsOn() ? "light is on" : "light is off");
        System.out.println(screen.isUsing() ? "screen is on" : "screen is off" );
        if (dvd.isUsing()) {
            System.out.println("dvd is playing " + dvd.getMovieName());
        } else {
            System.out.println("dvd is off");
        }

        theater.watchMovie("悲惨世界");

        System.out.println("============");
        System.out.println(light.lightIsOn() ? "light is on" : "light is off");
        System.out.println(screen.isUsing() ? "screen is on" : "screen is off" );
        if (dvd.isUsing()) {
            System.out.println("dvd is playing " + dvd.getMovieName());
        } else {
            System.out.println("dvd is off");
        }

        theater.endMovie();

        System.out.println("============");
        System.out.println(light.lightIsOn() ? "light is on" : "light is off");
        System.out.println(screen.isUsing() ? "screen is on" : "screen is off" );
        if (dvd.isUsing()) {
            System.out.println("dvd is playing " + dvd.getMovieName());
        } else {
            System.out.println("dvd is off");
        }
    }
}
