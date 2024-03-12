package ru.db.generic;

public class NumberBox<T extends Number> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}