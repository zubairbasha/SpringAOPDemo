package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(com.aspect..*)")
    public void authenticatingPoint(){

    }
    @Before("authenticatingPoint()")
    public void authentication(){
    System.out.println("Authentication");
    }

}
