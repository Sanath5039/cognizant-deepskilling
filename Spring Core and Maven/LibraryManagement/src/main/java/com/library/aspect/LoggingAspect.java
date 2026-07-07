package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Exercise 3: Logs method execution times for cross-cutting concerns.
 * Exercise 8: Provides "before" and "after" advice methods in addition to
 * the "around" advice used to measure execution time.
 */
@Aspect
@Component
public class LoggingAspect {

    // Exercise 8: advice that runs before any method in com.library.service
    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore(org.aspectj.lang.JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] Before executing: " + joinPoint.getSignature());
    }

    // Exercise 8: advice that runs after any method in com.library.service
    @After("execution(* com.library.service.*.*(..))")
    public void logAfter(org.aspectj.lang.JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] After executing: " + joinPoint.getSignature());
    }

    // Exercise 3: measure and log method execution time
    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("[LoggingAspect] " + joinPoint.getSignature()
                + " executed in " + elapsed + " ms");
        return result;
    }
}
