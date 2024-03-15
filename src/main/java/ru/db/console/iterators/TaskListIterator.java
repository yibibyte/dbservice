package ru.db.console.iterators;

import ru.db.console.models.tasks.Task;

import java.util.Iterator;
import java.util.List;

/**
 * Это кастомная форма Iterator'а для реализации,
 * какой-то своей логики прохождения по элементам List
 */
public class TaskListIterator implements Iterator<Task> {
    private final List<Task> tasks;
    private int currentIndex;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < tasks.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            return tasks.get(currentIndex++);
        }
        return null;
    }
}
