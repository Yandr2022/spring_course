package com.example.spring_course.spring_introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Create Pet Instance");
    }

    @Override
    public void say() {

        System.out.println("Bow-Wow");
    }
}
