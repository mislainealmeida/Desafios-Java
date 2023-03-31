package filtro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Desafio9{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//para ler entradas (quantas linhas de numeros)
        StringTokenizer st = new StringTokenizer(br.readLine());// divide a linha em palavras
        int linhas = Integer.parseInt(st.nextToken());//retorna o proximo token na linha

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {// para ler todas as linhas e preencher a lista
            st = new StringTokenizer(br.readLine());
            listaNumeros.add(Integer.parseInt(st.nextToken()));
        }
        //duas listas : par e ímpar.
        var pares = listaNumeros.stream()
                .filter(l -> l % 2 == 0)//filtrar os pares
                .sorted()//ordenar
                .collect(Collectors.toList());//coletar os resultados em uma lista.

        var impares = listaNumeros.stream()
                .filter(l -> l % 2 != 0)
                .sorted(Comparator.reverseOrder())//ordnar em ordem reversa
                .collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();// nova lista com todos os números
        total.addAll(pares);//adiciona os pares a lista
        total.addAll(impares);//adiciona os ímpares a lista
        total.forEach(System.out::println);
    }
}
