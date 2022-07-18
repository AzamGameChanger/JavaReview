package com.codewithazam.com.codewithazam.review06;

public class Canada {
    public static void main(String[] args) {
        USA usa = new USA();
        System.out.println("Accessing the variables from inside the USA");
        //capitalCity is private
        //System.out.println("private -> " + usa.capitalCity);
        System.out.println("protected -> " + usa.mainState);
        System.out.println("default -> " + usa.normalState);
        System.out.println("public -> " + usa.bestSchool);

        System.out.println();

        System.out.println("Accessing the methods from inside the USA");
        //selectPresident() is private
        //usa.selectPresident();
        usa.playNBA();
        usa.speakEnglish();
    }
}
