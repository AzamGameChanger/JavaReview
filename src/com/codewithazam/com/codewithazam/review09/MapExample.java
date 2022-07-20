package com.codewithazam.com.codewithazam.review09;

import java.util.*;

public class MapExample {
    // Map
    // HashMap | LinkedHashMap | TreeMap | HashTable
    public static void main(String[] args) {
        Map<Integer, String> phonebook = new HashMap<>();
        phonebook.put(123456789, "James Smith");
        phonebook.put(987654321, "John Brown");
        phonebook.put(123459876, "Donald Trump");
        phonebook.put(333333333,"Barack Obama");
        phonebook.put(777777777, "Brad Pitt");
        phonebook.put(888888888, "James Smith");

        // replacing James Smith with Julia Roberts
        phonebook.put(444444444, "Julia Roberts");
        // replace is doing the same thing
        // phonebook.replace(44444444, "Julia Roberts");

        // Map is one-directional, from Key to Value
        String obama =  phonebook.get(333333333); // get the value by using the key
        System.out.println("Obama -> " + obama);

        System.out.println(phonebook);

        boolean containKey = phonebook.containsKey(999999999);
        System.out.println(containKey);

        boolean containsJulia = phonebook.containsValue("Julia Roberts");
        System.out.println(containsJulia);

        phonebook.remove(987654321); // will remove the entry (key/value pair) from the map
        System.out.println(phonebook);

        System.out.println(phonebook.size());

        System.out.println("===================== phonebook.keySet(); =====================");
        // I will get all the keys and store them in a SET
        Set<Integer> keys = phonebook.keySet();
        System.out.println(keys);

        for (Integer number: keys){
            System.out.print(number);
            System.out.print(phonebook.get(number)); // Finding the value using the key
            System.out.println("----------");
        }

        System.out.println("----------------- phonebook.values(); -------------- ");
        Collection<String> names = phonebook.values();
        System.out.println(names);

        Iterator<String> namesIt =  names.iterator();
        while (namesIt.hasNext()){
            String values = namesIt.next();
            System.out.print(values + "; ");
        }

        // From the value you CANNOT find the key


    }
}
