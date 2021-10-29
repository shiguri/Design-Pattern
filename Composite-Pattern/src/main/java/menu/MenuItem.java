package menu;

import menu.iterator.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    /**
     * Item 没有子组件，返回一个空迭代器。
     * @return
     */
    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
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
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(" : ");
        stringBuilder.append(this.description);
        stringBuilder.append(" : ");
        stringBuilder.append(this.price);
        stringBuilder.append(" | ");
        stringBuilder.append(this.vegetarian ? "vegetable" : "not vegetable");
        System.out.println(stringBuilder.toString());
    }
}
