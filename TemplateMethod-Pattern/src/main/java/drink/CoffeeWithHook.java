package drink;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    public CoffeeWithHook() {}

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would want to add some condiments (y/n) ?");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
