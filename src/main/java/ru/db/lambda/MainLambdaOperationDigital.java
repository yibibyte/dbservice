package ru.db.lambda;

import java.util.function.DoubleUnaryOperator;

/**
 * Возврат функции для выполнения операции над числами
 * В этом примере функция createOperation принимает лямбда-выражение
 * и возвращает функциональный интерфейс DoubleUnaryOperator,
 * который можно использовать для выполнения операций над числами.
 */
public class MainLambdaOperationDigital {
    public static void main(String[] args) {
        DoubleUnaryOperator square = createOperation(x -> x * x);
        DoubleUnaryOperator cube = createOperation(x -> x * x * x);

        double number = 3.0;
        System.out.println("Square of " + number + ": " + square.applyAsDouble(number));
        System.out.println("Cube of " + number + ": " + cube.applyAsDouble(number));
    }

    // Метод для создания функции для операции над числами
    public static DoubleUnaryOperator createOperation(DoubleUnaryOperator operation) {
        return operation;
    }
}
