package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.MathService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MathController {

    @Autowired
    MathService mathService;
    
    @GetMapping("soma/{n1}/{n2}")
    public Double soma(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2){
        Double[] numeros = mathService.verificar(n1, n2);
        return numeros[0] + numeros[1];
    }
    @GetMapping("subt/{n1}/{n2}")
    public Double subtracao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2){
        Double[] numeros = mathService.verificar(n1, n2);
        return numeros[0] - numeros[1];
    }
    @GetMapping("mult/{n1}/{n2}")
    public Double multiplicacao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2){
        Double[] numeros = mathService.verificar(n1, n2);
        return numeros[0] * numeros[1];
    }
    @GetMapping("div/{n1}/{n2}")
    public Double divisao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2){
        Double[] numeros = mathService.verificar(n1, n2);
        return numeros[0] / numeros[1];
    }
}
