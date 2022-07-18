package com.codewithazam.com.codewithazam.review01;

public class TypeCasting {
    public static void main(String[] args) {

        // byte < short < int < long < float < double

        int intNumber = 24;

        // widening/implicitly/automatically
        double d = intNumber;

        System.out.println("Int number -> " + intNumber);
        System.out.println("Double number -> " + d);

       // byte is between -128 and 127
        //  narrowing/ explicit casting/ manually
        byte byteNumber = (byte) intNumber;
        System.out.println("ByteNumber -> " + byteNumber);

        intNumber = 2400;
        byteNumber = (byte) intNumber;
        // In this case I lost data
        System.out.println("ByteNumber -> " + byteNumber);

        // implicit casting
        byte b1 = 80;
        int a1 = b1;
        System.out.println("a1 -> " +  a1);



    }
}
