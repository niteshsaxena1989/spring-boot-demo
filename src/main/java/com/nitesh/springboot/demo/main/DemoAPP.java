package com.nitesh.springboot.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.nitesh.springboot.demo.*")
@EntityScan("com.nitesh.springboot.demo.entity")
@EnableJpaRepositories("com.nitesh.springboot.demo.repository")
public class DemoAPP {
    /*
    You have to keep SpringBootApplication Class in the root package to automatically scan all the spring bean and
    components inside sub packages, otherwise use @ComponentScan annotation, likewise I have used.
     */
    public static void main(String[] args) {

        SpringApplication.run(DemoAPP.class, args);

    }
}
