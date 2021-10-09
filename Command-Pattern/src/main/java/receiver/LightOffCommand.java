package receiver;

import command.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo() {
        // 获取先前状态
        boolean status = light.getLightFormStatus();

        light.setLightStatus(status);
    }

    public void setLight(Light light){
        this.light = light;
    }

    public Light getLight(){
        return this.light;
    }
}
