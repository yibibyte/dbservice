package ru.db.annotations;

@Company
public class Employee {

    @Deprecated(since = "1.8")
    public void getEmployeeStatus() {

        System.out.println("Это класс предка - Employee ");
    }
}
