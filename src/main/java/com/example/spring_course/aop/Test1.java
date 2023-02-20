package com.example.spring_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UnivLibrary library =  context.getBean("univLibrary", UnivLibrary.class);
//        SchoolLibrary library2 =  context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
        library.getMagazine();
        library.addBook("Yulia",book);
//        library.getMagazine();
//        library.returnMagazine();
        library.addMagazine();
//        library2.getBook();
        context.close();
    }
}
