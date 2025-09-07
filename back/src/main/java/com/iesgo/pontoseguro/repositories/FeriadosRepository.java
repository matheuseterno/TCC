package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.Feriados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeriadosRepository extends JpaRepository<Feriados, Long> {
}
