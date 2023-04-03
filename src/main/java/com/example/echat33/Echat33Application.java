package com.example.echat33;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.echat33.mapper")
public class Echat33Application {

    public static void main(String[] args) {
        SpringApplication.run(Echat33Application.class, args);
    }

}
