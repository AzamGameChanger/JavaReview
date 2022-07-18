package com.codewithazam.com.codewithazam.review04;

public class World {
    public static void main(String[] args) {

        //Declaring and assigning a value
        Baby baby1 = new Baby();
        baby1.name = "James";
        baby1.weight = 6;

        System.out.println("Name of the baby1 is " + baby1.name);
        System.out.println("The hair color is " + baby1.hairColor);
        baby1.gender = 'M';
        baby1.hairColor = "brown";
        System.out.println("The hair color is " + baby1.hairColor);

        System.out.println("===============================");

        //Declaring the variable type Baby
        Baby baby2;

        //Creating a baby and assigning it to the variable
        baby2 = new Baby();

        baby2.weight = 6;
        baby2.name = "Aisha";
        baby2.gender = 'F';
        baby2.hairColor  = "black";

        System.out.println("The hair color is " + baby1.hairColor);
        System.out.println("The hair color is " + baby2.hairColor);

        System.out.println("------------------------------------------");

        baby1.talk();
        baby1.cry();

        baby2.talk();

        System.out.println("=================================");
        baby1.displayInformation();

        baby1.talking("Bla", 3);

        baby2.talking("gugu", 4);
    }
}
