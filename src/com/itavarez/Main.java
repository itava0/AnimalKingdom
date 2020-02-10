package com.itavarez;

public class Main {

    public static void main(String[] args) {
        Mammals panda = new Mammals("Panda", 1869, 10);
        Mammals zebra = new Mammals("Zebra", 1778, 13);
        Mammals koala = new Mammals("Koala", 1816, 15);
        Mammals sloth = new Mammals("Sloth", 1804, 15);
        Mammals armadillo = new Mammals("Armadillo", 1758, 15);
        Mammals raccoon = new Mammals("Raccoon", 1758, 15);
        Mammals bigfoot = new Mammals("Bigfoot", 2021, 15);

        Birds pigeon = new Birds("Pigeon", 1837, 10);
        Birds peacock = new Birds("Peacock", 1837, 10);
        Birds toucan = new Birds("Toucan", 1837, 10);
        Birds parrot = new Birds("Parrot", 1837, 10);
        Birds swan = new Birds("Swan", 1837, 10);

        Fish salmon = new Fish("Salmon", 1758, 12);
        Fish catfish = new Fish("Catfish", 1817, 12);
        Fish perch = new Fish("Perch", 1758, 12);
    }
}

