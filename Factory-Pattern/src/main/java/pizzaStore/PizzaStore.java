package pizzaStore;

import pazza.Pizza;

/**
 * abstract Factory
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
        }

        return pizza;
    }

    /**
     * let subClass implement abstract method to create its Pizza
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
