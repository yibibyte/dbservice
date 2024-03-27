package ru.db.funcinterfaces;

@FunctionalInterface
public interface Action<T> {

    T getValueAction(T firstVariable, T secondVariable);

}
