package Exercicio01;
public class exercicio01 {
    public static void main(String[] args) {
        
        Eleitores eleit = new Eleitores();
        eleit.settotalEleitores(1000);
        eleit.settotalVotosValidos(800);
        eleit.settotalVotosBrancos(100);
        eleit.settotalVotosNulos(50);
        
        //Votos Válidos
        System.out
                .println("A porcentagem de votos válidos é de: " + eleit.getPorcentagemVotosValidos() + "%");

        //Votos Brancos
        System.out
                .println("A porcentagem de votos brancos é de: " + eleit.getPorcentagemVotosBrancos() + "%");

        //Votos Nulos
        System.out.println("A porcentagem de votos nulos é de: " + eleit.getPorcentagemVotosNulos() + "%");
    }
}
