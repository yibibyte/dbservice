package ru.db.annotations;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLombok {
    private String id;
    @NonNull
    private String name;
    private int salary;
    private final String department = "IT";
}