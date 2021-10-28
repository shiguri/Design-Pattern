package resturant;

import resturant.iterator.Iterator;
import resturant.iterator.Menu;
import resturant.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu<MenuItem> {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();
        addItem("K&B", "xxx", true, 2.99);
        addItem("Regular Pancake", "xxx", false, 3.12);
        addItem("Blueberry Pancake", "xxx", true, 3.45);
        addItem("waffles", "xxx", true, 4.50);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        this.menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(this.menuItems);
    }
}
