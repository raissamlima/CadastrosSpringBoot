package Exercicio02;

import java.util.List;
import java.util.Arrays;

public class exercicio02 {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        List<Integer> list = bubble.sortear(Arrays.asList(5, 3, 2, 4, 7, 1, 0, 6));
        System.out.println(list);
    } 
}
