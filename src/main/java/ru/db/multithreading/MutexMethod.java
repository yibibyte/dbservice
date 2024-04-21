package ru.db.multithreading;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Два потока пытаются одновременно войти в критическую секцию.
 * Мьютекс гарантирует, что только один поток может находиться
 * в критической секции в один момент времени.
 * Это предотвращает конфликты данных и гонки условий.
 *
 * ReentrantLock: Класс ReentrantLock используется для реализации мьютекса.
 * lock(): Метод lock() блокирует мьютекс. Если мьютекс уже заблокирован
 * другим потоком, текущий поток будет ждать, пока мьютекс не станет доступным.
 * unlock(): Метод unlock() разблокирует мьютекс.
 * synchronized: Ключевое слово synchronized автоматически создает и использует
 * мьютекс для синхронизации доступа к методу.
 * try-finally: Блок try-finally используется для обеспечения того, что мьютекс
 * всегда будет разблокирован, даже если в критической секции произойдет исключение.
 */
public class MutexMethod {


    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        MutexMethod example = new MutexMethod();
        Thread thread1 = new Thread(() -> example.criticalSection());
        Thread thread2 = new Thread(example::criticalSection);

        thread1.start();
        thread2.start();
    }

    public synchronized void criticalSection() {
        lock.lock();
        try {
            System.out.println("Поток вошел в критическую секцию");
            Thread.sleep(1000); // Имитация работы в критической секции
            System.out.println("Поток выходит из критической секции");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
