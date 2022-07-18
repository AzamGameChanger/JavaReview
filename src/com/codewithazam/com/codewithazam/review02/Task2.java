package com.codewithazam.com.codewithazam.review02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Ask the user to enter a positive number and add it to the total
        // He should enter -1 to STOP. -1 will not be added to the total

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int total =0;

//        System.out.println("Enter positive number: ");
//        number = scanner.nextInt();
//
//        while (number != -1){
//            total += number;
//            System.out.println("Enter positive number: ");
//            number = scanner.nextInt();
//        }
//        System.out.println(total);

        do {
            System.out.println("Enter positive number : ");
            number = scanner.nextInt();
            if (number != -1)
                total += number;
        }while (number != -1);
        System.out.println(total);
    }
}
