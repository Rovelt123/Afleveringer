public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
}


class Chef extends Customer {
    Chef(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
    }
}