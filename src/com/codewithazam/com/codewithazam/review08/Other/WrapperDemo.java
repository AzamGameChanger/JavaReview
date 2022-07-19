package com.codewithazam.com.codewithazam.review08.Other;

public class WrapperDemo {
    public static void main(String[] args) {
         int int1 = 3;
         Integer integer1 = new Integer(int1); // Boxing/Wrapping

        int int3 = integer1.intValue(); // unboxing/unwrapping

        // Easy way
        int int2 = 7;
        Integer integer2 = int2; // Auto-Boxing, Auto-Wrapping, Auto-Converting;
        int int4 = integer2; // Auto-boxing, auto-unwrapping, auto-converting

        Boolean b1 = false; // auto-boxing

        // Double Wrapper
        Double d1 = 4.2; // auto-boxing

        /**
         * int -> Integer
         * short -> Short
         * byte -> Byte
         * long -> Long
         * float -> Float
         * double -> Double
         * boolean -> Boolean
         * char -> Character
         */
    }
}
