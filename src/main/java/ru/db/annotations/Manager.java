package ru.db.annotations;

public class Manager extends Employee {

    @Override
    public void getEmployeeStatus(){

        System.out.println("Это класс - Manager");
    }
}
