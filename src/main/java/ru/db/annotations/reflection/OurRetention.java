package ru.db.annotations.reflection;

public class OurRetention {
    public static void main(String[] args) {

        OurSourceRetention[] ourSourceRetention = new EmployeeRetentionAnnotation().getClass().getAnnotationsByType(OurSourceRetention.class);
        System.out.println("Source Retentions at run-time: " + ourSourceRetention.length);

        OurRuntimeRetention[] ourRuntimeRetention = new EmployeeRetentionAnnotation().getClass().getAnnotationsByType(OurRuntimeRetention.class);
        System.out.println("Run-time Retentions at run-time: " + ourRuntimeRetention.length);

        OurClassRetention[] ourClassRetention = new EmployeeRetentionAnnotation().getClass().getAnnotationsByType(OurClassRetention.class);
        System.out.println("Class Retentions at run-time: " + ourClassRetention.length);
    }
}
