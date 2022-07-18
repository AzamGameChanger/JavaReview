package com.codewithazam.com.codewithazam.review08.Abstraction;

public class FruitDemo {
    public static void main(String[] args) {

        Apple apple = new Apple("Yellow");
        apple.wash();
        apple.peel();

        System.out.println("-----------------------------");
        Coconut coconut = new Coconut("Brown");
        coconut.crack();

        Fruit apple2 = new Apple("Red"); // up-casting
        apple2.color = "Black";

        if (apple2 instanceof Apple){
            Apple apple1 = (Apple) apple2;
            apple1.peel();
            apple1.wash();
        }
        else if (apple2 instanceof Coconut){
            // you can safely downcast it to Coconut
            Coconut coco = (Coconut) apple2;
            coco.crack();
        }


    }
}
