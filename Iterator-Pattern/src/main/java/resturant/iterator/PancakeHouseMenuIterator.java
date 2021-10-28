package resturant.iterator;

import resturant.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private ArrayList<MenuItem> items;
    private int size;
    private int position;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.items = menuItems;
        this.size = menuItems.size();
        this.position = 0;
    }

    public boolean hasNext() {
        if (this.position >= this.size || items.get(this.position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem item = this.items.get(this.position);
        this.position++;
        return item;
    }
}
