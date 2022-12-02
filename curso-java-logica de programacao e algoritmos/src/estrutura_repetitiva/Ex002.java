package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int contador = 0, soma = 0;

        if (idade < 0) {
            System.out.println("impossivel calcular");
        } else {
            while (idade >= 0) {
                soma += idade;
                contador++;
                idade = sc.nextInt();
            }
            double media = (double) soma / contador;
            System.out.printf("%.2f", media);
        }

        sc.close();
    }
}
