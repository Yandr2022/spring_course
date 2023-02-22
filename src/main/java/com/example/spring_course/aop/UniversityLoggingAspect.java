package com.example.spring_course.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: getting a list of students before getStudents");
    }

    //    @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student>students){
//        Student firstStudent = students.get(0);
//        StringBuilder name = new StringBuilder();
//        name.append("Mr. ").append(firstStudent.getNameSurname());
//        firstStudent.setNameSurname(name.toString());
//
//        double avgGrade = firstStudent.getAvgGrade()+1;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("afterGetStudentsLoggingAdvice: getting a list of students after getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exc")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exc) {
//        System.out.println("afterThrowingStudentsLoggingAdvice: logging throws exception "+ exc);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: log normal operation of the method or throws exception");
    }
}
