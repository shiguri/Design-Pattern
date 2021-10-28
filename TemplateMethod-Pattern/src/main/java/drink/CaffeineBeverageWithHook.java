package drink;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourIntoCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourIntoCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 用于控制的钩子，子类可以选择覆盖这个方法，这里提供一个默认实现。
     * @return
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
}
