package ru.db.multithreading.thread;

/**
 * слово volatile используется для модификатора переменной, чтобы указать,
 * что ее значение может быть изменено несколькими потоками одновременно,
 * и изменения должны быть видны всем потокам без блокировок. Основное
 * предназначение volatile - это обеспечение согласованности данных между потоками.
 * переменная flag объявлена с модификатором volatile, поэтому изменения этой переменной,
 * сделанные одним потоком, будут немедленно видны другим потокам без
 * необходимости синхронизации. Это гарантирует, что поток, ожидающий
 * изменения флага, не будет зацикливаться в бесконечном цикле, ожидая
 * обновления значения переменной.
 */
public class VolatileValue {
    private volatile boolean flag = false; // Объявление volatile переменной

    public void setFlag() {
        flag = true; // Установка флага в true
    }

    public void waitForFlag() {
        while (!flag) {
            // Ждем, пока флаг не станет true
        }
        System.out.println("Флаг сейчас в true");
    }

    public static void main(String[] args) {
        VolatileValue flagVolatileValue = new VolatileValue();

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flagVolatileValue.setFlag(); // Устанавливаем флаг после задержки
        });

        Thread thread2 = new Thread(() -> {
            flagVolatileValue.waitForFlag(); // Ожидаем установки флага
        });

        thread1.start();
        thread2.start();
    }
}
