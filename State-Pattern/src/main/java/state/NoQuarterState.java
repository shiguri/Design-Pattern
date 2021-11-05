package state;

public class NoQuarterState implements State{
    private GumballMachine machine;

    /**
     * 每个State都要持有状态机的引用，以获取该状态机的其它State
     * @param gumballMachine
     */
    public NoQuarterState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        // 付钱后，machine 转移到 HasQuarterState 下
        machine.setCurrentState(machine.getHasQuarterState());
    }

    /**
     * 在这个状态下不合适的操作
     */
    public void ejectQuarter() {
        System.out.println("You haven't insert any quarter");
    }

    /**
     * 在这个状态下不合适的操作
     */
    public void turnCrank() {
        System.out.println("You need insert a quarter");
    }

    /**
     * 在这个状态下不合适的操作
     */
    public void dispense() {
        System.out.println("You need insert a quarter, then turning crank");
    }
}
