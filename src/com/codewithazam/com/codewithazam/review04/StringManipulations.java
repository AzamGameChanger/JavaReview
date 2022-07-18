package com.codewithazam.com.codewithazam.review04;

public class StringManipulations {
    public static void main(String[] args) {
        String str = "Pershendetje";

        System.out.println(str.length());
        boolean equal = str.equalsIgnoreCase("pershendetje");
        System.out.println(equal);

        String str2 = "Hello" + " " + "World";

        String str3 = "Hello".concat(" ").concat("World"); // Method chaining
        System.out.println(str2);
        System.out.println(str3);

        String str6 ="Hi there";

        System.out.println(str6.indexOf('e'));
        System.out.println(str6.indexOf('e',6)); // Overloaded method - method with the same name



    }
}
