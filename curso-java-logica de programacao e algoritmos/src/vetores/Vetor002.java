package vetores;

import java.util.Scanner;

public class Vetor002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];

        for(int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int contador = 0;
        for (int num:numeros) {
            if(num %2 == 0) {
                System.out.print(num+ " ");
                contador++;
            }
        }
        System.out.println("\n" + contador);


        sc.close();
    }
}
