package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/people")
public class PersonController{

    @Autowired
    PersonService personservice;

}