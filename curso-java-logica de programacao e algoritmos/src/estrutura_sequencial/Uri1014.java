package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaPercorridaTotalKm = sc.nextInt();
        double combustivelGastoTotalL = sc.nextDouble();

        double consumoMedio = distanciaPercorridaTotalKm / combustivelGastoTotalL;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}
