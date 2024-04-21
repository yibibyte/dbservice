package ru.db.multithreading.thread;

public class Main implements Runnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Запуск потока

        Main main = new Main();
        main.run();

    }

    @Override
    public void run() {
        System.out.println("Я поток Main");
    }
}
