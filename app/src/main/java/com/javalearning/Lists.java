package com.javalearning;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {}
    public static void lists(){
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Ömer");;
        myStringList.add("Şakir");;
        myStringList.add("Buse");;
        myStringList.add(1,"Ada");

        System.out.println(myStringList.get(1));
    }
}
