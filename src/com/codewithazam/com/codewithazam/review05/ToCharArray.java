package com.codewithazam.com.codewithazam.review05;

public class ToCharArray {
    public static void main(String[] args) {
        String longStr = "I am very happy today, because today is Friday";

        char[] charArr = longStr.toCharArray();
        System.out.println(charArr.length);
        System.out.println("-------------------------------------");

        for (int i =0; i < charArr.length;i++){
            System.out.print(charArr[i]);
        }

        System.out.println();
        System.out.println("===============================");

        for (char ch:charArr){
            if (ch == 'a')
                System.out.print('e');
            else
                System.out.print(ch);
        }
        System.out.println();
    }
}
