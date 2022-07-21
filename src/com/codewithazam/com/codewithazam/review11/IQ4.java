package com.codewithazam.com.codewithazam.review11;

public class IQ4 {
    public static void main(String[] args) {
        String str = "dfg%^DF3434  ere  @#67";
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        System.out.println("Number of alpha characters -> " + str.length());
        System.out.println("____________________________________________");
        String str2 = "bye bye Java Hello Selenium";
        String[] words = str2.split(" ");
        System.out.println("Number of words int the string is = " +  words.length);
        for (String word: words){
            System.out.println(word);
        }
    }
}
