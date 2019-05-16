package com.lichee.microservices.springboot.config;

import org.springframework.beans.factory.annotation.Value;

public class Lichee {

    @Value("${config.lichee.name}")
    private String name;

    @Value("${config.lichee.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
