package ru.db.annotations;

import lombok.NonNull;

public class PersonLombok {
    @NonNull
    private String name;

    public void setName(@NonNull String name) {
        this.name = name;
    }
}