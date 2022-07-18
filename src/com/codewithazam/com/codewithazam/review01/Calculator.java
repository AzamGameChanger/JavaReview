package com.codewithazam.com.codewithazam.review01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Ask user to enter 2 numbers
        //Ask user for the operator (+,-,*,/)
        // Do it with if-else

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator : ");
        String operator = scanner.next();

        double result = 0;
        if (operator.equalsIgnoreCase("+"))
            result = num1 + num2;
        else if (operator.equalsIgnoreCase("-"))
            result = num1 - num2;
        else if (operator.equalsIgnoreCase("/"))
            result = num1 / num2;
        else if (operator.equalsIgnoreCase("*"))
            result = num1 * num2;
        else
            System.out.println("Invalid operator");


        if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
            System.out.println("Result :  " + result);
        }
    }
}
