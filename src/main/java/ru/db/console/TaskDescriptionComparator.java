package ru.db.console;

import java.util.Comparator;

public class TaskDescriptionComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        return task1.getDescription().compareTo(task2.getDescription());
    }
}
