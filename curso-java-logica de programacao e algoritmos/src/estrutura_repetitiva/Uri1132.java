package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max, min, soma = 0;
        if(n1 > n2) {
            max = n1;
            min = n2;
        } else {
            max = n2;
            min = n1;
        }

        for (int i = min; i <= max; i++) {
            if(i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
