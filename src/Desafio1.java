package introducao;

import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de pimentões amarelos");
        int a = leitor.nextInt();
        System.out.println("Digite a quantidade de pimentões vermelhos");
        int b = leitor.nextInt();

        int total = a + b;
        System.out.println("X = "+total);
        leitor.close();

    }
}
