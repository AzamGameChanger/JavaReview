package com.codewithazam.com.codewithazam.review03;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to store in the array? -> ");
        int sizeOfArr = scanner.nextInt();

        int[] arr = new int[sizeOfArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Give me the number to store in the array? -> ");
            arr[i] = scanner.nextInt();
        }

        // Print array

        for (int j=0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

        System.out.println();
        // sum of array
        int total =0;

        for (int ar:arr){
            total+=ar;
        }

        System.out.println(total);


    }
}
