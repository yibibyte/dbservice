package ru.db.lambda;

/**
 * Использование лямбда-выражения для реализации функционального интерфейса Runnable
 * В этом примере лямбда-выражение () -> {...} реализует метод run()
 * интерфейса Runnable, позволяя нам создать поток, который выполняет указанные действия.
 */
public class MainLambdaCreateThread {
    public static void main(String[] args) {
        // Создание и запуск потока с использованием лямбда-выражения
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count: " + i);
            }
        });
        thread.start();
    }
}
