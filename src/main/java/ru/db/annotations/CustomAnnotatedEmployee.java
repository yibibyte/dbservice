package ru.db.annotations;

@Company
public class CustomAnnotatedEmployee {

    private int id;
    private String name;

    public CustomAnnotatedEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getEmployeeDetails(){

        System.out.println("ID Employee : " + id);
        System.out.println("Name Employee: " + name);
    }
}
