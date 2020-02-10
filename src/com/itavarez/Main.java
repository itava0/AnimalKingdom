package com.itavarez;

import java.util.ArrayList;

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

        //New array with all the animal
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        System.out.println(animalList.toString());
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animalList.sort((a, b) -> b.getYear() - a.getYear());
        System.out.println(animalList.toString());

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println(animalList);
    }
}

