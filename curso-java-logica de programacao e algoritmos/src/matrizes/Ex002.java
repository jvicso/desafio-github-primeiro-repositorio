package matrizes;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        /* for(int i = 0; i < n; i++) {
            for (int j = i; j == i; j++) {
                System.out.print(mat[i][j] + " ");
            }
        } */

        for(int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int contadorNegativo = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    contadorNegativo++;
                }
            }
        }

        System.out.println("\nQUANTIDADE DE NEGATIVOS = " + contadorNegativo);

        sc.close();
    }
}
