package com.codewithazam.com.codewithazam.review08.Other;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p1 = new Phone("HQ123","Apple","Alb123");

        String serialNm = p1.getLicenseNr("Flori123");
        System.out.println(serialNm);


        serialNm = p1.getLicenseNr("Alb123");
        System.out.println(serialNm);

        p1.setLicenseNr("Komron123");
        serialNm = p1.getLicenseNr("Alb123");
        System.out.println(serialNm);

        p1.setLicenseNr("K1234");
        System.out.println(p1.getLicenseNr("Alb123"));

        String br = p1.getBrand();
        System.out.println(br);

        // I can not change the Brand
        // Because there is no setter method
        // p1.setBrand("Samsung);
    }
}
