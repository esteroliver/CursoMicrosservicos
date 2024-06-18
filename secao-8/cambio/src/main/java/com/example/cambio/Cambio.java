package com.example.cambio;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name = "cambio")
public class Cambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 3)
    private String convertFrom;

    @Column(nullable = false, length = 3)
    private String convertTo;

    @Column(nullable = false)
    private BigDecimal convertionFactor;

    @Transient
    private BigDecimal convertedValue;

    @Transient
    private String port;

    public Cambio(String convertFrom, String convertTo, BigDecimal convertionFactor, BigDecimal convertedValue, String port) {
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
        this.convertionFactor = convertionFactor;
        this.convertedValue = convertedValue;
        this.port = port;
    }
    public Cambio() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getConvertFrom() {
        return convertFrom;
    }
    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }
    public String getConvertTo() {
        return convertTo;
    }
    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }
    public BigDecimal getConvertionFactor() {
        return convertionFactor;
    }
    public void setConvertionFactor(BigDecimal convertionFactor) {
        this.convertionFactor = convertionFactor;
    }
    public BigDecimal getConvertedValue() {
        return convertedValue;
    }
    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    
}
