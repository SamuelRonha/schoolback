package com;

import com.base.repository.CustomRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Samuel on 15/04/2017.
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableJpaRepositories(repositoryBaseClass = CustomRepositoryImpl.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}


