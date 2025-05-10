// Even or Odd Checker Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement. in java with simple code.
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        input.close();
    }
}
