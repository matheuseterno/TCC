package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table(name = "feriados")
@Entity
public class Feriados {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private LocalDate data;

}
