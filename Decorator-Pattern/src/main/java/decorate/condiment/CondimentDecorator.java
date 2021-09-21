package decorate.condiment;

import decorate.base.Beverage;

/**
 * 继承的目的是让 CondimentDecorator 都获得 Beverage 类型，实现多态行为。
 */
public abstract class CondimentDecorator extends Beverage {
    //所有的装饰类必须重新实现 getDescription()方法。
    public abstract String getDescription();
}
