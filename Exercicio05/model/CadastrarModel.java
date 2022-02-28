package Exercicio05.model;

import java.util.Date;

public class CadastrarModel{ 

    private int id;
    private String veiculo;
    private String marca;
    private Integer ano;
    private String descricao;
    private boolean vendido;
    private Date created;
    private Date updated;

    //id
    public void setid(int id){
        this.id = id;
    }

    public int getid(){
        return id;
    }

    //veiculo
    public void setveiculo(String veiculo){
        this.veiculo = veiculo;
    }

    public String getveiculo(){
        return veiculo;
    }

    //marca
    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmarca(){
        return marca;
    }

    //ano
    public void setano(Integer ano){
        this.ano = ano;
    }

    public Integer getano(){
        return ano;
    }

    //descricao
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    public String getdescricao(){
        return descricao;
    }

    //vendido
    public void setvendido(Boolean vendido){
        this.vendido = vendido;
    }

    public Boolean getvendido(){
        return vendido;
    }

    //created
    public void setcreated(Date created){
        this.created = created;
    }
    public Date getcreated(){
        return created;
    }

    //updated
    public void setupdated(Date updated){
        this.updated = updated;
    }
    public Date getupdated(){
        return updated;
    }

    @Override 
    public String toString(){
        return this.id + ", " + this.veiculo + ", " + this.marca + ", " + this.ano + ", " + this.descricao + ", "
        + this.vendido + ", " + this.created + ", " + this.updated;
    }
}

