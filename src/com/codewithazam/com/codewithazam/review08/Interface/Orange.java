package com.codewithazam.com.codewithazam.review08.Interface;

import com.codewithazam.com.codewithazam.review08.Interface.Fruit;
import com.codewithazam.com.codewithazam.review08.Interface.Peelable;

public class Orange extends Fruit implements Peelable {
    public Orange(String color) {
        super(color);
    }

    @Override
    public void peel() {
        System.out.println("Peeling the orange.");
    }
}
