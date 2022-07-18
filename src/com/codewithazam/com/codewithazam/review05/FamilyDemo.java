package com.codewithazam.com.codewithazam.review05;

public class FamilyDemo {
    public static void main(String[] args) {
        FamilyMember.lastname = "James";
        FamilyMember.printLastName();
        FamilyMember family = new FamilyMember();
        family.firstName = "John";
        family.printFullName();
    }
}
