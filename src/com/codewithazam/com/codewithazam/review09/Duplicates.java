package com.codewithazam.com.codewithazam.review09;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        // How do you remove duplicates from the list?
        List<String> al = new LinkedList<String>();
        al.add("Mufasa");
        al.add("Flori");
        al.add("Evis");
        al.add("Flori");
        al.add("Enes");
        al.add("Evis");
        al.add("Flori");
        System.out.println(al);

        // HashSet - No duplicates, no order
        Set<String> hs = new HashSet<>();
        hs.addAll(al); // add a collection to the set
        System.out.println(hs); // HashSet does not preserve/keep the insertion order

        //LinkedHashSet - No duplicates, insertion order
        Set<String> lhs = new LinkedHashSet<>();
        lhs.addAll(al);
        System.out.println(lhs);

        // TreeSet - No duplicates, increasing order
        Set<String> ts = new TreeSet<>(al); // Constructor, adding the collection to the TreeSet
        System.out.println(ts);

        ///////////////////////////////////////////////////////////////
        //Task: Remove duplicates without using Set Interface
        List<String> list2 = new ArrayList<>();
        for (String el : al) {
            if (!list2.contains(el)) {
                list2.add(el);
            }
        }
        System.out.println(list2);
        ////////////////////////////////////////////////////////////

        // Let's get the 2nd element from the list
        String element2 = al.get(1);
        System.out.println(element2);

        // Let's get the 2nd element from the set
        // Because Set does not promise to preserve insertion order
        // String el2 = ts.get(1); -> compile error


        System.out.println(al);
        // String[] array = (String[]) al.toArray();
        Object[] array = al.toArray(); //Converts the List to an Array

        System.out.println("Before Sorting");
        for (Object el: array){
            System.out.print(el + " - ");
        }
        System.out.println();

        // Class Arrays is a utility class - has methods that work with arrays
        //Method to sort array
        Arrays.sort(array);

        System.out.println("After sorting");
        for (Object el: array){
            System.out.print(el + " - ");
        }

        System.out.println("List before sorting");
        System.out.println(al);
        // for collections, there are methods available in the Collections class
        Collections.sort(al);

        System.out.println("List after sorting");
        System.out.println(al);
    }
}
