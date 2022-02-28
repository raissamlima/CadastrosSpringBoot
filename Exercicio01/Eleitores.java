package Exercicio01;
public class Eleitores {

    private int totalEleitores;
    private int totalVotosValidos;
    private int totalVotosBrancos;
    private int totalVotosNulos;

    public void settotalEleitores(int totalEleitores){
        this.totalEleitores = totalEleitores;
    }

    public int gettotalEleitores(){
        return totalEleitores;
    }

    public void settotalVotosValidos(int totalVotosValidos){
        this.totalVotosValidos = totalVotosValidos;
    }

    public int gettotalVotosValidos(){
        return totalVotosValidos;
    }

    public void settotalVotosBrancos(int totalVotosBrancos){
        this.totalVotosBrancos = totalVotosBrancos;
    }

    public int gettotalVotosBrancos(){
        return totalVotosBrancos;
    }

    public void settotalVotosNulos(int totalVotosNulos){
        this.totalVotosNulos = totalVotosNulos;
    }

    public int gettotalVotosNulos(){
        return totalVotosNulos;
    }

    public double getPorcentagemVotosValidos(){
        return Double.valueOf(totalVotosValidos) / Double.valueOf(totalEleitores) * 100;
    } 

    public double getPorcentagemVotosBrancos(){
        return Double.valueOf(totalVotosBrancos) / Double.valueOf(totalVotosValidos) * 100;
    }

    public double getPorcentagemVotosNulos(){
        return Double.valueOf(totalVotosNulos) / Double.valueOf(totalVotosValidos) * 100;
    }
}
