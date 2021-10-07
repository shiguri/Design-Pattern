package invoker;

import command.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public Light getLight(){
        return this.light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
