package state;

import state.*;

public class GumballMachine {
    /**
     *
     */
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    /**
     * currentState 表示状态机当前的状态
     */
    private State currentState;
    private int candyCount;

    public GumballMachine(int candyCount) {
        this.candyCount = candyCount;

        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        /**
         * Init后，若 count > 0, 则初始状态是 noQuarterState, 否则是 soldOutState.
         */
        this.currentState = this.soldOutState;
        if (candyCount > 0) {
            this.currentState = this.noQuarterState;
        }
    }

    public void insertQuarter() {
        this.currentState.insertQuarter();
    }

    public void ejectQuarter() {
        this.currentState.ejectQuarter();
    }

    public void turnCrank() {
        this.currentState.turnCrank();
        /**
         * State 的 dispense 是一个内部动作，不向用户开放调用
         */
        this.currentState.dispense();
    }

    protected void setCurrentState(State state) {
        this.currentState = state;
    }

    /**
     * 调用该方法时，需确保machine的count > 0.
     */
    protected void releaseACandy() {
        System.out.println("A candy comes rolling out !!!");
        this.candyCount = this.candyCount - 1;
    }

    /**
     * 所有可能状态的访问器
     * @return
     */
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {return winnerState;}

    public int getCandyCount() {
        return this.candyCount;
    }
}
