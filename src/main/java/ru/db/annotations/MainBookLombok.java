package ru.db.annotations;

public class MainBookLombok {
    public static void main(String[] args) {
        BookLombok book = BookLombok.builder()
                .title("Java Core")
                .author("Joshua Bloch")
                .pages(500)
                .build();
        System.out.println(book);
    }
}

