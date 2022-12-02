package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];


        for(int i = 0; i < n; i ++) {
            vet[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i ++) {
            if (i == n-1){
                System.out.printf("%.1f%n", vet[i]);
            } else {
                System.out.printf("%.1f ", vet[i]);
            }
        }
        double soma = 0.0;
        for(int i = 0; i < n; i ++) {
            soma += vet[i];
        }

        System.out.printf("%.2f%n",soma);
        double media = soma / n;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}
