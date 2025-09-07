package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Table(name = "imagem_url")
@Entity
public class ImagemURL {

    private Long id;

    private String nome;

    private String tipo;

    private String caminho;

    private Integer Tamanho;

    private LocalDateTime dataUpload;
}
