package matrizes;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i < linha; i++) {

            for(int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }




        sc.close();
    }
}
