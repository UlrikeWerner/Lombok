package com.github.UlrikeWerner.Entity;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private final String courseId;
    private final String courseName;
    private Teacher teacher;
    private List<Student> students;
}
