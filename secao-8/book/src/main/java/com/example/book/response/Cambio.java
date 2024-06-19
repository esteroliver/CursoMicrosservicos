package com.example.book.response;

public class Cambio {
    private Long id;
    private String convertFrom;
    private String convertTo;
    private Double convertionFactor;
    private Double convertedValue;
    private String port;
    public Cambio() {
    }
    public Cambio(Long id, String convertFrom, String convertTo, Double convertionFactor, Double convertedValue,
            String port) {
        this.id = id;
        this.convertFrom = convertFrom;
        this.convertTo = convertTo;
        this.convertionFactor = convertionFactor;
        this.convertedValue = convertedValue;
        this.port = port;
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
    public Double getConvertionFactor() {
        return convertionFactor;
    }
    public void setConvertionFactor(Double convertionFactor) {
        this.convertionFactor = convertionFactor;
    }
    public Double getConvertedValue() {
        return convertedValue;
    }
    public void setConvertedValue(Double convertedValue) {
        this.convertedValue = convertedValue;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    
    
}
