package ru.db.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Блокировка объектов (Lock)
 */
public class LockExample {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Захват блокировки
        try {
            count++;
        } finally {
            lock.unlock(); // Освобождение блокировки в finally блоке
        }
    }

    public int getCount() {
        return count;
    }
}
