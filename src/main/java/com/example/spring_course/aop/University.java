package com.example.spring_course.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Yandr2022", 2, 7.5);
        Student st2 = new Student("Natalie2023", 3, 10);
        Student st3 = new Student("Michael2021", 4, 8.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents() start");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:\n" + students);
        return students;
    }
}
