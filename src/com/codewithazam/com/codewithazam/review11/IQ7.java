package com.codewithazam.com.codewithazam.review11;

import java.util.Arrays;

public class IQ7 {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?
        // Maximum and minimum number in the array?

        int[] numbers = {1, 110, 5, 90, -1, 89, 74, 125, 25, 100};
        Arrays.sort(numbers);

        System.out.println("SMALLEST -> " + numbers[0]);
        System.out.println("BIGGEST -> " + numbers[numbers.length - 1]);
        System.out.println("Second Biggest -> " + numbers[numbers.length - 2]);

        System.out.println("=====================================");

       int[] numbers2 = {1, 110, 5, 90, -1, 89, 74, 125, 25, 100};
       // int[] numbers2 = {3, 1, 3, 54, -13, 9, 4, 225,15, 20};

        int biggest = numbers2[0];
        int biggest2 = numbers2[0];
        int smallest = numbers2[0];

        for (int i = 0; i < numbers2.length; i++){
            int number = numbers2[i];
            if (number > biggest){
                biggest2 = biggest;
                biggest = number;
            }
            else if (number > biggest2){
                biggest2 = number;
            }
            else if (number < smallest){
                smallest = number;
            }
        }
        System.out.println("Biggest is -> " + biggest);
        System.out.println("Biggest2 is -> " + biggest2);
        System.out.println("Smallest is -> " + smallest);
    }
}
