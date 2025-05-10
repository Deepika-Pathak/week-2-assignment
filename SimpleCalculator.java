// Simple Calculator (if-else) Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
         double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}
