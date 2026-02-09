package com.javalearning.Classes;

public class Classes {
    public static void main(String[] args) {}
    public static void createPlater(String name, String surname, int skill){
        Player player = new Player(name, surname, skill);
        player.writePlayer();
    }
}
