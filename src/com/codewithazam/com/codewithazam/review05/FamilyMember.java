package com.codewithazam.com.codewithazam.review05;

public class FamilyMember {
    String firstName; // instance variable, belongs to the instance/object
    static String lastname; //static/class variable, belongs to the class
    int age;

    void printFullName(){
        System.out.println("Full name is " + firstName + " " + lastname);
    }

    static void printLastName(){
        System.out.println("Family name is " + lastname);
    }

}
