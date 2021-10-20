package duck;

import turkey.Turkey;

/**
 * 使用 Turkey 来适配 Duck
 * 采取组合的方式
 */
public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        this.turkey.gobble();
    }

    public void fly() {
        this.turkey.fly();
    }
}
