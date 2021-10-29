package waitress;

import menu.MenuComponent;
import menu.MenuItem;

import java.util.Iterator;


public class Waitress {
    MenuComponent baseMenu;

    public Waitress(MenuComponent baseMenu) {
        this.baseMenu = baseMenu;
    }

    public void printMenu() {
        this.baseMenu.print();
    }

    public void printVegetarianItem() {
        System.out.println("Vegetarian : ......");
        Iterator<MenuComponent> iterator = baseMenu.createIterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();

            if (menuComponent instanceof MenuItem) {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }
        }
    }
}
