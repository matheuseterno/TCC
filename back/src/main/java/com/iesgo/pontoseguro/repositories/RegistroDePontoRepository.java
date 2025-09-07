package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.RegistroDePonto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RegistroDePontoRepository extends JpaRepository<RegistroDePonto, Long> {
}
