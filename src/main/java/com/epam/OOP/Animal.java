package com.epam.OOP;

public class Animal {
    private String color;
    private int NumberOfPaws;
    private boolean hasFur;

    public Animal(String color, int NumberOfPaws, boolean hasFur) {
        this.color = color;
        this.NumberOfPaws = NumberOfPaws;
        this.hasFur = hasFur;
    }

    public void getDescription() {
        System.out.print("This animal is mostly " + color + ". It has " + NumberOfPaws + " paws and ");
        if (hasFur) System.out.print("a");
        else System.out.print("no");
        System.out.print(" fur.");
    }

}
