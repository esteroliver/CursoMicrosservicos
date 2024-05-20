package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.NotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repositories.PersonRepository;

import java.util.logging.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonService {
    private Logger logger = Logger.getLogger(PersonService.class.getName());
    @Autowired
    PersonRepository personrepository;

    public List<Person> findAll(){
        logger.info("Finding all person.");
        return personrepository.findAll();
    }

    public Person findPerson(Long id) throws Exception{
        logger.info("Finding one person.");
        Optional<Person> person = personrepository.findById(id);
        if(person.isEmpty()){
            throw new NotFoundException("Person not found.");
        }
        return person.get();
    }

    public Person createPerson(Person pessoa){
        logger.info("Creating one person.");
        return personrepository.save(pessoa);
    }

    public Person updatePerson(Person pessoa) throws Exception{
        logger.info("Updating one person.");
        Optional<Person> pessoa01 =  personrepository.findById(pessoa.getId());
        if(pessoa01.isEmpty()){
            throw new NotFoundException("Person not found.");
        }
        personrepository.save(pessoa);
        return pessoa;
    }

    public void deletePerson(Long id) throws Exception{
        logger.info("Deleting one person.");
        Optional<Person> pessoa = personrepository.findById(id);
        if(pessoa.isEmpty()){
            throw new NotFoundException("Person not found.");
        }
        personrepository.delete(pessoa.get());
    }
}

