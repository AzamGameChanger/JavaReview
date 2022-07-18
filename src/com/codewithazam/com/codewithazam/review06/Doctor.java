package com.codewithazam.com.codewithazam.review06;

// OOP -> Object Oriented Programming
// 1. Inheritance
// 2. Polymorphism
// 3. Abstraction
// 4. Encapsulation

public class Doctor {
    String name;
    int salary;
    String licenseId;

    public Doctor(){

    }
    public Doctor(String name, int salary, String licenseId) {
        this.name = name;
        this.salary = salary;
        this.licenseId = licenseId;
    }

    public void checkUp(String name){
        System.out.println("Doctor " + this.name + " makes a checkup on " + name );
    }

}
