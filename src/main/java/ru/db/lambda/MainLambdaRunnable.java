package ru.db.lambda;

public class MainLambdaRunnable {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Этот код выполняется с помощью лямбда функции");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
