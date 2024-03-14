package ru.db.generic;

public class Box<T> {
    private T content;
    private int volume;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    public int getVolume() {
        return volume;
    }
}
