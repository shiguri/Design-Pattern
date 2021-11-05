package state;

public class SoldState implements State{
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("please wait, we are giving a candy");
    }

    public void ejectQuarter() {
        System.out.println("sorry, we can't refund since the crank has been turned");
    }

    public void turnCrank() {
        System.out.println("you had turned crank just now");
    }

    public void dispense() {
        // 首先释放一个 candy, machine 设计确保进入 SoldState 前一定至少剩余一个 candy, 即 candyCount > 0
        machine.releaseACandy();
        if (machine.getCandyCount() > 0) {
            // 还有糖果，迁移至未投币的状态
            machine.setCurrentState(machine.getNoQuarterState());
        } else {
            // 没有糖果，迁移至 SoldOutState
            machine.setCurrentState(machine.getSoldOutState());
        }
    }
}
