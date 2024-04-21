package ru.db.multithreading.thread;

public class YieldExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                Thread.yield(); // Уступить место другим потокам
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
                Thread.yield(); // Уступить место другим потокам
            }
        });

        thread1.start();
        thread2.start();
    }
}
