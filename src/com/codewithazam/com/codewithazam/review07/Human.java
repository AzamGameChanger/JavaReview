package com.codewithazam.com.codewithazam.review07;

// every class by default extends the Object class
public class Human {
    // Field/variables
    String name;  // instance variable
    static final String planet = "World"; // class variable

    public Human() {
        // super();
        System.out.println("A human is being created.");
    }

    public Human(String name) {
        this();
        this.name = name;
    }

    // methods/behaviors
    public void talk() {
        System.out.println("Bla bla bla");
    }




}
