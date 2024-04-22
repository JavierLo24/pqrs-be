package com.ufps.pqrsbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class PqrsBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PqrsBeApplication.class, args);
    }

}
