package com.codewithazam.com.codewithazam.review06;

public class Person {
    //instance variables
    public String name;
    int age;
    protected int weight;


    Person(){
        System.out.println("creating a person");
        System.out.println("No parameters");
    }

    public Person(String personName, int personWeight) { //local variables
        this.name = personName;
        weight = personWeight;
    }

    public void sleep() {
        System.out.println("----sleeping----");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
    }
}
