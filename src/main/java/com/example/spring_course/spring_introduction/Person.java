package com.example.spring_course.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Create Person Instance");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Create Person Instance");
    }
//@Autowired
    public void setPet(Pet pet) {
        System.out.println("Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person: set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person: set Age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
