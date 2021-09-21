package decorate.condiment;

import decorate.base.Beverage;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "-Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10d;
    }
}
