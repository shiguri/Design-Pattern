package duck;

import flyBehavior.FlyWithWings;
import quackBehavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("会游泳");
    }

    @Override
    public void display() {
        System.out.println("这是一只绿头鸭");
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
