package ru.db.console.iterators;

import ru.db.console.models.tasks.Task;

import java.util.Iterator;
import java.util.Map;

/**
 * Это кастомная форма Iterator'а для реализации,
 * какой-то своей логики прохождения по элементам Map
 */
public class TaskMapIterator {
    public void iterateTasks(Map<Integer, Task> taskMap) {
        Iterator<Map.Entry<Integer, Task>> iterator = taskMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Task> entry = iterator.next();
            Integer taskId = entry.getKey();
            Task task = entry.getValue();
            System.out.println("Task ID: " + taskId + ", State: " + task.getState() + ", Description: " + task.getDescription());
        }
    }
}