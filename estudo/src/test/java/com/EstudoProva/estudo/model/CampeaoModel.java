package com.EstudoProva.estudo.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "tb_campeao")
public class CampeaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String nome;

    private String funcao;

    private String elo;
}
