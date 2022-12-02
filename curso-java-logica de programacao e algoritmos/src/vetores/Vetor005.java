package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < n; i++) {
            if(vetor[i] % 2 == 0){
                soma += vetor[i];
            }
        }

        int contador = 0;
        for(int i = 0; i < n; i++) {
            if(vetor[i] % 2 == 0){
                contador++;
            }
        }

        double mediaNumerosPares = (double) soma / contador;

        System.out.printf("%.1f%n", mediaNumerosPares);

        sc.close();
    }
}
