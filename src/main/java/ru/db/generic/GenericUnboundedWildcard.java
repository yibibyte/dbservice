package ru.db.generic;

import java.util.List;

/**
 * Unbounded Wildcard (?)
 */
public class GenericUnboundedWildcard {
    public static double sumList(List<?> list) {
        double sum = 0.0;
        for (Object element : list) {
            if (element instanceof Number) {
                sum += ((Number) element).doubleValue();
            }
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
