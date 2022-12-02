package estrutura_sequencial;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resto;

        int qtdNotaCem = N / 100;
        resto = N % 100;

        int qtdNotaCinquenta = resto / 50;
        resto = resto % 50;

        int qtdNotaVinte = resto / 20;
        resto = resto % 20;

        int qtdNotaDez = resto / 10;
        resto = resto % 10;

        int qtdNotaCinco = resto / 5;
        resto = resto % 5;

        int qtdNotaDois = resto / 2;
        resto = resto % 2;

        int qtdNotaUm = resto;

        System.out.println(N);
        System.out.println(qtdNotaCem + " nota(s) de R$ 100,00");
        System.out.println(qtdNotaCinquenta + " nota(s) de R$ 50,00");
        System.out.println(qtdNotaVinte + " nota(s) de R$ 20,00");
        System.out.println(qtdNotaDez + " nota(s) de R$ 10,00");
        System.out.println(qtdNotaCinco + " nota(s) de R$ 5,00");
        System.out.println(qtdNotaDois + " nota(s) de R$ 2,00");
        System.out.println(qtdNotaUm + " nota(s) de R$ 1,00");

        sc.close();
    }
}
