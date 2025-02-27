package ru.db.console.comparators.tasks;

import ru.db.console.models.tasks.Task;

import java.util.Comparator;

/**
 * Реализация интерфейса Comparator для сравнения элементов типа Task по State
 */
public class TaskStateComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {





        return task1.getState().compareTo(task2.getState());
    }
}
