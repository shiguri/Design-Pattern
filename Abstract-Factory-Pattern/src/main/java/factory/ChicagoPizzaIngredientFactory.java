package factory;

import ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ChiDough();
    }

    public Sauce createSauce() {
        return new ChiSauce();
    }

    public Cheese createCheese() {
        return new ChiCheese();
    }
}
