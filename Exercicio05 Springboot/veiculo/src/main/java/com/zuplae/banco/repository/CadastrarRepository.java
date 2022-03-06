package com.zuplae.banco.repository;

import com.zuplae.banco.model.*;

import org.springframework.data.repository.CrudRepository;

public interface CadastrarRepository extends CrudRepository<CadastrarModel,Integer> {

    Object getveiculo();
}
