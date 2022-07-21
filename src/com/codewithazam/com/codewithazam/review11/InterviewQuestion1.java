package com.codewithazam.com.codewithazam.review11;

public class InterviewQuestion1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("=====================");
        a = a + b; // a =15; b=10;
        b = a - b; // a= 15; b =5;
        a = a - b; // a = 10 ; b =5;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("-------------------------");
        String str1 = "Flori";
        String str2 = "Komron";
        System.out.println("str1 -> " + str1);
        System.out.println("str2 -> " + str2);

        System.out.println("========================");

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("str1 -> " + str1);
        System.out.println("str2 -> " + str2);

    }
}
