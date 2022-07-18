package com.codewithazam.com.codewithazam.review02;

public class SumEvenForLoop {
    public static void main(String[] args) {
        // Add Even numbers
        // Also add odd numbers
        // also add all numbers
        // between 1 & 50
        // using for loop


        int totalEven = 0;
        int totalOdd = 0;
        int totalAll = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0)
                totalEven += i;
            else
                totalOdd += i;
            totalAll += i;

        }

        System.out.println("Even -> " + totalEven);
        System.out.println("Odd -> " + totalOdd);
        System.out.println("Total -> " + totalAll);

    }
}
