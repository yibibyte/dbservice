package ru.db.stream.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStreamPerson {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Андрей", 25),
                new Person("Мария", 30),
                new Person("Иван", 22),
                new Person("Ольга", 28),
                new Person("Сергей", 35)
        );

        // 1. Найти средний возраст всех людей

        double averageAge = persons.stream()
                .mapToInt(Person::getAge) // Преобразуем Person в int (возраст)
                .average() // Находим среднее значение
                .getAsDouble(); // Преобразуем OptionalDouble в double

        System.out.println("Средний возраст: " + averageAge);

        // 2. Найти список имен всех людей старше 30 лет

        List<String> namesOver30 = persons.stream()
                .filter(person -> person.getAge() > 30) // Фильтруем людей старше 30 лет
                .map(Person::getName) // Преобразуем Person в String (имя)
                .toList(); // Собираем Stream в List
        System.out.println("Список имен людей старше 30:");
        namesOver30.forEach(System.out::print);

        // 3. Найти самого молодого человека

        Person youngestPerson = persons.stream()
                .min(Comparator.comparingInt(Person::getAge)) // Сравниваем людей по возрасту и находим самого младшего
                .orElse(null); // Возвращаем null, если список пустой

        System.out.println("Самый молодой человек: " + youngestPerson.getName() + youngestPerson.getAge());
    }
}

