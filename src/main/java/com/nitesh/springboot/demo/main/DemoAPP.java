package com.nitesh.springboot.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nitesh.springboot.demo.*")
public class DemoAPP {
    /*
    You have to keep SpringBootApplication Class in the root package to automatically scan all the spring bean and
    components inside sub packages, otherwise use @ComponentScan annotation, likewise I have used.
     */
    public static void main(String[] args) {

        SpringApplication.run(DemoAPP.class, args);

    }
}
