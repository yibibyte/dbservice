package ru.db.generic;

/**
 * Неправильный способ создания массива обобщенного типа
 * Попытка создать массив T[] напрямую приведет к ошибке компиляции,
 * так как Java не позволяет создавать массивы с параметризованными типами.
 * @param <T>
 */

public class IncorrectGenericArray<T> {
    private T[] array;

    public IncorrectGenericArray(int size) {

        // array = new T[size]; // Это вызовет ошибку компиляции
        // array = new T[size]; // Type parameter 'T' cannot be instantiated directly

    }
}