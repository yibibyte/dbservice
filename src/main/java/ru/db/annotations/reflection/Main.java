package ru.db.annotations.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        int number = myClass.getNumber();
        String name = null;
        System.out.println(number + " " + name);
        try {
            // Поле класса name
            Field fieldName = myClass.getClass().getDeclaredField("name");
            fieldName.setAccessible(true);
            name = (String) fieldName.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number + " " + name);

        printData(myClass);

        // Вывод имени класса и его пакет
        MyClass nameClass = null;
        try {
            // Если к нашему классу нет обращения загрузчик классов ClassLoader не загрузит его в JVM,
            // поэтому мы можем это сделать с помощью метода forName для получим экземпляра класса

            Class clazz = Class.forName(MyClass.class.getName());
            nameClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(nameClass.getNumber());



/*        MyClass myClass2 = null;
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = {int.class, String.class};

            // вызов метода newInstance() вернет Object
            myClass2 = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");

        System.out.println(myClass2);
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println(paramTypes);
        }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }*/
    }

    public static void printData(MyClass myClass) {
        try {
            Method printDataMethodReflection = myClass.getClass().getDeclaredMethod("printData");
            printDataMethodReflection.setAccessible(true);
            printDataMethodReflection.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}