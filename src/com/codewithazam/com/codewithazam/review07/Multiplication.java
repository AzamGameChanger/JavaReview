package com.codewithazam.com.codewithazam.review07;

public class Multiplication {

    // Method overloading: the name of the method should be the same
    // Method signature: method name + parameter (should be unique)
    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    // Access modifier is NOT part of Method Signature
    // Return type is NOT part of Method signature
    public static void multiply(int num1, int num2, int num3) {
        System.out.println(num1 * num2 * num3);
    }


    // YES, it is overloading the other two methods, even though it doesn't have STATIC keyboard
    public static void multiply(double d1, double d2) {
        double result = d1 * d2;
        System.out.println(result);
    }

    // I did it myself, multiply the array of numbers
//    public static void multiply(int[] numbers) {
//
//        int result = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//           result *= numbers[i];
//        }
//        System.out.println(result);
//    }

    public static void multiply(int[] numbers) {

        int result = 1;
        for (int el : numbers) {
            result *= el;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Multiplication.multiply(2, 3);

        multiply(3, 3);
        multiply(2, 3, 5);
        multiply(1.2, 2.3);

        int[] arr = {8, 8, 9, 7};
        multiply(arr);
    }
}
