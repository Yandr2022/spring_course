package com.example.spring_course.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
//    private String name;
    public Dog() {
        System.out.println("Create Pet Instance");
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog: init meth");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Dog: destroy meth");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
