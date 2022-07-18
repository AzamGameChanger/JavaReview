package com.codewithazam.com.codewithazam.review06_other;

import com.codewithazam.com.codewithazam.review06.USA;

public class Mexico {
    public static void main(String[] args) {

        USA usa = new USA();
        System.out.println("Accessing the variables from inside the USA");
        //private, protected and default variables
        //cannot be accessed from outside the package
//        System.out.println("private -> " + usa.capitalCity);
//        System.out.println("protected -> " + usa.mainState);
//        System.out.println("default -> " + usa.normalState);
        System.out.println("public -> " + usa.bestSchool);

        System.out.println();

        System.out.println("Accessing the methods from inside the USA");
        //selectPresident() is private
//        usa.selectPresident();
        //playNBA() is protected
//        usa.playNBA();
        usa.speakEnglish();
    }
}
