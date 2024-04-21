package ru.db.multithreading;

import java.util.concurrent.ConcurrentHashMap;

/**
 Ожидаемое поведение:
 Каждый поток пытается добавить уникальную пару ключ-значение к map.
 Поскольку ConcurrentHashMap потокобезопасен, несколько потоков могут
 добавлять элементы одновременно, не вызывая повреждения данных.

 Возможный исход:
 Точный порядок добавления элементов и печати сообщений будет варьироваться
 в зависимости от того, как потоки запланированы операционной системой.
 Однако каждый поток должен иметь возможность успешно добавлять свою пару ключ-значение в map.

 Примечание:
 Этот фрагмент кода демонстрирует только добавление элементов. ConcurrentHashMap
 также предоставляет потокобезопасные методы для извлечения, удаления и повторения элементов.
 */

public class ConcurrentHashMapExample {
    private static final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int count = i;
            new Thread(() -> {
                map.put("key" + count, count);
                System.out.println("Поток " + Thread.currentThread().getId() + " добавил элемент в карту");
            }).start();
        }
       map.elements().asIterator().forEachRemaining(System.out::println);
        map.forEach((s, i) -> System.out.println(i));
    }
}
