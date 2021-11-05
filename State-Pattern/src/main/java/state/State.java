package state;

// 状态接口，所有的状态实现该接口。
public interface State {
    //状态迁移动作
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
