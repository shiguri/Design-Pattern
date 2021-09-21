import pazza.Pizza;
import pizzaStore.ChicagoPizzaStore;
import pizzaStore.NYPizzaStore;
import pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        PizzaStore pizzaStore2 = new NYPizzaStore();

        Pizza pizza1 = pizzaStore2.orderPizza("tomato");
        Pizza pizza2 = pizzaStore1.orderPizza("whisky");
        Pizza pizza3 = pizzaStore1.orderPizza("");
        Pizza pizza4 = pizzaStore2.orderPizza("");
    }
}
