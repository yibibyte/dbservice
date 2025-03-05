package ru.db.generic;

import java.util.ArrayList;
import java.util.List;

public class CastingType {
    public static void main(String[] args) {
        List<Animal> listAnimals = new ArrayList<>();
        //List animals = new ArrayList();
        //ArrayList<Animal> animalsArrayList = new ArrayList<>();
        Dog dog = new Dog();
        Animal animal = new Animal();
        listAnimals.add(dog);
        listAnimals.add(animal);

        if (listAnimals.get(0) instanceof Dog) {
            Dog retrievedDog = (Dog) listAnimals.get(0);
            System.out.println("Теперь безопасно использовать объект типа Dog");
            retrievedDog.printDog();
        } else {
            System.out.println("Объект не является экземпляром класса Dog");
            listAnimals.get(0).printAnimal();
        }
    }
}

class Animal {
    String name;

    public void printAnimal() {
        System.out.println("Animal");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public String name;

    public void printDog() {
        System.out.println("Dog");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

