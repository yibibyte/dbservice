package ru.db.stream.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
    // squaredNumbers будет содержать [1, 4, 9, 16]
    List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(3, 4, 5)
    );
    List<Integer> flatList = listOfLists.stream()
            .flatMap(list -> list.stream())
            .collect(Collectors.toList());
// flatList будет содержать [1, 2, 3, 4, 5]

    public static void main(String[] args) {

    }
}
