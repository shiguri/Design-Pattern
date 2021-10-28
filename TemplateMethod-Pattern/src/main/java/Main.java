import drink.CoffeeWithHook;
import drink.TeaWithHook;

public class Main {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making coffee ...");
        coffeeWithHook.prepareRecipe();

        TeaWithHook teaWithHook = new TeaWithHook();
        System.out.println("Making tea ...");
        teaWithHook.prepareRecipe();
    }
}
