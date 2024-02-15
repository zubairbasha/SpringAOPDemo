package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingShoppingCart {
    @Before("execution(* com.aspect.ShoppingCart.checkOut(. .))")
    public void logger(){
        System.out.println("Logging the Checkout");
    }
    @After("within(com.aspect..*)")
    public void afterLogger(JoinPoint jointPoint){
        System.out.println("After Logger"+jointPoint.getStaticPart());
    }
    @AfterReturning(pointcut = ("execution(* *.*.*.checkOut(. .))"),returning = "returnValue")
    public void afterReturn(JoinPoint joinPoint,Object returnValue){
        System.out.println("After Returning the value"+ returnValue);
    }


}
