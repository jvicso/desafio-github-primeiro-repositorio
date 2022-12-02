package vetores;

import java.util.Scanner;

public class Vetor006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];

        for(int i = 0; i < n; i++) {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
        }

        double maisVelho = idade[0];
        String nomeMaior = "";
        for(int i = 0; i < n; i++) {
            if(idade[i] > maisVelho) {
                maisVelho = idade[i];
                nomeMaior = nome[i];
            }
        }

        System.out.println("Pessoa mais velha: " + nomeMaior);

        sc.close();
    }
}
