//package com.TRIAL2.SpringIn5Steps;
//
//import ComponentScanConnection.ComponentPersonDao;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan("com.TRIAL2.SpringIn5Steps")
//public class SpringInComponentScopeApplication {
//    private static org.slf4j.Logger LOGGER= LoggerFactory.getLogger(SpringInComponentScopeApplication.class);
//    public static void main(String[] args)  {
//        ApplicationContext applicationContext = SpringApplication.run(SpringInComponentScopeApplication.class,args);
//
//       ComponentPersonDao componentPersonDao=applicationContext.getBean(ComponentPersonDao.class);
//
//
//        // logger.infor just replaces what comes after the comma and put it inside {} and print it as a message so you can see it
//        LOGGER.info("{}",componentPersonDao);
//        LOGGER.info("{}",componentPersonDao.getJdbcConnection());
//
//    }
//}
