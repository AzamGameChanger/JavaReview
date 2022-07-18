package com.codewithazam.com.codewithazam.review01;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //Ask the user enter the age
        //if age is 1-3 -> you are a baby
        //if age is 4-5 -> you are a toddler
        //if age is 6-12 -> you are a kid
        //if age is 13-19 -> teenager
        //if age is >= 20 -> you are an adult

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String result = "";
        if (age >= 1 && age <= 3) { // using AND is better for a range of numbers
            result = "baby";
        } else if (age == 4 || age == 5) { // using OR is better for individual values
            result = "toddler";
        } else if (age >= 6 && age <= 12) {
            result = "kid";
        } else if (age >= 13 && age <= 19) {
            result = "teenager";
        } else if (age >= 20) {
            result = "adult";
        } else {
            result ="Alien";
        }

        System.out.println("You are a/an " + result);

    }
}
