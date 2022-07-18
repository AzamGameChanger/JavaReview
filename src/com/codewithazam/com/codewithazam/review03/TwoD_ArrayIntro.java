package com.codewithazam.com.codewithazam.review03;

public class TwoD_ArrayIntro {
    public static void main(String[] args) {

        int[][] numbers = new int[3][4]; // [rows][columns]


        int rows = numbers.length; // number of rows
        int cols = numbers[1].length; //  number of columns
        numbers[1][0] = 13;
        numbers[2][2] = 23;

        System.out.println(rows);
        System.out.println(cols);

        for (int row =0 ; row < rows; row++){
            for (int col =0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();
        }

    }
}
