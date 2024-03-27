package ru.db.funcinterfaces;

public class FunctionStringImpl implements Action<String>{
    @Override
    public String getValueAction(String firstVariable, String secondVariable) {
        return firstVariable + secondVariable;
    }
}
