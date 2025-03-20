import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Andreas", "Rovelt", "Rovelt123"));
        customers.add(new Customer("Freja", "Kristoffersen", "Frejapop"));
        customers.add(new Customer("Vikthor", "Andersen", "Vikk"));
        customers.add(new Chef("Alexander", "Rovelt", "Roveltus"));
        printCustomers(customers);
    }


    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}