package com.codewithazam.com.codewithazam.review09;

import java.util.*;

public class HomeworkMap {
    public static void main(String[] args) {
        // HW1 iterate europe using key -> keySet(); enhanced for loop
        // HW2 iterate asia using the values -> values(); iterator

        Map<String, String> europe = new TreeMap<>(); // order by the key
        europe.put("Germany", "Berlin");
        europe.put("Albania", "Tirana");
        europe.put("Italy", "Rome");

        Set<String> eur = europe.keySet();
        for (String eu:eur){
            System.out.println(eu + " -> " + europe.get(eu));
        }

        Map<String, String> asia = new LinkedHashMap<>(); // order is reserved
        asia.put("Turkey", "Ankara");
        asia.put("Tajikistan", "Dushanbe");
        asia.put("Uzbekistan", "Tashkent");

        Collection<String> as = asia.values();
        Iterator<String> iterator = as.iterator();
        while (iterator.hasNext()){
            String a = iterator.next();
            System.out.println(a);
        }
    }
}
