package estrutura_sequencial;

import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();
        int valorD = sc.nextInt();

        int diferencaProduto = (valorA * valorB) - (valorC * valorD);

        System.out.println("DIFERENCA = " + diferencaProduto);

        sc.close();
    }
}
