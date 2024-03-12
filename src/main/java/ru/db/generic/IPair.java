package ru.db.generic;

public interface IPair<K, V> {
    K getKey();
    V getValue();
}