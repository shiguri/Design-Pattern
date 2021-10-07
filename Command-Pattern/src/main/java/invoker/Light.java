package invoker;

public class Light {
    private boolean lightIsOn;

    public Light() {
        lightIsOn = false;
    }

    public void on() {
        lightIsOn = true;
    }

    public void off() {
        lightIsOn = false;
    }

    public String getLightStatus() {
        return "light is " + (lightIsOn ? "on" : "off") + " .";
    }
}
