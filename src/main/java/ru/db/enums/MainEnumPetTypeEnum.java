package ru.db.enums;

enum PetType {
    DOG, CAT, BIRD, FISH, HAMSTER;
}

/**
 * Типы домашних животных
 */
public class MainEnumPetTypeEnum {
    public static void main(String[] args) {
        PetType myPet = PetType.DOG;
        System.out.println("My pet is  " + myPet);
    }
}
