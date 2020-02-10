package com.itavarez;

public class Birds extends Animal {
    private String name;
    private int year;

    public Birds(String name, int year, int energy) {
        super(energy);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "breath with lungs";
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

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", year=" + year + '\'' +
                "energy=" + energy + '\'' +
                ", id=" + id +
                '}';
    }
}
