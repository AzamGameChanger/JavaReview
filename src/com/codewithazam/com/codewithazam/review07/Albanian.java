package com.codewithazam.com.codewithazam.review07;

public class Albanian extends Human {

    public Albanian() {

    }

    public Albanian(String name) {
        super(name);
    }

    // when overriding the method signature must be the same
    @Override
    public void talk() {
        System.out.println("Une flas shqip. Une quhem " + name);
    }

    public void albanianDance(){
        System.out.println("Dancing valle kosovare!");
    }
}
