package resturant;

import resturant.iterator.Iterator;
import resturant.iterator.Menu;

import java.util.List;

public class Waitress {
    List<Menu<MenuItem>> menus;

    public Waitress(List<Menu<MenuItem>> menus) {
        this.menus = menus;
    }

    public void addMenu(Menu<MenuItem> menu) {
        this.menus.add(menu);
    }

    public void printMenus() {
        for (int i = 0; i < this.menus.size(); i++) {
            Iterator<MenuItem> iterator = this.menus.get(i).createIterator();
            printMenu(iterator);
            System.out.println("----------------");
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + " : " + item.getDescription() + " : " +
                    item.getPrice() + " | " + (item.isVegetarian() ? "vegetable" : " not vegetable") );
        }
    }

}
