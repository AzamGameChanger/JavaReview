package com.codewithazam.com.codewithazam.review11;

public class IQ3 {
    public static void main(String[] args) {

        int a=1;
        int b=1;
        int c;
        for (int i =1; i <= 10;i++){
            System.out.print(a + ", ");
            c = a + b; // find next number
            a = b; // shift a
            b = c; // shift b
        }
    }
}
