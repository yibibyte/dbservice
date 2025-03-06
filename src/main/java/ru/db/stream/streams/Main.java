package ru.db.stream.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");

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

    // Фильтрация и сбор в список
    List<String> filtered = list.stream()
            .filter(s -> s.length() > 3)
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    // Сумма четных чисел
    int sum = Arrays.stream(new int[]{1, 2, 3, 4})
            .filter(n -> n % 2 == 0)
            .sum();

    // Поиск первого элемента
    Optional<String> first = Stream.of("a", "b", "c")
            .findFirst();

    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1, 2, 3, 4})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
