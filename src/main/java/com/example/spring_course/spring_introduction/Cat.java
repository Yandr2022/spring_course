package com.example.spring_course.spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Create Pet Instance");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
