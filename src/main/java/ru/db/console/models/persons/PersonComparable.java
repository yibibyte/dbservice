package ru.db.console.models.persons;

public class PersonComparable {
//
//    private final String lastName;
//    private final String firstName;
//
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName != null ? firstName : "";
//        this.lastName = lastName != null ? lastName : "";
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String toString() {
//        return lastName + ", " + firstName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (! (o instanceof Person)) return false;
//        Person p = (Person)o;
//        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//
//    @Override
//    public int compareTo(Person other) {
//        // If this' lastName and other's lastName are not comparably equivalent,
//        // Compare this to other by comparing their last names.
//        // Otherwise, compare this to other by comparing their first names
//        int lastNameCompare = lastName.compareTo(other.lastName);
//        if (lastNameCompare != 0) {
//            return lastNameCompare;
//        } else {
//            return firstName.compareTo(other.firstName);
//        }
//    }
}
