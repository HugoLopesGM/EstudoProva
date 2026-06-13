package com.EstudoProva.estudo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "tb_campeao")
public class CampeaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    private String funcao;

    private String elo;
}
