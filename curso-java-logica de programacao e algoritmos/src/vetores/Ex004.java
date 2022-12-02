package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++) {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double somaAltura = 0.0;
        for(int i = 0; i < n; i++) {
            somaAltura += altura[i];
        }

        double mediaAltura = somaAltura / n;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int contadorIdadeMenor = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                contadorIdadeMenor++;
            }
        }

        double porcentagemIdadeMenor = contadorIdadeMenor * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemIdadeMenor);

        sc.close();
    }
}
