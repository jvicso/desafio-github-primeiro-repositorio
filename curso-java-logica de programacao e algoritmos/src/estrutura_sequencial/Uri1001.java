package estrutura_sequencial;

import java.util.Scanner;

public class Uri1001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}
