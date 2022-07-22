package com.codewithazam.com.codewithazam.review11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {
    public static void main(String[] args) {
        // How can you remove all duplicates from ArrayList?
        // You can create a new ArrayList and add the values one by one, checking if the object
        // exists on not. You can also use a Set.

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Bek");
        names.add("Salim");
        names.add("Karim");
        names.add("Bashir");
        names.add("Ali");
        names.add("Salim");

        Set<String> set = new LinkedHashSet<>(names);
        names.clear();
        names.addAll(set);

        System.out.println(names);

        System.out.println("========================================");

        List<String> stringList = new ArrayList<>();
        stringList.add("Ali");
        stringList.add("Bek");
        stringList.add("Salim");
        stringList.add("Karim");
        stringList.add("Bashir");
        stringList.add("Ali");
        stringList.add("Salim");

        List<String> namesWithoutDuplicates = new ArrayList<>();

        for (String name: stringList){
            if (!namesWithoutDuplicates.contains(name))
            namesWithoutDuplicates.add(name);
        }
        System.out.println(namesWithoutDuplicates);

    }
}
