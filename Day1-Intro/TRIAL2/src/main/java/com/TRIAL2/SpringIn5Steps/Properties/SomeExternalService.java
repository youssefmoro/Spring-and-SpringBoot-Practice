package com.TRIAL2.SpringIn5Steps.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    //we will take it from the property file
    @Value("${external.service.URL}")
    private String URL;
    public String returnServiceURL()
    {
        return this.URL;
    }
}
