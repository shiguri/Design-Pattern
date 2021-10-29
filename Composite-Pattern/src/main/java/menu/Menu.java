package menu;

import menu.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
    private List<MenuComponent> children;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.children = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent component) {
        this.children.add(component);
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < this.children.size()) {
            this.children.remove(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void remove(MenuComponent component) {
        this.children.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return this.children.get(index);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        /**
         * 创建一个组合迭代器，传入 children的list迭代器。
         */
        return new CompositeIterator(childrenIterator());
    }

    @Override
    public Iterator<MenuComponent> childrenIterator() {
        return children.iterator();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("menu : ");
        stringBuilder.append(this.name);
        stringBuilder.append(" : ");
        stringBuilder.append(this.description);
        System.out.println(stringBuilder.toString());

        Iterator<MenuComponent> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }
    }
}
