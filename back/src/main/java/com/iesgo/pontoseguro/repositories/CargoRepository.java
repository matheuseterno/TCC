package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
