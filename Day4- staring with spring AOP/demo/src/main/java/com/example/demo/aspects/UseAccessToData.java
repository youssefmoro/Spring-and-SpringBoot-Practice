package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//weaving and weaver
@Aspect
@Configuration
public class UseAccessToData {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Before("com.example.demo.aspects.CommonJointPointConfig.getDataLayerExecutionAspect()")
    public void before(JoinPoint joinPoint){
        // can check inside a list for the user name inside it if yes make this logic if not return
        logger.info("user has access here");
        logger.info("intercepted method calls - {}",joinPoint);

    }
}
