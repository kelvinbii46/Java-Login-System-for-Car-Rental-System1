public class Customer {
    String customerId;
    String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId + ", Name: " + name);
    }
}
