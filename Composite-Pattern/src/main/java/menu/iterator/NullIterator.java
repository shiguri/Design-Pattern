package menu.iterator;

import menu.MenuComponent;

import java.util.Iterator;

/**
 * 空迭代器
 */
public class NullIterator implements Iterator<MenuComponent> {
    public boolean hasNext() {
        return false;
    }

    public MenuComponent next() {
        return null;
    }
}
