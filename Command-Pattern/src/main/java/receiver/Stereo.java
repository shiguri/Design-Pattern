package receiver;

public class Stereo {
    private boolean isStereoOn;
    private int volume;

    public Stereo(){
        this.isStereoOn = false;
        this.volume = 10;
    }

    public void on(){
        this.isStereoOn = true;
    }

    public void off(){
        this.isStereoOn = false;
    }

    public String getStereoStatus() {
        return "Stereo is " + (isStereoOn ? "playing" : "not playing") + " and volume is " +
                this.volume;
    }
}
