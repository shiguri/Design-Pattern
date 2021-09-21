package pazza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        setName("Chicago-Cheese-Pizza");
        setSauce("Plum Tomato");
    }

    @Override
    public void prepare() {
        System.out.println("get : " + getName() + "-" + getSauce());
    }
}
