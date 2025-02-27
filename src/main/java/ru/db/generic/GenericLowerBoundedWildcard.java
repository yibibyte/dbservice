package ru.db.generic;

import java.util.List;

/**
 * Lower Bounded Wildcard (<? super T>):
 */
public class GenericLowerBoundedWildcard {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Object> objectList = new java.util.ArrayList<>();
        objectList.add(100.0);
        addNumbers(objectList);

        System.out.println("Object List: " + objectList);
    }
}