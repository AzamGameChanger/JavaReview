package com.codewithazam.codewithmosh.UltimateJavaPart1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Enter a number, if divisible by 5, print Fizz
        // If number divisible by 3, print Buzz
        // If number divisible by 3 & 5, print FizzBuzz
        // If number NOT divisible by 3 & 5, print number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number is ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 ==0)
            System.out.println("FizzBuzz");
        else if  (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
