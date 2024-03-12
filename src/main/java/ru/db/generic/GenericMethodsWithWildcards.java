package ru.db.generic;

import java.util.List;

public class GenericMethodsWithWildcards {
    public static <T> void displayList(List<T> list) {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = List.of("A", "B", "C");

        displayList(integerList);
        displayList(stringList);
    }
}