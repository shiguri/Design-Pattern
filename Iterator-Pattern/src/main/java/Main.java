import resturant.DinerMenu;
import resturant.MenuItem;
import resturant.PancakeHouseMenu;
import resturant.Waitress;
import resturant.iterator.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        List<Menu<MenuItem>> menus = new ArrayList<Menu<MenuItem>>();
        menus.add(dinerMenu);
        menus.add(pancakeHouseMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenus();
    }
}
