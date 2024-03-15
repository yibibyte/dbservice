package ru.db.console.models.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task implements Comparable<Task>, Iterable<Task> {
    //    public class Task implements Comparable<Task>, Comparator<Task>
    private int id;
    private String task;
    private String state;
    private String description;
    private List<Task> taskList;

    // Конструктор
    public Task(int id, String task, String state, String description) {
        this.id = id;
        this.task = task;
        this.state = state;
        this.description = description;
        this.taskList = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Переопределение метода toString() для удобного вывода информации о задаче
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", state='" + state + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task otherTask) {
        // Сравниваем задачи по их id
        return Integer.compare(this.id, otherTask.id);
    }

    // Метод для добавления задачи в коллекцию
    public void addTask(Task newTask) {
        taskList.add(newTask);
    }

    // Реализация методов интерфейса Iterable
    @Override
    public Iterator<Task> iterator() {
        return taskList.iterator();
    }

//    @Override
//    public int compareTo(Task otherTask) {
//        // Реализация compareTo для естественного порядка сортировки
//        return Integer.compare(this.id, otherTask.id);
//    }
//
//    @Override
//    public int compare(Task task1, Task task2) {
//        // Реализация compare для дополнительного способа сравнения (Comparator)
//        return task1.getTask().compareTo(task2.getTask());
//    }
}
