package com.codewithazam.com.codewithazam.review09;

import java.util.*;

public class World {
    public static void main(String[] args) {

        Map<String, String> europe = new TreeMap<>(); // order by the key
        europe.put("Germany", "Berlin");
        europe.put("Albania", "Tirana");
        europe.put("Italy", "Rome");
        System.out.println(europe);

        Map<String, String> asia = new LinkedHashMap<>(); // order is reserved
        asia.put("Turkey", "Ankara");
        asia.put("Tajikistan", "Dushanbe");
        asia.put("Uzbekistan", "Tashkent");
        System.out.println(asia);

        Map<String, String> africa = new HashMap<>(); // no order
        africa.put("Egypt", "Kairo");
        africa.put("Morocco", "Rabat");
        africa.put("Ghana", "Accra");
        System.out.println(africa);

        // HW1 iterate europe using key -> keySet(); enhanced for loop
        // HW2 iterate asia using the values -> values(); iterator

        // Storing maps in a List
        List<Map<String, String>> world = new ArrayList<>();
        world.add(europe);
        world.add(asia);
        world.add(africa);
        System.out.println(world);

    }
}
