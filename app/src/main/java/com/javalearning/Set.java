package com.javalearning;

import java.util.HashSet;

public class Set {
    public static void main(String[] args){}
    public static  void set(){
        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("a");
        myHashSet.add("b");
        myHashSet.add("c");
        myHashSet.add("a");

        System.out.println("My Hash Set size: " + myHashSet.size());
        // output should be 3 because hashset does no include duplicate item
    }
}
