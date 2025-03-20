//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Kristoffer", "Kristoffersen", "kristoffersen");
        Customer myCustomer = new Customer("Freja", "Kristoffersen", "frejapop");
        String firstname = myCustomer.getFirstName();
        String lastname = myCustomer.getLastName();
        String username = myCustomer.getUsername();
        System.out.println("Hello " + firstname + " " + lastname + "!");
        System.out.println("Your username is " + username + ".");

        System.out.println("Hello chef " + chef.getFirstName() + " " + chef.getLastName() + "!");
    }
}
