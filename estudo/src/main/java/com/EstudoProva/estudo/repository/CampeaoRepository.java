package com.EstudoProva.estudo.repository;

import com.EstudoProva.estudo.model.CampeaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CampeaoRepository extends JpaRepository<CampeaoModel, UUID> {
     List<CampeaoModel>findByName(String nome);
}
