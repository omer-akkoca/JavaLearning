package com.javalearning;

public class Statements {
    public static void main(String[] args) {}

    public static void statements() {
        // Operators
        int x = 9;
        System.out.println("x: " + x);
        x++;
        System.out.println("x: " + x);
        x--;
        System.out.println("x: " + x);
        x = x * 5;
        System.out.println("x: " + x);

        int y = 56;
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x <= y));
        System.out.println("x != y: " + (x != y));

        int z = 45;

        System.out.println("x < y veya z < y: " + (x < y ||  z < y));
        System.out.println("x != y veya x >= z: " + (x != y &&  x >= z));

        // Statements
        if (x > y && x > z) {
            System.out.println("X is bigger");
        } else {
            System.out.println("X is NOT bigger");
        }

        int day = 2;
        String dayString = "";

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "'Wednesday'";
                break;
            default:
                dayString = "Sunday";
        }

        System.out.println("dayString: " + dayString);

    }
}
