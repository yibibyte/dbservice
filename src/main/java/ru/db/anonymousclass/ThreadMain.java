package ru.db.anonymousclass;

public class ThreadMain {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Этот код выполняется в анонимном классе");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
