package com.etycx;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.etycx.*.mapper")
@Slf4j
public class Application
{
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        log.info("Application is start up success");
    }
}