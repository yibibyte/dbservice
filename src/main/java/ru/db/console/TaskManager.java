package ru.db.console;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    public static void sortTasksByName(List<Task> tasks) {
        Collections.sort(tasks, new TaskStateComparator());
    }
}