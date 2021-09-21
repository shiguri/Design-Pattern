import decorate.base.Beverage;
import decorate.condiment.Mocha;
import decorate.condiment.Soy;
import decorate.condiment.Whip;
import decorate.drink.Decaf;
import decorate.drink.Espresso;
import decorate.drink.HouseBlend;

public class Main {
    public static void main(String[] args) {
        Beverage drink1 = new Decaf();
        System.out.println(drink1.getDescription());
        System.out.println(drink1.cost());
        System.out.println("=============");

        Beverage drink2 = new Espresso();
        drink2 = new Mocha(drink2);
        drink2 = new Soy(drink2);
        System.out.println(drink2.getDescription());
        System.out.println(drink2.cost());
        System.out.println("=============");

        Beverage drink3 = new HouseBlend();
        drink3 = new Mocha(drink3);
        drink3 = new Soy(drink3);
        drink3 = new Whip(drink3);
        System.out.println(drink3.getDescription());
        System.out.println(drink3.cost());
        System.out.println("=============");
    }
}
