package drink;

public class TeaWithHook extends CaffeineBeverageWithHook{
    public TeaWithHook() {}

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
