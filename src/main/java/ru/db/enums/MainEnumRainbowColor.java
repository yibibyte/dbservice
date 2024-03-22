package ru.db.enums;

enum RainbowColor {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, TEST("test123");

    RainbowColor() {
    }

    private String color = "GREY";

    RainbowColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

/**
 * Цвета радуги
 */
public class MainEnumRainbowColor {
    public static void main(String[] args) {
        RainbowColor favoriteColor = RainbowColor.BLUE;
        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("Test  " + RainbowColor.TEST.name());
    }
}
