package com.example.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dog",Dog.class);
        Dog dog1 =context.getBean("dog", Dog.class);
        System.out.println(dog==dog1);
        context.close();
    }
}
