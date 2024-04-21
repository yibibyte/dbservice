package ru.db.annotations;

/**
 *  This class Manager
 * @author Developer Name
 */

public class Manager extends Employee {

    @Override
    public void getEmployeeStatus(){

        System.out.println("Это класс - Manager");
    }
}
