package ru.db.enums;

/**
 * Математические операции калькулятора
 */
enum Operation {
    ADDITION {
        public int perform(int x, int y) { return x + y; }
    },
    SUBTRACTION {
        public int perform(int x, int y) { return x - y; }
    },
    MULTIPLICATION {
        public int perform(int x, int y) { return x * y; }
    },
    DIVISION {
        public int perform(int x, int y) { return x / y; }
    };

    public abstract int perform(int x, int y);
}

public class MainEnumOperation {
    public static void main(String[] args) {
        int result = Operation.ADDITION.perform(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
