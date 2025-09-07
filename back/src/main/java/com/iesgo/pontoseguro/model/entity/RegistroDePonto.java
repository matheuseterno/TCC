package com.iesgo.pontoseguro.model.entity;

import com.iesgo.pontoseguro.model.converter.Point;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Converter(autoApply = true)
@Table(name = "registro_de_ponto")
@Entity
public class RegistroDePonto {

    @Id
    @GeneratedValue
    private Long id;

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
