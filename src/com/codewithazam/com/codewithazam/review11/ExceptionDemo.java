package com.codewithazam.com.codewithazam.review11;

public class ExceptionDemo {
    public static void main(String[] args) {
        division(6,0);
        division(6,2);

        System.out.println("Continue executing extra code...");
    }

    static void division(int a, int b){
        try {
            int result = a / b;
            System.out.println("result -> " + result);
        } catch (Exception e) {
            // Write the problem/exception into a file
            System.out.println("Something went wrong!");

            System.out.println("Exception: " + e);
            System.out.println("Exception message: " + e.getMessage());

            e.printStackTrace();
        }
    }
}
