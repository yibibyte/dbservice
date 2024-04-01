package ru.db.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Пример Wildcard
 *  < ? >
 */

public class WildcardClass {

    // Метод, который принимает список чисел и выводит их на экран
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Wildcard");
        stringList.add("Example");

        System.out.println("Integer List:");
        printList(integerList); // Выводит: 1 2 3

        System.out.println("Double List:");
        printList(doubleList); // Выводит: 1.5 2.5 3.5

        System.out.println("String List:");
        printList(stringList); // Выводит: Hello Wildcard Example
    }
}
