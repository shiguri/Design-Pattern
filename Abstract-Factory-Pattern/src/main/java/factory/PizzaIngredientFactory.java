package factory;

import ingredient.Cheese;
import ingredient.Dough;
import ingredient.Sauce;

/**
 * pizza 原料抽象工厂接口
 * 用来创建相关的对象的族。
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}
