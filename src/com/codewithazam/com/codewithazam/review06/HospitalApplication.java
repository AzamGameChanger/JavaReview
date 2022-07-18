package com.codewithazam.com.codewithazam.review06;

public class HospitalApplication {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("John",120000,"D1234");
        d1.checkUp("Burak ");

        // These are variables and methods of child
        // d1.dermId;
        // d1.applySkinTreatment();

        Dermatologist d2 = new Dermatologist();
        d2.name = "Okan";
        d2.salary = 200_000;
        d2.licenseId = "D789";
        d2.dermId = "XYZ";

        d2.checkUp("Komron");
        d2.applySkinTreatment();

        System.out.println("=================================");
        // creating a dermatologist with initial information
        Dermatologist d3 = new Dermatologist("Hakan", 185000, "D007");
        d3.applySkinTreatment();
    }
}
