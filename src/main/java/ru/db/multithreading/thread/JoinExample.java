package ru.db.multithreading.thread;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Ждем завершения thread1
        thread2.join(); // Ждем завершения thread2

        System.out.println("Both threads have finished.");
    }
}
