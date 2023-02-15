package com.example.spring_course.spring_introduction;

public class Test1 {
    public static void main(String[] args) {
        Pet[] pets = {new Dog(),new Cat()};
        for (Pet pet:pets) {
            pet.say();
        }
    }
}
