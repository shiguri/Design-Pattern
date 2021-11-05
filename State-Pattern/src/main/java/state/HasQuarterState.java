package state;

import java.util.Random;

public class HasQuarterState implements State{
    private GumballMachine machine;
    private Random random;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
        this.random = new Random(System.currentTimeMillis());
    }

    /**
     * 这是这个状态下，一个不合适的动作。
     */
    public void insertQuarter() {
        System.out.println("You have already inserted a quarter");
    }

    public void ejectQuarter() {
        System.out.println("quarter returned");
        // 退钱后，machine 回到 NoQuarterState
        machine.setCurrentState(machine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned crank");
        int number = random.nextInt(10);
        if (number == 0 && machine.getCandyCount() >= 2) {
            machine.setCurrentState(machine.getWinnerState());
        } else {
            machine.setCurrentState(machine.getSoldState());
        }
    }

    /**
     * 这是这个状态下，一个不合适的动作。
     */
    public void dispense() {
        System.out.println("you need to turn crank for a candy");
    }
}
