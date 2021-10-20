package Theater;

public class Screen {
    private boolean using;

    public Screen() {
        this.using = false;
    }

    public void on () {
        this.using = true;
    }

    public void off() {
        this.using = false;
    }

    public boolean isUsing() {
        return this.using;
    }
}
