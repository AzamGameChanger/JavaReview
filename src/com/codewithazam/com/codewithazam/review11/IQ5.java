package com.codewithazam.com.codewithazam.review11;

public class IQ5 {
    public static void main(String[] args) {
        String str = "Neotech";

        String reverse1 = reverseOne(str);
        System.out.println("Reverse1 -> " + reverse1);

        String str2 = "Azamtech";
        String reverse2 = reverseTwo(str2);
        System.out.println("Reverse2 -> " + reverse2);

        String str3 = "Pablo";
        StringBuffer reverse3 = reverseThree(str3);
        System.out.println("Reverse3 -> " + reverse3);

        System.out.println("==============================================");

        String strLong = "bye bye Java Hello Selenium";
        System.out.println("Regular String -> " + strLong);
        String reverseStr = longStr(strLong);
        System.out.println("Reversed long String -> " + reverseStr);


    }

    public static String reverseOne(String str) {
        String reserved1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reserved1 += str.charAt(i);
        }
        return reserved1;
    }

    public static String reverseTwo(String str) {
        String reserved2 = "";
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            reserved2 += chArr[i];
        }
        return reserved2;
    }

    public static StringBuffer reverseThree(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse(); // StringBuffer = is mutable;

        return sb;
    }

    public static String longStr(String longStr) {
        String stReverse = "";
        String[] words = longStr.split(" ");
        for (int i = words.length - 1; i >= 0; i--)
            stReverse += words[i] + " ";

        return stReverse;
    }

}
