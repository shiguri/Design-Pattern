package decorate.condiment;

import decorate.base.Beverage;

public class Mocha extends CondimentDecorator{
    // 被装饰的对象
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20d;
    }
}
