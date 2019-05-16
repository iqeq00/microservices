package com.lichee.microservices.springboot.col;

import com.lichee.microservices.springboot.config.Lichee;
import com.lichee.microservices.springboot.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("api")
public class FirstCol {

    @Value("${config.lichee.name}")
    private String name;

    @Value("${config.lichee.age}")
    private int age;

    @Autowired
    private Lichee lichee;

    @RequestMapping("first")
    public Person first() {

        Person person = new Person();
        person.setId(3);
        person.setName("里奇");
        person.setBirthday(new Date());

        System.out.println("lichee.name=" + name);
        System.out.println("lichee.age=" + age);

        System.out.println("========");
        System.out.println("lichee.name=" + lichee.getName());
        System.out.println("lichee.age=" + lichee.getAge());
        return person;
    }

}