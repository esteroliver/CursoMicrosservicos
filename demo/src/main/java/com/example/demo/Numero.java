package com.example.demo;

public class Numero {
    private long id;
    private Double numero;
    public Numero(long id, Double numero) {
        this.id = id;
        this.numero = numero;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Double getNumero() {
        return numero;
    }
    public void setNumero(Double numero) {
        this.numero = numero;
    }

    
}
