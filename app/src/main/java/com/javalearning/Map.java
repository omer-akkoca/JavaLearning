package com.javalearning;

import java.util.HashMap;

public class Map {
    public static void main(String[] args){}
    public static void map(){
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("name", "Ömer");
        myHashMap.put("surname", "Akkoca");

        String fullname = myHashMap.get("name") + " " + myHashMap.get("surname");

        System.out.println("Your full name is " + fullname);

        HashMap<String, Integer> points = new HashMap<>();
        points.put("omer", 78);
        points.put("sude", 56);
        points.put("furkan", 13);

        System.out.println("Sude's point is " + points.get("sude"));
    }
}
