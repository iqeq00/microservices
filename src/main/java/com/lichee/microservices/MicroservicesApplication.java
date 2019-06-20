package com.lichee.microservices;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesApplication {

    public static void main(String[] args) {

        System.out.println(MicroservicesApplication.class.getClassLoader());
        SpringApplication.run(MicroservicesApplication.class, args);

//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
    }

}
