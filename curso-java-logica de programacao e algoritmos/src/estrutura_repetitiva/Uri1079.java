package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
