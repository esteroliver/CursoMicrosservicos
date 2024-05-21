package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.Person;
import com.example.demo.services.PersonService;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Person> findPerson(@PathVariable(value = "id") Long id){
        personservice.findPerson(id);
        return ResponseEntity.status(HttpStatus.OK).body(personservice.findPerson(id));
    }

    @PostMapping("")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        personservice.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable(value = "id") long id, @RequestBody Person person){
        personservice.updatePerson(person, id);
        return ResponseEntity.status(HttpStatus.OK).body(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable(value = "id") Long id){
        personservice.deletePerson(id);
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado.");
    }
}