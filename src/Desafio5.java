package aritimetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Desafio5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numero = br.readLine();
        int n = Integer.parseInt(numero);



        for (int i=2; i<=n; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}