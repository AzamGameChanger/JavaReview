package com.codewithazam.com.codewithazam.review05;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 6};

        System.out.println("The initial values of the array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------");

        ArrayManipulation manipulation = new ArrayManipulation();
        int largest = manipulation.largest(arr);
        System.out.println("Largest -> " + largest);

        int sum = manipulation.sum(arr);
        System.out.println("Sum -> " + sum);

        double average = manipulation.average(arr);
        System.out.println("Average -> " + average);
    }

    int largest(int[] arr) {
        int largest = arr[0];
        for (int el : arr) {
            if (el > largest)
                largest = el;
        }
        return largest;
    }

    protected int sum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    double average(int[] arr){
        double sum = 0;
        for (int el:arr){
            sum+=el;
        }
        double average = sum/arr.length;
        return average;
    }
}
