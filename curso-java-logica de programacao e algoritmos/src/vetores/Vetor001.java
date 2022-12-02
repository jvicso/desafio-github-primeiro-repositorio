package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numeros = new double[n];

        for(int i = 0; i < n; i++) {
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        int posicaoMaior = 0;


        for(int i = 0; i < n; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicaoMaior);

        sc.close();
    }
}
