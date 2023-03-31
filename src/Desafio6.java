package aritimetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio6 {
    public static void main(String[] args) throws IOException {
        String linha;
        Integer n;
        int pos=0;
        int neg =0;
        int impar=0;
        int par=0;
        int i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i=0;i<5; i++) {
            linha = br.readLine();
            n = Integer.parseInt(linha);
            if(n>0){
                pos++;
            }else if(n<0){
                neg++;
            }

            if(n % 2==0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println( par+ " par(es)");
        System.out.println( impar+ " impar(es)");
        System.out.println( pos+ " positivo(s)");
        System.out.println( neg+ " negativo(s)");
    }
}
