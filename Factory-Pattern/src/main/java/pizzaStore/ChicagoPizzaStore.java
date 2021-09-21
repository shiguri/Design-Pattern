package pizzaStore;

import pazza.ChicagoStyleCheesePizza;
import pazza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore() {}

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = new ChicagoStyleCheesePizza();
        type = type.toLowerCase();
        if (type.equals("tomato")) {
            pizza.setSauce("tomato");
        } else if (type.equals("whisky")) {
            pizza.setSauce("whisky");
        } else {
            pizza.setSauce("noSauce");
        }

        return pizza;
    }
}
