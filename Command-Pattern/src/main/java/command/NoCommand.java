package command;

/**
 * NoCommand 什么都不做
 */
public class NoCommand implements Command{
    public void execute() {}
    public void undo() {}
}
