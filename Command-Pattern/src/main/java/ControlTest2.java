import command.RemoteControl;
import receiver.*;

public class ControlTest2 {
    public static void main(String[] args) {
        Light light1 = new Light();
        Light light2 = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand light1_OnCommand = new LightOnCommand(light1);
        LightOnCommand light2_OnCommand = new LightOnCommand(light2);
        StereoOnCommand stereo_OnCommand = new StereoOnCommand(stereo);

        LightOffCommand light1_OffCommand = new LightOffCommand(light1);
        LightOffCommand light2_OffCommand = new LightOffCommand(light2);
        StereoOffCommand stereo_OffCommand = new StereoOffCommand(stereo);

        RemoteControl remoteControl = new RemoteControl(3);
        remoteControl.setCommand(0, light1_OnCommand, light1_OffCommand);
        remoteControl.setCommand(1, light2_OnCommand, light2_OffCommand);
        remoteControl.setCommand(2, stereo_OnCommand, stereo_OffCommand);

        System.out.println("=======");
        System.out.println(light1.getLightStatus());
        System.out.println(light2.getLightStatus());
        System.out.println(stereo.getStereoStatus());

        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);

        System.out.println("=======");
        System.out.println(light1.getLightStatus());
        System.out.println(light2.getLightStatus());
        System.out.println(stereo.getStereoStatus());

        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.onButtonPressed(2);

        System.out.println("=======");
        System.out.println(light1.getLightStatus());
        System.out.println(light2.getLightStatus());
        System.out.println(stereo.getStereoStatus());

        remoteControl.undoButtonPressed(0);
        remoteControl.undoButtonPressed(2);

        System.out.println("=======");
        System.out.println(light1.getLightStatus());
        System.out.println(light2.getLightStatus());
        System.out.println(stereo.getStereoStatus());
    }
}
