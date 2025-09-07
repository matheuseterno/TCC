package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.JornadasDeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JornadasDeTrabalhoRepository extends JpaRepository<JornadasDeTrabalho, Long> {
}
