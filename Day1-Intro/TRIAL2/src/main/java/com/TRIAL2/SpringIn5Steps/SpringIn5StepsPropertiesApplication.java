package com.TRIAL2.SpringIn5Steps;

import com.TRIAL2.SpringIn5Steps.Properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.TRIAL2.SpringIn5Steps")
//iam loading here app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args)  {

        try(AnnotationConfigApplicationContext appcon=new AnnotationConfigApplicationContext("com.TRIAL2.SpringIn5Steps")) {

            SomeExternalService service = appcon.getBean(SomeExternalService.class);

            System.out.println(service.returnServiceURL());

        }

    }

}
