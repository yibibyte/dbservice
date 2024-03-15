package ru.db.console.models.persons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StartSort {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", "Doe"),
                new Person("Bob", "Dole"),
                new Person("Ronald", "McDonald"),
                new Person("Alice", "McDonald"),
                new Person("Jill", "Doe"));
        Collections.sort(people);
        System.out.println(people);
    }
}
