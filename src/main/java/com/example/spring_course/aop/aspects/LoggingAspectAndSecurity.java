package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAndSecurity {
    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.*(..))")
    private void allMethodsFromUnivLibrary() {
    }

    @Pointcut("execution(*  com.example.spring_course.aop.UnivLibrary.returnMagazine())")
    private void returnMagazineFromUnivLibrary() {
    }

    @Pointcut("allMethodsFromUnivLibrary() && !returnMagazineFromUnivLibrary()")
    private void allMethodsExceptReturnMagazineFromUnivLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUnivLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log#10");
    }



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


//    @Pointcut("execution(*  get*())")
//        private void allGetMethods(){}
//
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: trying get Book/Magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking eligibility for Book/Magazine");
//    }
//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying return Book");
//    }
}

