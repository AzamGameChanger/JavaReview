package com.codewithazam.com.codewithazam.review09;

import java.util.*;

public class SetExample {
    // Collection
    // List | Set | Queue (Three interfaces inheriting Collection)
    // ArrayList | LinkedList (Two classes implementing the List interface)
    // HashSet | LinkedHashSet | TreeSet (Three classes implementing Set interface)

    public static void main(String[] args) {

        Set<String> africaLinked = new LinkedHashSet<>(); // No duplicates, insertion order
        africaLinked.add("Tunisia");
        africaLinked.add("Morocco");
        africaLinked.add("Kenya");
        System.out.println(africaLinked.size());

        // Try to add duplicates
        boolean added = africaLinked.add("Morocco");
        System.out.println(added);

        System.out.println("LinkedHashSet - > " + africaLinked);

        // Can I add with an index? -> NO
        // africaLinked.add(1,"Egypt");

        Set<String> africaHash = new HashSet<>(africaLinked); // No duplicates, no order
        System.out.println("HashSet -> " + africaHash);

        Set<String> africaTree = new TreeSet<>(); // No duplicates, increasing order
        africaTree.addAll(africaLinked);
        System.out.println("TreeSet -> " + africaTree);

        boolean egypt = africaLinked.contains("Egypt");
        System.out.println(egypt);
        System.out.println(africaTree.isEmpty());
        boolean ableToRemove = africaLinked.remove("Kenya");
        System.out.println("Able to remove: " + ableToRemove);
        System.out.println("TreeSet -> " + africaLinked);
        System.out.println("Linked  -> " + africaTree);

        // Note: You are not able to get/add/remove by index in a SET

        System.out.println("----------- 1st way, normal for loop DOES nOT WORk ------------");
        // Because I cannot get by index
//        for (int i = 0; i < africaTree.size(); i++) {
//            africaTree.get(i);
//        }

        System.out.println("============== 2nd way, Enhanced/Advanced for loop =================");
        for (String country : africaTree) {
            System.out.println(country);
        }

        System.out.println("_______________ 3rd way, Iterator ____________________");
        Iterator<String> iterator = africaTree.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);
        }

        System.out.println("=========================================================");
        // 1. List preserves insertion order, but Set DOES NOT
        // 2. List contains duplicates, but Set contains UNIQUE objects

        // Collections Framework -- All interfaces and implementation
        // Collection Interface -- Only one interface
        // Collections -- It is a helper/utility class

        System.out.println(africaHash);
        String minNum = Collections.min(africaHash);
        System.out.println("minimum -> " + minNum);

        Set<Integer> num = new HashSet<>();
        num.add(12);
        num.add(123);
        num.add(23);
        num.add(42);
        num.add(46);
        System.out.println(num);

        Integer min = Collections.min(num);
        System.out.println("min -> " + min);

        System.out.println("max -> " + Collections.max(num));

        // HashSet can't be sorted/ordered
        // Collections.sort (numbers);

        // List can be sorted
        List<Integer> numList = new ArrayList<>(num);
        Collections.sort(numList);
        System.out.println(numList);


    }
}
