package com.codewithazam.com.codewithazam.review04;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "I am very happy today because it is Friday";

        String anotherStr = str.substring(5,7);
        System.out.println(anotherStr);

        anotherStr = str.substring(5);
        System.out.println(anotherStr);

        str = str.substring(10);
        System.out.println(str);

        // Run-time error
        //str.substring(7,5);
        //str.substring(5,100);
        //str.substring(-1,10);
    }
}
