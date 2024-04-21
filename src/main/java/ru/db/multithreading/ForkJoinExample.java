package ru.db.multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

// Пример использования ForkJoinPool и RecursiveTask для параллельного выполнения задач
public class ForkJoinExample {
    static class MyRecursiveTask extends RecursiveTask<Integer> {
        private final int start;
        private final int end;

        public MyRecursiveTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start < 10) {
                return IntStream.range(start, end).sum();
            } else {
                int mid = start + (end - start) / 2;
                MyRecursiveTask leftTask = new MyRecursiveTask(start, mid);
                MyRecursiveTask rightTask = new MyRecursiveTask(mid, end);
                leftTask.fork();
                int rightResult = rightTask.compute();
                int leftResult = leftTask.join();
                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int result = forkJoinPool.invoke(new MyRecursiveTask(0, 100));
        System.out.println("Result: " + result);
    }
}
