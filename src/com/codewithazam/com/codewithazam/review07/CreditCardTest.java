package com.codewithazam.com.codewithazam.review07;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard(12000);
        cc1.calculateInterest();

        CreditCard cc2 = new Visa(12000);
        cc2.calculateInterest();

        CreditCard cc3 = new AmericanExpress(12000);
        cc3.calculateInterest();

        System.out.println("-------------------------------");
        CreditCard[] cc = new CreditCard[3];
        cc[0] = new CreditCard(6000);
        cc[1] = new Visa(6000);
        cc[2] = new AmericanExpress(6000);

        for (CreditCard c: cc){
            c.calculateInterest();
        }
    }
}
