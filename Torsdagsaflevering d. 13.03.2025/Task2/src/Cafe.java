import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> CoffeeMenu = new ArrayList<>();
    public Cafe() {
        File menuList = new File("src/menu.txt");
        try{
            Scanner s = new Scanner(menuList);
            while (s.hasNextLine()) {
                CoffeeMenu.add(s.nextLine());
            }
            System.out.println("The menu has been successfully loaded!\n\nWhat would you like to order?");
        }catch (Exception e){
            System.out.println("Error loading the menu!\nError: " + e);
        }
    }

    public ArrayList<String> getMenu() {
        return CoffeeMenu;
    }
}
