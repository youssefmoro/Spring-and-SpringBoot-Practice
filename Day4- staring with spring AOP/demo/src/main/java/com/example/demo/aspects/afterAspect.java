package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class afterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //WHAT KING OF METHOD CALLS I WOULD INTERCEPT
//execution(* PACKAGE..*(..))
    @AfterReturning(
            //new way using config class
            value = "com.example.demo.aspects.CommonJointPointConfig.getBusinessLayerExecutionAspect()",
            returning = "result"//must be the same name passed to the method to return result inside it
    )
    @AfterThrowing(
            //old way
            value = "execution(* com.example.demo.business..*(..))",
            throwing = "throwed"
    )
    //result must be an object because you really don't know what is the return of this process
    public void afterReturning(JoinPoint joinPoint,Object result){
        logger.info("{} after returnning this: {}",joinPoint,result);

    }
    public void afterThrowing(JoinPoint joinPoint,Exception throwed){
        logger.info("{} after throwing this: {}",joinPoint,throwed);

    }
}
