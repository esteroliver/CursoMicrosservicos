package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MathController {
    private boolean isNumeric(String number){
        if(number == null) return false;
        return number.matches("[-+]?[0-9]\\.?[0-9]+");
    }
    @GetMapping("soma/{n1}/{n2}")
    public Double soma(@PathVariable(value = "n1") Double n1, @PathVariable(value = "n2") Double n2)
        throws Exception{
            String n1_s = String.valueOf(n1);
            String n2_s = String.valueOf(n2);
            if(!isNumeric(n1_s) || !isNumeric(n2_s)){
                throw new Exception();
            }
            return n1 + n2;
        }
}
