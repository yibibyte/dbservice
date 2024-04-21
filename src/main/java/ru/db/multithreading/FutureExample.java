package ru.db.multithreading;

import java.util.concurrent.*;

// Пример использования Callable и Future для получения результата асинхронной задачи
public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor(); // Создание пула из одного потока

        Callable<String> task = () -> {
            TimeUnit.SECONDS.sleep(2);
            return "Result of the asynchronous task";
        };

        Future<String> future = executor.submit(task); // Запуск асинхронной задачи и получение Future объекта

        System.out.println("Waiting for the result...");

        String result = future.get(); // Получение результата задачи (блокирующий вызов)

        System.out.println("Result: " + result);

        executor.shutdown(); // Остановка пула потоков после завершения всех задач
    }
}
