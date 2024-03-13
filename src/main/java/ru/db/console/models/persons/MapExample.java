package ru.db.console.models.persons;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("Max", "Maximov");
        students.put("Petr", "Petrov");
        students.put("Ivan", "Ivanov");

        System.out.println(students.entrySet());

        // 1 способ получения значения по ключу
        for (String s : students.keySet()) {
            String lastname = students.get(s);
        }

        // 2 cпособ получения значения по ключу - более употребим
        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(
                    "Student name is = " + student.getKey() + " and student lastname is = " + student.getValue()
            );
        }
        Map<String, Integer> people = new HashMap<>();

        // Добавление элемента в словарь
        people.put("Max", 2006);
        people.put("Petr", 1998);
        people.put("Ivan", 1981);

        System.out.println(people);
        // => {Max=2006, Petr=1998, Ivan=1981}
        System.out.println("Размер Map: " + people.size());
        // => Размер Map: 3

        Map<String, Integer> additionalPeopleMap = new HashMap<>();
        additionalPeopleMap.put("Vladimir", 1978);
        additionalPeopleMap.put("Robert", 2010);
        additionalPeopleMap.put("Ibrahim", 2011);

        // Метод putAll() копирует все значения из переданного словаря в текущий
        people.putAll(additionalPeopleMap);

        System.out.println(people);
        // => {Ibrahim=2011, Max=2006, Robert=2010, Petr=1998, Ivan=1981, Vladimir=1978}

        // Проверка на наличие в словаре ключа
        System.out.println(people.containsKey("Max")); // => true

        //  и значения
        System.out.println(people.containsValue(2021)); // => false

        // Удаление элемента из словаря
        people.remove("Robert");
        System.out.println(people);
        // => {Ibrahim=2011, Max=2006, Petr=1998, Ivan=1981, Vladimir=1978}

        // Удаление всех элементов
        people.clear();
        System.out.println(people);
    }
}
