package ru.db.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Пример использования ExecutorService и Executors для создания и управления потоками
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Создание пула потоков из 5 потоков

        executor.execute(() -> System.out.println("Task executed by thread: " + Thread.currentThread().getName()));

        executor.shutdown(); // Остановка пула потоков после завершения всех задач
    }
}
