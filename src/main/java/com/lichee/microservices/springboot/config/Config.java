package com.lichee.microservices.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Lichee initLichee() {

        return new Lichee();
    }
}