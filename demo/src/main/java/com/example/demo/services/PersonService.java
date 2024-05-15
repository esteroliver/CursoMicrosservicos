package com.example.demo.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

import java.util.logging.*;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findPerson(String id){
        logger.info("Finding one person.");
        Person p = new Person();
        p.setId(counter.incrementAndGet());
        p.setName("Ana");
        p.setGender("Woman");
        p.setAddress("Rio de Janeiro - RJ, Brazil");
        return p;
    }
}
