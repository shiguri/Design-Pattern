package pazza;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        setName("NY-Cheese-Pizza");
        setSauce("Marinara Sauce");
    }

    @Override
    public void prepare() {
        System.out.println("get : " + getName() + "-" + getSauce());
    }
}
