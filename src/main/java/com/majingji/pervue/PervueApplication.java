package com.majingji.pervue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.majingji.pervue.mapper")
@EnableCaching
public class PervueApplication {

    public static void main(String[] args) {
        SpringApplication.run(PervueApplication.class, args);
    }

}
