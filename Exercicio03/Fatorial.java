package Exercicio03;

public class Fatorial {

    public int resultadoFatorial(int valor){
        int fat = 1;

        for(int i = 1; i <= valor; i++){
            fat *= i;
        }
        return fat;
    }
}