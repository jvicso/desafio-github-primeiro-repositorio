package estrutura_repetitiva;

import java.util.Scanner;

public class Uri1078 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int tabuada;
        for(int i = 1; i <= 10; i++) {
            tabuada = i * n;
            System.out.println(i + " x " + n + " = " + tabuada);
        }

        sc.close();

    }
}
