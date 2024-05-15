package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.UnsupportedMathOperationException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MathController {
    private boolean isNumeric(String number){
        if(number == null) return false;
        return number.matches("^-?\\d*\\.\\d+$");
    }
    @GetMapping("soma/{n1}/{n2}")
    public Double soma(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2)
        throws Exception{
            if(!isNumeric(n1) || !isNumeric(n2)){
                throw new UnsupportedMathOperationException("Coloque um valor numérico.");
            }
            Double n1_d = Double.parseDouble(n1);
            Double n2_d = Double.parseDouble(n2);
            return n1_d + n2_d;
    }
    @GetMapping("subt/{n1}/{n2}")
    public Double subtracao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2)
        throws Exception{
            if(!isNumeric(n1) || !isNumeric(n2)){
                throw new UnsupportedMathOperationException("Coloque um valor numérico.");
            }
            Double n1_d = Double.parseDouble(n1);
            Double n2_d = Double.parseDouble(n2);
            return n1_d - n2_d;
    }
    @GetMapping("mult/{n1}/{n2}")
    public Double multiplicacao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2)
        throws Exception{
            if(!isNumeric(n1) || !isNumeric(n2)){
                throw new UnsupportedMathOperationException("Coloque um valor numérico.");
            }
            Double n1_d = Double.parseDouble(n1);
            Double n2_d = Double.parseDouble(n2);
            return n1_d * n2_d;
    }
    @GetMapping("div/{n1}/{n2}")
    public Double divisao(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2)
        throws Exception{
            if(!isNumeric(n1) || !isNumeric(n2)){
                throw new UnsupportedMathOperationException("Coloque um valor numérico.");
            }
            Double n1_d = Double.parseDouble(n1);
            Double n2_d = Double.parseDouble(n2);
            return n1_d / n2_d;
    }
    // private Double count = 0.0;
    // private Double soma = 0.0;

    // @GetMapping("media")
    // public Double media(@RequestParam("numero") Double num)
    //     throws Exception{
    //         soma += num;
    //         count++;
    //         return soma/count;
    // }
}
