package ru.db.generic;

/**
 * Создание массива происходит через new Object[size], а затем происходит приведение типа к T[].
 * Это позволяет обойти ограничение и создать массив, который будет хранить элементы обобщенного типа.
 * Использование аннотации @SuppressWarnings("unchecked") помогает избежать предупреждений
 * компилятора о небезопасном приведении типов.
 * @param <T>
 */
public class CorrectGenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public CorrectGenericArray(int size) {
        // Правильный способ создания массива обобщенного типа
        array = (T[]) new Object[size]; // Приведение типа для создания массива
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        CorrectGenericArray<String> stringArray = new CorrectGenericArray<>(5);
        stringArray.set(0, "Hello");
        System.out.println(stringArray.get(0)); // Вывод: Hello

        CorrectGenericArray<Integer> intArray = new CorrectGenericArray<>(5);
        intArray.set(0, 42);
        System.out.println(intArray.get(0)); // Вывод: 42
    }
}
