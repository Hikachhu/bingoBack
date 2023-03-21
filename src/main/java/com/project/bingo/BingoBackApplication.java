package com.project.bingo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.project.bingo.*"})
@EnableJpaRepositories(basePackages = "com.project.bingo.*")
public class BingoBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingoBackApplication.class, args);
    }

}
