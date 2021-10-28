package resturant.iterator;

import resturant.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem>{
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.position = 0;
    }

    public boolean hasNext() {
        if (this.position >= this.menuItems.length || this.menuItems[this.position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem item = this.menuItems[this.position];
        this.position++;
        return item;
    }
}
