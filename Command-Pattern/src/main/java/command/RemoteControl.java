package command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(int size){
        this.onCommands = new Command[size];
        this.offCommands = new Command[size];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < size; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= 0 && slot < onCommands.length) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void onButtonPressed(int slot){
        if (slot >= 0 && slot < onCommands.length) {
            onCommands[slot].execute();
        }
    }

    public void offButtonPressed(int slot) {
        if (slot >= 0 && slot < offCommands.length) {
            offCommands[slot].execute();
        }
    }
}
