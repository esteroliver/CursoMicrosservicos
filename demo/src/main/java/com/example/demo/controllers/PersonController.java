package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.services.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/people")
public class PersonController{

    @Autowired
    PersonService personservice;

    @GetMapping("")
    public List<Person> findAll() {
        return personservice.findAll();
    }

    @GetMapping("/{id}")
    public Person findPerson(@PathVariable(value = "id") Long id) throws Exception {
        return personservice.findPerson(id);
    }

    @PostMapping("")
    public Person createPerson(@RequestBody Person person) {
        return personservice.createPerson(person);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable(value = "id") long id, @RequestBody Person person) throws Exception{
        return personservice.updatePerson(person, id);
    }

    @DeleteMapping("/id")
    public void deletePerson(@PathVariable(value = "id") Long id) throws Exception{
        personservice.deletePerson(id);
    }
}