package matrizes;

import java.util.Scanner;

public class Matriz001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] mat = new int[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");
        for(int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

        sc.close();
    }
}
