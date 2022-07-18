package com.codewithazam.com.codewithazam.review04;

public class Ensar {

    //a method with NO parameters and NO return type
    void addTwoNumber(){
        System.out.println("I am inside addTwoNumbers");
        int result = 3 +4;
    }

    // a method with Two parameters and No return type
    void addTwoNumbersIGive(int num1, int num2){
        System.out.println("I am inside addTwoNumbers I give");
        int result = num1 + num2;
    }

    // a method with NO parameters and WITH return type
    int  addTwoNumbersAndGiveMeTheResult(){
        System.out.println("I am inside the result method");
        int result = 5 + 2;
        return result;
    }

    // A method with two parameters and with return type
    int addTwoNumbersIGiveYou(int num1, int num2){
        System.out.println("I am inside the last method");
        int result = num1+num2;
        return result;
    }

}
