package com.revature.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(com.revature.aop.BeanConfig.class);

        AdvisedClass advisedClass = context.getBean(AdvisedClass.class);

        advisedClass.testBeforeJoinPoint();

        advisedClass.testAfterThrowingJoinPoint();

        advisedClass.testAfterJoinPoint("Hello!");
    }
}
