package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        double[][] mat = new double[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        double[] vet = new double[linha];

        for(int i = 0; i < linha; i++) {
            double soma = 0.0;
            for (int j = 0; j < coluna; j++) {
                soma += mat[i][j];
            }
            vet[i] = soma;
        }

        for (int i = 0; i < linha; i++) {
            System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();

    }
}
