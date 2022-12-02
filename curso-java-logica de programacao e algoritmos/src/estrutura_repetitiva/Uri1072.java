package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();
        int numeros, dentro = 0, fora = 0;

        for(int i = 0; i < quantidade; i++) {

            numeros = sc.nextInt();

            if(numeros >= 10 && numeros <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        sc.close();
    }
}
