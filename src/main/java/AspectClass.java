import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectClass {
    @Before("execution(* TestClass.testJoinPoint())")
    public void beforeAdvice(){
        System.out.println("Advice: beforeAdvice");
    }

    @After("execution(* TestClass.testJoinPoint())")
    public void afterAdvice() {
        System.out.println("Advice: afterAdvice");
    }
}
