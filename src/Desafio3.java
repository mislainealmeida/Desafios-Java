package introducao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Desafio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int colaborador = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horasTrabalhadas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());

        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + colaborador);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}