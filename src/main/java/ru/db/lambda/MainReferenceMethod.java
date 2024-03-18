package ru.db.lambda;

import java.util.function.Function;

/**
 * Ссылочные методы в Java позволяют использовать уже существующие методы как реализацию
 * функционального интерфейса. Это делает код более компактным и улучшает его читаемость
 * В этом примере toUpperCase является статическим методом класса String.
 * Мы создаем ссылку на этот метод с помощью оператора :: и присваиваем его
 * переменной типа Function<String, String>. Теперь переменная
 * toUpperCaseFunction представляет собой объект функционального интерфейса,
 * который вызывает метод toUpperCase при вызове своего метода apply.
 */
public class MainReferenceMethod {
    public static void main(String[] args) {
        // Создаем ссылку на метод toUpperCase класса String
        Function<String, String> toUpperCaseFunction = String::toUpperCase;

        // Вызываем метод apply для преобразования строки в верхний регистр
        String result = toUpperCaseFunction.apply("hello world");

        System.out.println("Result: " + result);
    }
}
