package duck;

import flyBehavior.FlyBehavior;
import quackBehavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void swim();
    public abstract void display();
    public abstract void performFly();
    public abstract void performQuack();
}
