package com.iesgo.pontoseguro.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "funcionario")
@Entity
public class Funcionario {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String cpf;

    private String rg;

    private LocalDate dataDeNascimento;

    private String matricula;

    private String email;

    private String telefone;

    private LocalDateTime dataDeAdminissao;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresaId;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargoId;

}
