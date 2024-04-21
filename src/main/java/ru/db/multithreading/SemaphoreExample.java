package ru.db.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final int PERMITS = 3; // Максимальное количество разрешений

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(PERMITS);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire(); // Получить разрешение
                    System.out.println("Поток " + Thread.currentThread().getId() + " вошел в критическую секцию");
                    Thread.sleep(1000); // Имитация работы в критической секции
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release(); // Освободить разрешение
                    System.out.println("Поток " + Thread.currentThread().getId() + " вышел из критической секции");
                }
            }).start();
        }
    }
}