package com.github.UlrikeWerner;

import com.github.UlrikeWerner.Entity.Course;
import com.github.UlrikeWerner.Entity.Student;
import com.github.UlrikeWerner.Entity.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student sKlaus = new Student("1263", "Klaus", "Schmidt", "Lange Str. 12 23754 Testburg", "2C");
        Student sLisa = new Student("1364", "Lisa", "Mayer", "Große Str. 1 23754 Testburg", "2B");
        System.out.println(sKlaus);
        System.out.println(sLisa);

        sLisa.setGrade("2C");
        System.out.println(sLisa);

        Student sLisaFeldmann = sLisa.withLastName("Feldmann");
        System.out.println(sLisaFeldmann);

        System.out.println("--------------------");
        System.out.println("Builder für die Klasse Student");
        Student sPaul = Student.builder()
                .studentId("5273")
                .firstName("Paul")
                .lastName("Nagel")
                .address("Hauptstraße 25 23754 Testburg")
                .grade("2C")
                .build();
        System.out.println(sPaul);

        System.out.println("--------------------");
        Teacher tFuchs = new Teacher("t12", "Jan", "Fuchs", List.of("Mathe", "Sport", "Erdkunde"));
        System.out.println(tFuchs);

        System.out.println("--------------------");
        System.out.println("Builder für die Klasse Teacher");
        Teacher tGayer = Teacher.builder()
                .teacherId("t23")
                .firstName("Hannah")
                .lastName("Gayer")
                .subjects(List.of("Musik", "Kunst"))
                .build();
        System.out.println(tGayer);

        System.out.println("--------------------");
        Course cSport2 = new Course("2GradeSport123", "Weitsprung", tFuchs, List.of(sKlaus, sLisaFeldmann));
        System.out.println(cSport2);

        System.out.println("--------------------");
        System.out.println("Builder für die Klasse Course");
        Course cKunst2 = Course.builder()
                .courseId("2GradeKunst2")
                .courseName("Grundlagen der Kunst")
                .teacher(tGayer)
                .students(List.of(sPaul, sKlaus))
                .build();
        System.out.println(cKunst2);
    }
}
