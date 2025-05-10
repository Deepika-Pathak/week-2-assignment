//Product Discount Calculator Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.

public class Product {
    
    String productName;
    double price;
    double discountPercentage;

    public Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateFinalPrice() {
        double discountAmount = price * (discountPercentage / 100);
        double finalPrice = price - discountAmount;
        return finalPrice;
    }

    public static void main(String[] args) {
        
        Product product1 = new Product("Laptop", 1000.00, 15);  
        Product product2 = new Product("Smartphone", 800.00, 10);  
        Product product3 = new Product("Headphones", 150.00, 20);  

        System.out.println("Final price of " + product1.productName + ": Rs" + product1.calculateFinalPrice());
        System.out.println("Final price of " + product2.productName + ": Rs" + product2.calculateFinalPrice());
        System.out.println("Final price of " + product3.productName + ": Rs" + product3.calculateFinalPrice());
    }
}
