package com.example.cambio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
    public Cambio findByConvertFromAndConvertTo(String convertFrom, String convertTo);
}
