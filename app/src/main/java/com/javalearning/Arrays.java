package com.javalearning;

public class Arrays {
    public static void main(String[] args){}
    public static  void  arrays(){
        String[] myStringArray = new String[3];
        myStringArray[0] = "Ömer";
        myStringArray[1] = "Şevki";
        myStringArray[2] = "Halise";

        System.out.println(myStringArray[1]);

        int[] myIntArray = new int[3];
        myIntArray[0] = 26;
        myIntArray[1] = 35;
        myIntArray[2] = 86;

        System.out.println(myIntArray[1]);

        int[] myNumberArray = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(myNumberArray[2]);

    }
}
