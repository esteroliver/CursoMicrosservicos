package com.example.cambio;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("cambio-service")
public class CambioController {
    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(@PathVariable("amount") BigDecimal amount, @PathVariable("from") String from, @PathVariable("to") String to){
        return new Cambio(1L, from, to, BigDecimal.valueOf(5), amount);
    }
}
