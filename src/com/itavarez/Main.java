package com.itavarez;

import java.util.ArrayList;

public class Main {

    public static void printAnimals(ArrayList<Animal> animal, CheckAnimal tester) {
        for (Animal a : animal) {
            if (tester.test(a)) {
                System.out.println(a.getName() + ", " + a.getYear());
            }
        }
    }

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

        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((a, b)-> a.move().compareToIgnoreCase(b.move()));
        System.out.println(animalList);

        System.out.println("\n*** List only those animals the breath with lungs ***");
        printAnimals(animalList, a -> a.breath() == "breath with lungs");

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        printAnimals(animalList, a -> a.breath() == "breath with lungs" && a.getYear() == 1758);

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        printAnimals(animalList, a -> a.reproduce() == "eggs" && a.breath() == "breath with lungs");
    }
}

