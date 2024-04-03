package ru.db.stream.streams;

import java.util.*;
import java.util.stream.Collectors;

public class MainStreamProduct {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Молоко", 50, "Напитки"),
                new Product("Хлеб", 30, "Хлебобулочные изделия"),
                new Product("Яйца", 60, "Напитки"),
                new Product("Сыр", 120, "Молочные продукты"),
                new Product("Колбаса", 150, "Мясные продукты"),
                new Product("Яблоки", 80, "Фрукты"),
                new Product("Бананы", 90, "Фрукты"),
                new Product("Огурцы", 40, "Овощи")
        );

        // 1. Сгруппировать продукты по категории

        Map<String, List<Product>> productsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("Продукты по категории: " + productsByCategory);

        // 2. Найти самый дорогой продукт в каждой категории

        Map<String, Optional<Product>> mostExpensiveProductsByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))));

        System.out.println("Самые дорогие продукты по категории: " + mostExpensiveProductsByCategory);

        // 3. Найти среднюю цену продуктов

        double averagePrice = products.stream()
                .mapToInt(Product::getPrice)
                .average()
                .getAsDouble();

        System.out.println("Средняя цена продуктов: " + averagePrice);

        // 4. Найти список продуктов, название которых содержит слово "я"

        List<Product> productsWithNameContainsЯ = products.stream()
                .filter(product -> product.getName().contains("я"))
                .collect(Collectors.toList());

        System.out.println("Список продуктов, название которых содержит слово \"я\": " + productsWithNameContainsЯ);
    }
}