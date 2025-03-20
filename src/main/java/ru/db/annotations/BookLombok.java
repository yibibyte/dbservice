package ru.db.annotations;

import lombok.Builder;
import lombok.ToString;

/**
 * @Builder
 * Генерирует билдер для удобного создания объектов.
 */
@Builder
@ToString
public class BookLombok {
    private String title;
    private String author;
    private int pages;
}