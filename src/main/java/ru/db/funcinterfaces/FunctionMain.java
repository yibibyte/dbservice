package ru.db.funcinterfaces;

import java.util.Scanner;
import java.util.function.*;

public class FunctionMain {
    public static void main(String[] args) {

        // Predicate Проверка числа на четность
        Predicate<Integer> predicate = value -> value % 2 == 0;
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(2));

        // Consumer<Integer> consumer = string -> System.out.println(string);
        Consumer<Integer> consumer = string -> System.out.println("Это результат Consumer Interface в консоли");
        System.out.println(consumer);

        // Consumer<Integer> consumer = System.out::println;
        // System.out.println(consumer);

        // Function Multiplier valuer by 2
        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(function.apply(15));
        System.out.println(function.apply(25));

        // Supplier Integer Вывести значение Integer на экран консоли
        Supplier<Integer> supplierInteger = () -> 999;
        System.out.println(supplierInteger.get());

        // Supplier String Вывести значение String на экран консоли
        Supplier<String> supplierString = () -> "Строка интерфейс Supplier";
        System.out.println(supplierString.get());

        // Supplier for Scanner, Ввести значение на экран консоли
        Supplier<Integer> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число : ");
            return scanner.nextInt();
        };
        System.out.println(text.get());

        // UnaryOperator Умножние значения Integer на два, где на выходе будет тоже значение Integer
        UnaryOperator<Integer> unaryOperator = value -> value * 2;
        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator.apply(10));

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

        System.out.println(binaryOperator.apply(5, 2));
        System.out.println(binaryOperator.apply(40, 20));

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator2 = (a, b) -> a * b;
        System.out.println(binaryOperator2.apply(50, 2));
        System.out.println(binaryOperator2.apply(20, 5));

        // BinaryOperator
        BinaryOperator<Integer> binaryOperatorMultiply = (a, b) -> a * b;
        System.out.println(binaryOperatorMultiply.apply(40, 30));
        BinaryOperator<Integer> binaryOperatorPow = (a, b) -> (int) Math.pow(a, b);
        System.out.println(binaryOperatorPow.apply(10, 20));


    }
}
