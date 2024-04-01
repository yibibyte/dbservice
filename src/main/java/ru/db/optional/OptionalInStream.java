package ru.db.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Stream API
 */
public class OptionalInStream {
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

        // Пример использования Optional в Stream API
        String concatenatedValues = optionalValues.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated values: " + concatenatedValues);
    }
}
