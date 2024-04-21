package ru.db.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Concurrent (использование классов из java.util.concurrent)
 *  с использованием атомарных операций типа AtomicInteger
 */
public class ConcurrentExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Атомарное увеличение на 1
    }

    public int getCount() {
        return count.get();
    }
}