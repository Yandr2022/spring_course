package com.example.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UnivLibrary {
//    @Override
    public  void getBook(){
        System.out.println("We take book from University Library " );
    }
    public  void returnBook(){
        System.out.println("We return book to University Library");
    }
    public  void addBook(){
        System.out.println("We add book to University Library");
    }
    public  void getMagazine(){
        System.out.println("We take magazine from University Library");
    }
    public  void returnMagazine(){
        System.out.println("We return magazine from University Library");
    }
    public  void addMagazine(){
        System.out.println("We add magazine from University Library");
    }
}
