package com.codewithazam.com.codewithazam.review08.Other;

public class Phone {
    private String licenseNr;
    private String brand;
    private String password;

    public Phone(String licenseNr, String brand, String password) {
        this.licenseNr = licenseNr;
        this.brand = brand;
        this.password = password;
    }

    // Getter and Setter methods

    // I will give the serial number only if you
    // provide me the correct password
    public String getLicenseNr(String password) {
        String result ="";
        if(password.equals(this.password))
            result = licenseNr;
        else
            result = "Invalid Access!!!";

        return result;
    }

    // You will be able to change the serial number
    // only if it is 5 characters long
    public void setLicenseNr(String licenseNr) {
        if (licenseNr.length() == 5) {
            this.licenseNr = licenseNr;
        }
    }

    // brand is view only

    public String getBrand() {
        return brand;
    }
}
