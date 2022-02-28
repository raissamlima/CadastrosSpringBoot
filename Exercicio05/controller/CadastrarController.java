package Exercicio05.controller;

import java.util.ArrayList;
import java.util.Date;

import Exercicio05.model.*;

public class CadastrarController {
    private ArrayList<CadastrarModel> veiculos = new ArrayList<CadastrarModel>();

    public void salvar(CadastrarModel veiculo){
        veiculo.setcreated(new Date());
        veiculo.setupdated(new Date());
        this.veiculos.add(veiculo);
    }

    public void editar(CadastrarModel veiculo) {
        int index = this.veiculos.indexOf(veiculo);
        veiculo.setupdated(new Date());
        this.veiculos.set(index, veiculo);
    }

    public void deletar(int idVeiculo) {
        CadastrarModel veiculo = busca(idVeiculo);
        if ( veiculo != null ) {
            int index = this.veiculos.indexOf(veiculo);
            this.veiculos.remove(index);
        }
    }

    public CadastrarModel busca(int idVeiculo) {
        return this.veiculos.stream().filter( veiculo -> veiculo.getid() == idVeiculo).findAny().orElse(null);
    }

    public ArrayList<CadastrarModel> listar(){
        return veiculos;
    }
}
