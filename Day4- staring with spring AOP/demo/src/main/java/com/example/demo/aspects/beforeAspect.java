package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//CONFIGURATION
@Aspect
@Configuration
public class beforeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //WHAT KING OF METHOD CALLS I WOULD INTERCEPT
//execution(* PACKAGE..*(..))
    @Before("com.example.demo.aspects.CommonJointPointConfig.getDataLayerExecutionAspect()")
    public void before(JoinPoint joinPoint){
        logger.info("intercepted method calls - {}",joinPoint);

    }
}
