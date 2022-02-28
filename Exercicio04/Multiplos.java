package Exercicio04;

public class Multiplos {


    public int resultadoMultiplos(int valor){
        int soma = 0;
        for(int i = 1; i < valor; i++){
            if(i % 3 == 0 || i % 5 == 0){
                soma += i;
            }
        }
        return soma;
    }
}
