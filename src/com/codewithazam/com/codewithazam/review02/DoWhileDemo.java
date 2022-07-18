package com.codewithazam.com.codewithazam.review02;

public class DoWhileDemo {
    public static void main(String[] args) {
        System.out.println("Similarity btw while and do-while");

        int age = 1;
        while (age <= 10) {

            System.out.println("Happy birthday. You are " + age + " years old.");
            age++;
        }
        System.out.println("Now you are big. No more birthdays!");

        int age2 = 1;
        do {
            System.out.println("Happy birthday. You are " + age2 + " years old.");
            age2++;
        } while (age2 <= 10);

        System.out.println("Now you are big. No more birthdays!");

        System.out.println();
        System.out.println("Difference btw while and do-while");

        boolean happy =false;

        while (happy){
            System.out.println("Bye - While");
        }

        do {
            System.out.println("Bye - Do- While");
        }while (happy);
    }
}
