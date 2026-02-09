package com.javalearning.Classes;

import androidx.annotation.NonNull;

public class Player {
    private String name;
    private String surname;
    private int skillPoint;

    public Player(String name, String surname, int skillPoint){
        this.name = name;
        this.surname = surname;
        this.skillPoint = skillPoint;
    }

    public void writePlayer(){
        String text = this.name + " " + this.surname + ": " + this.skillPoint;
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSkillPoint() {
        return skillPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSkillPoint(int skillPoint) {
        this.skillPoint = skillPoint;
    }
}
