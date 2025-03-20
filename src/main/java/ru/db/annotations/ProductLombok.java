package ru.db.annotations;

import lombok.Data;

/**
 * @Data
 * Генерирует:
 * Геттеры для всех нестатических полей.
 * Сеттеры для всех не-final полей.
 * Методы toString(), equals(), hashCode().
 * Конструктор для всех final-полей.
 * Эквивалент без Lombok:
 * Класс получил бы 50+ строк кода с геттерами, сеттерами, equals, hashCode, toString.
 */
@Data
public class ProductLombok {
    private final String id;
    private String name;
    private double price;
}
