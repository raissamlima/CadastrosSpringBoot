package com.zuplae.veiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "veiculo")
public class CadastrarVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String veiculo;

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private Integer ano;

    @Getter @Setter
    private String descricao;

    @Getter @Setter
    private boolean vendido;
}
