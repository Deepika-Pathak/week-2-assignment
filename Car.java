//Create Multiple Objects Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.

public class Car {
    String brand;
    int year;
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);
        car1.displayDetails();
        car2.displayDetails();
    }
}

