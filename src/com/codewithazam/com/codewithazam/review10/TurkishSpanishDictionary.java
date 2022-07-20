package com.codewithazam.com.codewithazam.review10;

import java.util.*;

public class TurkishSpanishDictionary {
    public static void main(String[] args) {

        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("ev", "casa");
        dictionary.put("kedi", "gato");
        dictionary.put("esek", "burro");
        dictionary.put("bayrak", "bandera");
        dictionary.put("carsaf", "bandera");
        System.out.println(dictionary);

        // Set - No duplicates
        // List -> Insertion order is preserved
        Set<String> turkishWords = dictionary.keySet();
        System.out.println("keys -> " + turkishWords);

        Collection<String> spanishWords = dictionary.values();
        System.out.println("values -> " + spanishWords);

        Set<Map.Entry<String, String>> entries = dictionary.entrySet();
        System.out.println("entries -> " + entries);

        System.out.println("---------------");
        // Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        for (Map.Entry<String, String> pair : entries) {
            // System.out.println(pair);
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " -> " + value);
        }



    }
}
