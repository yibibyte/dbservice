package ru.db.annotations;

public class Person {
    private String name;

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.name = name;
    }
}