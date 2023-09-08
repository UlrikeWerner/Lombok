package com.github.UlrikeWerner.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@AllArgsConstructor
@Builder
@Value
public class Course {
    String courseId;
    String courseName;
    Teacher teacher;
    List<Student> students;
}
