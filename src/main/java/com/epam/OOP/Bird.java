package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public void getDescription(){
        super.getDescription();
        System.out.println("Moreover, it has 2 wings and can fly.");
    }
}