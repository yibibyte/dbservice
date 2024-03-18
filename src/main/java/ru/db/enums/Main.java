package ru.db.enums;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    private final String description;

    // Пример конструктора
    Season() {
        this.description = "Default description";
    }

    // Пример статического метода
    public static void printAllSeasons() {
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }

    // Пример метода перечисления
    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования перечисления
        Season currentSeason = Season.SPRING;
        System.out.println("Current season: " + currentSeason);

        // Вызов статического метода
        Season.printAllSeasons();

        // Вызов метода перечисления
        System.out.println("Description of SPRING: " + Season.SPRING.getDescription());
    }
}
