package com.javalearning;

public class Loops {
    public static void main(String[] args) {}

    public static void loops() {

        // For
        int[] myNumbers = {15,68,42,36,6,57,19,10};

        for(int i = 0; i < myNumbers.length; i++){
            System.out.print("● " + myNumbers[i] + "\n");
        }

        System.out.println("Double It");

        for (int myNumber : myNumbers){
            System.out.print("● " + myNumber * 2 + "\n");
        }

        // While
        int j = 0;
        while (j <= 10) {
            j++;
            System.out.print("j = " + j + ", ");

        }
    }
}
