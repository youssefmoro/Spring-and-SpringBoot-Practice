package com.Day3.REST.API.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // /courses
    //Course:id,name,author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","24hrs"),
        new Course(2,"Learn Devops","48hrs"),
        new Course(3,"Learn Java","32hrs"),
                new Course(4,"Learn C","90hrs"),
                new Course(5,"Learn MCU","60hrs"),
                new Course(6,"Learn RTOS","20hrs"),
                new Course(7,"Learn RTOS","20hrs"),
                new Course(8,"Learn RTOS","20hrs"),
                new Course(9,"Learn RTOS","20hrs"),
                new Course(10,"Learn RTOS","20hrs"),
                new Course(11,"Learn RTOS","20hrs"),
                new Course(12,"Learn RTOS","20hrs")
        );
    }
}
