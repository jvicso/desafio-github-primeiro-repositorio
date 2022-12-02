package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int soma = 0, contador = 0;
        while(idade >= 0) {
            soma += idade;
            contador++;
            idade = sc.nextInt();
        }

        double media = (double) soma / contador;

        System.out.printf("%.2f%n", media);

        sc.close();

    }
}
