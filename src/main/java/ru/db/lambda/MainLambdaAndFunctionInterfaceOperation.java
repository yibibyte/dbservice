package ru.db.lambda;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

/**
 * Использование лямбда-выражения для реализации пользовательского функционального интерфейса
 * В этом примере мы создаем пользовательский функциональный интерфейс MathOperation,
 * а затем используем лямбда-выражение (a, b) -> a + b для реализации метода operate(),
 * выполняющего операцию сложения двух чисел
 */
public class MainLambdaAndFunctionInterfaceOperation {
    public static void main(String[] args) {

        // Использование лямбда-выражения для реализации пользовательского функционального интерфейса
        MathOperation addition = Integer::sum;

        // MathOperation addition = Integer::sum;

        // Выполнение операции сложения
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
