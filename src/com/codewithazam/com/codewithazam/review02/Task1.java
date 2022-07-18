package com.codewithazam.com.codewithazam.review02;

public class Task1 {
    public static void main(String[] args) {
        // I want to celebrate my son's 20 birthday
        // but not 13th birthday, because we are scared
        // lets use for loop

        for (int i = 1; i <= 20; i++){
            if (i == 13){
                continue;
            }
            System.out.println( i + " -> Celebrating " + i + "th birthday!");
        }

        System.out.println("====Same thing with a while loop");

        int age2 = 0;
        while (age2 < 20){
            age2++;
            if (age2 == 13)
                continue;
            System.out.println( age2 + " -> Celebrating " + age2 + "th birthday!");

        }
    }
}
