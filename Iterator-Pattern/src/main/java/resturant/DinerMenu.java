package resturant;

import resturant.iterator.DinerMenuIterator;
import resturant.iterator.Iterator;
import resturant.iterator.Menu;

public class DinerMenu implements Menu<MenuItem>{
    private static final int size = 10;
    private int itemCount = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[size];

        addItem("Vegetarian BLT", "xxx", true, 2.99);
        addItem("BLT", "xxx", false, 1.99);
        addItem("hotDog", "xxx", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (this.itemCount < size) {
            menuItems[itemCount] = new MenuItem(name, description, vegetarian, price);
            itemCount++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
