package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
