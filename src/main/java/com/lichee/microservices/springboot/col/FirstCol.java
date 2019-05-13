package com.lichee.microservices.springboot.col;

import com.lichee.microservices.springboot.vo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("api")
public class FirstCol {

    @RequestMapping("first")
    public Person first() {

        Person person = new Person();
        person.setId(3);
        person.setName("里奇");
        person.setBirthday(new Date());
        return person;
    }

}