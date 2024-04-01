package ru.db.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Коллекции
 */
public class OptionalInCollections {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("value1", "value2", null, "value3");

        // Преобразование списка значений в список Optional
        List<Optional<String>> optionalValues = values.stream()
                .map(Optional::ofNullable)
                .collect(Collectors.toList());

        // Фильтрация и получение значений, не являющихся null
        List<String> nonNullValues = optionalValues.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println("Non-null values: " + nonNullValues);
    }
}
