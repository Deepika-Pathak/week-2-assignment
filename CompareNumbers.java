// Comparison using if-else Write a Java program that takes two numbers and prints the greater number. in java with simple

  import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("Greater number is: " + a);
        } else if (b > a) {
            System.out.println("Greater number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}
