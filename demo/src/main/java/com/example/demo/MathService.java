package com.example.demo;

import com.example.demo.exceptions.UnsupportedMathOperationException;

public class MathService {
    private Double[] numeros = new Double[2];

    private boolean isNumeric(String number){
        if(number == null) return false;
        return number.matches("^-?\\d*\\.\\d+$");
    }

    public Double[] verificar(String n1, String n2){
        if(isNumeric(n1) && isNumeric(n2)){
            Double n1_d = Double.parseDouble(n1);
            Double n2_d = Double.parseDouble(n2);
            numeros[0] = n1_d;
            numeros[1] = n2_d;
            return numeros;
        }
        throw new UnsupportedMathOperationException("Insira valores numéricos.");
    }

}
