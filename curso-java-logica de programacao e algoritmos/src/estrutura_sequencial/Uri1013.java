package estrutura_sequencial;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int k = (a + b + Math.abs(a - b)) / 2;

        int t = (k + c + Math.abs(k - c)) / 2;

        System.out.println(t + " eh o maior");

        sc.close();
    }
}
