package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "imagem_url")
@Entity
public class ImagemURL {

    private UUID id;

    private String nome;

    private String tipo;

    private String caminho;

    private Integer Tamanho;

    private LocalDateTime dataUpload;
}
