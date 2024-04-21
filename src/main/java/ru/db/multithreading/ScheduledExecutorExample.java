package ru.db.multithreading;

import java.util.concurrent.*;

// Пример использования ScheduledExecutorService и ScheduledFuture для выполнения задач по расписанию
public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1); // Создание планировщика с одним потоком

        Runnable task = () -> System.out.println("Scheduled task executed at: " + System.currentTimeMillis());

        ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS); // Запуск задачи каждую секунду

        // Остановка планировщика после 5 секунд
        executor.schedule(() -> {
            future.cancel(true);
            executor.shutdown();
        }, 5, TimeUnit.SECONDS);
    }
}
