package ru.db.funcinterfaces;

import java.util.Scanner;
import java.util.function.*;

public class FunctionMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = value -> value % 2 == 0;
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(2));


        //Consumer<Integer> consumer = string -> System.out.println(string);
        Consumer<Integer> consumer = string -> System.out.println("This is Result Consumer Interface in Console");
        System.out.println(consumer);

        // Consumer<Integer> consumer = System.out::println;
        // System.out.println(consumer);

        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(function.apply(1));
        System.out.println(function.apply(2));

        // Supplier
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        // Supplier

        Supplier<Integer> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            return scanner.nextInt();
        };
        System.out.println(text.get());

        //UnaryOperator
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
        BinaryOperator<Integer> binaryOperatorPow = (a, b) -> (int) Math.pow(a,b);
        System.out.println(binaryOperatorPow.apply(10, 20));



    }
}
