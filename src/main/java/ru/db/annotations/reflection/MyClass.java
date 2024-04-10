package ru.db.annotations.reflection;

public class MyClass {
    private int number;
    private String name = "default";
    // Конструктор по умолчанию
/*        public MyClass() {
    }*/

    // Конструктор с параметрами
/*        public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }*/
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void printData(){
        System.out.println(number + name);
    }


}
