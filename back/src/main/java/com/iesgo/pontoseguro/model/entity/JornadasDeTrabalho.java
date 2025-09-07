package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "jornadas_trabalho")
@Entity
public class JornadasDeTrabalho {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Integer horasTrabalhadas;
}
