package com.example.greetingservice;

import org.springframework.web.bind.annotation.RestController;

import com.example.greetingservice.configuration.GreetingConfiguration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GreetingController {
    private static final String template = "%s, %s!";
    
    @Autowired
    GreetingConfiguration configuration;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="nome", defaultValue = "") String nome){
        Greeting g;
        if (nome.isEmpty()) nome = configuration.getDefaultValue();
        g = new Greeting(0, String.format(template, configuration.getGreeting(), nome));
        return g;
    }
    
}
