public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;
    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    public String toString() {
        return "\nCustomer: " + firstName + " " + lastName + " \nUsername: " + userName + "\nID: " + id;
    }
}
