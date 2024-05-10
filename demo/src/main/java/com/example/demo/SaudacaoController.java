package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SaudacaoController {
    private static String template = "Hello, %!";
    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/saudacao")
    public Saudacao fazerSaudacao(@RequestParam(name = "nome", defaultValue = "World") String nome) {
        return new Saudacao(counter.incrementAndGet(), "alalalla");
    }
}
