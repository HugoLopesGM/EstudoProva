package com.EstudoProva.estudo.controller;

import com.EstudoProva.estudo.model.CampeaoModel;
import com.EstudoProva.estudo.service.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping(path = "/campeoes")
@RestController
public class CampeaoController {
    @Autowired
    private CampeaoService service;

    @PostMapping
    public CampeaoModel save(@RequestBody CampeaoModel campeaoModel){
        return service.save(campeaoModel);
    }

    @GetMapping
    public List<CampeaoModel>listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<CampeaoModel>buscaPorId(@PathVariable UUID id){
        return service.buscaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id){
        service.deletar(id);
    }

    @PutMapping("/{id}")

    public CampeaoModel atualizar(@PathVariable UUID id, @RequestBody CampeaoModel campeaoModel){
        campeaoModel.setId(id);
        return service.save(campeaoModel);
    }
}
