package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int min, max;
        if(n1 < n2) {
            min = n1;
            max = n2;
        } else {
            min = n2;
            max = n1;
        }

        int soma = 0;
        for(int i = max - 1; i > min; i--) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
