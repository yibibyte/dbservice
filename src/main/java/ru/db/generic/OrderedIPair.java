package ru.db.generic;

// Реализация обобщенного интерфейса:
public class OrderedIPair<K, V> implements IPair<K, V> {
    private K key;
    private V value;

    public OrderedIPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
