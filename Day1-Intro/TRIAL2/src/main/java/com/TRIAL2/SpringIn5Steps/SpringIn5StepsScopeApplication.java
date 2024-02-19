//package com.TRIAL2.SpringIn5Steps;
//
//import com.TRIAL2.SpringIn5Steps.Basics.SomeExternalService;
//import com.TRIAL2.SpringIn5Steps.Scope.PersonDao;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import java.util.logging.Logger;
//
//@SpringBootApplication
//public class SpringIn5StepsScopeApplication {
//    private static org.slf4j.Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
//    public static void main(String[] args)  {
//        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
//
//        PersonDao personDao=applicationContext.getBean(PersonDao.class);
//        PersonDao personDao1=applicationContext.getBean(PersonDao.class);
//
//        // logger.infor just replaces what comes after the comma and put it inside {} and print it as a message so you can see it
//        LOGGER.info("{}",personDao);
//        LOGGER.info("{}",personDao.getJdbcConnection());
//        LOGGER.info("{}",personDao1);
//        LOGGER.info("{}",personDao1.getJdbcConnection());
//
//
//    }
//}
