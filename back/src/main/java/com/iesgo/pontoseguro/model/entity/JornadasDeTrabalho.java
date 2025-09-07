package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "jornadas_trabalho")
@Entity
public class JornadasDeTrabalho {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    private Integer horasTrabalhadas;
}
