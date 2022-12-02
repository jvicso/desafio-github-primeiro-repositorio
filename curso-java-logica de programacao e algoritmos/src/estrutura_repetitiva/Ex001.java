package estrutura_repetitiva;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int soma = 0;
        while(valor != 0) {
            soma += valor;
            valor = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();

    }
}
