package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user for their name
        System.out.printf("Enter your name: ");
        String name = scanner.nextLine();

        //prompt user for hours worked and store it in a vaiable
        System.out.printf("Hours worked: " );
        double hoursWorked = scanner.nextDouble();

        //prompt user for pay rate
        System.out.printf("Pay rate: ");
        double payRate = scanner.nextDouble();
    }

}
