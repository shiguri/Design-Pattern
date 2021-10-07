package command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(Command command) {
        this.slot = command;
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        this.slot.execute();
    }
}
