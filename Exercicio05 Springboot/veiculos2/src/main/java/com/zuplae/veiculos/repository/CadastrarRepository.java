package com.zuplae.veiculos.repository;

import com.zuplae.veiculos.model.CadastrarVeiculo;

import org.springframework.data.repository.CrudRepository;

public interface CadastrarRepository extends CrudRepository<CadastrarRepository,Integer> {

    void save(CadastrarVeiculo model);  
}
    
