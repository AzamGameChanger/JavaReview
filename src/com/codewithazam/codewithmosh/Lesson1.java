package com.codewithazam.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();
        double monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * MONTHS_IN_YEAR;




        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
