package com.codewithazam.com.codewithazam.review06;

public class Forest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Wolfy", 4);
        //wolf.name = "Wolfy";
        //wolf.legs = 4;

        wolf.sleep();
        wolf.displayInfo();
        System.out.println("-----------------------------");

        Fox fox = new Fox("Foxy", 4, "Orange");
//        fox.name = "Foxy";
//        fox.legs =4;
//        fox.furColor = "orange";

        fox.sleep();
        fox.displayInfo();
        System.out.println("======================================");

        Bear bear = new Bear("Teddy", 2);
//        bear.name ="Teddy";
//        bear.legs = 2;

        bear.sleep();
        bear.displayInfo();
        bear.roar();

    }
}
