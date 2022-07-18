package com.codewithazam.com.codewithazam.review01;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // if you are a boy
        // if you are rich --- buy Ferrari
        // otherwise  --- Play Soccer

        // If you are a girl
        // If you are rich --- buy a LV bag
        // otherwise -- Read a book

        // If you are none
        // Invalid gender

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = scanner.next();
        System.out.print("Are you rich? -> ");
        String rich = scanner.next();

        if (gender.equalsIgnoreCase("boy")){
            if (rich.equalsIgnoreCase("rich")){
                System.out.println("buy Ferrari");
            }else {
                System.out.println("Play Soccer");
            }
        }else if (gender.equalsIgnoreCase("girl")){
            if (rich.equalsIgnoreCase("rich")){
                System.out.println("buy a LV bag");
            }else {
                System.out.println("read a book");
            }
        }else {
            System.out.println("Invalid gender!");
        }
    }
}
