package ru.db.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Использование лямбда-выражения для сортировки списка
 * В этом примере лямбда-выражение передается в метод sort списка для определения критерия сортировки строк по их длине
 */
public class MainLambdaSortByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Сортировка списка строк по длине с использованием лямбда-выражения
        names.sort((s1, s2) -> s1.length() - s2.length());

        //names.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted names by length: " + names);
    }
}
