import command.SimpleRemoteControl;
import invoker.Light;
import invoker.LightOnCommand;

public class ControlTest {
    public static void main(String[] args) {
        Light light1 = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light1);
        SimpleRemoteControl control = new SimpleRemoteControl(lightOnCommand);

        System.out.println(light1.getLightStatus());
        System.out.println("==========");
        control.pressButton();
        System.out.println(light1.getLightStatus());
    }
}
