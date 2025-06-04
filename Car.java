public class Car {
    String carId;
    String model;
    boolean isAvailable;

    public Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " has been rented.");
        } else {
            System.out.println(model + " is not available.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println(model + " has been returned.");
    }

    public void displayInfo() {
        System.out.println("Car ID: " + carId + ", Model: " + model + ", Available: " + isAvailable);
    }
}
