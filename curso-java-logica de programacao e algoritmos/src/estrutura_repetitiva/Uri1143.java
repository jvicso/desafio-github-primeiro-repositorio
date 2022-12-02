package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1143 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = 1, n2 = 1, n3 = 1;
        System.out.printf("%d %d %d%n", n1 , n2, n3);

        for(int i = 1; i <= n-1; i++){

            n1++;
            n2 = n1 * n1;
            n3 = n1 * n2;
            System.out.printf("%d %d %d%n", n1 , n2, n3);

        }

        sc.close();
    }
}
