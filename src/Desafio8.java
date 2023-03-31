package aritimetico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio8 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int  km= leitor.nextInt();
        double  litros= leitor.nextDouble();

        double media = km/litros ;
        System.out.println(String.format("%.3f km/l",media));
        leitor.close();
    }

}
