package com.zuplae.veiculos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zuplae.veiculos.model.CadastrarVeiculo;
import com.zuplae.veiculos.repository.CadastrarRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastrarController {
    private CadastrarRepository repository;

    public CadastrarController(CadastrarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/veiculo")
    public String veiculos(HttpServletRequest req){
        List<CadastrarRepository> lista = (List<CadastrarRepository>)repository.findAll();
        req.setAttribute("veiculos", lista);
        return "veiculos";
    }

    @GetMapping("/veiculo/form")
    public String formulario(HttpServletRequest req){
        CadastrarVeiculo model = new CadastrarVeiculo();
        req.setAttribute("veiculo", model);
        return "veiculos-form";
    }

    @PostMapping("/veiculo/salvar")
    public String salvar(CadastrarVeiculo model){
        repository.save(model);
        return "redirect:/veiculo";
    }

    @GetMapping("/veiculo/deletar/{id}")
    public String deleter(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/veiculo";
    }

    @GetMapping("/veiculo/editar/{id}")
    public String editar(@PathVariable int id, HttpServletRequest req){
        CadastrarRepository model = repository.findById(id).get();
        req.setAttribute("veiculo", model);
        return "veiculos-form";
    }
}