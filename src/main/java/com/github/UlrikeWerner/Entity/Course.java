package com.github.UlrikeWerner.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    private final String courseId;
    private final String courseName;
    private Teacher teacher;
    private List<Student> students;
}
