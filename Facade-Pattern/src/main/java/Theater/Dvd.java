package Theater;

public class Dvd {
    private boolean using;
    private String movieName;

    public Dvd() {
        this.using = false;
        movieName = "";
    }

    public void on() {
        this.using = true;
    }

    public void off() {
        this.movieName = "";
        this.using = false;
    }

    public void play(String movieName) {
        if (this.using) {
            this.movieName = movieName;
        }
    }

    public boolean isUsing() {
        return this.using;
    }

    public String getMovieName() {
        return this.movieName;
    }
}
