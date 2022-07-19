package com.codewithazam.com.codewithazam.review08.Interface;

import com.codewithazam.com.codewithazam.review08.Interface.Crackable;
import com.codewithazam.com.codewithazam.review08.Interface.Fruit;

public class Coconut extends Fruit implements Crackable {
    public Coconut(String color) {
        super(color);
    }

    @Override
    public void crack() {
        System.out.println("Cracking the coconut.");
    }
}
