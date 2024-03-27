package ru.db.funcinterfaces;

public class OperationMain {
    public static void main(String[] args) {
        // Lambda expression
        // Action<Integer> multiplyAction = (variableOne, variableTwo) -> variableOne + variableTwo;
        Action<Integer> multiplyAction = (Integer variableOne, Integer variableTwo) -> variableOne + variableTwo;
        System.out.println(multiplyAction);

        Action<String> concatinationAction = (variableOne, variableTwo) -> variableOne + variableTwo;
        System.out.println(concatinationAction.getValueAction("One", "Two"));

        FunctionIntegerImpl functInteger = new FunctionIntegerImpl();
        System.out.printf(functInteger.getValueAction(300, 400) + " ");

        FunctionStringImpl functionString = new FunctionStringImpl();
        System.out.printf(functionString.getValueAction("Hello", "World"));
    }
}
