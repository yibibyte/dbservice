package ru.db.multithreading.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Я отдельный поток! - MyThread");
    }
}

