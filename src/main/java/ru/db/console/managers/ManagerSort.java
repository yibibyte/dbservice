package ru.db.console.managers;

import ru.db.console.models.tasks.Task;
import ru.db.console.comparators.tasks.TaskStateComparator;

import java.util.Collections;
import java.util.List;

/**
 * Использование метода sortTasksByName(List<Task> tasks)
 * Для сортировки task по имени
 */
public class ManagerSort {
    public static void sortTasksByName(List<Task> tasks) {
        Collections.sort(tasks, new TaskStateComparator());
    }
}