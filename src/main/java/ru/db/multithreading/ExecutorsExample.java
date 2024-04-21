package ru.db.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    public static void main(String[] args) throws Exception {
        // Создаем пул потоков с кешированием
        ExecutorService executor = Executors.newCachedThreadPool();

        // Запускаем 10 задач Runnable в пуле потоков
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println("Выполняю задачу " + finalI);
            });
        }

        // Ожидаем завершения всех задач в пуле
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
