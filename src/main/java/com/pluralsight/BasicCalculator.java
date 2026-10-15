package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // initialize scanner
        Scanner scanner = new Scanner(System.in);

        // propmt user for the first number and store in the scanner
        System.out.printf("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        //prompt user for the second number and store in the a virable
        System.out.printf("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        //added a next because int to string is a problem
        scanner.nextLine();

        // prompts for the user in the sentence
        System.out.println("Possible calculations:");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");

        //prompt user for their option
        System.out.println("Please select an option: M");
        String optionalChar = scanner.nextLine();

        //calculate product and print product to the user
        int product = firstNumber * secondNumber;
        System.out.printf("%d * %d = %d%n", firstNumber , secondNumber, product);


    }
}
