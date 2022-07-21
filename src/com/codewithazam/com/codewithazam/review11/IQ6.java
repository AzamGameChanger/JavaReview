package com.codewithazam.com.codewithazam.review11;

public class IQ6 {
    public static void main(String[] args) {

        String original = "Anna";

        String reverse = IQ5.reverseTwo(original);

        if (original.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("NOT Palindrome");
    }
}
