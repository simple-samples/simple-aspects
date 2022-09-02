package com.revature.aop;

import org.springframework.stereotype.Component;

@Component
public class AdvisedClass {

    public void testBeforeJoinPoint() {
        System.out.println("This is testBeforeJoinPoint()");
    }

    public boolean testAfterThrowingJoinPoint() {
        System.out.println("This is testAfterThrowingJoinPoint()");
        return true;
    }

    public String testAfterJoinPoint(String string) {
        System.out.println("This is testAfterJoinPoint. This method invokes the testAroundJoinPoint() next...");
        return testAroundJoinPoint(string);
    }

    public String testAroundJoinPoint(String string) {
        System.out.println("This is the testAroundJoinPoint. The String is: " + string);
        return string;
    }


}
