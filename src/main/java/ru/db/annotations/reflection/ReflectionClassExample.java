package ru.db.annotations.reflection;

public class ReflectionClassExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("ru.db.annotations.reflection.MyClass");
            System.out.println("Class Name: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
