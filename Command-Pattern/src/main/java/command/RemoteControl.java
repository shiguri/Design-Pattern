package command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    // 每个项均可以撤销之前的操作
    private Command[] undoCommands;

    public RemoteControl(int size){
        this.onCommands = new Command[size];
        this.offCommands = new Command[size];
        this.undoCommands = new Command[size];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < size; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
            undoCommands[i] = noCommand;
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
            undoCommands[slot] = onCommands[slot];
            onCommands[slot].execute();
        }
    }

    public void offButtonPressed(int slot) {
        if (slot >= 0 && slot < offCommands.length) {
            undoCommands[slot] = offCommands[slot];
            offCommands[slot].execute();
        }
    }

    public void undoButtonPressed(int slot) {
        if (slot >= 0 && slot < undoCommands.length) {
            undoCommands[slot].undo();
        }
    }
}
