package com.codewithazam.com.codewithazam.review01;

public class VariableDemo {

    public static void main(String[] args) {
       // Declare the variable
        String firstName;

        // Assign a value (initialize)
        firstName = "John";

        // Declare the variable & Assign a value
        String lastName = "Smith"; //Camel Case

        int age = 29;

        System.out.println(firstName + " " + lastName + " is " + age + " years old.");

        // After some years
        // Re- assign new value to the variable
        age += 3; // age = age + 3;
        lastName = "Brown";

        // Declaring another variable with the same name is not possible
        // String lastName = "Brown";

        System.out.println("After getting married: ");
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");

    }
}
