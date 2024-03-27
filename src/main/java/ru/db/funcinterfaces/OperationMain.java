package ru.db.funcinterfaces;

public class OperationMain {
    public static void main(String[] args) {
        // Lambda expression
        // Action<Integer> multiplyAction = (variableOne, variableTwo) -> variableOne + variableTwo;
        Action<Integer> multiplyAction = (Integer variableOne, Integer variableTwo) -> variableOne + variableTwo;
        System.out.println(multiplyAction);

        Action<String> concatinationAction = (variableOne, variableTwo) -> variableOne + variableTwo;
        System.out.println(concatinationAction.getValueAction("One", "Two"));

    }
}
