package ru.db.generic;

import javafx.scene.SubScene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastingType {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        ArrayList<Animal> animalsArrayList = new ArrayList<>();
        Dog dog = new Dog();
        animals.add(dog);

        if (animals.get(0) instanceof Dog) {
            Dog retrievedDog = (Dog) animals.get(0);
            System.out.println("Теперь безопасно использовать объект типа Dog");
            retrievedDog.printDog();
        } else {
            System.out.println("Объект не является экземпляром класса Dog");
            animals.get(0).printAnimal();
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

