package com.codewithazam.com.codewithazam.review06;

public class USA {
    //Access modifiers, we define where these variables can be accessed from
    private String capitalCity = "Washington DC";
    protected String mainState = "New York";
    String normalState = "California";
    public String bestSchool = "Neotech";

    private void selectPresident() {
        System.out.println("Selecting the president only within USA");
    }

    protected void playNBA(){
        System.out.println("There are USA and Canada teams in the NBA");
    }
    public void speakEnglish(){
        System.out.println("English can be spoken everywhere");
    }

    public static void main(String[] args) {
        USA usa = new USA();
        System.out.println("Accessing the variables from inside the USA");
        System.out.println("private -> " + usa.capitalCity);
        System.out.println("protected -> " + usa.mainState);
        System.out.println("default -> " + usa.normalState);
        System.out.println("public -> " + usa.bestSchool);

        System.out.println();

        System.out.println("Accessing the methods from inside the USA");
        usa.selectPresident();
        usa.playNBA();
        usa.speakEnglish();
    }

}
