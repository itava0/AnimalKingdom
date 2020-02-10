package com.itavarez;

public abstract class Animal {
    public static int maxId = 0;
    protected int energy;
    protected int id;

    //constructor
    public Animal(int energy) {
        maxId++;
        id = maxId;
        this.energy = energy;
    }

    public Animal() {
        this.energy = 1;
    }

    //Setters & Getters

    public void eat() {
        energy++;
    }

    public int getEnergy() {
        return energy;
    }

    //Abstract Methods
    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    public abstract String getName();

    public abstract int getYear();
}
