// Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).

public class Car {
    
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarDetails() {
        if (price > 2000000) {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: ₹" + price);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Car car1 = new Car("BMW", "M5", 15000000); 
        Car car2 = new Car("Audi", "A8", 9000000);  
        Car car3 = new Car("Maruti Suzuki", "Swift", 600000);  
        Car car4 = new Car("Mercedes", "S-Class", 23000000); 
        Car car5 = new Car("Honda", "Civic", 1800000);  

        car1.displayCarDetails();
        car2.displayCarDetails();
        car4.displayCarDetails();
    }
}
