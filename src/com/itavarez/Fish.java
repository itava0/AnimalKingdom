package com.itavarez;

public class Fish extends Animal {
    private String name;
    private int year;

    public Fish(String name, int year, int energy) {
        super(energy);
        this.name = name;
        this.year = year;
    }
    @Override
    public String move() {
        return "swing";
    }

    @Override
    public String breath() {
        return "breath with gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }
}
