package com.codewithazam.com.codewithazam.review07;

public class Turkish extends Human{

    public Turkish(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Ben turkce konusuyorum. Benim adim " + name);
    }

    public void makeBaklava(){
        System.out.println("I am making baklava.");
    }
}
