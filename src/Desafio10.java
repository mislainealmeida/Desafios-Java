package filtro;


import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Desafio10 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Digite a quantidade de lista (teste)");
        int qtdLista = scan.nextInt();
        scan.nextLine();
        //System.out.println(qtdLista);

        //System.out.println("Digite os itens da lista");

        for (int i = 0; i < qtdLista; i++) {
            String[] itens = scan.nextLine().split(" ");
            Set<String> listaCompras = new TreeSet<>();
            Collections.addAll(listaCompras, itens);
            System.out.println(String.join(" ", listaCompras));
        }
        scan.close();
    }
}



