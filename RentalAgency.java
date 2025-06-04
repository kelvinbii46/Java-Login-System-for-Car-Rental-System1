public class RentalAgency {
    public static void main(String[] args) {
        Car car1 = new Car("001", "Toyota");
        Customer cust1 = new Customer("C101", "Alice");

        cust1.displayCustomer();
        car1.displayInfo();

        car1.rentCar(); // Renting the car
        car1.displayInfo();

        car1.returnCar(); // Returning the car
        car1.displayInfo();
    }
}
