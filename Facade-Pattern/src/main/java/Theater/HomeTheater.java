package Theater;

public class HomeTheater implements TheaterFacade{
    private Dvd dvd;
    private Light light;
    private Screen screen;

    public HomeTheater(Dvd dvd, Light light, Screen screen) {
        this.dvd = dvd;
        this.light = light;
        this.screen = screen;
    }

    public void watchMovie(String MovieName) {
        light.off();
        screen.on();
        if (! dvd.isUsing()) {
            dvd.on();
        }
        dvd.play(MovieName);
    }

    public void endMovie() {
        dvd.off();
        screen.off();
        light.on();
    }
}
