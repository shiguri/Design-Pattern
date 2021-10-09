package receiver;

public class Light {
    private boolean lightIsOn;
    private boolean lightFormStatus;

    public Light() {
        lightIsOn = false;
    }

    public void on() {
        setLightFormStatus(false);
        lightIsOn = true;
    }

    public void off() {
        setLightFormStatus(true);
        lightIsOn = false;
    }

    public void setLightFormStatus(boolean status) {
        this.lightFormStatus = status;
    }

    public void setLightStatus(boolean status) {
        this.lightIsOn = status;
    }

    public boolean getLightFormStatus() {
        return this.lightFormStatus;
    }

    public String getLightStatus() {
        return "light is " + (lightIsOn ? "on" : "off") + " .";
    }
}
