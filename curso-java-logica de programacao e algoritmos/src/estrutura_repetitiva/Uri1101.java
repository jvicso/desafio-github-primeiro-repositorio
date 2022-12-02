package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while(m > 0 && n > 0){

            int max, min;
            if(m > n) {
                min = n;
                max = m;
            } else {
                min = m;
                max = n;
            }

            int soma = 0;
            for (int i = min; i <= max; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);

            m = sc.nextInt();
            n = sc.nextInt();
        }


        sc.close();
    }
}
