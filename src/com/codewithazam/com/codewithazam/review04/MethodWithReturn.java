package com.codewithazam.com.codewithazam.review04;

public class MethodWithReturn {
    public static void main(String[] args) {
        String name = "Akan";
        int numOfCharacters = name.length();

        System.out.println("The length of " + name + " is " + numOfCharacters);

        MethodWithReturn m = new MethodWithReturn();
        System.out.println(m.isOdd(29));

        boolean result = m.isOddEnhanced(30);
        System.out.println(result);


    }

    boolean isOdd(int num) {
        boolean result;

        if (num % 2 == 1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    boolean isOddEnhanced(int num) {
        return (num % 2 == 1);
    }
}
