package com.iesgo.pontoseguro.model.entity;

import com.iesgo.pontoseguro.model.converter.Point;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Converter(autoApply = true)
@Table(name = "registro_de_ponto")
@Entity
public class RegistroDePonto {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime dataHora;

    private Point coordenada;

    private Boolean aprovado;

    private Boolean retroativo;

    @OneToOne
    @JoinColumn(name = "imagem_id")
    private ImagemURL imagemURL;

    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
}
