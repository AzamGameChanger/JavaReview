package com.codewithazam.com.codewithazam.review07;

public class World {

    public static void main(String[] args) {

        Human h1 = new Human("Komron");
        System.out.println("The first human is " + h1.name);
        System.out.println("He lives in " + Human.planet);

        Human h2 = new Human("Murad");
        System.out.println("He lives in " + Human.planet);

        Human h3; // Declaring a variable of type human
        h3 = new Albanian("Evis"); // Creating an Albanian and assign it to h3
        // up-casting

        System.out.println(h3.name + " lives in " + Human.planet);

        Human h4 = new Turkish("Mustafa"); // up-casting, automatically
        System.out.println(h4.name + " lives in " + Human.planet);

        System.out.println("------------------------- Let's make the people talk : ------------------------");
        h1.talk();
        h2.talk();
        h3.talk();
        h4.talk();

        System.out.println("========================================");

        // compile error, because h4 is of type Human
        // h4.makeBaklava();

        // down-casting, manually
        Turkish t1 = (Turkish) h4;
        t1.talk();
        t1.makeBaklava();

        // this will give us a runtime error
        // Turkish t2 = (Turkish) h3;
        // t2.makeBaklava();


        // Polymorphism
        // Method overriding
        // Run time polymorphism/late binding/dynamic binding


        // The safe way to down-cast
        if (h4 instanceof Turkish ){
            Turkish turk = (Turkish) h4;
            turk.makeBaklava();
        }
        else if (h4 instanceof Albanian){
            Albanian albanian = (Albanian) h4;
            albanian.albanianDance();
        }

        System.out.println("=========================purpose of polymorphism===========================");
        American american = new American("Donald", "123-123-1234");
        american.talk();
        american.taxReturn();

        Human h5 = american; // up-casting/automatically
        h5.talk();
        // h5.taxReturn();

        American a2 = (American) h5; // down - casting, manually
        a2.taxReturn();
        a2.talk();

        System.out.println("-----------------------------");

        Human[] humans = new Human[6];
        humans[0] = h1;
        humans[1] = h2;
        humans[2] = h3; // Albanian, no up-casting
        humans[3] = h4; // Turkish
        humans[4] = h5; // American, up-casting
        humans[5] = new Turkish("Okan"); // up-casting
        // This is possible because of inheritance

        System.out.println("=====================================");
        for (Human element:humans){
            System.out.println("--------");
            element.talk();

            if (element instanceof Albanian){
                Albanian albanian = (Albanian) element;
                albanian.albanianDance();
            }
            else if (element instanceof Turkish){
                Turkish turkish = (Turkish) element;
                turkish.makeBaklava();
            }
            else if (element instanceof American){
                American amer = (American) element;
                amer.taxReturn();
            }
        }

    }

}
