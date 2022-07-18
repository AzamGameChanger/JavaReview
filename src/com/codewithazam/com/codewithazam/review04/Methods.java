package com.codewithazam.com.codewithazam.review04;

public class Methods {
    void sayWelcome() {
        for (int i = 0; i < 3; i++) {   //static
            System.out.print("Welcome ");
        }
        System.out.println();
    }

    void sayWelcomeWithNumber(int times) { //dynamic
        for (int i = 0; i < times; i++) {
            System.out.print("Welcome ");
        }
        System.out.println();
    }

    void sayGreeting(String greeting) {
        for (int i = 0; i < 3; i++) {
            System.out.print(greeting + " ");
        }
        System.out.println();
    }

    void sayGreetingWithNumbers(String greeting, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(greeting + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //create object of the class
        Methods method = new Methods();
        method.sayWelcome();
        method.sayWelcomeWithNumber(7);

        method.sayGreeting("Khush omaded!");


        method.sayGreetingWithNumbers("Salom", 7);
    }


}
