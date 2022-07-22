package com.codewithazam.codewithmosh.UltimateJavaPart1;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        double monthlyInterest = 0;
        int numberOfPayments =0;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Principal(1k - 1m): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;

            System.out.println("Enter the amount between 1k and 1M.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            double rate = scanner.nextDouble();
            if (rate >= 1 && rate <= 30) {
                monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        while (true) {
            System.out.print("Period(Years): ");
            int period = scanner.nextInt();
            if (period >= 1 && period <= 30){
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
