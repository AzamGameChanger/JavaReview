package com.codewithazam.com.codewithazam.review08.Interface;

import com.codewithazam.com.codewithazam.review08.Interface.Fruit;
import com.codewithazam.com.codewithazam.review08.Interface.Peelable;
import com.codewithazam.com.codewithazam.review08.Interface.Washable;

public class Apple extends Fruit implements Peelable, Washable {

    public Apple(String color) {
        super(color);
    }

    @Override
    public void peel() {
        System.out.println("Peeling the apple.");
    }

    @Override
    public void wash() {
        System.out.println("Washing the appple");
    }
}
