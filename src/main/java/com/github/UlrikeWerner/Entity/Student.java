package com.github.UlrikeWerner.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
public class Student {
    private final String id;
    @With
    private final String firstName;
    @With
    private final String lastName;
    @With
    private final String address;
    private String grade;
}
