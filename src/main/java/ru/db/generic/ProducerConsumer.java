package ru.db.generic;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer <T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int limit;

    public ProducerConsumer(int limit) {
        this.limit = limit;
    }

    public synchronized void produce(T item) throws InterruptedException {
        while (queue.size() == limit) {
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized T consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T item = queue.poll();
        notifyAll();
        return item;
    }
}
