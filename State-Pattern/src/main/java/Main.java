import state.GumballMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(25);

        System.out.println("input 'insert', 'eject', 'turned' and other string for exit ");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        while (validInput(line)) {
            switch (line) {
                case "insert" :
                    gumballMachine.insertQuarter();
                    break;
                case "eject" :
                    gumballMachine.ejectQuarter();
                    break;
                case "turned" :
                    gumballMachine.turnCrank();
                    System.out.println("remainder candies : " + gumballMachine.getCandyCount());
                    break;
                default:
                    break;
            }
            line = sc.nextLine().trim();
        }
    }

    private static boolean validInput(String s) {
        return s.equals("insert") || s.equals("eject") || s.equals("turned");
    }
}
