package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
