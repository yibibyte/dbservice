package ru.db.javafx;

public class Model {

    private int id;
    private String task;
    private String state;
    private String description;

    public Model(int id, String task, String state, String description) {
        this.id = id;
        this.task = task;
        this.state = state;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
}
