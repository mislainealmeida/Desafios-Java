package aritimetico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio7 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int notasInseridas = leitor.nextInt();
        System.out.println(notasInseridas);

        int atual = notasInseridas;
        int[] notas={100,50,20,10,5,2,1};


        for(int i =0; i <=6; i++){
            int qtdNotas = atual / notas[i];
            atual = atual % notas[i];
            System.out.println(qtdNotas + " nota(s) de R$ "+notas[i]+",00");
        }
        leitor.close();
    }

}
