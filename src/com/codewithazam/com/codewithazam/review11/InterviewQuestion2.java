package com.codewithazam.com.codewithazam.review11;

public class InterviewQuestion2 {
    public static void main(String[] args) {
        int num = 1; // is divisible 1,3,5,15;
        boolean prime = true;


        if (num == 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {  // num is divisible by i
                    System.out.println(num + " is divisible by " + i);
                    prime = false;
                    break;
                } else {
                    System.out.println(num + " is NOT divisible by " + i);
                }
            }
        }
        System.out.println(num + " is prime? " + prime);

    }
}
