package com.javalearning;

public class Variables {
    public static  void variables(){
        System.out.println("This is a test string");
        int x = 2;
        int y = 9;
        System.out.println("x times y equals " + x * y);

        int myInt = 20;
        long myLong = 26;
        double myDouble = 10.0;
        float myFloat = 10.0f;

        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myFloat: " + myFloat);

        // String
        String name = "Ömer";
        String surname = "Akkoca";
        String fullname = name + " " + surname;
        System.out.println(fullname);

        // Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println("isAlive = " + isAlive);

        // Final
        final int birthDate = 2000;
        System.out.println("birthDate: " + birthDate);
    }
}
