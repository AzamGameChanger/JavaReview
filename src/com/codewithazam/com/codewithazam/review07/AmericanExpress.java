package com.codewithazam.com.codewithazam.review07;

public class AmericanExpress extends CreditCard {

    public AmericanExpress(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        if (balance > 10_000)
            interest = 10;
        else
            interest = 20;

        System.out.println("The interest rate is " + interest + "%");
    }
}
