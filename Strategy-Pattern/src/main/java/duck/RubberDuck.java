package duck;

import flyBehavior.FlyNoWay;
import quackBehavior.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Squeak();
    }

    @Override
    public void swim() {
        System.out.println("会游泳");
    }

    @Override
    public void display() {
        System.out.println("这是一只橡皮鸭");
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
