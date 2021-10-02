import factory.ChicagoPizzaIngredientFactory;
import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory factory;
        Dough dough;
        Sauce sauce;
        Cheese cheese;

        factory = new NYPizzaIngredientFactory();
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();

        System.out.println(dough.getInfo());
        System.out.println(sauce.getInfo());
        System.out.println(cheese.getInfo());

        System.out.println("================");

        factory = new ChicagoPizzaIngredientFactory();
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();

        System.out.println(dough.getInfo());
        System.out.println(sauce.getInfo());
        System.out.println(cheese.getInfo());
    }
}
