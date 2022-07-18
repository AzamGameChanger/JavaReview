package com.codewithazam.com.codewithazam.review03;

public class MaxIn2DArr {
    public static void main(String[] args) {
        int[][] b ={
                {2,3,5},
                {2,4,7},
                {8,1,9},
                {3,5,1}
        };

        int max =0;
        for (int[] arr:b){
            for (int arr2:arr){
                if (max <arr2)
                    max = arr2;
            }
        }
        System.out.println(max);
    }
}
