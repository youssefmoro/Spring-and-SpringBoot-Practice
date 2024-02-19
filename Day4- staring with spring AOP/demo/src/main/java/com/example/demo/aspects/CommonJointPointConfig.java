package com.example.demo.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class CommonJointPointConfig {
   @Pointcut("execution(* com.example.demo.data..*(..))")
    public void getDataLayerExecutionAspect(){}

    @Pointcut("execution(* com.example.demo.business..*(..))")
    public void getBusinessLayerExecutionAspect(){}

    @Pointcut("execution(* com.example.demo.business..*(..))&&execution(* com.example.demo.data..*(..))")
    public void getAllLayerExecutionAspect(){}

    @Pointcut("bean(*dao)")
    public void getallBeansWith_dao(){}
    @Pointcut("within(com.example.demo.data..*)")
    public void getallInterceptionsWithDataLayer() {}
}
