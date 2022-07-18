package com.codewithazam.com.codewithazam.review07;

public class OverloadingMainMethod {
    // Can I overload main method?
    // Can I have another method with name main in the same class?

    public static void main(String[] args) {
        // Java looks for the main method with this signature
        // Method signature: method name is (main) + parameters (String array)

        System.out.println("Main method with String array parameters");

        int[] arr = {4,4,65,6,7};
        main(arr);
        // Polymorphism
        // Method overloading
        // Compile time polymorphism/early binding/static binding

    }

    public static void main(int[] ints) {
        System.out.println("Main method with int array parameters");
    }

    public static void main(int num1, int num2) {
        System.out.println("Main method with two int parameters");
    }

    public static void main(String str1, String str2) {
        System.out.println("Main method with two String parameters");
    }
}
