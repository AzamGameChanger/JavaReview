package com.codewithazam.com.codewithazam.review07;

public class Visa extends CreditCard{

    public Visa(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        if (balance > 5_000)
            interest = 15;
        else
            interest = 30;

        System.out.println("The interest rate is " + interest + "%");
    }
}
