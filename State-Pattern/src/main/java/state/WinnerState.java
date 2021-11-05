package state;

/**
 * WinnerState 下，会给用户发放两个糖果
 */
public class WinnerState implements State{
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you had insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, we can't refund since you had turned crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("please wait, we are giving you candies");
    }

    /**
     * 进入 Winner State时，确保至少存在两个糖果
     */
    @Override
    public void dispense() {
        machine.releaseACandy();
        machine.releaseACandy();

        if (machine.getCandyCount() > 0) {
            machine.setCurrentState(machine.getNoQuarterState());
        } else {
            machine.setCurrentState(machine.getSoldOutState());
        }
    }
}
