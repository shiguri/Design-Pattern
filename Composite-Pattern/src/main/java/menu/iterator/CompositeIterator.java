package menu.iterator;

import menu.Menu;
import menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.stack = new Stack<>();
        stack.push(iterator);
    }

    public boolean hasNext() {
        // stack 为空，没有next，返回false
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                // 栈顶的迭代器没有next元素，弹栈后重新作 hasNext check。
                stack.pop();
                return hasNext();
            }
        }
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            // hasNext, 则一定有next
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                /**
                 * 如果是一个Menu，则把Menu的children的迭代器放到栈顶，之后作迭代。
                 *
                 * 注意， Head First 里的 这段代码是 stack.push(menuComponent.createIterator()),
                 * 添加 子CompositeIterator会导致Item被重复迭代。修正成childrenIterator()
                 */
                stack.push(menuComponent.childrenIterator());
            }

            return menuComponent;
        } else {
            return null;
        }
    }
}
