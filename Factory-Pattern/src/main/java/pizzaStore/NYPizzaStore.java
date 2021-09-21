package pizzaStore;

import pazza.NYStyleCheesePizza;
import pazza.Pizza;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore() {}

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = new NYStyleCheesePizza();
        type = type.toLowerCase();
        if (type.equals("tomato")) {
            pizza.setSauce("tomato");
        } else if(type.equals("gravy")) {
            pizza.setSauce("gravy");
        } else {
            pizza.setSauce("noSauce");
        }

        return pizza;
    }
}
