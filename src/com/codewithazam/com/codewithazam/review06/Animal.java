package com.codewithazam.com.codewithazam.review06;

public class Animal {
    String name;
    int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void sleep() {
        System.out.println("All animals can sleep");
    }

    void displayInfo() {
        System.out.println(name + " has " + legs + " legs");
    }

//    class Snake extends Animal {
//
//    }
}
