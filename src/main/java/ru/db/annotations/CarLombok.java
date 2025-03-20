package ru.db.annotations;

import lombok.*;

/**
 * @NoArgsConstructor, @AllArgsConstructor, @RequiredArgsConstructor
 * @NoArgsConstructor — создает конструктор без аргументов.
 *
 * @AllArgsConstructor — создает конструктор со всеми полями.
 *
 * @RequiredArgsConstructor — создает конструктор для полей с final или @NonNull.
 */

@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
//@ToString
public class CarLombok {
    @NonNull
    private String model;
    private int year;
    private final String vin;
}