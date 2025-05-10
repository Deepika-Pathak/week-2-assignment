//Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. Create two Circle objects and display their area and circumference.

public class Circle {
    
    double radius;

    public static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(5.0);  
        Circle circle2 = new Circle(7.5);  

        System.out.println("Circle 1: ");
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Circumference: " + circle1.calculateCircumference());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println();

        System.out.println("Circle 2: ");
        System.out.println("Radius: " + circle2.radius);
        System.out.println("Circumference: " + circle2.calculateCircumference());
        System.out.println("Area: " + circle2.calculateArea());
    }
}
