package com.kayulu.securenotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.authentication.AuthenticationFilter;

@SpringBootApplication
public class SecureNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureNotesApplication.class, args);
    }
}
