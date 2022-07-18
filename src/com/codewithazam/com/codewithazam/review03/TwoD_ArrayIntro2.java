package com.codewithazam.com.codewithazam.review03;

public class TwoD_ArrayIntro2 {
    public static void main(String[] args) {
        int[][] nums = {
                {2,4,3},
                {3,1,2},
                {4,8,9},
                {3,2,9}
        };

        System.out.println(nums[3][0]);
        System.out.println(nums[1][1]);

        for (int[] row: nums) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
