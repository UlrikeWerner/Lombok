package com.github.UlrikeWerner.Entity;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private final String studentId;
    @With
    private final String firstName;
    @With
    private final String lastName;
    @With
    private final String address;
    private String grade;
}
