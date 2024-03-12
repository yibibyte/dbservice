package ru.db.generic;

public class Util {
    public static <T> T getElement(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        return null;
    }
}