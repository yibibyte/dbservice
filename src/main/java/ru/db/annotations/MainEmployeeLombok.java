package ru.db.annotations;

public class MainEmployeeLombok {
    public static void main(String[] args) {
        EmployeeLombok employee = new EmployeeLombok("Ivan", "Ivanov", 100000);
        EmployeeLombok employee2 = new EmployeeLombok("Ivan", "Ivanov", 100000);
        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println(employee.equals(employee2));
    }
}
