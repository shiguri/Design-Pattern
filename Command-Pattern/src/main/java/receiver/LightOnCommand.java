package receiver;

import command.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo(){
        boolean status = light.getLightFormStatus();
        light.setLightStatus(status);
    }

    public Light getLight(){
        return this.light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
