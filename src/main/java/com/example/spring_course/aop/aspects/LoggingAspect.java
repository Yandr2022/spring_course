package com.example.spring_course.aop.aspects;

import com.example.spring_course.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.*(..))")
//    private void allMethodsFromUnivLibrary() {
//    }
//
//    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.returnMagazine())")
//    private void returnMagazineFromUnivLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUnivLibrary() && !returnMagazineFromUnivLibrary()")
//    private void allMethodsExceptReturnMagazineFromUnivLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUnivLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
//    }



//    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.get*())")
//        private void allGetMethodsFromUnivLibrary(){}
//    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.return*())")
//        private void allReturnMethodsFromUnivLibrary(){}
//    @Pointcut("allGetMethodsFromUnivLibrary()||allReturnMethodsFromUnivLibrary()")
//    private void allGetAndReturnMethodsFromUnivLibrary(){}
//
//    @Before("allGetMethodsFromUnivLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//    @Before("allReturnMethodsFromUnivLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//    @Before("allGetAndReturnMethodsFromUnivLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
//    }


    @Before("com.example.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + signature);
        System.out.println("MethodSignature.getMethod(): " + signature.getMethod());
        System.out.println("MethodSignature.getReturnType(): " + signature.getReturnType());
        System.out.println("MethodSignature.getName(): " + signature.getName());
        System.out.println("beforeAddBookAdvice: log trying get Book/Magazine");
        if (signature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book book = (Book) arg;
                    System.out.printf("Info about Book:\nname = %s\nauthor = %s\nyear = %d", book.getName()
                            , book.getAuthor(), book.getYearOfPublication());
                } else if (arg instanceof String) {
                    System.out.println(arg + " added Book to Library");
                }
            }
        }
    }


//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying return Book");
//    }
}

