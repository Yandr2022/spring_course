package com.example.spring_course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: attempt to return a book to the library");
        Object targetMethResult = null;
        try {
            targetMethResult = joinPoint.proceed();
        } catch (ArithmeticException e) {
            System.out.println("aroundReturnBookAdvice: was catch " + e);
           throw e;
        }

//        targetMethResult = "NewBook";
//        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookAdvice: book was successfully returned to the library");
//        System.out.println("aroundReturnBookAdvice: was completed in " + (end - start) + " mls");
        return targetMethResult;
    }
}
