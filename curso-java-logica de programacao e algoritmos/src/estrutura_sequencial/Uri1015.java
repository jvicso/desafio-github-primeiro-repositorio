package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xI = sc.nextDouble();
        double yI = sc.nextDouble();
        double xII = sc.nextDouble();
        double yII = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((xII-xI), 2.0) + Math.pow((yII-yI), 2.0));

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}