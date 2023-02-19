package com.example.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public  void getBook(){
        System.out.println("We take book from School Library");
    }
}
