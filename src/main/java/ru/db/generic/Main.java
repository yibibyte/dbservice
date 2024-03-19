package ru.db.generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Ранее
        ArrayList arrayList = new ArrayList<>();
        String string = "Hello World";
        arrayList.add(string);
        arrayList.add(10);
        Object o = arrayList.get(0);
        string = (String) arrayList.get(0);

        // Сейчас
//        ArrayList<String> arrayListNew = new ArrayList<String>();
//        String stringNew = "Hello World";
//        arrayListNew.add(string);
//        arrayListNew.add(10);

        //  Обобщенный класс Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        String content = stringBox.getContent();
        System.out.println(content);

        // Util Обобщенный метод getElement(T[] array, int index)
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer element = Util.getElement(intArray, 2);
        System.out.println("Element at index 2: " + element);

        // IPair Обобщенный интерфейс
        IPair<String, Integer> orderedIPair = new OrderedIPair<>("One", 1);
        System.out.println("Key: " + orderedIPair.getKey() + ", Value: " + orderedIPair.getValue());

        // NumberBox Ограничения типов (bounded types)
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setContent(42);
        Integer intValue = integerBox.getContent();
        System.out.println("Integer value: " + intValue);

        // Множественные обобщенные параметры
        Pair<String, Integer> stringIntegerPair = new Pair<>("One", 1);
        System.out.println("Key: " + stringIntegerPair.getKey() + ", Value: " + stringIntegerPair.getValue());
    }
}
