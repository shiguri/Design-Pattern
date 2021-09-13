package duck;

import flyBehavior.FlyWithWings;
import quackBehavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("会游泳");
    }

    @Override
    public void display() {
        System.out.println("这是一只红头鸭");
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
