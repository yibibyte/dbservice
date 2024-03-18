package ru.db.enums;

enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class MainEnumWeekday {
    public static void main(String[] args) {
        Weekday today = Weekday.MONDAY;
        System.out.println("Today is " + today);
    }
}
