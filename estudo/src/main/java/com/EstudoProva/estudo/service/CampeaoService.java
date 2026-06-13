package com.EstudoProva.estudo.service;


import com.EstudoProva.estudo.model.CampeaoModel;
import com.EstudoProva.estudo.repository.CampeaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CampeaoService {
    @Autowired
    private CampeaoRepository repository;

    public CampeaoModel save(CampeaoModel campeaoModel){
    return repository.save(campeaoModel);
    }

    public List<CampeaoModel>listarTodos(){
        return repository.findAll();
    }

    public Optional<CampeaoModel>buscaPorId(UUID id){
        return repository.findById(id);
    }

    public void deletar(UUID id){
        repository.deleteById(id);
    }

    public CampeaoModel atualizar(UUID id, CampeaoModel campeaoModel){
        campeaoModel.setId(id);
        return repository.save(campeaoModel);
    }

    public List<CampeaoModel>findByName(String nome){
        return repository.findByName(nome);
    }


}