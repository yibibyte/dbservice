package ru.db.multithreading.thread;

/**
 * Прерывание (Interrupted)
 */
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.interrupted()) {
                    System.out.println("Поток запущен...");
                    Thread.sleep(1000); // Поток может быть прерван во время сна
                }
            } catch (InterruptedException e) {
                System.out.println("Поток прерван.");
            }
        });

        thread.start();
        // Подождем некоторое время, а затем прервем поток
        try {
            Thread.sleep(3000);
            thread.interrupt(); // Прерывание потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
