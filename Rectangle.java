//Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.

public class Rectangle {
    
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(10.0, 5.0);
        Rectangle rectangle2 = new Rectangle(7.5, 3.2);
        Rectangle rectangle3 = new Rectangle(15.0, 8.5);

        System.out.println("Area of Rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.calculateArea());
        System.out.println("Area of Rectangle 3: " + rectangle3.calculateArea());
    }
}
