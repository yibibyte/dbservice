package ru.db.console.managers;

import ru.db.console.comparators.tasks.TaskStateComparator;
import ru.db.console.models.tasks.Task;

import java.util.Collections;
import java.util.List;

/**
 * Класс менеджер, как некая надстройка над реализацией нашего Comparator по State
 * для сортировки task с использованием метода sortTasksByName()
 */
public class ManagerSort {
    public static void sortTasksByComparator(List<Task> tasks) {
        Collections.sort(tasks, new TaskStateComparator());
    }
}