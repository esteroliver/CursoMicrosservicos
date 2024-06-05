package com.example.cambio;

import java.math.BigDecimal;

public class Cambio {
    private Long id;
    private String convertFrom;
    private String convertTo;
    private BigDecimal convertionFactor;
    private BigDecimal convertedValue;
    public Cambio(Long id, String convertFrom, String convertTo, BigDecimal convertionFactor, BigDecimal convertedValue) {
        this.id = id;
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
        this.convertionFactor = convertionFactor;
        this.convertedValue = convertedValue;
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
    
}
