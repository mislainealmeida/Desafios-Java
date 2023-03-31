package introducao;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = A * B;

        System.out.println("PROD = " +  PROD);
        sc.close();
    }
}
