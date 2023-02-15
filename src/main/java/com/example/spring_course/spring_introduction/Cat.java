package com.example.spring_course.spring_introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Create Pet Instance");
    }

    @Override
    public void say() {

        System.out.println("Meow-Meow");
    }
}
