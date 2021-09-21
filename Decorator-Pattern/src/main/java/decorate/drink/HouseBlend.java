package decorate.drink;

import decorate.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 0.89d;
    }
}
