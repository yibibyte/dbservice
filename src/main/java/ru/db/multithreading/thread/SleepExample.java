package ru.db.multithreading.thread;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Countdown: " + (5 - i));
            Thread.sleep(1000); // Приостановка на 1 секунду
        }
        System.out.println("Lift off! или Поехали");
    }
}
