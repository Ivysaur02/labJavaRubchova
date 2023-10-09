package com.lab.rub.AopLogger;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Pointcut("execution(* com.lab.rub.Controllers.PetController.showPetList(..))")
    public void showPetListPointcut() {
    }

    @Before("showPetListPointcut()")
    public void logShowPetList(JoinPoint joinPoint) {
        log.info("Method called: " + joinPoint.getSignature().getName());
    }
}

