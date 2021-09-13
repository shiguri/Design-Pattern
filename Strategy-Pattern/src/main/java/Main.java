import duck.*;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[4];
        ducks[0] = new MallardDuck();
        ducks[1] = new RedheadDuck();
        ducks[2] = new RubberDuck();
        ducks[3] = new DecoyDuck();

        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performQuack();

            System.out.println("===========");
        }
    }
}
