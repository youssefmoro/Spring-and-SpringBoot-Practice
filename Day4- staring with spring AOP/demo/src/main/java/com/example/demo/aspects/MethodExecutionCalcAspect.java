package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalcAspect {

        private Logger logger = LoggerFactory.getLogger(this.getClass());

        @Around("com.example.demo.aspects.CommonJointPointConfig.getDataLayerExecutionAspect()")
        //result must be an object because you really don't know what is the return of this process
        public void around(ProceedingJoinPoint pJoinPoint) throws Throwable {
            long startTime=System.currentTimeMillis();
            pJoinPoint.proceed();
            long timeTaken=System.currentTimeMillis()-startTime;
            logger.info("time taken to proceed {} is {}",pJoinPoint,timeTaken);

        }
    }
