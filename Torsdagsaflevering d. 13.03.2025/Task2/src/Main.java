import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cafe myCafe = new Cafe();
        //ArrayList<String> menu = myCafe.getMenu(); // Kunne godt lave det som et variable
        for (String Option : myCafe.getMenu()) {
            System.out.println(Option);
        }
    }
}