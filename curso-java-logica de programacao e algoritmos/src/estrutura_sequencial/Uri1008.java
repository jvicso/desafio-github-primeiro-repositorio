package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int numHorasTrabalhadas = sc.nextInt();
        double salarioPorHora = sc.nextDouble();

        double salario = numHorasTrabalhadas * salarioPorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
