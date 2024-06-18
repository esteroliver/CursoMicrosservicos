package com.example.cambio;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("cambio-service")
public class CambioController {
    @Autowired
    private Environment environment;

    @Autowired
    private CambioRepository repository;

    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(@PathVariable("amount") BigDecimal amount, @PathVariable("from") String from, @PathVariable("to") String to){
        Cambio cambio = repository.findByConvertFromAndConvertTo(from, to);
        if (cambio == null) throw new RuntimeException("Currency unsupported.");

        String port = environment.getProperty("local.server.port");
        BigDecimal conversionFactor = cambio.getConvertionFactor();
        BigDecimal convertedValue = conversionFactor.multiply(amount);

        cambio.setPort(port);
        cambio.setConvertedValue(convertedValue.setScale(2, RoundingMode.CEILING));

        return cambio;
    }
}
