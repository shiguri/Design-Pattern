package Theater;

public class Light {
    private boolean isOn;
    public Light() {
        this.isOn = false;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean lightIsOn() {
        return this.isOn;
    }
}
