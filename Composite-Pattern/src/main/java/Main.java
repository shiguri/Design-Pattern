import menu.Menu;
import menu.MenuComponent;
import menu.MenuItem;
import menu.iterator.CompositeIterator;
import waitress.Waitress;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent baseMenu = new Menu("AllMenu", "base menu");

        baseMenu.add(pancakeHouseMenu);
        baseMenu.add(dinerMenu);
        baseMenu.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("egg", "xxx", false, 1.50));
        pancakeHouseMenu.add(new MenuItem("pancake", "xxx", true, 2.10));
        pancakeHouseMenu.add(new MenuItem("blueBerryPancake", "xxx", true, 3.23));

        dinerMenu.add(new MenuItem("Pasta", "xxx", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("ice-cream", "xxx", false, 2.00));
        dessertMenu.add(new MenuItem("strawberry", "xxx", true, 1.20));

        cafeMenu.add(new MenuItem("blackCafe", "xxx", false, 2.50));
        Waitress waitress = new Waitress(baseMenu);

        waitress.printMenu();

        System.out.println("===============");

        waitress.printVegetarianItem();
    }
}
