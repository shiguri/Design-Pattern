package receiver;

import command.Command;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute(){
        this.stereo.on();
    }

    public void undo() {
        boolean status = stereo.getFormStereoStatus();
        stereo.setStereoStatus(status);
    }

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
    }
}
