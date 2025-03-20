package ru.db.annotations;

import lombok.Getter;
import lombok.Setter;

/**
 * @Getter и @Setter
 * Автоматически генерируют геттеры и сеттеры для полей.
 */
public class UserLombok {
    @Getter @Setter
    private String name;

    @Getter
    @Setter
    private int age;
}