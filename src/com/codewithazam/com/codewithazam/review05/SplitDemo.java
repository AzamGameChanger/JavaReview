package com.codewithazam.com.codewithazam.review05;

public class SplitDemo {
    public static void main(String[] args) {
        String longStr = "I am very happy today, because today is Friday";
        String[] strArr = longStr.split("today");
        System.out.println(strArr.length);


        //Enhanced for loop
        for (String arr:strArr){
            System.out.println(arr);
        }

        System.out.println("==========================");

        //regular for loop
        for (int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }

        System.out.println("==========================");

        longStr = "I like 6 because 7 ate 9 yesterday";
        strArr = longStr.split("[6-9]");
        System.out.println(strArr.length);

        for (String str: strArr){
            System.out.println(str.trim());
        }
    }
}
