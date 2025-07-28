package com.example.interviewdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
@EntityScan("com.example.interviewdemo")
public class InterviewDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewDemoApplication.class, args);
    }

}
