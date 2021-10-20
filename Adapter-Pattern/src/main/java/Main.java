import duck.Duck;
import duck.MallardDuck;
import duck.TurkeyAdapter;
import turkey.Turkey;
import turkey.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        System.out.println("============");
        duck.quack();
        duck.fly();
        System.out.println("============");

        // 使用turkey 构造一个 duckAdapter
        duck = new TurkeyAdapter(turkey);
        System.out.println("============");
        duck.quack();
        duck.fly();
        System.out.println("============");
    }
}
