package ru.db.enums;

enum RainbowColor {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;
}

/**
 * Цвета радуги
 */
public class MainEnumRainbowColor {
    public static void main(String[] args) {
        RainbowColor favoriteColor = RainbowColor.BLUE;
        System.out.println("My favorite color is " + favoriteColor);
    }
}
