package decorate.drink;

import decorate.base.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 0.99d;
    }
}
