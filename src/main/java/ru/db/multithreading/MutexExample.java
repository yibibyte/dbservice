package ru.db.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {

    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Поток 1 вошел в критическую секцию");
                Thread.sleep(1000); // Имитация работы в критической секции
                System.out.println("Поток 1 выходит из критической секции");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread thread2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Поток 2 вошел в критическую секцию");
                Thread.sleep(1000); // Имитация работы в критической секции
                System.out.println("Поток 2 выходит из критической секции");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        thread1.start();
        thread2.start();
    }
}
