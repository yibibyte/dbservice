package ru.db.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/**
 * Возврат функции для выполнения операции сравнения
 * В этом примере функция createComparator возвращает
 * лямбда-выражение, которое в зависимости от заданного
 * типа создает и возвращает соответствующий компаратор для строк.
 */
public class MainLambdaComparingStrings {
    public static void main(String[] args) {
        // Объявление переменной stringComparator, которая является функциональным интерфейсом,
        // принимающим строку и возвращающим компаратор строк
        Function<String, Comparator<String>> stringComparator = createComparator();

        // Создание компаратора для сортировки строк по их длине с помощью stringComparator
        Comparator<String> lengthComparator = stringComparator.apply("length");

        // Создание компаратора для сортировки строк в алфавитном порядке с помощью stringComparator
        Comparator<String> alphabeticalComparator = stringComparator.apply("alphabetical");


        String[] words = {"apple", "banana", "grape", "orange"};
        Arrays.sort(words, lengthComparator);
        System.out.println("Sorted by length: " + Arrays.toString(words));
        Arrays.sort(words, alphabeticalComparator);
        System.out.println("Sorted alphabetically: " + Arrays.toString(words));
    }

    // Метод для создания функции для сравнения строк
    public static Function<String, Comparator<String>> createComparator() {
        return type -> {
            if (type.equals("length")) {
                return Comparator.comparingInt(String::length);
            } else if (type.equals("alphabetical")) {
                return Comparator.naturalOrder();
            }
            throw new IllegalArgumentException("Unknown comparison type: " + type);
        };
    }
}
