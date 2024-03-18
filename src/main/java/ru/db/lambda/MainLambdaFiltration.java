package ru.db.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Использование лямбда-выражения для фильтрации списка
 * Этот пример демонстрирует, как лямбда-выражение передается в метод filter
 * в качестве параметра predicate для определения критерия фильтрации списка.
 */
public class MainLambdaFiltration {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Функция фильтрации, использующая лямбда-выражение
        List<String> filteredNames = filter(names, s -> s.startsWith("A"));

        System.out.println("Отфильтрованные имена, начинающиеся с \"A\": " + filteredNames);
    }

    // Метод для фильтрации списка строк на основе заданного предиката
    public static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }
}
