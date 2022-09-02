package com.revature.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceClass {
    @Before("execution(public void testBeforeJoinPoint())")
    public void before() {
        System.out.println("Advised: Before testBeforeJoinPoint");
    }

    @AfterThrowing("execution(boolean testAfterThrowingJoinPoint(..))")
    public void afterThrowing() {
        System.out.println("Advised: After Throwing testAfterThrowingJoinPoint()");
    }

    @AfterReturning("execution(public * testAfterJoinPoint(*))")
    public void after() {
        System.out.println("Advised: After Returning testAfterJoinPoint()");
    }

    @Around("execution(public String testAroundJoinPoint(*))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        pjp.proceed();
        System.out.println("Advised: Around testAroundJoinPoint()");
    }

}
