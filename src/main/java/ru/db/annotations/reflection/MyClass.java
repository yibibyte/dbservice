package ru.db.annotations.reflection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyClass {

    private int number = 1000;
    private String name = "default";
    // Конструктор по умолчанию
/*        public MyClass() {
    }*/

    // Конструктор с параметрами
/*        public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }*/



    private void printData(){
        System.out.println(number + " " + name + " Это метод printData() из класса MyClass");
    }


    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
