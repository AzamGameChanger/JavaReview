package com.codewithazam.com.codewithazam.review03;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        System.out.println("=================");

        int total = 0;
        int[] arr2 = {4, 2, 3, 1};

        for (int element : arr2) {
            total += element;

        }
        System.out.println(total);

        System.out.println("=================");


        String[] animals = {"dog", "cat", "horse", "mouse", "worm" };
        for (String animal : animals) {
            System.out.print(animal + " ");
        }

        System.out.println();
        System.out.println("=================");

        for (int i = animals.length - 1; i >= 0; i--) {
            System.out.print(animals[i] + " ");
        }


    }
}
