package com.codewithazam.com.codewithazam.review07;

public class CreditCard {
    double balance, interest;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        interest = 25;
        System.out.println("The interest rate is " + interest + "%");
    }



}
