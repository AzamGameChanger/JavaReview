package com.codewithazam.com.codewithazam.review01;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the operator(+, -, /, *): ");
        String operator = scanner.next();

        double result = 0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")) {
            System.out.println("The result is " + result);
        }
    }
}
