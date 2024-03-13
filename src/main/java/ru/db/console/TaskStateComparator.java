package ru.db.console;

import java.util.Comparator;

public class TaskStateComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        return task1.getState().compareTo(task2.getState());
    }
}
