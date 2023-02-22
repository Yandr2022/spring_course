package com.example.spring_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("method main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UnivLibrary library = context.getBean("univLibrary", UnivLibrary.class);
        String book = library.returnBook();
        System.out.println(book);
        context.close();
        System.out.println("method main end");

    }
}
