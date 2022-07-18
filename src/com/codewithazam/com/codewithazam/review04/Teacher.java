package com.codewithazam.com.codewithazam.review04;

public class Teacher {
    String name;
    double salary;
    String subject;

    void teach(){
        System.out.println(name +" is teaching " + subject);
    }

    void yellAtStudent(){
        System.out.println(name + " is yelling!");
    }
}
