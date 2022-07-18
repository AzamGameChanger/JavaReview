package com.codewithazam.com.codewithazam.review04;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Atoullo";
        student1.studentNr = 526;
        student1.gradeLevel = 2;

        Student student2 = new Student();
        student2.name = "Ivon";
        student2.studentNr = 007;
        student2.gradeLevel = 3;

        Teacher teacher1 = new Teacher();
        teacher1.name = "Sabah";
        teacher1.subject = "Java";
        teacher1.salary = 95000;

        System.out.println("Let us call the methods!");
        student1.study();

        student2.sleep();
        student2.study();

        teacher1.teach();
    }
}
