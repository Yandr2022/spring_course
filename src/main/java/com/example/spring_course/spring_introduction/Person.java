package com.example.spring_course.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Create Person Instance");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
