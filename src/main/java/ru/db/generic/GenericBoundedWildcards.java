package ru.db.generic;

import java.util.List;

/**
 * Upper Bounded Wildcard (<? extends T>):
 */
public class GenericBoundedWildcards {
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sumList(integerList));
        System.out.println("Sum of doubles: " + sumList(doubleList));
    }
}