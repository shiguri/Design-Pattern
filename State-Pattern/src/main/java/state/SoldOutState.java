package state;

public class SoldOutState implements State{
    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    /**
     * 处于 SoldOut 状态下，所有的操作都是无效操作。
     */

    public void insertQuarter() {
        System.out.println("candy has sold out");
    }

    public void ejectQuarter() {
        System.out.println("no quarter to return");
    }

    public void turnCrank() {
        System.out.println("candy has sold out");
    }

    public void dispense() {
        System.out.println("candy has sold out");
    }
}
