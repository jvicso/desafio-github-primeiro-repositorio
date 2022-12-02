package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendasEfetuadas = sc.nextDouble();

        double total = salarioFixo + (totalVendasEfetuadas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
