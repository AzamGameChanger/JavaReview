package com.codewithazam.com.codewithazam.review08.Other;

import java.util.ArrayList;

public class CollectionIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean isEmp = numbers.isEmpty();
        System.out.println(isEmp);

        numbers.add(new Integer(7));
        numbers.add(5); // auto-boxing
        numbers.add(3);
        numbers.add(1, 10); // add index 1


        isEmp = numbers.isEmpty();
        System.out.println(isEmp);

        System.out.println("Size is: " + numbers.size());

        System.out.println("How to iterate ArrayList?");
        System.out.println("======= 1st way, normal for loop ============");
        for (int i = 0; i < numbers.size(); i++) {
            Integer num = numbers.get(i);
            System.out.println(num);
        }

        System.out.println("--------------------- 2nd way, Enhanced for loop -------------------");
        for (Integer element: numbers){
            System.out.println(element);
        }


    }
}