// Use of Logical Operators Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.) in java with simple code


import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = input.nextBoolean();
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}
