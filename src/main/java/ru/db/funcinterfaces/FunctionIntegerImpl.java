package ru.db.funcinterfaces;

public class FunctionIntegerImpl implements Action<Integer>{

    @Override
    public Integer getValueAction(Integer firstVariable, Integer secondVariable) {
        Integer summary = firstVariable + secondVariable;
        return summary;
    }
}
