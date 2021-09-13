package duck;

import flyBehavior.FlyNoWay;
import quackBehavior.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void swim() {
        System.out.println("会游泳");
    }

    @Override
    public void display() {
        System.out.println("这是一只诱饵鸭");
    }

    @Override
    public void performFly() {
        super.flyBehavior.fly();
    }

    @Override
    public void performQuack() {
        super.quackBehavior.quack();
    }
}
