package com.codewithazam.com.codewithazam.review06;

public class World {
    public static void main(String[] args) {
        //using constructor with no parameters
        Person p1 = new Person();
        p1.displayInfo();

        p1.name = "Hakan";
        p1.weight = 180;
        p1.age = 26;

        p1.displayInfo();

        System.out.println("----------------------------");

        //using constructor with no parameters
        Person p2 = new Person("Musafa", 185);
        p2.displayInfo();

        System.out.println("-----------------------------");
    }
}
