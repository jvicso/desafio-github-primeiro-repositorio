package estrutura_sequencial;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int resto;

        int anos = N / 365;
        resto = N % 365;

        int meses = resto / 30;
        resto = resto % 30;

        int dias = resto;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
