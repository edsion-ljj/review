package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mr.mapper")
public class ReviewdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewdemoApplication.class, args);
    }

}
