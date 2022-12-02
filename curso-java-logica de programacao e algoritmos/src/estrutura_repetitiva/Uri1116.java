package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();

            if (numero2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) numero1 / numero2;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();

    }
}
