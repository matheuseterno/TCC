package com.iesgo.pontoseguro.repositories;

import com.iesgo.pontoseguro.model.entity.ImagemURL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ImagemURLRepository extends JpaRepository<ImagemURL, Long> {
}
