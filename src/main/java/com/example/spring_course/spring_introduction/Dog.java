package com.example.spring_course.spring_introduction;

public class Dog implements Pet {
//    private String name;
    public Dog() {
        System.out.println("Create Pet Instance");
    }
    public void init(){
        System.out.println("Dog: init meth");
    }
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
