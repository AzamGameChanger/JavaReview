package com.codewithazam.com.codewithazam.review04;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "I am very happy today because it is Friday";

        String anotherStr = str.replace('a', 'e');
        System.out.println(anotherStr);

        anotherStr = str.replace("today", "tomorrow");
        System.out.println(anotherStr);

        System.out.println("=================================");

        //Regular expression
        anotherStr = str.replaceAll("[a-z]", "*");
        System.out.println(anotherStr);

        String ssn = "589-659-8745";
        String newSsn = ssn.replaceAll("[4-6]", "*");
        System.out.println(newSsn);

        System.out.println("Let us remove the dashes");

        newSsn = ssn.replaceAll("[^0-9]", "");
        System.out.println(newSsn);

        //Hide all numbers except leave the digits
        // ***-***-8745

        newSsn = ssn.replaceFirst("^.{7}", "******");
        System.out.println(newSsn);
    }
}
