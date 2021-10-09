package receiver;

public class Stereo {
    private boolean isStereoOn;
    private int volume;

    private boolean formStereoStatus;
    private int formVolume;

    public Stereo(){
        this.isStereoOn = false;
        this.volume = 10;
    }

    public void on(){
        this.setFormStereoStatus(false);
        this.isStereoOn = true;
    }

    public void off(){
        this.setFormStereoStatus(true);
        this.isStereoOn = false;
    }

    public void setStereoStatus(boolean status) {
        this.isStereoOn = status;
    }

    public void setFormStereoStatus(boolean status) {
        this.formStereoStatus = status;
    }

    public void setFormVolume(int volume) {
        this.formVolume = volume;
    }

    public boolean getFormStereoStatus() {
        return this.formStereoStatus;
    }

    public int getFormVolume() {
        return this.formVolume;
    }

    public String getStereoStatus() {
        return "Stereo is " + (isStereoOn ? "playing" : "not playing") + " and volume is " +
                this.volume;
    }
}
