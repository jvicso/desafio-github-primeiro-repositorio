package estrutura_repetitiva;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = sc.nextInt();
        int numero, soma = 0;


        for(int i = 0; i < quantidadeNumeros; i++) {
            numero = sc.nextInt();
            soma += numero;
        }

        System.out.println(soma);

        sc.close();

    }
}
